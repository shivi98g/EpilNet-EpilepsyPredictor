package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C1803ki;

/* renamed from: com.google.android.gms.internal.kg */
public class C1799kg extends C1750jl<C1803ki> {
    public C1799kg(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String... strArr) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public C1803ki mo11721l(IBinder iBinder) {
        return C1803ki.C1804a.m5402V(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15916j(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName());
    }

    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.common.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
