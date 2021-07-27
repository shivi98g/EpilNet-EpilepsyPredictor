package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C1775jt;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.C2717af;
import com.google.android.gms.wearable.internal.C2720ag;
import com.google.android.gms.wearable.internal.C2754az;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.wearable.internal.ba */
public class C2766ba extends C1750jl<C2717af> {
    private final ExecutorService asJ = Executors.newCachedThreadPool();
    private final C2720ag<DataApi.DataListener> ayg = new C2720ag.C2722b();
    private final C2720ag<MessageApi.MessageListener> ayh = new C2720ag.C2723c();
    private final C2720ag<NodeApi.NodeListener> ayi = new C2720ag.C2724d();

    public C2766ba(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, new String[0]);
    }

    /* renamed from: a */
    private FutureTask<Boolean> m8095a(final ParcelFileDescriptor parcelFileDescriptor, final byte[] bArr) {
        return new FutureTask<>(new Callable<Boolean>() {
            /* renamed from: rr */
            public Boolean call() {
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: writing data to FD : " + parcelFileDescriptor);
                }
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    autoCloseOutputStream.write(bArr);
                    autoCloseOutputStream.flush();
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: wrote data: " + parcelFileDescriptor);
                    }
                    try {
                        if (Log.isLoggable("WearableClient", 3)) {
                            Log.d("WearableClient", "processAssets: closing: " + parcelFileDescriptor);
                        }
                        autoCloseOutputStream.close();
                        return true;
                    } catch (IOException e) {
                        return true;
                    }
                } catch (IOException e2) {
                    Log.w("WearableClient", "processAssets: writing data failed: " + parcelFileDescriptor);
                    try {
                        if (Log.isLoggable("WearableClient", 3)) {
                            Log.d("WearableClient", "processAssets: closing: " + parcelFileDescriptor);
                        }
                        autoCloseOutputStream.close();
                    } catch (IOException e3) {
                    }
                    return false;
                } catch (Throwable th) {
                    try {
                        if (Log.isLoggable("WearableClient", 3)) {
                            Log.d("WearableClient", "processAssets: closing: " + parcelFileDescriptor);
                        }
                        autoCloseOutputStream.close();
                    } catch (IOException e4) {
                    }
                    throw th;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11710a(int i, IBinder iBinder, Bundle bundle) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.ayg.mo19482ca(iBinder);
            this.ayh.mo19482ca(iBinder);
            this.ayi.mo19482ca(iBinder);
        }
        super.mo11710a(i, iBinder, bundle);
    }

    /* renamed from: a */
    public void mo19551a(BaseImplementation.C0670b<DataApi.DataItemResult> bVar, Uri uri) throws RemoteException {
        ((C2717af) mo15820hw()).mo19453a((C2711ad) new C2754az.C2758d(bVar), uri);
    }

    /* renamed from: a */
    public void mo19552a(BaseImplementation.C0670b<DataApi.GetFdForAssetResult> bVar, Asset asset) throws RemoteException {
        ((C2717af) mo15820hw()).mo19454a((C2711ad) new C2754az.C2760f(bVar), asset);
    }

    /* renamed from: a */
    public void mo19553a(BaseImplementation.C0670b<Status> bVar, DataApi.DataListener dataListener) throws RemoteException {
        this.ayg.mo19479a(this, bVar, dataListener);
    }

    /* renamed from: a */
    public void mo19554a(BaseImplementation.C0670b<Status> bVar, DataApi.DataListener dataListener, IntentFilter[] intentFilterArr) throws RemoteException {
        this.ayg.mo19480a(this, bVar, dataListener, intentFilterArr);
    }

    /* renamed from: a */
    public void mo19555a(BaseImplementation.C0670b<DataApi.GetFdForAssetResult> bVar, DataItemAsset dataItemAsset) throws RemoteException {
        mo19552a(bVar, Asset.createFromRef(dataItemAsset.getId()));
    }

    /* renamed from: a */
    public void mo19556a(BaseImplementation.C0670b<Status> bVar, MessageApi.MessageListener messageListener) throws RemoteException {
        this.ayh.mo19479a(this, bVar, messageListener);
    }

    /* renamed from: a */
    public void mo19557a(BaseImplementation.C0670b<Status> bVar, MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) throws RemoteException {
        this.ayh.mo19480a(this, bVar, messageListener, intentFilterArr);
    }

    /* renamed from: a */
    public void mo19558a(BaseImplementation.C0670b<Status> bVar, NodeApi.NodeListener nodeListener) throws RemoteException, RemoteException {
        this.ayi.mo19480a(this, bVar, nodeListener, (IntentFilter[]) null);
    }

    /* renamed from: a */
    public void mo19559a(BaseImplementation.C0670b<DataApi.DataItemResult> bVar, PutDataRequest putDataRequest) throws RemoteException {
        for (Map.Entry<String, Asset> value : putDataRequest.getAssets().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.getData() == null && asset.getDigest() == null && asset.getFd() == null && asset.getUri() == null) {
                throw new IllegalArgumentException("Put for " + putDataRequest.getUri() + " contains invalid asset: " + asset);
            }
        }
        PutDataRequest k = PutDataRequest.m7892k(putDataRequest.getUri());
        k.setData(putDataRequest.getData());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : putDataRequest.getAssets().entrySet()) {
            Asset asset2 = (Asset) next.getValue();
            if (asset2.getData() == null) {
                k.putAsset((String) next.getKey(), (Asset) next.getValue());
            } else {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: replacing data with FD in asset: " + asset2 + " read:" + createPipe[0] + " write:" + createPipe[1]);
                    }
                    k.putAsset((String) next.getKey(), Asset.createFromFd(createPipe[0]));
                    FutureTask<Boolean> a = m8095a(createPipe[1], asset2.getData());
                    arrayList.add(a);
                    this.asJ.submit(a);
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: " + putDataRequest, e);
                }
            }
        }
        try {
            ((C2717af) mo15820hw()).mo19455a((C2711ad) new C2754az.C2763i(bVar, arrayList), k);
        } catch (NullPointerException e2) {
            throw new IllegalStateException("Unable to putDataItem: " + putDataRequest, e2);
        }
    }

    /* renamed from: a */
    public void mo19560a(BaseImplementation.C0670b<MessageApi.SendMessageResult> bVar, String str, String str2, byte[] bArr) throws RemoteException {
        ((C2717af) mo15820hw()).mo19460a(new C2754az.C2764j(bVar), str, str2, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15906e(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName());
    }

    /* renamed from: b */
    public void mo19561b(BaseImplementation.C0670b<DataItemBuffer> bVar, Uri uri) throws RemoteException {
        ((C2717af) mo15820hw()).mo19462b((C2711ad) new C2754az.C2759e(bVar), uri);
    }

    /* renamed from: b */
    public void mo19562b(BaseImplementation.C0670b<Status> bVar, NodeApi.NodeListener nodeListener) throws RemoteException {
        this.ayi.mo19479a(this, bVar, nodeListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* renamed from: c */
    public void mo19563c(BaseImplementation.C0670b<DataApi.DeleteDataItemsResult> bVar, Uri uri) throws RemoteException {
        ((C2717af) mo15820hw()).mo19466c((C2711ad) new C2754az.C2756b(bVar), uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: cb */
    public C2717af mo11721l(IBinder iBinder) {
        return C2717af.C2718a.m7994bZ(iBinder);
    }

    public void disconnect() {
        this.ayg.mo19481b(this);
        this.ayh.mo19481b(this);
        this.ayi.mo19481b(this);
        super.disconnect();
    }

    /* renamed from: n */
    public void mo19565n(BaseImplementation.C0670b<DataItemBuffer> bVar) throws RemoteException {
        ((C2717af) mo15820hw()).mo19461b(new C2754az.C2759e(bVar));
    }

    /* renamed from: o */
    public void mo19566o(BaseImplementation.C0670b<NodeApi.GetLocalNodeResult> bVar) throws RemoteException {
        ((C2717af) mo15820hw()).mo19465c(new C2754az.C2761g(bVar));
    }

    /* renamed from: p */
    public void mo19567p(BaseImplementation.C0670b<NodeApi.GetConnectedNodesResult> bVar) throws RemoteException {
        ((C2717af) mo15820hw()).mo19468d(new C2754az.C2757c(bVar));
    }
}
