package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.internal.C1890md;

/* renamed from: com.google.android.gms.internal.lu */
public interface C1863lu extends Api.C0666a {

    /* renamed from: com.google.android.gms.internal.lu$a */
    public static abstract class C1864a<R extends Result> extends BaseImplementation.C0669a<R, C1863lu> {
        public C1864a(GoogleApiClient googleApiClient) {
            super(Fitness.f1320DQ, googleApiClient);
        }
    }

    /* renamed from: com.google.android.gms.internal.lu$b */
    public static class C1865b extends C1890md.C1891a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f4049Ea;

        public C1865b(BaseImplementation.C0670b<Status> bVar) {
            this.f4049Ea = bVar;
        }

        /* renamed from: j */
        public void mo16078j(Status status) {
            this.f4049Ea.mo10914b(status);
        }
    }

    /* renamed from: com.google.android.gms.internal.lu$c */
    public static abstract class C1866c extends C1864a<Status> {
        C1866c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Status mo10544c(Status status) {
            C1785jx.m5354L(!status.isSuccess());
            return status;
        }
    }

    Context getContext();

    /* renamed from: jM */
    C1877lz mo16077jM() throws DeadObjectException;
}
