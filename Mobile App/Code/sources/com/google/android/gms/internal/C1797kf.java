package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.kf */
abstract class C1797kf<R extends Result> extends BaseImplementation.C0669a<R, C1799kg> {

    /* renamed from: com.google.android.gms.internal.kf$a */
    static abstract class C1798a extends C1797kf<Status> {
        public C1798a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public C1797kf(GoogleApiClient googleApiClient) {
        super(C1791kc.f3954DQ, googleApiClient);
    }
}
