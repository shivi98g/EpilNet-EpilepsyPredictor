package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.C1045l;
import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.fitness.request.a */
public class C1015a extends C1045l.C1046a {

    /* renamed from: VC */
    private final BleScanCallback f1551VC;

    /* renamed from: com.google.android.gms.fitness.request.a$a */
    public static class C1017a {

        /* renamed from: VD */
        private static final C1017a f1552VD = new C1017a();

        /* renamed from: VE */
        private final Map<BleScanCallback, C1015a> f1553VE = new HashMap();

        private C1017a() {
        }

        /* renamed from: jP */
        public static C1017a m1852jP() {
            return f1552VD;
        }

        /* renamed from: a */
        public C1015a mo12674a(BleScanCallback bleScanCallback) {
            C1015a aVar;
            synchronized (this.f1553VE) {
                aVar = this.f1553VE.get(bleScanCallback);
                if (aVar == null) {
                    aVar = new C1015a(bleScanCallback);
                    this.f1553VE.put(bleScanCallback, aVar);
                }
            }
            return aVar;
        }

        /* renamed from: b */
        public C1015a mo12675b(BleScanCallback bleScanCallback) {
            synchronized (this.f1553VE) {
                C1015a aVar = this.f1553VE.get(bleScanCallback);
                if (aVar != null) {
                    return aVar;
                }
                C1015a aVar2 = new C1015a(bleScanCallback);
                return aVar2;
            }
        }
    }

    private C1015a(BleScanCallback bleScanCallback) {
        this.f1551VC = (BleScanCallback) C1785jx.m5364i(bleScanCallback);
    }

    public void onDeviceFound(BleDevice bleDevice) throws RemoteException {
        this.f1551VC.onDeviceFound(bleDevice);
    }

    public void onScanStopped() throws RemoteException {
        this.f1551VC.onScanStopped();
    }
}
