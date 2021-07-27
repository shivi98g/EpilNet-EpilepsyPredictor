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
import com.google.android.gms.internal.C1993ni;

/* renamed from: com.google.android.gms.internal.nc */
public class C1969nc extends C1750jl<C1993ni> {

    /* renamed from: Ee */
    protected final C2007np<C1993ni> f4137Ee = new C2007np<C1993ni>() {
        /* renamed from: dS */
        public void mo16236dS() {
            C1969nc.this.mo15816dS();
        }

        /* renamed from: nh */
        public C1993ni mo16237hw() throws DeadObjectException {
            return (C1993ni) C1969nc.this.mo15820hw();
        }
    };
    private final String agD;

    public C1969nc(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.agD = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.agD);
        jtVar.mo15907e(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aM */
    public C1993ni mo11721l(IBinder iBinder) {
        return C1993ni.C1994a.m5881aO(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
}
