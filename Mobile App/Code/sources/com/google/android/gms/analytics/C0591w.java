package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C0563c;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1627ha;
import com.google.android.gms.internal.C1832ld;
import com.google.android.gms.internal.C1834lf;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.gms.analytics.w */
class C0591w implements C0557ak, C0563c.C0565b, C0563c.C0566c {
    private final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: wb */
    public C1832ld f301wb;

    /* renamed from: yU */
    private C0567d f302yU;

    /* renamed from: yV */
    private final C0569f f303yV;

    /* renamed from: yX */
    private boolean f304yX;
    /* access modifiers changed from: private */

    /* renamed from: zh */
    public volatile long f305zh;
    /* access modifiers changed from: private */

    /* renamed from: zi */
    public volatile C0594a f306zi;

    /* renamed from: zj */
    private volatile C0562b f307zj;

    /* renamed from: zk */
    private C0567d f308zk;

    /* renamed from: zl */
    private final GoogleAnalytics f309zl;
    /* access modifiers changed from: private */

    /* renamed from: zm */
    public final Queue<C0597d> f310zm;

    /* renamed from: zn */
    private volatile int f311zn;

    /* renamed from: zo */
    private volatile Timer f312zo;

    /* renamed from: zp */
    private volatile Timer f313zp;
    /* access modifiers changed from: private */

    /* renamed from: zq */
    public volatile Timer f314zq;

    /* renamed from: zr */
    private boolean f315zr;

    /* renamed from: zs */
    private boolean f316zs;

    /* renamed from: zt */
    private boolean f317zt;
    /* access modifiers changed from: private */

    /* renamed from: zu */
    public long f318zu;

    /* renamed from: com.google.android.gms.analytics.w$a */
    private enum C0594a {
        CONNECTING,
        CONNECTED_SERVICE,
        CONNECTED_LOCAL,
        BLOCKED,
        PENDING_CONNECTION,
        PENDING_DISCONNECT,
        DISCONNECTED
    }

    /* renamed from: com.google.android.gms.analytics.w$b */
    private class C0595b extends TimerTask {
        private C0595b() {
        }

        public void run() {
            if (C0591w.this.f306zi != C0594a.CONNECTED_SERVICE || !C0591w.this.f310zm.isEmpty() || C0591w.this.f305zh + C0591w.this.f318zu >= C0591w.this.f301wb.elapsedRealtime()) {
                C0591w.this.f314zq.schedule(new C0595b(), C0591w.this.f318zu);
                return;
            }
            C0550ae.m105V("Disconnecting due to inactivity");
            C0591w.this.m283cJ();
        }
    }

    /* renamed from: com.google.android.gms.analytics.w$c */
    private class C0596c extends TimerTask {
        private C0596c() {
        }

        public void run() {
            if (C0591w.this.f306zi == C0594a.CONNECTING) {
                C0591w.this.m289eE();
            }
        }
    }

    /* renamed from: com.google.android.gms.analytics.w$d */
    private static class C0597d {

        /* renamed from: zF */
        private final Map<String, String> f331zF;

        /* renamed from: zG */
        private final long f332zG;

        /* renamed from: zH */
        private final String f333zH;

        /* renamed from: zI */
        private final List<C1627ha> f334zI;

        public C0597d(Map<String, String> map, long j, String str, List<C1627ha> list) {
            this.f331zF = map;
            this.f332zG = j;
            this.f333zH = str;
            this.f334zI = list;
        }

        /* renamed from: eH */
        public Map<String, String> mo10486eH() {
            return this.f331zF;
        }

        /* renamed from: eI */
        public long mo10487eI() {
            return this.f332zG;
        }

        /* renamed from: eJ */
        public List<C1627ha> mo10488eJ() {
            return this.f334zI;
        }

        public String getPath() {
            return this.f333zH;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PATH: ");
            sb.append(this.f333zH);
            if (this.f331zF != null) {
                sb.append("  PARAMS: ");
                for (Map.Entry next : this.f331zF.entrySet()) {
                    sb.append((String) next.getKey());
                    sb.append("=");
                    sb.append((String) next.getValue());
                    sb.append(",  ");
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.analytics.w$e */
    private class C0598e extends TimerTask {
        private C0598e() {
        }

        public void run() {
            C0591w.this.m290eF();
        }
    }

    C0591w(Context context, C0569f fVar) {
        this(context, fVar, (C0567d) null, GoogleAnalytics.getInstance(context));
    }

    C0591w(Context context, C0569f fVar, C0567d dVar, GoogleAnalytics googleAnalytics) {
        this.f310zm = new ConcurrentLinkedQueue();
        this.f318zu = 300000;
        this.f308zk = dVar;
        this.mContext = context;
        this.f303yV = fVar;
        this.f309zl = googleAnalytics;
        this.f301wb = C1834lf.m5525if();
        this.f311zn = 0;
        this.f306zi = C0594a.DISCONNECTED;
    }

    /* renamed from: a */
    private Timer m279a(Timer timer) {
        if (timer == null) {
            return null;
        }
        timer.cancel();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: cJ */
    public synchronized void m283cJ() {
        if (this.f307zj != null && this.f306zi == C0594a.CONNECTED_SERVICE) {
            this.f306zi = C0594a.PENDING_DISCONNECT;
            this.f307zj.disconnect();
        }
    }

    /* renamed from: eA */
    private void m286eA() {
        this.f312zo = m279a(this.f312zo);
        this.f313zp = m279a(this.f313zp);
        this.f314zq = m279a(this.f314zq);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r8.f305zh = r8.f301wb.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e7, code lost:
        if (r8.f304yX == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e9, code lost:
        m288eD();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
        return;
     */
    /* renamed from: eC */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m287eC() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.f r1 = r8.f303yV     // Catch:{ all -> 0x00ee }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x0021
            com.google.android.gms.analytics.f r0 = r8.f303yV     // Catch:{ all -> 0x00ee }
            java.util.concurrent.LinkedBlockingQueue r0 = r0.mo10447dX()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.w$1 r1 = new com.google.android.gms.analytics.w$1     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            r0.add(r1)     // Catch:{ all -> 0x00ee }
            monitor-exit(r8)
            return
        L_0x0021:
            boolean r0 = r8.f315zr     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0028
            r8.mo10379dQ()     // Catch:{ all -> 0x00ee }
        L_0x0028:
            int[] r0 = com.google.android.gms.analytics.C0591w.C05932.f320zw     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.w$a r1 = r8.f306zi     // Catch:{ all -> 0x00ee }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x00ee }
            r0 = r0[r1]     // Catch:{ all -> 0x00ee }
            switch(r0) {
                case 1: goto L_0x00ab;
                case 2: goto L_0x0055;
                case 3: goto L_0x0035;
                case 4: goto L_0x0035;
                case 5: goto L_0x0035;
                case 6: goto L_0x0043;
                case 7: goto L_0x0037;
                default: goto L_0x0035;
            }     // Catch:{ all -> 0x00ee }
        L_0x0035:
            goto L_0x00ec
        L_0x0037:
            java.lang.String r0 = "Blocked. Dropping hits."
            com.google.android.gms.analytics.C0550ae.m105V(r0)     // Catch:{ all -> 0x00ee }
            java.util.Queue<com.google.android.gms.analytics.w$d> r0 = r8.f310zm     // Catch:{ all -> 0x00ee }
            r0.clear()     // Catch:{ all -> 0x00ee }
            goto L_0x00ec
        L_0x0043:
            java.lang.String r0 = "Need to reconnect"
            com.google.android.gms.analytics.C0550ae.m105V(r0)     // Catch:{ all -> 0x00ee }
            java.util.Queue<com.google.android.gms.analytics.w$d> r0 = r8.f310zm     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00ec
            r8.m290eF()     // Catch:{ all -> 0x00ee }
            goto L_0x00ec
        L_0x0055:
            java.util.Queue<com.google.android.gms.analytics.w$d> r0 = r8.f310zm     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00a2
            java.util.Queue<com.google.android.gms.analytics.w$d> r0 = r8.f310zm     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.w$d r0 = (com.google.android.gms.analytics.C0591w.C0597d) r0     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = "Sending hit to service   "
            r1.append(r2)     // Catch:{ all -> 0x00ee }
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.C0550ae.m105V(r1)     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.GoogleAnalytics r1 = r8.f309zl     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.isDryRunEnabled()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x0097
            com.google.android.gms.analytics.b r2 = r8.f307zj     // Catch:{ all -> 0x00ee }
            java.util.Map r3 = r0.mo10486eH()     // Catch:{ all -> 0x00ee }
            long r4 = r0.mo10487eI()     // Catch:{ all -> 0x00ee }
            java.lang.String r6 = r0.getPath()     // Catch:{ all -> 0x00ee }
            java.util.List r7 = r0.mo10488eJ()     // Catch:{ all -> 0x00ee }
            r2.mo10402a(r3, r4, r6, r7)     // Catch:{ all -> 0x00ee }
            goto L_0x009c
        L_0x0097:
            java.lang.String r0 = "Dry run enabled. Hit not actually sent to service."
            com.google.android.gms.analytics.C0550ae.m105V(r0)     // Catch:{ all -> 0x00ee }
        L_0x009c:
            java.util.Queue<com.google.android.gms.analytics.w$d> r0 = r8.f310zm     // Catch:{ all -> 0x00ee }
            r0.poll()     // Catch:{ all -> 0x00ee }
            goto L_0x0055
        L_0x00a2:
            com.google.android.gms.internal.ld r0 = r8.f301wb     // Catch:{ all -> 0x00ee }
            long r0 = r0.elapsedRealtime()     // Catch:{ all -> 0x00ee }
            r8.f305zh = r0     // Catch:{ all -> 0x00ee }
            goto L_0x00ec
        L_0x00ab:
            java.util.Queue<com.google.android.gms.analytics.w$d> r0 = r8.f310zm     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00e5
            java.util.Queue<com.google.android.gms.analytics.w$d> r0 = r8.f310zm     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.w$d r0 = (com.google.android.gms.analytics.C0591w.C0597d) r0     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = "Sending hit to store  "
            r1.append(r2)     // Catch:{ all -> 0x00ee }
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.C0550ae.m105V(r1)     // Catch:{ all -> 0x00ee }
            com.google.android.gms.analytics.d r2 = r8.f302yU     // Catch:{ all -> 0x00ee }
            java.util.Map r3 = r0.mo10486eH()     // Catch:{ all -> 0x00ee }
            long r4 = r0.mo10487eI()     // Catch:{ all -> 0x00ee }
            java.lang.String r6 = r0.getPath()     // Catch:{ all -> 0x00ee }
            java.util.List r7 = r0.mo10488eJ()     // Catch:{ all -> 0x00ee }
            r2.mo10359a(r3, r4, r6, r7)     // Catch:{ all -> 0x00ee }
            goto L_0x00ab
        L_0x00e5:
            boolean r0 = r8.f304yX     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            r8.m288eD()     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r8)
            return
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0591w.m287eC():void");
    }

    /* renamed from: eD */
    private void m288eD() {
        this.f302yU.dispatch();
        this.f304yX = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: eE */
    public synchronized void m289eE() {
        C0567d ex;
        if (this.f306zi != C0594a.CONNECTED_LOCAL) {
            if (this.mContext == null || !GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE.equals(this.mContext.getPackageName())) {
                m286eA();
                C0550ae.m105V("falling back to local store");
                if (this.f308zk != null) {
                    ex = this.f308zk;
                } else {
                    C0588v eu = C0588v.m268eu();
                    eu.mo10478a(this.mContext, this.f303yV);
                    ex = eu.mo10481ex();
                }
                this.f302yU = ex;
                this.f306zi = C0594a.CONNECTED_LOCAL;
                m287eC();
                return;
            }
            this.f306zi = C0594a.BLOCKED;
            this.f307zj.disconnect();
            C0550ae.m106W("Attempted to fall back to local store from service.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: eF */
    public synchronized void m290eF() {
        if (this.f317zt || this.f307zj == null || this.f306zi == C0594a.CONNECTED_LOCAL) {
            C0550ae.m106W("client not initialized.");
        } else {
            try {
                this.f311zn++;
                m279a(this.f313zp);
                this.f306zi = C0594a.CONNECTING;
                this.f313zp = new Timer("Failed Connect");
                this.f313zp.schedule(new C0596c(), 3000);
                C0550ae.m105V("connecting to Analytics service");
                this.f307zj.connect();
            } catch (SecurityException e) {
                C0550ae.m106W("security exception on connectToService");
            }
        }
        m289eE();
    }

    /* renamed from: eG */
    private void m291eG() {
        this.f312zo = m279a(this.f312zo);
        this.f312zo = new Timer("Service Reconnect");
        this.f312zo.schedule(new C0598e(), 5000);
    }

    /* renamed from: a */
    public synchronized void mo10412a(int i, Intent intent) {
        this.f306zi = C0594a.PENDING_CONNECTION;
        if (this.f311zn < 2) {
            C0550ae.m106W("Service unavailable (code=" + i + "), will retry.");
            m291eG();
        } else {
            C0550ae.m106W("Service unavailable (code=" + i + "), using local store.");
            m289eE();
        }
    }

    /* renamed from: b */
    public void mo10378b(Map<String, String> map, long j, String str, List<C1627ha> list) {
        C0550ae.m105V("putHit called");
        this.f310zm.add(new C0597d(map, j, str, list));
        m287eC();
    }

    /* renamed from: dQ */
    public void mo10379dQ() {
        C0550ae.m105V("clearHits called");
        this.f310zm.clear();
        switch (this.f306zi) {
            case CONNECTED_LOCAL:
                this.f302yU.mo10366l(0);
                break;
            case CONNECTED_SERVICE:
                this.f307zj.mo10404dQ();
                break;
            default:
                this.f315zr = true;
                return;
        }
        this.f315zr = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return;
     */
    /* renamed from: dW */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo10380dW() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f317zt     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            java.lang.String r0 = "setForceLocalDispatch called."
            com.google.android.gms.analytics.C0550ae.m105V(r0)     // Catch:{ all -> 0x0025 }
            r0 = 1
            r3.f317zt = r0     // Catch:{ all -> 0x0025 }
            int[] r1 = com.google.android.gms.analytics.C0591w.C05932.f320zw     // Catch:{ all -> 0x0025 }
            com.google.android.gms.analytics.w$a r2 = r3.f306zi     // Catch:{ all -> 0x0025 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0025 }
            r1 = r1[r2]     // Catch:{ all -> 0x0025 }
            switch(r1) {
                case 1: goto L_0x0023;
                case 2: goto L_0x0020;
                case 3: goto L_0x001d;
                case 4: goto L_0x0023;
                case 5: goto L_0x0023;
                case 6: goto L_0x0023;
                default: goto L_0x001c;
            }     // Catch:{ all -> 0x0025 }
        L_0x001c:
            goto L_0x0023
        L_0x001d:
            r3.f316zs = r0     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0020:
            r3.m283cJ()     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r3)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0591w.mo10380dW():void");
    }

    public void dispatch() {
        switch (this.f306zi) {
            case CONNECTED_LOCAL:
                m288eD();
                return;
            case CONNECTED_SERVICE:
                return;
            default:
                this.f304yX = true;
                return;
        }
    }

    /* renamed from: eB */
    public void mo10382eB() {
        if (this.f307zj == null) {
            this.f307zj = new C0563c(this.mContext, this, this);
            m290eF();
        }
    }

    public synchronized void onConnected() {
        this.f313zp = m279a(this.f313zp);
        this.f311zn = 0;
        C0550ae.m105V("Connected to service");
        this.f306zi = C0594a.CONNECTED_SERVICE;
        if (this.f316zs) {
            m283cJ();
            this.f316zs = false;
            return;
        }
        m287eC();
        this.f314zq = m279a(this.f314zq);
        this.f314zq = new Timer("disconnect check");
        this.f314zq.schedule(new C0595b(), this.f318zu);
    }

    public synchronized void onDisconnected() {
        if (this.f306zi == C0594a.BLOCKED) {
            C0550ae.m105V("Service blocked.");
            m286eA();
        } else if (this.f306zi == C0594a.PENDING_DISCONNECT) {
            C0550ae.m105V("Disconnected from service");
            m286eA();
            this.f306zi = C0594a.DISCONNECTED;
        } else {
            C0550ae.m105V("Unexpected disconnect.");
            this.f306zi = C0594a.PENDING_CONNECTION;
            if (this.f311zn < 2) {
                m291eG();
            } else {
                m289eE();
            }
        }
    }
}
