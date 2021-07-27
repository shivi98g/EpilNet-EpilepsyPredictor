package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.wearable.internal.C2726ah;
import com.google.android.gms.wearable.internal.C2733ak;
import com.google.android.gms.wearable.internal.C2753ay;
import com.google.android.gms.wearable.internal.C2766ba;
import com.google.android.gms.wearable.internal.C2771e;
import com.google.android.gms.wearable.internal.C2772f;

public class Wearable {
    public static final Api<WearableOptions> API = new Api<>(f4527DR, f4526DQ, new Scope[0]);

    /* renamed from: DQ */
    public static final Api.C0668c<C2766ba> f4526DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C2766ba, WearableOptions> f4527DR = new Api.C0667b<C2766ba, WearableOptions>() {
        /* renamed from: a */
        public C2766ba mo10533a(Context context, Looper looper, C1744jg jgVar, WearableOptions wearableOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            if (wearableOptions == null) {
                new WearableOptions(new WearableOptions.Builder());
            }
            return new C2766ba(context, looper, connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };
    public static final DataApi DataApi = new C2772f();
    public static final MessageApi MessageApi = new C2726ah();
    public static final NodeApi NodeApi = new C2733ak();
    public static final C2702b axl = new C2771e();
    public static final C2706f axm = new C2753ay();

    public static final class WearableOptions implements Api.ApiOptions.Optional {

        public static class Builder {
            public WearableOptions build() {
                return new WearableOptions(this);
            }
        }

        private WearableOptions(Builder builder) {
        }
    }

    private Wearable() {
    }
}
