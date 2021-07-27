package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1550fl;
import com.google.android.gms.internal.C1750jl;

@C1507ey
/* renamed from: com.google.android.gms.internal.fg */
public class C1544fg extends C1750jl<C1550fl> {

    /* renamed from: qg */
    final int f3302qg;

    public C1544fg(Context context, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i) {
        super(context, context.getMainLooper(), connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f3302qg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C1550fl mo11721l(IBinder iBinder) {
        return C1550fl.C1551a.m4493C(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15911g(eVar, this.f3302qg, getContext().getPackageName(), new Bundle());
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.ads.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* renamed from: cL */
    public C1550fl mo15288cL() throws DeadObjectException {
        return (C1550fl) super.mo15820hw();
    }
}
