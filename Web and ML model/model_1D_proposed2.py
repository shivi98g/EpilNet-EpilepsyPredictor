import torch
import torch.nn as nn
import torch.nn.functional as F
from collections import OrderedDict


#define layers that would be used frequently 

#3x1 that is used in model basic block 
def conv3x3(in_planes, out_planes, stride=1):  
    return nn.Conv1d(in_planes, out_planes, kernel_size=3, stride=stride, padding=1, bias=False)

def conv1x1(in_planes, out_planes, stride=1):
    return nn.Conv1d(in_planes, out_planes, kernel_size=1, stride=stride, bias=False)



class BasicBlock(nn.Module):
    expansion = 1  #no of times output channel expand need 

    #define layers 
    def __init__(self, inplanes, planes, stride=1, downsample=None):
        super(BasicBlock, self).__init__()  #call parent constructor if any 
        self.conv1 = conv3x3(inplanes, planes, stride)    #1st layer of basic block
        self.bn1 = nn.BatchNorm1d(planes)
        self.relu = nn.ReLU(inplace=True)
        self.conv2 = conv3x3(planes, planes)     #2nd Layer of basic block 
        self.bn2 = nn.BatchNorm1d(planes)
        self.downsample = downsample #if downsample set to true then to reduce dimension for size maintaince while skip connection
        self.stride = stride    #stride is amount of filter slide when doing convolution

    
    
    #map output of one layer to input of next
    def forward(self, x):
        identity = x   #inout to layer 1 
        out = self.conv1(x)
        out = self.bn1(out)       
        out = self.relu(out)
        out = self.conv2(out)
        out = self.bn2(out)
        if self.downsample is not None:
            identity = self.downsample(x)
        out += identity                   #SKip connection  add input to layer 1 to final output of basic block 
        out = self.relu(out)
        return out



#Use basic block to form architecture of model
class Proposed(nn.Module):

    def __init__(self, block, layers, num_classes):
        super(Proposed, self).__init__()
        self.inplanes = 64
        self.conv1 = nn.Conv1d(1, 64, kernel_size=7, stride=2, padding=3, bias=False) #normal lib conv 1d 

        self.bn1 = nn.BatchNorm1d(64)
        self.relu = nn.ReLU(inplace=True)
        
        
        self.maxpool = nn.MaxPool1d(kernel_size=3, stride=2, padding=1)
        
        self.layer1 = self._make_layer(block, 64, layers[0]) #basic block 
        self.layer2 = self._make_layer(block, 128, layers[1], stride=2) #Repeat basic block with 128 and no of times 3 ie layers[1] in                                                             #each block
        self.layer3 = self._make_layer(block, 256, layers[2], stride=2)
        self.layer4 = self._make_layer(block, 512, layers[3], stride=2)
        
        #self.layer5 = self._make_layer(block, 512, layers[3], stride=2)
        self.avgpool = nn.AdaptiveAvgPool1d(1)
        self.fc = nn.Linear(512 * block.expansion, num_classes)  # 1D to fully connected network convert 
        
        for m in self.modules():    #At start intialise weight with random value standard code
            if isinstance(m, nn.Conv1d):
                nn.init.kaiming_normal_(m.weight, mode='fan_out', nonlinearity='relu')
            elif isinstance(m, nn.BatchNorm1d):
                nn.init.constant_(m.weight, 1)
                nn.init.constant_(m.bias, 0)

    def _make_layer(self, block, planes, blocks, stride=1):
        downsample = None
        
        #if expansion needed or stride not 1 then use conv1x1
        if stride != 1 or self.inplanes != planes * block.expansion:
            downsample = nn.Sequential(
                conv1x1(self.inplanes, planes * block.expansion, stride),
                nn.BatchNorm1d(planes * block.expansion),
            )
        layers = []
        layers.append(block(self.inplanes, planes, stride, downsample))
        self.inplanes = planes * block.expansion
        for _ in range(1, blocks):
            layers.append(block(self.inplanes, planes))
        return nn.Sequential(*layers)

#map ouptut of one layer to input of other
    def forward(self, x):
        x = self.conv1(x)
        x = self.bn1(x)
        x = self.relu(x)
        x = self.maxpool(x)
        x = self.layer1(x)
        x = self.layer2(x)
        x = self.layer3(x)
        x = self.layer4(x)
        #x = self.layer5(x)
        x = self.avgpool(x)
        x = x.view(x.size(0), -1) #3D to 2D convert 
        x = self.fc(x)
        return x


def proposed(num_classes):
    model = Proposed(BasicBlock, [3, 3, 3, 3], num_classes)   #call our proposed model 
    return model
