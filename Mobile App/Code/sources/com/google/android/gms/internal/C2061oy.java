package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.C2432e;

/* renamed from: com.google.android.gms.internal.oy */
public final class C2061oy implements Account {

    /* renamed from: com.google.android.gms.internal.oy$a */
    private static abstract class C2063a extends Plus.C2407a<Status> {
        private C2063a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.Api$c, com.google.android.gms.common.api.Api$c<com.google.android.gms.plus.internal.e>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.plus.internal.C2432e m6081a(com.google.android.gms.common.api.GoogleApiClient r4, com.google.android.gms.common.api.Api.C0668c<com.google.android.gms.plus.internal.C2432e> r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2061oy.m6081a(com.google.android.gms.common.api.GoogleApiClient, com.google.android.gms.common.api.Api$c):com.google.android.gms.plus.internal.e");
    }

    public void clearDefaultAccount(GoogleApiClient googleApiClient) {
        m6081a(googleApiClient, Plus.f4368DQ).clearDefaultAccount();
    }

    public String getAccountName(GoogleApiClient googleApiClient) {
        return m6081a(googleApiClient, Plus.f4368DQ).getAccountName();
    }

    public PendingResult<Status> revokeAccessAndDisconnect(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10940b(new C2063a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.mo18468l((BaseImplementation.C0670b<Status>) this);
            }
        });
    }
}
