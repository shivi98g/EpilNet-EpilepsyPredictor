package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.internal.bg */
public class C0791bg extends C0794c {

    /* renamed from: Ea */
    private final BaseImplementation.C0670b<Status> f1039Ea;

    public C0791bg(BaseImplementation.C0670b<Status> bVar) {
        this.f1039Ea = bVar;
    }

    /* renamed from: n */
    public void mo11532n(Status status) throws RemoteException {
        this.f1039Ea.mo10914b(status);
    }

    public void onSuccess() throws RemoteException {
        this.f1039Ea.mo10914b(Status.f663Kw);
    }
}
