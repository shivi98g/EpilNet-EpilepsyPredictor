package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;

/* renamed from: com.google.android.gms.internal.kc */
public final class C1791kc {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(f3955DR, f3954DQ, new Scope[0]);

    /* renamed from: DQ */
    public static final Api.C0668c<C1799kg> f3954DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C1799kg, Api.ApiOptions.NoOptions> f3955DR = new Api.C0667b<C1799kg, Api.ApiOptions.NoOptions>() {
        /* renamed from: c */
        public C1799kg mo10533a(Context context, Looper looper, C1744jg jgVar, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C1799kg(context, looper, connectionCallbacks, onConnectionFailedListener, new String[0]);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };

    /* renamed from: Nu */
    public static final C1793kd f3956Nu = new C1794ke();
}
