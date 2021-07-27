package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1797kf;

/* renamed from: com.google.android.gms.internal.ke */
public final class C1794ke implements C1793kd {

    /* renamed from: com.google.android.gms.internal.ke$a */
    private static class C1796a extends C1790kb {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f3958Ea;

        public C1796a(BaseImplementation.C0670b<Status> bVar) {
            this.f3958Ea = bVar;
        }

        /* renamed from: aI */
        public void mo15948aI(int i) throws RemoteException {
            this.f3958Ea.mo10914b(new Status(i));
        }
    }

    /* renamed from: c */
    public PendingResult<Status> mo15950c(GoogleApiClient googleApiClient) {
        return new C1797kf.C1798a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1799kg kgVar) throws RemoteException {
                ((C1803ki) kgVar.mo15820hw()).mo15957a(new C1796a(this));
            }
        }.mo10928gE();
    }
}
