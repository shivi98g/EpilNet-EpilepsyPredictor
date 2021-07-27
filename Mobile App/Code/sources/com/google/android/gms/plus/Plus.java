package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C2061oy;
import com.google.android.gms.internal.C2064oz;
import com.google.android.gms.internal.C2066pa;
import com.google.android.gms.internal.C2067pb;
import com.google.android.gms.internal.C2076pc;
import com.google.android.gms.plus.internal.C2432e;
import com.google.android.gms.plus.internal.C2443h;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import java.util.HashSet;
import java.util.Set;

public final class Plus {
    public static final Api<PlusOptions> API = new Api<>(f4369DR, f4368DQ, new Scope[0]);
    public static final Account AccountApi = new C2061oy();

    /* renamed from: DQ */
    public static final Api.C0668c<C2432e> f4368DQ = new Api.C0668c<>();

    /* renamed from: DR */
    static final Api.C0667b<C2432e, PlusOptions> f4369DR = new Api.C0667b<C2432e, PlusOptions>() {
        /* renamed from: a */
        public C2432e mo10533a(Context context, Looper looper, C1744jg jgVar, PlusOptions plusOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C2432e(context, looper, connectionCallbacks, onConnectionFailedListener, new C2443h(jgVar.mo15787hm(), jgVar.mo15790hp(), (String[]) (plusOptions == null ? new PlusOptions() : plusOptions).ans.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), (String) null, new PlusCommonExtras()));
        }

        public int getPriority() {
            return 2;
        }
    };
    public static final Moments MomentsApi = new C2067pb();
    public static final People PeopleApi = new C2076pc();
    public static final Scope SCOPE_PLUS_LOGIN = new Scope(Scopes.PLUS_LOGIN);
    public static final Scope SCOPE_PLUS_PROFILE = new Scope(Scopes.PLUS_ME);
    public static final C2421b anp = new C2066pa();
    public static final C2420a anq = new C2064oz();

    public static final class PlusOptions implements Api.ApiOptions.Optional {
        final String anr;
        final Set<String> ans;

        public static final class Builder {
            String anr;
            final Set<String> ans = new HashSet();

            public Builder addActivityTypes(String... strArr) {
                C1785jx.m5359b(strArr, (Object) "activityTypes may not be null.");
                for (String add : strArr) {
                    this.ans.add(add);
                }
                return this;
            }

            public PlusOptions build() {
                return new PlusOptions(this);
            }

            public Builder setServerClientId(String str) {
                this.anr = str;
                return this;
            }
        }

        private PlusOptions() {
            this.anr = null;
            this.ans = new HashSet();
        }

        private PlusOptions(Builder builder) {
            this.anr = builder.anr;
            this.ans = builder.ans;
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    /* renamed from: com.google.android.gms.plus.Plus$a */
    public static abstract class C2407a<R extends Result> extends BaseImplementation.C0669a<R, C2432e> {
        public C2407a(GoogleApiClient googleApiClient) {
            super(Plus.f4368DQ, googleApiClient);
        }
    }

    private Plus() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.Api$c, com.google.android.gms.common.api.Api$c<com.google.android.gms.plus.internal.e>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.plus.internal.C2432e m6946a(com.google.android.gms.common.api.GoogleApiClient r4, com.google.android.gms.common.api.Api.C0668c<com.google.android.gms.plus.internal.C2432e> r5) {
        /*
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0006
            r2 = r1
            goto L_0x0007
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.String r3 = "GoogleApiClient parameter is required."
            com.google.android.gms.internal.C1785jx.m5361b((boolean) r2, (java.lang.Object) r3)
            boolean r2 = r4.isConnected()
            java.lang.String r3 = "GoogleApiClient must be connected."
            com.google.android.gms.internal.C1785jx.m5355a(r2, r3)
            com.google.android.gms.common.api.Api$a r4 = r4.mo10937a(r5)
            com.google.android.gms.plus.internal.e r4 = (com.google.android.gms.plus.internal.C2432e) r4
            if (r4 == 0) goto L_0x001e
            r0 = r1
        L_0x001e:
            java.lang.String r5 = "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature."
            com.google.android.gms.internal.C1785jx.m5355a(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.Plus.m6946a(com.google.android.gms.common.api.GoogleApiClient, com.google.android.gms.common.api.Api$c):com.google.android.gms.plus.internal.e");
    }
}
