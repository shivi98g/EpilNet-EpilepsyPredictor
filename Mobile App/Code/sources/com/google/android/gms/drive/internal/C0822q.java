package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;

/* renamed from: com.google.android.gms.drive.internal.q */
abstract class C0822q<R extends Result> extends BaseImplementation.C0669a<R, C0824r> {

    /* renamed from: com.google.android.gms.drive.internal.q$a */
    static abstract class C0823a extends C0822q<Status> {
        C0823a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public C0822q(GoogleApiClient googleApiClient) {
        super(Drive.f842DQ, googleApiClient);
    }
}
