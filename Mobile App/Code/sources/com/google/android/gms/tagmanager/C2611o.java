package com.google.android.gms.tagmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1351c;
import com.google.android.gms.internal.C1832ld;
import com.google.android.gms.internal.C2111pu;
import com.google.android.gms.tagmanager.C2502bg;
import com.google.android.gms.tagmanager.C2531ce;
import com.google.android.gms.tagmanager.C2551cr;
import com.google.android.gms.tagmanager.C2608n;

/* renamed from: com.google.android.gms.tagmanager.o */
class C2611o extends BaseImplementation.AbstractPendingResult<ContainerHolder> {

    /* renamed from: JF */
    private final Looper f4470JF;
    private final C2617d aqB;
    /* access modifiers changed from: private */
    public final C2534cg aqC;
    private final int aqD;
    private C2619f aqE;
    /* access modifiers changed from: private */
    public volatile C2608n aqF;
    /* access modifiers changed from: private */
    public volatile boolean aqG;
    /* access modifiers changed from: private */
    public C1351c.C1361j aqH;
    private String aqI;
    private C2618e aqJ;
    private C2614a aqK;
    private final String aqm;
    /* access modifiers changed from: private */
    public long aqr;
    private final TagManager aqy;
    private final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: wb */
    public final C1832ld f4471wb;

    /* renamed from: com.google.android.gms.tagmanager.o$a */
    interface C2614a {
        /* renamed from: b */
        boolean mo18869b(Container container);
    }

    /* renamed from: com.google.android.gms.tagmanager.o$b */
    private class C2615b implements C2502bg<C2111pu.C2112a> {
        private C2615b() {
        }

        /* renamed from: a */
        public void mo18672l(C2111pu.C2112a aVar) {
            C1351c.C1361j jVar;
            if (aVar.auC != null) {
                jVar = aVar.auC;
            } else {
                C1351c.C1357f fVar = aVar.f4209gs;
                C1351c.C1361j jVar2 = new C1351c.C1361j();
                jVar2.f2783gs = fVar;
                jVar2.f2782gr = null;
                jVar2.f2784gt = fVar.version;
                jVar = jVar2;
            }
            C2611o.this.m7619a(jVar, aVar.auB, true);
        }

        /* renamed from: a */
        public void mo18671a(C2502bg.C2503a aVar) {
            if (!C2611o.this.aqG) {
                C2611o.this.m7630w(0);
            }
        }

        /* renamed from: ps */
        public void mo18673ps() {
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.o$c */
    private class C2616c implements C2502bg<C1351c.C1361j> {
        private C2616c() {
        }

        /* renamed from: a */
        public void mo18671a(C2502bg.C2503a aVar) {
            C2611o oVar;
            Result aD;
            if (C2611o.this.aqF != null) {
                oVar = C2611o.this;
                aD = C2611o.this.aqF;
            } else {
                oVar = C2611o.this;
                aD = C2611o.this.mo10544c(Status.f666Kz);
            }
            oVar.mo10914b(aD);
            C2611o.this.m7630w(3600000);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18672l(com.google.android.gms.internal.C1351c.C1361j r6) {
            /*
                r5 = this;
                com.google.android.gms.tagmanager.o r0 = com.google.android.gms.tagmanager.C2611o.this
                monitor-enter(r0)
                com.google.android.gms.internal.c$f r1 = r6.f2783gs     // Catch:{ all -> 0x0063 }
                if (r1 != 0) goto L_0x002a
                com.google.android.gms.tagmanager.o r1 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                com.google.android.gms.internal.c$j r1 = r1.aqH     // Catch:{ all -> 0x0063 }
                com.google.android.gms.internal.c$f r1 = r1.f2783gs     // Catch:{ all -> 0x0063 }
                if (r1 != 0) goto L_0x0020
                java.lang.String r6 = "Current resource is null; network resource is also null"
                com.google.android.gms.tagmanager.C2504bh.m7243T(r6)     // Catch:{ all -> 0x0063 }
                com.google.android.gms.tagmanager.o r6 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                r1 = 3600000(0x36ee80, double:1.7786363E-317)
                r6.m7630w(r1)     // Catch:{ all -> 0x0063 }
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return
            L_0x0020:
                com.google.android.gms.tagmanager.o r1 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                com.google.android.gms.internal.c$j r1 = r1.aqH     // Catch:{ all -> 0x0063 }
                com.google.android.gms.internal.c$f r1 = r1.f2783gs     // Catch:{ all -> 0x0063 }
                r6.f2783gs = r1     // Catch:{ all -> 0x0063 }
            L_0x002a:
                com.google.android.gms.tagmanager.o r1 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                com.google.android.gms.tagmanager.o r2 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                com.google.android.gms.internal.ld r2 = r2.f4471wb     // Catch:{ all -> 0x0063 }
                long r2 = r2.currentTimeMillis()     // Catch:{ all -> 0x0063 }
                r4 = 0
                r1.m7619a(r6, r2, r4)     // Catch:{ all -> 0x0063 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
                r1.<init>()     // Catch:{ all -> 0x0063 }
                java.lang.String r2 = "setting refresh time to current time: "
                r1.append(r2)     // Catch:{ all -> 0x0063 }
                com.google.android.gms.tagmanager.o r2 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                long r2 = r2.aqr     // Catch:{ all -> 0x0063 }
                r1.append(r2)     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0063 }
                com.google.android.gms.tagmanager.C2504bh.m7245V(r1)     // Catch:{ all -> 0x0063 }
                com.google.android.gms.tagmanager.o r1 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                boolean r1 = r1.m7629pr()     // Catch:{ all -> 0x0063 }
                if (r1 != 0) goto L_0x0061
                com.google.android.gms.tagmanager.o r1 = com.google.android.gms.tagmanager.C2611o.this     // Catch:{ all -> 0x0063 }
                r1.m7618a((com.google.android.gms.internal.C1351c.C1361j) r6)     // Catch:{ all -> 0x0063 }
            L_0x0061:
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return
            L_0x0063:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2611o.C2616c.mo18672l(com.google.android.gms.internal.c$j):void");
        }

        /* renamed from: ps */
        public void mo18673ps() {
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.o$d */
    private class C2617d implements C2608n.C2609a {
        private C2617d() {
        }

        /* renamed from: ct */
        public void mo18857ct(String str) {
            C2611o.this.mo18864ct(str);
        }

        /* renamed from: pl */
        public String mo18858pl() {
            return C2611o.this.mo18865pl();
        }

        /* renamed from: pn */
        public void mo18859pn() {
            if (C2611o.this.aqC.mo18670fe()) {
                C2611o.this.m7630w(0);
            }
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.o$e */
    interface C2618e extends Releasable {
        /* renamed from: a */
        void mo18735a(C2502bg<C1351c.C1361j> bgVar);

        /* renamed from: cw */
        void mo18736cw(String str);

        /* renamed from: e */
        void mo18737e(long j, String str);
    }

    /* renamed from: com.google.android.gms.tagmanager.o$f */
    interface C2619f extends Releasable {
        /* renamed from: a */
        void mo18740a(C2502bg<C2111pu.C2112a> bgVar);

        /* renamed from: b */
        void mo18741b(C2111pu.C2112a aVar);

        /* renamed from: fH */
        C2551cr.C2555c mo18743fH(int i);

        /* renamed from: pt */
        void mo18744pt();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2611o(Context context, TagManager tagManager, Looper looper, String str, int i, C2619f fVar, C2618e eVar, C1832ld ldVar, C2534cg cgVar) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.mContext = context;
        this.aqy = tagManager;
        this.f4470JF = looper == null ? Looper.getMainLooper() : looper;
        this.aqm = str;
        this.aqD = i;
        this.aqE = fVar;
        this.aqJ = eVar;
        this.aqB = new C2617d();
        this.aqH = new C1351c.C1361j();
        this.f4471wb = ldVar;
        this.aqC = cgVar;
        if (m7629pr()) {
            mo18864ct(C2531ce.m7333qa().mo18729qc());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2611o(android.content.Context r19, com.google.android.gms.tagmanager.TagManager r20, android.os.Looper r21, java.lang.String r22, int r23, com.google.android.gms.tagmanager.C2622r r24) {
        /*
            r18 = this;
            r1 = r19
            r4 = r22
            com.google.android.gms.tagmanager.cq r6 = new com.google.android.gms.tagmanager.cq
            r6.<init>(r1, r4)
            com.google.android.gms.tagmanager.cp r7 = new com.google.android.gms.tagmanager.cp
            r0 = r24
            r7.<init>(r1, r4, r0)
            com.google.android.gms.internal.ld r8 = com.google.android.gms.internal.C1834lf.m5525if()
            com.google.android.gms.tagmanager.bf r17 = new com.google.android.gms.tagmanager.bf
            java.lang.String r15 = "refreshing"
            com.google.android.gms.internal.ld r16 = com.google.android.gms.internal.C1834lf.m5525if()
            r10 = 30
            r11 = 900000(0xdbba0, double:4.44659E-318)
            r13 = 5000(0x1388, double:2.4703E-320)
            r9 = r17
            r9.<init>(r10, r11, r13, r15, r16)
            r0 = r18
            r2 = r20
            r3 = r21
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2611o.<init>(android.content.Context, com.google.android.gms.tagmanager.TagManager, android.os.Looper, java.lang.String, int, com.google.android.gms.tagmanager.r):void");
    }

    /* renamed from: V */
    private void m7616V(final boolean z) {
        this.aqE.mo18740a(new C2615b());
        this.aqJ.mo18735a(new C2616c());
        C2551cr.C2555c fH = this.aqE.mo18743fH(this.aqD);
        if (fH != null) {
            this.aqF = new C2608n(this.aqy, this.f4470JF, new Container(this.mContext, this.aqy.getDataLayer(), this.aqm, 0, fH), this.aqB);
        }
        this.aqK = new C2614a() {
            /* renamed from: b */
            public boolean mo18869b(Container container) {
                return z ? container.getLastRefreshTime() + 43200000 >= C2611o.this.f4471wb.currentTimeMillis() : !container.isDefault();
            }
        };
        if (m7629pr()) {
            this.aqJ.mo18737e(0, "");
        } else {
            this.aqE.mo18744pt();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m7618a(C1351c.C1361j jVar) {
        if (this.aqE != null) {
            C2111pu.C2112a aVar = new C2111pu.C2112a();
            aVar.auB = this.aqr;
            aVar.f4209gs = new C1351c.C1357f();
            aVar.auC = jVar;
            this.aqE.mo18741b(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m7619a(com.google.android.gms.internal.C1351c.C1361j r10, long r11, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            if (r13 == 0) goto L_0x000b
            boolean r13 = r9.aqG     // Catch:{ all -> 0x0009 }
            if (r13 == 0) goto L_0x000b
            monitor-exit(r9)
            return
        L_0x0009:
            r10 = move-exception
            goto L_0x006f
        L_0x000b:
            boolean r13 = r9.isReady()     // Catch:{ all -> 0x0009 }
            if (r13 == 0) goto L_0x0013
            com.google.android.gms.tagmanager.n r13 = r9.aqF     // Catch:{ all -> 0x0009 }
        L_0x0013:
            r9.aqH = r10     // Catch:{ all -> 0x0009 }
            r9.aqr = r11     // Catch:{ all -> 0x0009 }
            r0 = 0
            long r2 = r9.aqr     // Catch:{ all -> 0x0009 }
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            long r2 = r2 + r4
            com.google.android.gms.internal.ld r13 = r9.f4471wb     // Catch:{ all -> 0x0009 }
            long r6 = r13.currentTimeMillis()     // Catch:{ all -> 0x0009 }
            long r2 = r2 - r6
            long r2 = java.lang.Math.min(r4, r2)     // Catch:{ all -> 0x0009 }
            long r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x0009 }
            r9.m7630w(r0)     // Catch:{ all -> 0x0009 }
            com.google.android.gms.tagmanager.Container r13 = new com.google.android.gms.tagmanager.Container     // Catch:{ all -> 0x0009 }
            android.content.Context r3 = r9.mContext     // Catch:{ all -> 0x0009 }
            com.google.android.gms.tagmanager.TagManager r0 = r9.aqy     // Catch:{ all -> 0x0009 }
            com.google.android.gms.tagmanager.DataLayer r4 = r0.getDataLayer()     // Catch:{ all -> 0x0009 }
            java.lang.String r5 = r9.aqm     // Catch:{ all -> 0x0009 }
            r2 = r13
            r6 = r11
            r8 = r10
            r2.<init>((android.content.Context) r3, (com.google.android.gms.tagmanager.DataLayer) r4, (java.lang.String) r5, (long) r6, (com.google.android.gms.internal.C1351c.C1361j) r8)     // Catch:{ all -> 0x0009 }
            com.google.android.gms.tagmanager.n r10 = r9.aqF     // Catch:{ all -> 0x0009 }
            if (r10 != 0) goto L_0x0055
            com.google.android.gms.tagmanager.n r10 = new com.google.android.gms.tagmanager.n     // Catch:{ all -> 0x0009 }
            com.google.android.gms.tagmanager.TagManager r11 = r9.aqy     // Catch:{ all -> 0x0009 }
            android.os.Looper r12 = r9.f4470JF     // Catch:{ all -> 0x0009 }
            com.google.android.gms.tagmanager.o$d r0 = r9.aqB     // Catch:{ all -> 0x0009 }
            r10.<init>(r11, r12, r13, r0)     // Catch:{ all -> 0x0009 }
            r9.aqF = r10     // Catch:{ all -> 0x0009 }
            goto L_0x005a
        L_0x0055:
            com.google.android.gms.tagmanager.n r10 = r9.aqF     // Catch:{ all -> 0x0009 }
            r10.mo18852a(r13)     // Catch:{ all -> 0x0009 }
        L_0x005a:
            boolean r10 = r9.isReady()     // Catch:{ all -> 0x0009 }
            if (r10 != 0) goto L_0x006d
            com.google.android.gms.tagmanager.o$a r10 = r9.aqK     // Catch:{ all -> 0x0009 }
            boolean r10 = r10.mo18869b(r13)     // Catch:{ all -> 0x0009 }
            if (r10 == 0) goto L_0x006d
            com.google.android.gms.tagmanager.n r10 = r9.aqF     // Catch:{ all -> 0x0009 }
            r9.mo10914b(r10)     // Catch:{ all -> 0x0009 }
        L_0x006d:
            monitor-exit(r9)
            return
        L_0x006f:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2611o.m7619a(com.google.android.gms.internal.c$j, long, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: pr */
    public boolean m7629pr() {
        C2531ce qa = C2531ce.m7333qa();
        return (qa.mo18728qb() == C2531ce.C2532a.CONTAINER || qa.mo18728qb() == C2531ce.C2532a.CONTAINER_DEBUG) && this.aqm.equals(qa.getContainerId());
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public synchronized void m7630w(long j) {
        if (this.aqJ == null) {
            C2504bh.m7246W("Refresh requested, but no network load scheduler.");
        } else {
            this.aqJ.mo18737e(j, this.aqH.f2784gt);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aD */
    public ContainerHolder mo10544c(Status status) {
        if (this.aqF != null) {
            return this.aqF;
        }
        if (status == Status.f666Kz) {
            C2504bh.m7243T("timer expired: setting result to failure");
        }
        return new C2608n(status);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ct */
    public synchronized void mo18864ct(String str) {
        this.aqI = str;
        if (this.aqJ != null) {
            this.aqJ.mo18736cw(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pl */
    public synchronized String mo18865pl() {
        return this.aqI;
    }

    /* renamed from: po */
    public void mo18866po() {
        C2551cr.C2555c fH = this.aqE.mo18743fH(this.aqD);
        if (fH != null) {
            mo10914b(new C2608n(this.aqy, this.f4470JF, new Container(this.mContext, this.aqy.getDataLayer(), this.aqm, 0, fH), new C2608n.C2609a() {
                /* renamed from: ct */
                public void mo18857ct(String str) {
                    C2611o.this.mo18864ct(str);
                }

                /* renamed from: pl */
                public String mo18858pl() {
                    return C2611o.this.mo18865pl();
                }

                /* renamed from: pn */
                public void mo18859pn() {
                    C2504bh.m7246W("Refresh ignored: container loaded as default only.");
                }
            }));
        } else {
            C2504bh.m7243T("Default was requested, but no default container was found");
            mo10914b(mo10544c(new Status(10, "Default was requested, but no default container was found", (PendingIntent) null)));
        }
        this.aqJ = null;
        this.aqE = null;
    }

    /* renamed from: pp */
    public void mo18867pp() {
        m7616V(false);
    }

    /* renamed from: pq */
    public void mo18868pq() {
        m7616V(true);
    }
}
