package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.C1036e;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;
import com.google.android.gms.internal.C1863lu;
import com.google.android.gms.internal.C1868lw;

/* renamed from: com.google.android.gms.internal.mj */
public class C1909mj implements HistoryApi {

    /* renamed from: com.google.android.gms.internal.mj$a */
    private static class C1913a extends C1868lw.C1869a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DataReadResult> f4085Ea;

        /* renamed from: Vi */
        private int f4086Vi;

        /* renamed from: Vj */
        private DataReadResult f4087Vj;

        private C1913a(BaseImplementation.C0670b<DataReadResult> bVar) {
            this.f4086Vi = 0;
            this.f4087Vj = null;
            this.f4085Ea = bVar;
        }

        /* renamed from: a */
        public void mo16081a(DataReadResult dataReadResult) {
            synchronized (this) {
                Log.v("Fitness", "Received batch result");
                if (this.f4087Vj == null) {
                    this.f4087Vj = dataReadResult;
                } else {
                    this.f4087Vj.mo12882b(dataReadResult);
                }
                this.f4086Vi++;
                if (this.f4086Vi == this.f4087Vj.mo12892kr()) {
                    this.f4085Ea.mo10914b(this.f4087Vj);
                }
            }
        }
    }

    public PendingResult<Status> deleteData(GoogleApiClient googleApiClient, final DataDeleteRequest dataDeleteRequest) {
        return googleApiClient.mo10938a(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16093a(dataDeleteRequest, (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<Status> insertData(GoogleApiClient googleApiClient, final DataSet dataSet) {
        return googleApiClient.mo10938a(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16106a(new C1036e.C1038a().mo12755b(dataSet).mo12756jU(), (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<DataReadResult> readData(GoogleApiClient googleApiClient, final DataReadRequest dataReadRequest) {
        return googleApiClient.mo10938a(new C1863lu.C1864a<DataReadResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16094a(dataReadRequest, (C1868lw) new C1913a(this), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: x */
            public DataReadResult mo10544c(Status status) {
                return DataReadResult.m1968a(status, dataReadRequest);
            }
        });
    }
}
