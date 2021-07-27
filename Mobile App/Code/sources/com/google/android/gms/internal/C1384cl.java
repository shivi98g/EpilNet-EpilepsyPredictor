package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1385cm;
import com.google.android.gms.internal.C1750jl;

@C1507ey
/* renamed from: com.google.android.gms.internal.cl */
public class C1384cl extends C1750jl<C1385cm> {

    /* renamed from: qg */
    final int f2803qg;

    public C1384cl(Context context, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i) {
        super(context, context.getMainLooper(), connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f2803qg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15911g(eVar, this.f2803qg, getContext().getPackageName(), new Bundle());
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.ads.gservice.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.ads.internal.gservice.IGservicesValueService";
    }

    /* renamed from: bM */
    public C1385cm mo15019bM() throws DeadObjectException {
        return (C1385cm) super.mo15820hw();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C1385cm mo11721l(IBinder iBinder) {
        return C1385cm.C1386a.m4180m(iBinder);
    }
}
