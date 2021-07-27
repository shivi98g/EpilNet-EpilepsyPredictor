package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.C0992k;
import com.google.android.gms.fitness.data.C0995l;
import com.google.android.gms.fitness.request.C1052o;
import com.google.android.gms.fitness.request.C1054q;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.C1863lu;
import com.google.android.gms.internal.C1871lx;
import com.google.android.gms.internal.C1890md;

/* renamed from: com.google.android.gms.internal.mm */
public class C1920mm implements SensorsApi {

    /* renamed from: com.google.android.gms.internal.mm$a */
    private static abstract class C1925a<R extends Result> extends BaseImplementation.C0669a<R, C1863lu> {
        public C1925a(GoogleApiClient googleApiClient) {
            super(Fitness.f1320DQ, googleApiClient);
        }
    }

    /* renamed from: com.google.android.gms.internal.mm$b */
    private interface C1926b {
        /* renamed from: jO */
        void mo16161jO();
    }

    /* renamed from: com.google.android.gms.internal.mm$c */
    private static class C1927c extends C1871lx.C1872a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DataSourcesResult> f4104Ea;

        private C1927c(BaseImplementation.C0670b<DataSourcesResult> bVar) {
            this.f4104Ea = bVar;
        }

        /* renamed from: a */
        public void mo16085a(DataSourcesResult dataSourcesResult) {
            this.f4104Ea.mo10914b(dataSourcesResult);
        }
    }

    /* renamed from: com.google.android.gms.internal.mm$d */
    private static class C1928d extends C1890md.C1891a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f4105Ea;

        /* renamed from: Vu */
        private final C1926b f4106Vu;

        private C1928d(BaseImplementation.C0670b<Status> bVar, C1926b bVar2) {
            this.f4105Ea = bVar;
            this.f4106Vu = bVar2;
        }

        /* renamed from: j */
        public void mo16078j(Status status) {
            if (this.f4106Vu != null && status.isSuccess()) {
                this.f4106Vu.mo16161jO();
            }
            this.f4105Ea.mo10914b(status);
        }
    }

    /* renamed from: a */
    private PendingResult<Status> m5694a(GoogleApiClient googleApiClient, final C1052o oVar) {
        return googleApiClient.mo10938a(new C1925a<Status>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16109a(oVar, (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Status mo10544c(Status status) {
                return status;
            }
        });
    }

    /* renamed from: a */
    private PendingResult<Status> m5695a(GoogleApiClient googleApiClient, final C1054q qVar, final C1926b bVar) {
        return googleApiClient.mo10940b(new C1925a<Status>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16110a(qVar, (C1890md) new C1928d(this, bVar), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Status mo10544c(Status status) {
                return status;
            }
        });
    }

    public PendingResult<Status> add(GoogleApiClient googleApiClient, SensorRequest sensorRequest, PendingIntent pendingIntent) {
        return m5694a(googleApiClient, new C1052o(sensorRequest, (C0992k) null, pendingIntent));
    }

    public PendingResult<Status> add(GoogleApiClient googleApiClient, SensorRequest sensorRequest, OnDataPointListener onDataPointListener) {
        return m5694a(googleApiClient, new C1052o(sensorRequest, C0995l.C0997a.m1747jG().mo12480a(onDataPointListener), (PendingIntent) null));
    }

    public PendingResult<DataSourcesResult> findDataSources(GoogleApiClient googleApiClient, final DataSourcesRequest dataSourcesRequest) {
        return googleApiClient.mo10938a(new C1925a<DataSourcesResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16095a(dataSourcesRequest, (C1871lx) new C1927c(this), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: z */
            public DataSourcesResult mo10544c(Status status) {
                return DataSourcesResult.m1978D(status);
            }
        });
    }

    public PendingResult<Status> remove(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return m5695a(googleApiClient, new C1054q((C0992k) null, pendingIntent), (C1926b) null);
    }

    public PendingResult<Status> remove(GoogleApiClient googleApiClient, final OnDataPointListener onDataPointListener) {
        C0995l b = C0995l.C0997a.m1747jG().mo12481b(onDataPointListener);
        return b == null ? new C1893me(Status.f663Kw) : m5695a(googleApiClient, new C1054q(b, (PendingIntent) null), new C1926b() {
            /* renamed from: jO */
            public void mo16161jO() {
                C0995l.C0997a.m1747jG().mo12482c(onDataPointListener);
            }
        });
    }
}
