package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p000v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1759jm;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1791kc;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.common.api.c */
final class C0675c implements GoogleApiClient {

    /* renamed from: JF */
    private final Looper f673JF;

    /* renamed from: JR */
    private final Condition f674JR = this.f697zO.newCondition();

    /* renamed from: JS */
    private final C1759jm f675JS;

    /* renamed from: JT */
    private final int f676JT;

    /* renamed from: JU */
    final Queue<C0686d<?>> f677JU = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: JV */
    public ConnectionResult f678JV;
    /* access modifiers changed from: private */

    /* renamed from: JW */
    public int f679JW;
    /* access modifiers changed from: private */

    /* renamed from: JX */
    public volatile int f680JX = 4;
    /* access modifiers changed from: private */

    /* renamed from: JY */
    public volatile boolean f681JY;

    /* renamed from: JZ */
    private boolean f682JZ = false;

    /* renamed from: Jy */
    private final C0684b f683Jy = new C0684b() {
        /* renamed from: b */
        public void mo11001b(C0686d<?> dVar) {
            C0675c.this.f694Kk.remove(dVar);
        }
    };

    /* renamed from: Ka */
    private int f684Ka;
    /* access modifiers changed from: private */

    /* renamed from: Kb */
    public long f685Kb = 120000;
    /* access modifiers changed from: private */

    /* renamed from: Kc */
    public long f686Kc = 5000;

    /* renamed from: Kd */
    final Handler f687Kd;

    /* renamed from: Ke */
    BroadcastReceiver f688Ke;
    /* access modifiers changed from: private */

    /* renamed from: Kf */
    public final Bundle f689Kf = new Bundle();

    /* renamed from: Kg */
    private final Map<Api.C0668c<?>, Api.C0666a> f690Kg = new HashMap();

    /* renamed from: Kh */
    private final List<String> f691Kh;
    /* access modifiers changed from: private */

    /* renamed from: Ki */
    public boolean f692Ki;

    /* renamed from: Kj */
    private final Set<C0687d<?>> f693Kj = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: Kk */
    final Set<C0686d<?>> f694Kk = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: Kl */
    private final GoogleApiClient.ConnectionCallbacks f695Kl = new GoogleApiClient.ConnectionCallbacks() {
        public void onConnected(Bundle bundle) {
            C0675c.this.f697zO.lock();
            try {
                if (C0675c.this.f680JX == 1) {
                    if (bundle != null) {
                        C0675c.this.f689Kf.putAll(bundle);
                    }
                    C0675c.this.m569gJ();
                }
            } finally {
                C0675c.this.f697zO.unlock();
            }
        }

        public void onConnectionSuspended(int i) {
            C0675c.this.f697zO.lock();
            switch (i) {
                case 1:
                    if (!C0675c.this.mo11000gL()) {
                        boolean unused = C0675c.this.f681JY = true;
                        C0675c.this.f688Ke = new C0683a(C0675c.this);
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        C0675c.this.mContext.registerReceiver(C0675c.this.f688Ke, intentFilter);
                        C0675c.this.f687Kd.sendMessageDelayed(C0675c.this.f687Kd.obtainMessage(1), C0675c.this.f685Kb);
                        C0675c.this.f687Kd.sendMessageDelayed(C0675c.this.f687Kd.obtainMessage(2), C0675c.this.f686Kc);
                        C0675c.this.m561al(i);
                        break;
                    } else {
                        C0675c.this.f697zO.unlock();
                        return;
                    }
                case 2:
                    try {
                        C0675c.this.m561al(i);
                        C0675c.this.connect();
                        break;
                    } catch (Throwable th) {
                        C0675c.this.f697zO.unlock();
                        throw th;
                    }
            }
            C0675c.this.f697zO.unlock();
        }
    };

    /* renamed from: Km */
    private final C1759jm.C1761b f696Km = new C1759jm.C1761b() {
        /* renamed from: fX */
        public Bundle mo11002fX() {
            return null;
        }

        /* renamed from: gN */
        public boolean mo11003gN() {
            return C0675c.this.f692Ki;
        }

        public boolean isConnected() {
            return C0675c.this.isConnected();
        }
    };
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: zO */
    public final Lock f697zO = new ReentrantLock();

    /* renamed from: com.google.android.gms.common.api.c$a */
    private static class C0683a extends BroadcastReceiver {

        /* renamed from: Ks */
        private WeakReference<C0675c> f712Ks;

        C0683a(C0675c cVar) {
            this.f712Ks = new WeakReference<>(cVar);
        }

        public void onReceive(Context context, Intent intent) {
            C0675c cVar;
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (schemeSpecificPart != null && schemeSpecificPart.equals(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE) && (cVar = (C0675c) this.f712Ks.get()) != null && !cVar.isConnected() && !cVar.isConnecting() && cVar.mo11000gL()) {
                cVar.connect();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.c$b */
    interface C0684b {
        /* renamed from: b */
        void mo11001b(C0686d<?> dVar);
    }

    /* renamed from: com.google.android.gms.common.api.c$c */
    private class C0685c extends Handler {
        C0685c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C0675c.this.m571gM();
                    return;
                case 2:
                    C0675c.this.resume();
                    return;
                default:
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.c$d */
    interface C0686d<A extends Api.C0666a> {
        /* renamed from: a */
        void mo10926a(C0684b bVar);

        /* renamed from: b */
        void mo10927b(A a) throws DeadObjectException;

        void cancel();

        /* renamed from: gF */
        int mo10929gF();

        /* renamed from: gz */
        Api.C0668c<A> mo10930gz();

        /* renamed from: l */
        void mo10931l(Status status);
    }

    public C0675c(Context context, Looper looper, C1744jg jgVar, Map<Api<?>, Api.ApiOptions> map, Set<GoogleApiClient.ConnectionCallbacks> set, Set<GoogleApiClient.OnConnectionFailedListener> set2, int i) {
        this.mContext = context;
        this.f675JS = new C1759jm(context, looper, this.f696Km);
        this.f673JF = looper;
        this.f687Kd = new C0685c(looper);
        this.f676JT = i;
        for (GoogleApiClient.ConnectionCallbacks registerConnectionCallbacks : set) {
            this.f675JS.registerConnectionCallbacks(registerConnectionCallbacks);
        }
        for (GoogleApiClient.OnConnectionFailedListener registerConnectionFailedListener : set2) {
            this.f675JS.registerConnectionFailedListener(registerConnectionFailedListener);
        }
        for (Api next : map.keySet()) {
            final Api.C0667b gx = next.mo10903gx();
            this.f690Kg.put(next.mo10905gz(), m554a(gx, map.get(next), context, looper, jgVar, this.f695Kl, new GoogleApiClient.OnConnectionFailedListener() {
                public void onConnectionFailed(ConnectionResult connectionResult) {
                    C0675c.this.f697zO.lock();
                    try {
                        if (C0675c.this.f678JV == null || gx.getPriority() < C0675c.this.f679JW) {
                            ConnectionResult unused = C0675c.this.f678JV = connectionResult;
                            int unused2 = C0675c.this.f679JW = gx.getPriority();
                        }
                        C0675c.this.m569gJ();
                    } finally {
                        C0675c.this.f697zO.unlock();
                    }
                }
            }));
        }
        this.f691Kh = Collections.unmodifiableList(jgVar.mo15789ho());
    }

    /* renamed from: a */
    private static <C extends Api.C0666a, O> C m554a(Api.C0667b<C, O> bVar, Object obj, Context context, Looper looper, C1744jg jgVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return bVar.mo10533a(context, looper, jgVar, obj, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m556a(final GoogleApiClient googleApiClient, final C0691f fVar, final boolean z) {
        C1791kc.f3956Nu.mo15950c(googleApiClient).setResultCallback(new ResultCallback<Status>() {
            /* renamed from: j */
            public void onResult(Status status) {
                if (status.isSuccess() && C0675c.this.isConnected()) {
                    C0675c.this.reconnect();
                }
                fVar.mo10914b(status);
                if (z) {
                    googleApiClient.disconnect();
                }
            }
        });
    }

    /* renamed from: a */
    private <A extends Api.C0666a> void m557a(C0686d<A> dVar) throws DeadObjectException {
        this.f697zO.lock();
        try {
            C1785jx.m5361b(dVar.mo10930gz() != null, (Object) "This task can not be executed or enqueued (it's probably a Batch or malformed)");
            this.f694Kk.add(dVar);
            dVar.mo10926a(this.f683Jy);
            if (mo11000gL()) {
                dVar.mo10931l(new Status(8));
                return;
            }
            dVar.mo10927b(mo10937a(dVar.mo10930gz()));
            this.f697zO.unlock();
        } finally {
            this.f697zO.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: al */
    public void m561al(int i) {
        this.f697zO.lock();
        try {
            if (this.f680JX != 3) {
                if (i == -1) {
                    if (isConnecting()) {
                        Iterator it = this.f677JU.iterator();
                        while (it.hasNext()) {
                            C0686d dVar = (C0686d) it.next();
                            if (dVar.mo10929gF() != 1) {
                                dVar.cancel();
                                it.remove();
                            }
                        }
                    } else {
                        this.f677JU.clear();
                    }
                    for (C0686d<?> cancel : this.f694Kk) {
                        cancel.cancel();
                    }
                    this.f694Kk.clear();
                    for (C0687d<?> clear : this.f693Kj) {
                        clear.clear();
                    }
                    this.f693Kj.clear();
                    if (this.f678JV == null && !this.f677JU.isEmpty()) {
                        this.f682JZ = true;
                        return;
                    }
                }
                boolean isConnecting = isConnecting();
                boolean isConnected = isConnected();
                this.f680JX = 3;
                if (isConnecting) {
                    if (i == -1) {
                        this.f678JV = null;
                    }
                    this.f674JR.signalAll();
                }
                this.f692Ki = false;
                for (Api.C0666a next : this.f690Kg.values()) {
                    if (next.isConnected()) {
                        next.disconnect();
                    }
                }
                this.f692Ki = true;
                this.f680JX = 4;
                if (isConnected) {
                    if (i != -1) {
                        this.f675JS.mo15843aE(i);
                    }
                    this.f692Ki = false;
                }
            }
            this.f697zO.unlock();
        } finally {
            this.f697zO.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: gJ */
    public void m569gJ() {
        this.f684Ka--;
        if (this.f684Ka != 0) {
            return;
        }
        if (this.f678JV != null) {
            this.f682JZ = false;
            m561al(3);
            if (!mo11000gL() || !GooglePlayServicesUtil.m494e(this.mContext, this.f678JV.getErrorCode())) {
                m571gM();
                this.f675JS.mo15844b(this.f678JV);
            }
            this.f692Ki = false;
            return;
        }
        this.f680JX = 2;
        m571gM();
        this.f674JR.signalAll();
        m570gK();
        if (this.f682JZ) {
            this.f682JZ = false;
            m561al(-1);
            return;
        }
        this.f675JS.mo15846f(this.f689Kf.isEmpty() ? null : this.f689Kf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022 A[SYNTHETIC, Splitter:B:12:0x0022] */
    /* renamed from: gK */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m570gK() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f697zO
            r0.lock()
            boolean r0 = r3.isConnected()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0014
            boolean r0 = r3.mo11000gL()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r0 = 0
            goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            java.lang.String r1 = "GoogleApiClient is not connected yet."
            com.google.android.gms.internal.C1785jx.m5355a(r0, r1)     // Catch:{ all -> 0x003d }
        L_0x001a:
            java.util.Queue<com.google.android.gms.common.api.c$d<?>> r0 = r3.f677JU     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0037
            java.util.Queue<com.google.android.gms.common.api.c$d<?>> r0 = r3.f677JU     // Catch:{ DeadObjectException -> 0x002e }
            java.lang.Object r0 = r0.remove()     // Catch:{ DeadObjectException -> 0x002e }
            com.google.android.gms.common.api.c$d r0 = (com.google.android.gms.common.api.C0675c.C0686d) r0     // Catch:{ DeadObjectException -> 0x002e }
            r3.m557a(r0)     // Catch:{ DeadObjectException -> 0x002e }
            goto L_0x001a
        L_0x002e:
            r0 = move-exception
            java.lang.String r1 = "GoogleApiClientImpl"
            java.lang.String r2 = "Service died while flushing queue"
            android.util.Log.w(r1, r2, r0)     // Catch:{ all -> 0x003d }
            goto L_0x001a
        L_0x0037:
            java.util.concurrent.locks.Lock r0 = r3.f697zO
            r0.unlock()
            return
        L_0x003d:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.f697zO
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0675c.m570gK():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: gM */
    public void m571gM() {
        this.f697zO.lock();
        try {
            if (this.f681JY) {
                this.f681JY = false;
                this.f687Kd.removeMessages(2);
                this.f687Kd.removeMessages(1);
                this.mContext.unregisterReceiver(this.f688Ke);
                this.f697zO.unlock();
            }
        } finally {
            this.f697zO.unlock();
        }
    }

    /* access modifiers changed from: private */
    public void resume() {
        this.f697zO.lock();
        try {
            if (mo11000gL()) {
                connect();
            }
        } finally {
            this.f697zO.unlock();
        }
    }

    /* renamed from: a */
    public <C extends Api.C0666a> C mo10937a(Api.C0668c<C> cVar) {
        C c = (Api.C0666a) this.f690Kg.get(cVar);
        C1785jx.m5359b(c, (Object) "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: a */
    public <A extends Api.C0666a, R extends Result, T extends BaseImplementation.C0669a<R, A>> T mo10938a(T t) {
        this.f697zO.lock();
        try {
            if (isConnected()) {
                mo10940b(t);
            } else {
                this.f677JU.add(t);
            }
            return t;
        } finally {
            this.f697zO.unlock();
        }
    }

    /* renamed from: a */
    public boolean mo10939a(Scope scope) {
        return this.f691Kh.contains(scope.mo10975gO());
    }

    /* renamed from: b */
    public <A extends Api.C0666a, T extends BaseImplementation.C0669a<? extends Result, A>> T mo10940b(T t) {
        C1785jx.m5355a(isConnected() || mo11000gL(), "GoogleApiClient is not connected yet.");
        m570gK();
        try {
            m557a(t);
            return t;
        } catch (DeadObjectException e) {
            m561al(1);
            return t;
        }
    }

    public ConnectionResult blockingConnect() {
        ConnectionResult connectionResult;
        C1785jx.m5355a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f697zO.lock();
        try {
            connect();
            while (isConnecting()) {
                this.f674JR.await();
            }
            connectionResult = isConnected() ? ConnectionResult.f609Iu : this.f678JV != null ? this.f678JV : new ConnectionResult(13, (PendingIntent) null);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            connectionResult = new ConnectionResult(15, (PendingIntent) null);
        } catch (Throwable th) {
            this.f697zO.unlock();
            throw th;
        }
        this.f697zO.unlock();
        return connectionResult;
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        ConnectionResult connectionResult;
        C1785jx.m5355a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f697zO.lock();
        try {
            connect();
            long nanos = timeUnit.toNanos(j);
            while (true) {
                if (isConnecting()) {
                    nanos = this.f674JR.awaitNanos(nanos);
                    if (nanos <= 0) {
                        connectionResult = new ConnectionResult(14, (PendingIntent) null);
                        break;
                    }
                } else {
                    connectionResult = isConnected() ? ConnectionResult.f609Iu : this.f678JV != null ? this.f678JV : new ConnectionResult(13, (PendingIntent) null);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            connectionResult = new ConnectionResult(15, (PendingIntent) null);
        } catch (Throwable th) {
            this.f697zO.unlock();
            throw th;
        }
        this.f697zO.unlock();
        return connectionResult;
    }

    public PendingResult<Status> clearDefaultAccountAndReconnect() {
        C1785jx.m5355a(isConnected(), "GoogleApiClient is not connected yet.");
        final C0691f fVar = new C0691f(this.f673JF);
        if (this.f690Kg.containsKey(C1791kc.f3954DQ)) {
            m556a(this, fVar, false);
            return fVar;
        }
        final AtomicReference atomicReference = new AtomicReference();
        C06805 r2 = new GoogleApiClient.ConnectionCallbacks() {
            public void onConnected(Bundle bundle) {
                C0675c.this.m556a((GoogleApiClient) atomicReference.get(), fVar, true);
            }

            public void onConnectionSuspended(int i) {
            }
        };
        GoogleApiClient build = new GoogleApiClient.Builder(this.mContext).addApi(C1791kc.API).addConnectionCallbacks(r2).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() {
            public void onConnectionFailed(ConnectionResult connectionResult) {
                fVar.mo10914b(new Status(8));
            }
        }).setHandler(this.f687Kd).build();
        atomicReference.set(build);
        build.connect();
        return fVar;
    }

    public void connect() {
        this.f697zO.lock();
        try {
            this.f682JZ = false;
            if (!isConnected()) {
                if (!isConnecting()) {
                    this.f692Ki = true;
                    this.f678JV = null;
                    this.f680JX = 1;
                    this.f689Kf.clear();
                    this.f684Ka = this.f690Kg.size();
                    for (Api.C0666a connect : this.f690Kg.values()) {
                        connect.connect();
                    }
                    this.f697zO.unlock();
                }
            }
        } finally {
            this.f697zO.unlock();
        }
    }

    /* renamed from: d */
    public <L> C0687d<L> mo10945d(L l) {
        C1785jx.m5359b(l, (Object) "Listener must not be null");
        this.f697zO.lock();
        try {
            C0687d<L> dVar = new C0687d<>(this.f673JF, l);
            this.f693Kj.add(dVar);
            return dVar;
        } finally {
            this.f697zO.unlock();
        }
    }

    public void disconnect() {
        m571gM();
        m561al(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gL */
    public boolean mo11000gL() {
        return this.f681JY;
    }

    public Looper getLooper() {
        return this.f673JF;
    }

    public boolean isConnected() {
        return this.f680JX == 2;
    }

    public boolean isConnecting() {
        return this.f680JX == 1;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.f675JS.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f675JS.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void reconnect() {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f675JS.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f675JS.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void stopAutoManage(FragmentActivity fragmentActivity) {
        C1785jx.m5355a(this.f676JT >= 0, "Called stopAutoManage but automatic lifecycle management is not enabled.");
        C0692g.m602a(fragmentActivity).mo11021ao(this.f676JT);
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f675JS.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f675JS.unregisterConnectionFailedListener(onConnectionFailedListener);
    }
}
