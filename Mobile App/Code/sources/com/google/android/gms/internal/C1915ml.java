package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.C1023af;
import com.google.android.gms.fitness.request.C1029aj;
import com.google.android.gms.fitness.request.C1048m;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import com.google.android.gms.internal.C1863lu;
import com.google.android.gms.internal.C1881ma;

/* renamed from: com.google.android.gms.internal.ml */
public class C1915ml implements RecordingApi {

    /* renamed from: com.google.android.gms.internal.ml$a */
    private static class C1919a extends C1881ma.C1882a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<ListSubscriptionsResult> f4094Ea;

        private C1919a(BaseImplementation.C0670b<ListSubscriptionsResult> bVar) {
            this.f4094Ea = bVar;
        }

        /* renamed from: a */
        public void mo16119a(ListSubscriptionsResult listSubscriptionsResult) {
            this.f4094Ea.mo10914b(listSubscriptionsResult);
        }
    }

    /* renamed from: a */
    private PendingResult<ListSubscriptionsResult> m5682a(GoogleApiClient googleApiClient, final C1048m mVar) {
        return googleApiClient.mo10938a(new C1863lu.C1864a<ListSubscriptionsResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16108a(mVar, (C1881ma) new C1919a(this), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public ListSubscriptionsResult mo10544c(Status status) {
                return ListSubscriptionsResult.m1982F(status);
            }
        });
    }

    /* renamed from: a */
    public PendingResult<Status> mo16151a(GoogleApiClient googleApiClient, final C1023af afVar) {
        return googleApiClient.mo10938a(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16102a(afVar, (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    /* renamed from: a */
    public PendingResult<Status> mo16152a(GoogleApiClient googleApiClient, final C1029aj ajVar) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16104a(ajVar, (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient googleApiClient) {
        return m5682a(googleApiClient, new C1048m.C1050a().mo12792ka());
    }

    public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient googleApiClient, DataType dataType) {
        return m5682a(googleApiClient, new C1048m.C1050a().mo12791c(dataType).mo12792ka());
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, DataSource dataSource) {
        return mo16151a(googleApiClient, new C1023af.C1025a().mo12705b(new Subscription.C0981a().mo12412b(dataSource).mo12414jK()).mo12706kp());
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, DataType dataType) {
        return mo16151a(googleApiClient, new C1023af.C1025a().mo12705b(new Subscription.C0981a().mo12413b(dataType).mo12414jK()).mo12706kp());
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, DataSource dataSource) {
        return mo16152a(googleApiClient, new C1029aj.C1031a().mo12727d(dataSource).mo12729kq());
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, DataType dataType) {
        return mo16152a(googleApiClient, new C1029aj.C1031a().mo12728d(dataType).mo12729kq());
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, Subscription subscription) {
        return subscription.getDataType() == null ? unsubscribe(googleApiClient, subscription.getDataSource()) : unsubscribe(googleApiClient, subscription.getDataType());
    }
}
