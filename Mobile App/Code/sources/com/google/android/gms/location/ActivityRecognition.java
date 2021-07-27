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
import com.google.android.gms.internal.C1965nb;
import com.google.android.gms.internal.C1999nk;

public class ActivityRecognition {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(f4277DR, f4276DQ, new Scope[0]);
    public static ActivityRecognitionApi ActivityRecognitionApi = new C1965nb();
    public static final String CLIENT_NAME = "activity_recognition";
    /* access modifiers changed from: private */

    /* renamed from: DQ */
    public static final Api.C0668c<C1999nk> f4276DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C1999nk, Api.ApiOptions.NoOptions> f4277DR = new Api.C0667b<C1999nk, Api.ApiOptions.NoOptions>() {
        /* renamed from: e */
        public C1999nk mo10533a(Context context, Looper looper, C1744jg jgVar, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C1999nk(context, looper, context.getPackageName(), connectionCallbacks, onConnectionFailedListener, ActivityRecognition.CLIENT_NAME);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };

    /* renamed from: com.google.android.gms.location.ActivityRecognition$a */
    public static abstract class C2197a<R extends Result> extends BaseImplementation.C0669a<R, C1999nk> {
        public C2197a(GoogleApiClient googleApiClient) {
            super(ActivityRecognition.f4276DQ, googleApiClient);
        }
    }

    private ActivityRecognition() {
    }
}
