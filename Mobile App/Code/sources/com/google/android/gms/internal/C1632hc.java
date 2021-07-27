package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;

/* renamed from: com.google.android.gms.internal.hc */
public final class C1632hc {

    /* renamed from: CG */
    public static final Api.C0668c<C1662hx> f3608CG = new Api.C0668c<>();

    /* renamed from: CH */
    private static final Api.C0667b<C1662hx, Api.ApiOptions.NoOptions> f3609CH = new Api.C0667b<C1662hx, Api.ApiOptions.NoOptions>() {
        /* renamed from: a */
        public C1662hx mo10533a(Context context, Looper looper, C1744jg jgVar, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C1662hx(context, looper, connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };

    /* renamed from: CI */
    public static final Api<Api.ApiOptions.NoOptions> f3610CI = new Api<>(f3609CH, f3608CG, new Scope[0]);

    /* renamed from: CJ */
    public static final C1654ht f3611CJ = new C1664hz();
}
