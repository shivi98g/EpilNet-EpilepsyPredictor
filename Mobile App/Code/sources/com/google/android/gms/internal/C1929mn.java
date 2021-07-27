package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.C1018aa;
import com.google.android.gms.fitness.request.C1058u;
import com.google.android.gms.fitness.request.C1060w;
import com.google.android.gms.fitness.request.C1064y;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import com.google.android.gms.internal.C1863lu;
import com.google.android.gms.internal.C1884mb;
import com.google.android.gms.internal.C1887mc;

/* renamed from: com.google.android.gms.internal.mn */
public class C1929mn implements SessionsApi {

    /* renamed from: com.google.android.gms.internal.mn$a */
    private static class C1936a extends C1884mb.C1885a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<SessionReadResult> f4119Ea;

        private C1936a(BaseImplementation.C0670b<SessionReadResult> bVar) {
            this.f4119Ea = bVar;
        }

        /* renamed from: a */
        public void mo16123a(SessionReadResult sessionReadResult) throws RemoteException {
            this.f4119Ea.mo10914b(sessionReadResult);
        }
    }

    /* renamed from: com.google.android.gms.internal.mn$b */
    private static class C1937b extends C1887mc.C1888a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<SessionStopResult> f4120Ea;

        private C1937b(BaseImplementation.C0670b<SessionStopResult> bVar) {
            this.f4120Ea = bVar;
        }

        /* renamed from: a */
        public void mo16127a(SessionStopResult sessionStopResult) {
            this.f4120Ea.mo10914b(sessionStopResult);
        }
    }

    /* renamed from: a */
    private PendingResult<SessionStopResult> m5712a(GoogleApiClient googleApiClient, final String str, final String str2) {
        return googleApiClient.mo10940b(new C1863lu.C1864a<SessionStopResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: A */
            public SessionStopResult mo10544c(Status status) {
                return SessionStopResult.m1987H(status);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16113a(new C1064y.C1066a().mo12867bx(str).mo12868by(str2).mo12869kl(), (C1887mc) new C1937b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<Status> insertSession(GoogleApiClient googleApiClient, final SessionInsertRequest sessionInsertRequest) {
        return googleApiClient.mo10938a(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16097a(sessionInsertRequest, (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<SessionReadResult> readSession(GoogleApiClient googleApiClient, final SessionReadRequest sessionReadRequest) {
        return googleApiClient.mo10938a(new C1863lu.C1864a<SessionReadResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: B */
            public SessionReadResult mo10544c(Status status) {
                return SessionReadResult.m1984G(status);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16098a(sessionReadRequest, (C1884mb) new C1936a(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<Status> registerForSessions(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                C1863lu.C1865b bVar = new C1863lu.C1865b(this);
                luVar.mo16077jM().mo16111a(new C1058u(pendingIntent), (C1890md) bVar, luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<Status> startSession(GoogleApiClient googleApiClient, final Session session) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16112a(new C1060w.C1062a().mo12853b(session).mo12854kk(), (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<SessionStopResult> stopSession(GoogleApiClient googleApiClient, String str) {
        return m5712a(googleApiClient, (String) null, str);
    }

    public PendingResult<Status> unregisterForSessions(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                C1863lu.C1865b bVar = new C1863lu.C1865b(this);
                luVar.mo16077jM().mo16100a(new C1018aa(pendingIntent), (C1890md) bVar, luVar.getContext().getPackageName());
            }
        });
    }
}
