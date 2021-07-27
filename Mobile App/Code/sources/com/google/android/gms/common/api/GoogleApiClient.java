package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p000v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface GoogleApiClient {

    public static final class Builder {

        /* renamed from: DZ */
        private String f648DZ;

        /* renamed from: JF */
        private Looper f649JF;

        /* renamed from: JH */
        private final Set<String> f650JH;

        /* renamed from: JI */
        private int f651JI;

        /* renamed from: JJ */
        private View f652JJ;

        /* renamed from: JK */
        private String f653JK;

        /* renamed from: JL */
        private final Map<Api<?>, Api.ApiOptions> f654JL;

        /* renamed from: JM */
        private FragmentActivity f655JM;

        /* renamed from: JN */
        private int f656JN;

        /* renamed from: JO */
        private OnConnectionFailedListener f657JO;

        /* renamed from: JP */
        private final Set<ConnectionCallbacks> f658JP;

        /* renamed from: JQ */
        private final Set<OnConnectionFailedListener> f659JQ;
        private final Context mContext;

        public Builder(Context context) {
            this.f650JH = new HashSet();
            this.f654JL = new HashMap();
            this.f656JN = -1;
            this.f658JP = new HashSet();
            this.f659JQ = new HashSet();
            this.mContext = context;
            this.f649JF = context.getMainLooper();
            this.f653JK = context.getPackageName();
        }

        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            C1785jx.m5359b(connectionCallbacks, (Object) "Must provide a connected listener");
            this.f658JP.add(connectionCallbacks);
            C1785jx.m5359b(onConnectionFailedListener, (Object) "Must provide a connection failed listener");
            this.f659JQ.add(onConnectionFailedListener);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.common.api.GoogleApiClient} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.gms.common.api.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.gms.common.api.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.gms.common.api.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: gI */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.google.android.gms.common.api.GoogleApiClient m541gI() {
            /*
                r10 = this;
                android.support.v4.app.FragmentActivity r0 = r10.f655JM
                com.google.android.gms.common.api.g r0 = com.google.android.gms.common.api.C0692g.m602a((android.support.p000v4.app.FragmentActivity) r0)
                int r1 = r10.f656JN
                com.google.android.gms.common.api.GoogleApiClient r1 = r0.mo11020an(r1)
                if (r1 != 0) goto L_0x0028
                com.google.android.gms.common.api.c r1 = new com.google.android.gms.common.api.c
                android.content.Context r2 = r10.mContext
                android.content.Context r3 = r2.getApplicationContext()
                android.os.Looper r4 = r10.f649JF
                com.google.android.gms.internal.jg r5 = r10.mo10965gH()
                java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions> r6 = r10.f654JL
                java.util.Set<com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks> r7 = r10.f658JP
                java.util.Set<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r8 = r10.f659JQ
                int r9 = r10.f656JN
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            L_0x0028:
                int r2 = r10.f656JN
                com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r3 = r10.f657JO
                r0.mo11018a((int) r2, (com.google.android.gms.common.api.GoogleApiClient) r1, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient.Builder.m541gI():com.google.android.gms.common.api.GoogleApiClient");
        }

        public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            this.f654JL.put(api, (Object) null);
            List<Scope> gy = api.mo10904gy();
            int size = gy.size();
            for (int i = 0; i < size; i++) {
                this.f650JH.add(gy.get(i).mo10975gO());
            }
            return this;
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o) {
            C1785jx.m5359b(o, (Object) "Null options are not permitted for this Api");
            this.f654JL.put(api, o);
            List<Scope> gy = api.mo10904gy();
            int size = gy.size();
            for (int i = 0; i < size; i++) {
                this.f650JH.add(gy.get(i).mo10975gO());
            }
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            this.f658JP.add(connectionCallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            this.f659JQ.add(onConnectionFailedListener);
            return this;
        }

        public Builder addScope(Scope scope) {
            this.f650JH.add(scope.mo10975gO());
            return this;
        }

        public GoogleApiClient build() {
            C1785jx.m5361b(!this.f654JL.isEmpty(), (Object) "must call addApi() to add at least one API");
            return this.f656JN >= 0 ? m541gI() : new C0675c(this.mContext, this.f649JF, mo10965gH(), this.f654JL, this.f658JP, this.f659JQ, -1);
        }

        public Builder enableAutoManage(FragmentActivity fragmentActivity, int i, OnConnectionFailedListener onConnectionFailedListener) {
            C1785jx.m5361b(i >= 0, (Object) "clientId must be non-negative");
            this.f656JN = i;
            this.f655JM = (FragmentActivity) C1785jx.m5359b(fragmentActivity, (Object) "Null activity is not permitted.");
            this.f657JO = onConnectionFailedListener;
            return this;
        }

        /* renamed from: gH */
        public C1744jg mo10965gH() {
            return new C1744jg(this.f648DZ, this.f650JH, this.f651JI, this.f652JJ, this.f653JK);
        }

        public Builder setAccountName(String str) {
            this.f648DZ = str;
            return this;
        }

        public Builder setGravityForPopups(int i) {
            this.f651JI = i;
            return this;
        }

        public Builder setHandler(Handler handler) {
            C1785jx.m5359b(handler, (Object) "Handler must not be null");
            this.f649JF = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view) {
            this.f652JJ = view;
            return this;
        }

        public Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }
    }

    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener extends GooglePlayServicesClient.OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    <C extends Api.C0666a> C mo10937a(Api.C0668c<C> cVar);

    /* renamed from: a */
    <A extends Api.C0666a, R extends Result, T extends BaseImplementation.C0669a<R, A>> T mo10938a(T t);

    /* renamed from: a */
    boolean mo10939a(Scope scope);

    /* renamed from: b */
    <A extends Api.C0666a, T extends BaseImplementation.C0669a<? extends Result, A>> T mo10940b(T t);

    ConnectionResult blockingConnect();

    ConnectionResult blockingConnect(long j, TimeUnit timeUnit);

    PendingResult<Status> clearDefaultAccountAndReconnect();

    void connect();

    /* renamed from: d */
    <L> C0687d<L> mo10945d(L l);

    void disconnect();

    Looper getLooper();

    boolean isConnected();

    boolean isConnecting();

    boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks);

    boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener);

    void reconnect();

    void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    void stopAutoManage(FragmentActivity fragmentActivity);

    void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);
}
