package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C1877lz;

/* renamed from: com.google.android.gms.internal.lv */
public class C1867lv extends C1750jl<C1877lz> implements C1863lu {

    /* renamed from: DZ */
    private final String f4050DZ;

    public C1867lv(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, String[] strArr) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f4050DZ = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15894a((C1772js) eVar, (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f4050DZ, mo15819hv(), new Bundle());
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public C1877lz mo11721l(IBinder iBinder) {
        return C1877lz.C1878a.m5603av(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.fitness.GoogleFitnessService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.fitness.internal.IGoogleFitnessService";
    }

    /* renamed from: jM */
    public C1877lz mo16077jM() throws DeadObjectException {
        return (C1877lz) mo15820hw();
    }
}
