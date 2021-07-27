package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1973nf;
import com.google.android.gms.internal.C1982ng;
import com.google.android.gms.internal.C1999nk;

public class LocationServices {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(f4286DR, f4285DQ, new Scope[0]);
    /* access modifiers changed from: private */

    /* renamed from: DQ */
    public static final Api.C0668c<C1999nk> f4285DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C1999nk, Api.ApiOptions.NoOptions> f4286DR = new Api.C0667b<C1999nk, Api.ApiOptions.NoOptions>() {
        /* renamed from: e */
        public C1999nk mo10533a(Context context, Looper looper, C1744jg jgVar, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C1999nk(context, looper, context.getPackageName(), connectionCallbacks, onConnectionFailedListener, "locationServices", jgVar.getAccountName());
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };
    public static FusedLocationProviderApi FusedLocationApi = new C1973nf();
    public static GeofencingApi GeofencingApi = new C1982ng();

    /* renamed from: com.google.android.gms.location.LocationServices$a */
    public static abstract class C2201a<R extends Result> extends BaseImplementation.C0669a<R, C1999nk> {
        public C2201a(GoogleApiClient googleApiClient) {
            super(LocationServices.f4285DQ, googleApiClient);
        }
    }

    private LocationServices() {
    }

    /* renamed from: f */
    public static C1999nk m6620f(GoogleApiClient googleApiClient) {
        boolean z = false;
        C1785jx.m5361b(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        C1999nk nkVar = (C1999nk) googleApiClient.mo10937a(f4285DQ);
        if (nkVar != null) {
            z = true;
        }
        C1785jx.m5355a(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return nkVar;
    }
}
