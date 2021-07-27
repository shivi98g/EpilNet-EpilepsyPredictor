package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.C1508ez;
import com.google.android.gms.internal.C1539fe;
import com.google.android.gms.internal.C1545fh;
import org.json.JSONException;

@C1507ey
/* renamed from: com.google.android.gms.internal.fa */
public class C1525fa extends C1584gf implements C1539fe.C1540a {
    private final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: mH */
    public final Object f3255mH = new Object();

    /* renamed from: qi */
    private C1393cr f3256qi;
    /* access modifiers changed from: private */

    /* renamed from: ti */
    public final C1508ez.C1509a f3257ti;

    /* renamed from: tj */
    private final Object f3258tj = new Object();

    /* renamed from: tk */
    private final C1545fh.C1546a f3259tk;

    /* renamed from: tl */
    private final C1788k f3260tl;

    /* renamed from: tm */
    private C1584gf f3261tm;

    /* renamed from: tn */
    private C1548fj f3262tn;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.fa$a */
    private static final class C1528a extends Exception {

        /* renamed from: tq */
        private final int f3266tq;

        public C1528a(String str, int i) {
            super(str);
            this.f3266tq = i;
        }

        public int getErrorCode() {
            return this.f3266tq;
        }
    }

    public C1525fa(Context context, C1545fh.C1546a aVar, C1788k kVar, C1508ez.C1509a aVar2) {
        this.f3257ti = aVar2;
        this.mContext = context;
        this.f3259tk = aVar;
        this.f3260tl = kVar;
    }

    /* renamed from: a */
    private C1306ay m4431a(C1545fh fhVar) throws C1528a {
        if (this.f3262tn.f3340tZ == null) {
            throw new C1528a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f3262tn.f3340tZ.split("x");
        if (split.length != 2) {
            throw new C1528a("Could not parse the ad size from the ad response: " + this.f3262tn.f3340tZ, 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (C1306ay ayVar : fhVar.f3305lS.f2399or) {
                float f = this.mContext.getResources().getDisplayMetrics().density;
                int i = ayVar.width == -1 ? (int) (((float) ayVar.widthPixels) / f) : ayVar.width;
                int i2 = ayVar.height == -2 ? (int) (((float) ayVar.heightPixels) / f) : ayVar.height;
                if (parseInt == i && parseInt2 == i2) {
                    return new C1306ay(ayVar, fhVar.f3305lS.f2399or);
                }
            }
            throw new C1528a("The ad size from the ad response was not one of the requested sizes: " + this.f3262tn.f3340tZ, 0);
        } catch (NumberFormatException e) {
            throw new C1528a("Could not parse the ad size from the ad response: " + this.f3262tn.f3340tZ, 0);
        }
    }

    /* renamed from: c */
    private boolean m4434c(long j) throws C1528a {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f3255mH.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new C1528a("Ad request cancelled.", -1);
        }
    }

    /* renamed from: cE */
    private void m4435cE() throws C1528a {
        if (this.f3262tn.errorCode != -3) {
            if (TextUtils.isEmpty(this.f3262tn.f3335tU)) {
                throw new C1528a("No fill from ad server.", 3);
            }
            C1579ga.m4589a(this.mContext, this.f3262tn.f3334tT);
            if (this.f3262tn.f3337tW) {
                try {
                    this.f3256qi = new C1393cr(this.f3262tn.f3335tU);
                } catch (JSONException e) {
                    throw new C1528a("Could not parse mediation config: " + this.f3262tn.f3335tU, 0);
                }
            }
        }
    }

    /* renamed from: e */
    private void m4436e(long j) throws C1528a {
        while (m4434c(j)) {
            if (this.f3262tn != null) {
                synchronized (this.f3258tj) {
                    this.f3261tm = null;
                }
                if (this.f3262tn.errorCode != -2 && this.f3262tn.errorCode != -3) {
                    throw new C1528a("There was a problem getting an ad response. ErrorCode: " + this.f3262tn.errorCode, this.f3262tn.errorCode);
                }
                return;
            }
        }
        throw new C1528a("Timed out waiting for ad response.", 2);
    }

    /* renamed from: t */
    private void m4437t(boolean z) {
        C1579ga.m4593dc().mo15371x(z);
        C1288an l = C1579ga.m4593dc().mo15370l(this.mContext);
        if (l != null && !l.isAlive()) {
            C1607gr.m4705S("start fetching content...");
            l.mo14784ba();
        }
    }

    /* renamed from: a */
    public void mo15262a(C1548fj fjVar) {
        synchronized (this.f3255mH) {
            C1607gr.m4705S("Received ad response.");
            this.f3262tn = fjVar;
            this.f3255mH.notify();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: cx */
    public void mo15197cx() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f3255mH
            monitor-enter(r0)
            java.lang.String r1 = "AdLoaderBackgroundTask started."
            com.google.android.gms.internal.C1607gr.m4705S(r1)     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.k r1 = r13.f3260tl     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.g r1 = r1.mo15943C()     // Catch:{ all -> 0x00da }
            android.content.Context r2 = r13.mContext     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.mo15349a((android.content.Context) r2)     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.fh r3 = new com.google.android.gms.internal.fh     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.fh$a r2 = r13.f3259tk     // Catch:{ all -> 0x00da }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x00da }
            r1 = -2
            r4 = -1
            r2 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ a -> 0x0064 }
            android.content.Context r8 = r13.mContext     // Catch:{ a -> 0x0064 }
            com.google.android.gms.internal.gf r8 = com.google.android.gms.internal.C1539fe.m4468a(r8, r3, r13)     // Catch:{ a -> 0x0064 }
            java.lang.Object r9 = r13.f3258tj     // Catch:{ a -> 0x0064 }
            monitor-enter(r9)     // Catch:{ a -> 0x0064 }
            r13.f3261tm = r8     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.gf r8 = r13.f3261tm     // Catch:{ all -> 0x0061 }
            if (r8 != 0) goto L_0x003b
            com.google.android.gms.internal.fa$a r1 = new com.google.android.gms.internal.fa$a     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = "Could not start the ad request service."
            r7 = 0
            r1.<init>(r6, r7)     // Catch:{ all -> 0x0061 }
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x003b:
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            r13.m4436e(r6)     // Catch:{ a -> 0x0064 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ a -> 0x0064 }
            r13.m4435cE()     // Catch:{ a -> 0x005f }
            com.google.android.gms.internal.ay r4 = r3.f3305lS     // Catch:{ a -> 0x005f }
            com.google.android.gms.internal.ay[] r4 = r4.f2399or     // Catch:{ a -> 0x005f }
            if (r4 == 0) goto L_0x0051
            com.google.android.gms.internal.ay r4 = r13.m4431a((com.google.android.gms.internal.C1545fh) r3)     // Catch:{ a -> 0x005f }
            goto L_0x0052
        L_0x0051:
            r4 = r2
        L_0x0052:
            com.google.android.gms.internal.fj r5 = r13.f3262tn     // Catch:{ a -> 0x005d }
            boolean r5 = r5.f3348uh     // Catch:{ a -> 0x005d }
            r13.m4437t(r5)     // Catch:{ a -> 0x005d }
            r8 = r6
            r7 = r1
            r6 = r4
            goto L_0x00a4
        L_0x005d:
            r1 = move-exception
            goto L_0x0067
        L_0x005f:
            r1 = move-exception
            goto L_0x0066
        L_0x0061:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            throw r1     // Catch:{ a -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            r6 = r4
        L_0x0066:
            r4 = r2
        L_0x0067:
            int r5 = r1.getErrorCode()     // Catch:{ all -> 0x00da }
            r8 = 3
            if (r5 == r8) goto L_0x007a
            r8 = -1
            if (r5 != r8) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.C1607gr.m4709W(r1)     // Catch:{ all -> 0x00da }
            goto L_0x0081
        L_0x007a:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.C1607gr.m4707U(r1)     // Catch:{ all -> 0x00da }
        L_0x0081:
            com.google.android.gms.internal.fj r1 = r13.f3262tn     // Catch:{ all -> 0x00da }
            if (r1 != 0) goto L_0x008d
            com.google.android.gms.internal.fj r1 = new com.google.android.gms.internal.fj     // Catch:{ all -> 0x00da }
            r1.<init>(r5)     // Catch:{ all -> 0x00da }
        L_0x008a:
            r13.f3262tn = r1     // Catch:{ all -> 0x00da }
            goto L_0x0097
        L_0x008d:
            com.google.android.gms.internal.fj r1 = new com.google.android.gms.internal.fj     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.fj r8 = r13.f3262tn     // Catch:{ all -> 0x00da }
            long r8 = r8.f3330qA     // Catch:{ all -> 0x00da }
            r1.<init>(r5, r8)     // Catch:{ all -> 0x00da }
            goto L_0x008a
        L_0x0097:
            android.os.Handler r1 = com.google.android.gms.internal.C1606gq.f3553wR     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.fa$1 r8 = new com.google.android.gms.internal.fa$1     // Catch:{ all -> 0x00da }
            r8.<init>()     // Catch:{ all -> 0x00da }
            r1.post(r8)     // Catch:{ all -> 0x00da }
            r8 = r6
            r6 = r4
            r7 = r5
        L_0x00a4:
            com.google.android.gms.internal.fj r1 = r13.f3262tn     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.f3345ue     // Catch:{ all -> 0x00da }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00da }
            if (r1 != 0) goto L_0x00bf
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b9 }
            com.google.android.gms.internal.fj r4 = r13.f3262tn     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r4 = r4.f3345ue     // Catch:{ Exception -> 0x00b9 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00b9 }
            r12 = r1
            goto L_0x00c0
        L_0x00b9:
            r1 = move-exception
            java.lang.String r4 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.C1607gr.m4711b(r4, r1)     // Catch:{ all -> 0x00da }
        L_0x00bf:
            r12 = r2
        L_0x00c0:
            com.google.android.gms.internal.fy$a r1 = new com.google.android.gms.internal.fy$a     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.fj r4 = r13.f3262tn     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.cr r5 = r13.f3256qi     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.fj r2 = r13.f3262tn     // Catch:{ all -> 0x00da }
            long r10 = r2.f3341ua     // Catch:{ all -> 0x00da }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12)     // Catch:{ all -> 0x00da }
            android.os.Handler r2 = com.google.android.gms.internal.C1606gq.f3553wR     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.fa$2 r3 = new com.google.android.gms.internal.fa$2     // Catch:{ all -> 0x00da }
            r3.<init>(r1)     // Catch:{ all -> 0x00da }
            r2.post(r3)     // Catch:{ all -> 0x00da }
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            return
        L_0x00da:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1525fa.mo15197cx():void");
    }

    public void onStop() {
        synchronized (this.f3258tj) {
            if (this.f3261tm != null) {
                this.f3261tm.cancel();
            }
        }
    }
}
