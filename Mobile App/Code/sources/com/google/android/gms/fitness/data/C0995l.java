package com.google.android.gms.fitness.data;

import android.os.RemoteException;
import com.google.android.gms.fitness.data.C0992k;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.fitness.data.l */
public class C0995l extends C0992k.C0993a {

    /* renamed from: UF */
    private final OnDataPointListener f1445UF;

    /* renamed from: com.google.android.gms.fitness.data.l$a */
    public static class C0997a {

        /* renamed from: UG */
        private static final C0997a f1446UG = new C0997a();

        /* renamed from: UH */
        private final Map<OnDataPointListener, C0995l> f1447UH = new HashMap();

        private C0997a() {
        }

        /* renamed from: jG */
        public static C0997a m1747jG() {
            return f1446UG;
        }

        /* renamed from: a */
        public C0995l mo12480a(OnDataPointListener onDataPointListener) {
            C0995l lVar;
            synchronized (this.f1447UH) {
                lVar = this.f1447UH.get(onDataPointListener);
                if (lVar == null) {
                    lVar = new C0995l(onDataPointListener);
                    this.f1447UH.put(onDataPointListener, lVar);
                }
            }
            return lVar;
        }

        /* renamed from: b */
        public C0995l mo12481b(OnDataPointListener onDataPointListener) {
            C0995l lVar;
            synchronized (this.f1447UH) {
                lVar = this.f1447UH.get(onDataPointListener);
            }
            return lVar;
        }

        /* renamed from: c */
        public C0995l mo12482c(OnDataPointListener onDataPointListener) {
            synchronized (this.f1447UH) {
                C0995l remove = this.f1447UH.remove(onDataPointListener);
                if (remove != null) {
                    return remove;
                }
                C0995l lVar = new C0995l(onDataPointListener);
                return lVar;
            }
        }
    }

    private C0995l(OnDataPointListener onDataPointListener) {
        this.f1445UF = (OnDataPointListener) C1785jx.m5364i(onDataPointListener);
    }

    /* renamed from: c */
    public void mo12476c(DataPoint dataPoint) throws RemoteException {
        this.f1445UF.onDataPoint(dataPoint);
    }
}
