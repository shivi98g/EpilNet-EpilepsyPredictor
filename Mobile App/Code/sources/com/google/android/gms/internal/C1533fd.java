package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.WebView;
import com.google.android.gms.internal.C1531fc;
import com.google.android.gms.internal.C1574fy;
import com.google.android.gms.internal.C1612gv;

@C1507ey
/* renamed from: com.google.android.gms.internal.fd */
public class C1533fd extends C1584gf implements C1612gv.C1614a {

    /* renamed from: lA */
    private final C1402cy f3279lA;
    private final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: mH */
    public final Object f3280mH = new Object();
    /* access modifiers changed from: private */

    /* renamed from: mo */
    public final C1610gu f3281mo;

    /* renamed from: qi */
    private C1393cr f3282qi;
    /* access modifiers changed from: private */

    /* renamed from: tA */
    public final C1531fc.C1532a f3283tA;

    /* renamed from: tB */
    private final C1574fy.C1575a f3284tB;

    /* renamed from: tC */
    private boolean f3285tC = false;

    /* renamed from: tD */
    private C1390cp f3286tD;

    /* renamed from: tE */
    private C1398cv f3287tE;

    /* renamed from: tj */
    private final Object f3288tj = new Object();
    /* access modifiers changed from: private */

    /* renamed from: tn */
    public C1548fj f3289tn;

    /* renamed from: com.google.android.gms.internal.fd$a */
    private static final class C1538a extends Exception {

        /* renamed from: tq */
        private final int f3296tq;

        public C1538a(String str, int i) {
            super(str);
            this.f3296tq = i;
        }

        public int getErrorCode() {
            return this.f3296tq;
        }
    }

    public C1533fd(Context context, C1574fy.C1575a aVar, C1610gu guVar, C1402cy cyVar, C1531fc.C1532a aVar2) {
        this.mContext = context;
        this.f3284tB = aVar;
        this.f3289tn = aVar.f3468vK;
        this.f3281mo = guVar;
        this.f3279lA = cyVar;
        this.f3283tA = aVar2;
        this.f3282qi = aVar.f3464vE;
    }

    /* renamed from: a */
    private void m4458a(C1545fh fhVar, long j) throws C1538a {
        synchronized (this.f3288tj) {
            this.f3286tD = new C1390cp(this.mContext, fhVar, this.f3279lA, this.f3282qi);
        }
        this.f3287tE = this.f3286tD.mo15027a(j, 60000);
        switch (this.f3287tE.f2844qO) {
            case 0:
                return;
            case 1:
                throw new C1538a("No fill from any mediation ad networks.", 3);
            default:
                throw new C1538a("Unexpected mediation result: " + this.f3287tE.f2844qO, 0);
        }
    }

    /* renamed from: c */
    private boolean m4461c(long j) throws C1538a {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f3280mH.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new C1538a("Ad request cancelled.", -1);
        }
    }

    /* renamed from: f */
    private void m4463f(long j) throws C1538a {
        C1606gq.f3553wR.post(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0084, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r8 = this;
                    com.google.android.gms.internal.fd r0 = com.google.android.gms.internal.C1533fd.this
                    java.lang.Object r0 = r0.f3280mH
                    monitor-enter(r0)
                    com.google.android.gms.internal.fd r1 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fj r1 = r1.f3289tn     // Catch:{ all -> 0x0085 }
                    int r1 = r1.errorCode     // Catch:{ all -> 0x0085 }
                    r2 = -2
                    if (r1 == r2) goto L_0x0014
                    monitor-exit(r0)     // Catch:{ all -> 0x0085 }
                    return
                L_0x0014:
                    com.google.android.gms.internal.fd r1 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.gu r1 = r1.f3281mo     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.gv r1 = r1.mo15426dD()     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r2 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    r1.mo15447a((com.google.android.gms.internal.C1612gv.C1614a) r2)     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r1 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fj r1 = r1.f3289tn     // Catch:{ all -> 0x0085 }
                    int r1 = r1.errorCode     // Catch:{ all -> 0x0085 }
                    r2 = -3
                    if (r1 != r2) goto L_0x005c
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
                    r1.<init>()     // Catch:{ all -> 0x0085 }
                    java.lang.String r2 = "Loading URL in WebView: "
                    r1.append(r2)     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r2 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fj r2 = r2.f3289tn     // Catch:{ all -> 0x0085 }
                    java.lang.String r2 = r2.f3333sg     // Catch:{ all -> 0x0085 }
                    r1.append(r2)     // Catch:{ all -> 0x0085 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.C1607gr.m4708V(r1)     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r1 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.gu r1 = r1.f3281mo     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r2 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fj r2 = r2.f3289tn     // Catch:{ all -> 0x0085 }
                    java.lang.String r2 = r2.f3333sg     // Catch:{ all -> 0x0085 }
                    r1.loadUrl(r2)     // Catch:{ all -> 0x0085 }
                    goto L_0x0083
                L_0x005c:
                    java.lang.String r1 = "Loading HTML in WebView."
                    com.google.android.gms.internal.C1607gr.m4708V(r1)     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r1 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.gu r2 = r1.f3281mo     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r1 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fj r1 = r1.f3289tn     // Catch:{ all -> 0x0085 }
                    java.lang.String r1 = r1.f3333sg     // Catch:{ all -> 0x0085 }
                    java.lang.String r3 = com.google.android.gms.internal.C1591gi.m4638L(r1)     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fd r1 = com.google.android.gms.internal.C1533fd.this     // Catch:{ all -> 0x0085 }
                    com.google.android.gms.internal.fj r1 = r1.f3289tn     // Catch:{ all -> 0x0085 }
                    java.lang.String r4 = r1.f3335tU     // Catch:{ all -> 0x0085 }
                    java.lang.String r5 = "text/html"
                    java.lang.String r6 = "UTF-8"
                    r7 = 0
                    r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0085 }
                L_0x0083:
                    monitor-exit(r0)     // Catch:{ all -> 0x0085 }
                    return
                L_0x0085:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0085 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1533fd.C15363.run():void");
            }
        });
        m4464h(j);
    }

    /* renamed from: h */
    private void m4464h(long j) throws C1538a {
        while (m4461c(j)) {
            if (this.f3285tC) {
                return;
            }
        }
        throw new C1538a("Timed out waiting for WebView to finish loading.", 2);
    }

    /* renamed from: a */
    public void mo14753a(C1610gu guVar) {
        synchronized (this.f3280mH) {
            C1607gr.m4705S("WebView finished loading.");
            this.f3285tC = true;
            this.f3280mH.notify();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ a -> 0x002f, all -> 0x011a }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057 A[Catch:{ a -> 0x002f, all -> 0x011a }] */
    /* renamed from: cx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15197cx() {
        /*
            r47 = this;
            r1 = r47
            java.lang.Object r2 = r1.f3280mH
            monitor-enter(r2)
            java.lang.String r3 = "AdRendererBackgroundTask started."
            com.google.android.gms.internal.C1607gr.m4705S(r3)     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fy$a r3 = r1.f3284tB     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fh r3 = r3.f3467vJ     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fy$a r4 = r1.f3284tB     // Catch:{ all -> 0x011a }
            int r4 = r4.errorCode     // Catch:{ all -> 0x011a }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ a -> 0x002f }
            com.google.android.gms.internal.fj r7 = r1.f3289tn     // Catch:{ a -> 0x002f }
            boolean r7 = r7.f3337tW     // Catch:{ a -> 0x002f }
            if (r7 == 0) goto L_0x0020
            r1.m4458a(r3, r5)     // Catch:{ a -> 0x002f }
            goto L_0x002d
        L_0x0020:
            com.google.android.gms.internal.fj r7 = r1.f3289tn     // Catch:{ a -> 0x002f }
            boolean r7 = r7.f3343uc     // Catch:{ a -> 0x002f }
            if (r7 == 0) goto L_0x002a
            r1.mo15279g(r5)     // Catch:{ a -> 0x002f }
            goto L_0x002d
        L_0x002a:
            r1.m4463f(r5)     // Catch:{ a -> 0x002f }
        L_0x002d:
            r11 = r4
            goto L_0x006c
        L_0x002f:
            r0 = move-exception
            r4 = r0
            int r5 = r4.getErrorCode()     // Catch:{ all -> 0x011a }
            r6 = 3
            if (r5 == r6) goto L_0x0044
            r6 = -1
            if (r5 != r6) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.C1607gr.m4709W(r4)     // Catch:{ all -> 0x011a }
            goto L_0x004b
        L_0x0044:
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.C1607gr.m4707U(r4)     // Catch:{ all -> 0x011a }
        L_0x004b:
            com.google.android.gms.internal.fj r4 = r1.f3289tn     // Catch:{ all -> 0x011a }
            if (r4 != 0) goto L_0x0057
            com.google.android.gms.internal.fj r4 = new com.google.android.gms.internal.fj     // Catch:{ all -> 0x011a }
            r4.<init>(r5)     // Catch:{ all -> 0x011a }
        L_0x0054:
            r1.f3289tn = r4     // Catch:{ all -> 0x011a }
            goto L_0x0061
        L_0x0057:
            com.google.android.gms.internal.fj r4 = new com.google.android.gms.internal.fj     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r6 = r1.f3289tn     // Catch:{ all -> 0x011a }
            long r6 = r6.f3330qA     // Catch:{ all -> 0x011a }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x011a }
            goto L_0x0054
        L_0x0061:
            android.os.Handler r4 = com.google.android.gms.internal.C1606gq.f3553wR     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fd$1 r6 = new com.google.android.gms.internal.fd$1     // Catch:{ all -> 0x011a }
            r6.<init>()     // Catch:{ all -> 0x011a }
            r4.post(r6)     // Catch:{ all -> 0x011a }
            r11 = r5
        L_0x006c:
            com.google.android.gms.internal.fy r4 = new com.google.android.gms.internal.fy     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.av r8 = r3.f3308tL     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.gu r9 = r1.f3281mo     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r5 = r1.f3289tn     // Catch:{ all -> 0x011a }
            java.util.List<java.lang.String> r10 = r5.f3331qw     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r5 = r1.f3289tn     // Catch:{ all -> 0x011a }
            java.util.List<java.lang.String> r12 = r5.f3332qx     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r5 = r1.f3289tn     // Catch:{ all -> 0x011a }
            java.util.List<java.lang.String> r13 = r5.f3339tY     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r5 = r1.f3289tn     // Catch:{ all -> 0x011a }
            int r14 = r5.orientation     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r5 = r1.f3289tn     // Catch:{ all -> 0x011a }
            long r5 = r5.f3330qA     // Catch:{ all -> 0x011a }
            java.lang.String r3 = r3.f3311tO     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r7 = r1.f3289tn     // Catch:{ all -> 0x011a }
            boolean r15 = r7.f3337tW     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            r16 = 0
            if (r7 == 0) goto L_0x0099
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.cq r7 = r7.f2845qP     // Catch:{ all -> 0x011a }
            r19 = r7
            goto L_0x009b
        L_0x0099:
            r19 = r16
        L_0x009b:
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x00a6
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.cz r7 = r7.f2846qQ     // Catch:{ all -> 0x011a }
            r20 = r7
            goto L_0x00a8
        L_0x00a6:
            r20 = r16
        L_0x00a8:
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x00b1
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            java.lang.String r7 = r7.f2847qR     // Catch:{ all -> 0x011a }
            goto L_0x00b7
        L_0x00b1:
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r7 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x011a }
        L_0x00b7:
            r21 = r7
            com.google.android.gms.internal.cr r7 = r1.f3282qi     // Catch:{ all -> 0x011a }
            r36 = r7
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x00c8
            com.google.android.gms.internal.cv r7 = r1.f3287tE     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.ct r7 = r7.f2848qS     // Catch:{ all -> 0x011a }
            r23 = r7
            goto L_0x00ca
        L_0x00c8:
            r23 = r16
        L_0x00ca:
            com.google.android.gms.internal.fj r7 = r1.f3289tn     // Catch:{ all -> 0x011a }
            r37 = r5
            long r5 = r7.f3338tX     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fy$a r7 = r1.f3284tB     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.ay r7 = r7.f3462lS     // Catch:{ all -> 0x011a }
            r39 = r7
            com.google.android.gms.internal.fj r7 = r1.f3289tn     // Catch:{ all -> 0x011a }
            r40 = r5
            long r5 = r7.f3336tV     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fy$a r7 = r1.f3284tB     // Catch:{ all -> 0x011a }
            r42 = r5
            long r5 = r7.f3465vG     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r7 = r1.f3289tn     // Catch:{ all -> 0x011a }
            r44 = r5
            long r5 = r7.f3341ua     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fj r7 = r1.f3289tn     // Catch:{ all -> 0x011a }
            java.lang.String r7 = r7.f3342ub     // Catch:{ all -> 0x011a }
            r46 = r7
            com.google.android.gms.internal.fy$a r7 = r1.f3284tB     // Catch:{ all -> 0x011a }
            org.json.JSONObject r7 = r7.f3463vD     // Catch:{ all -> 0x011a }
            r35 = 0
            r34 = r7
            r22 = r36
            r26 = r39
            r33 = r46
            r7 = r4
            r18 = r15
            r15 = r37
            r17 = r3
            r24 = r40
            r27 = r42
            r29 = r44
            r31 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r29, r31, r33, r34, r35)     // Catch:{ all -> 0x011a }
            android.os.Handler r3 = com.google.android.gms.internal.C1606gq.f3553wR     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.fd$2 r5 = new com.google.android.gms.internal.fd$2     // Catch:{ all -> 0x011a }
            r5.<init>(r4)     // Catch:{ all -> 0x011a }
            r3.post(r5)     // Catch:{ all -> 0x011a }
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            return
        L_0x011a:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1533fd.mo15197cx():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo15279g(long j) throws C1538a {
        int i;
        int i2;
        C1306ay ac = this.f3281mo.mo15420ac();
        if (ac.f2398oq) {
            i2 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            i = this.mContext.getResources().getDisplayMetrics().heightPixels;
        } else {
            int i3 = ac.widthPixels;
            i = ac.heightPixels;
            i2 = i3;
        }
        final C1529fb fbVar = new C1529fb(this, this.f3281mo, i2, i);
        C1606gq.f3553wR.post(new Runnable() {
            public void run() {
                synchronized (C1533fd.this.f3280mH) {
                    if (C1533fd.this.f3289tn.errorCode == -2) {
                        C1533fd.this.f3281mo.mo15426dD().mo15447a((C1612gv.C1614a) C1533fd.this);
                        fbVar.mo15267b(C1533fd.this.f3289tn);
                    }
                }
            }
        });
        m4464h(j);
        if (fbVar.mo15270cH()) {
            C1607gr.m4705S("Ad-Network indicated no fill with passback URL.");
            throw new C1538a("AdNetwork sent passback url", 3);
        } else if (!fbVar.mo15271cI()) {
            throw new C1538a("AdNetwork timed out", 2);
        }
    }

    public void onStop() {
        synchronized (this.f3288tj) {
            this.f3281mo.stopLoading();
            C1591gi.m4652a((WebView) this.f3281mo);
            if (this.f3286tD != null) {
                this.f3286tD.cancel();
            }
        }
    }
}
