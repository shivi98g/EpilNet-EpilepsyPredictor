package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.C1043j;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;
import com.google.android.gms.internal.C1863lu;
import com.google.android.gms.internal.C1874ly;

/* renamed from: com.google.android.gms.internal.mi */
public class C1904mi implements ConfigApi {

    /* renamed from: com.google.android.gms.internal.mi$a */
    private static class C1908a extends C1874ly.C1875a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DataTypeResult> f4078Ea;

        private C1908a(BaseImplementation.C0670b<DataTypeResult> bVar) {
            this.f4078Ea = bVar;
        }

        /* renamed from: a */
        public void mo16089a(DataTypeResult dataTypeResult) {
            this.f4078Ea.mo10914b(dataTypeResult);
        }
    }

    public PendingResult<DataTypeResult> createCustomDataType(GoogleApiClient googleApiClient, final DataTypeCreateRequest dataTypeCreateRequest) {
        return googleApiClient.mo10940b(new C1863lu.C1864a<DataTypeResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16096a(dataTypeCreateRequest, (C1874ly) new C1908a(this), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: w */
            public DataTypeResult mo10544c(Status status) {
                return DataTypeResult.m1980E(status);
            }
        });
    }

    public PendingResult<Status> disableFit(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16114a((C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<DataTypeResult> readDataType(GoogleApiClient googleApiClient, String str) {
        final C1043j jVar = new C1043j(str);
        return googleApiClient.mo10938a(new C1863lu.C1864a<DataTypeResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16107a(jVar, (C1874ly) new C1908a(this), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: w */
            public DataTypeResult mo10544c(Status status) {
                return DataTypeResult.m1980E(status);
            }
        });
    }
}
