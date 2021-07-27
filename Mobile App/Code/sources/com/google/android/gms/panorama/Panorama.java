package com.google.android.gms.panorama;

import android.content.Context;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C2037ol;
import com.google.android.gms.internal.C2044om;

public final class Panorama {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(f4367DR, f4366DQ, new Scope[0]);

    /* renamed from: DQ */
    public static final Api.C0668c<C2044om> f4366DQ = new Api.C0668c<>();

    /* renamed from: DR */
    static final Api.C0667b<C2044om, Api.ApiOptions.NoOptions> f4367DR = new Api.C0667b<C2044om, Api.ApiOptions.NoOptions>() {
        /* renamed from: f */
        public C2044om mo10533a(Context context, Looper looper, C1744jg jgVar, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C2044om(context, looper, connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };
    public static final PanoramaApi PanoramaApi = new C2037ol();

    private Panorama() {
    }
}
