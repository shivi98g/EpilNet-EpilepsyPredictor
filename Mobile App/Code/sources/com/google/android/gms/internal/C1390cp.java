package com.google.android.gms.internal;

import android.content.Context;

@C1507ey
/* renamed from: com.google.android.gms.internal.cp */
public final class C1390cp {

    /* renamed from: lA */
    private final C1402cy f2805lA;
    private final Context mContext;

    /* renamed from: mH */
    private final Object f2806mH = new Object();

    /* renamed from: qh */
    private final C1545fh f2807qh;

    /* renamed from: qi */
    private final C1393cr f2808qi;

    /* renamed from: qj */
    private boolean f2809qj = false;

    /* renamed from: qk */
    private C1396cu f2810qk;

    public C1390cp(Context context, C1545fh fhVar, C1402cy cyVar, C1393cr crVar) {
        this.mContext = context;
        this.f2807qh = fhVar;
        this.f2805lA = cyVar;
        this.f2808qi = crVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r4 = r1.f2810qk.mo15043b(r17, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (r4.f2844qO != 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        com.google.android.gms.internal.C1607gr.m4705S("Adapter succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r4.f2846qQ == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        com.google.android.gms.internal.C1606gq.f3553wR.post(new com.google.android.gms.internal.C1390cp.C13911(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C1398cv mo15027a(long r17, long r19) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Starting mediation."
            com.google.android.gms.internal.C1607gr.m4705S(r2)
            com.google.android.gms.internal.cr r2 = r1.f2808qi
            java.util.List<com.google.android.gms.internal.cq> r2 = r2.f2823qu
            java.util.Iterator r2 = r2.iterator()
        L_0x000f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.cq r3 = (com.google.android.gms.internal.C1392cq) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Trying mediation network: "
            r4.append(r5)
            java.lang.String r5 = r3.f2814qo
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.C1607gr.m4707U(r4)
            java.util.List<java.lang.String> r4 = r3.f2815qp
            java.util.Iterator r13 = r4.iterator()
        L_0x0037:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0096
            java.lang.Object r4 = r13.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r14 = r1.f2806mH
            monitor-enter(r14)
            boolean r4 = r1.f2809qj     // Catch:{ all -> 0x0092 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.cv r1 = new com.google.android.gms.internal.cv     // Catch:{ all -> 0x0092 }
            r2 = -1
            r1.<init>(r2)     // Catch:{ all -> 0x0092 }
            monitor-exit(r14)     // Catch:{ all -> 0x0092 }
            return r1
        L_0x0053:
            com.google.android.gms.internal.cu r15 = new com.google.android.gms.internal.cu     // Catch:{ all -> 0x0092 }
            android.content.Context r5 = r1.mContext     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.cy r7 = r1.f2805lA     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.cr r8 = r1.f2808qi     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.fh r4 = r1.f2807qh     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.av r10 = r4.f3308tL     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.fh r4 = r1.f2807qh     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ay r11 = r4.f3305lS     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.fh r4 = r1.f2807qh     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.gs r12 = r4.f3304lO     // Catch:{ all -> 0x0092 }
            r4 = r15
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0092 }
            r1.f2810qk = r15     // Catch:{ all -> 0x0092 }
            monitor-exit(r14)     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.cu r4 = r1.f2810qk
            r5 = r17
            r7 = r19
            com.google.android.gms.internal.cv r4 = r4.mo15043b(r5, r7)
            int r9 = r4.f2844qO
            if (r9 != 0) goto L_0x0083
            java.lang.String r1 = "Adapter succeeded."
            com.google.android.gms.internal.C1607gr.m4705S(r1)
            return r4
        L_0x0083:
            com.google.android.gms.internal.cz r9 = r4.f2846qQ
            if (r9 == 0) goto L_0x0037
            android.os.Handler r9 = com.google.android.gms.internal.C1606gq.f3553wR
            com.google.android.gms.internal.cp$1 r10 = new com.google.android.gms.internal.cp$1
            r10.<init>(r4)
            r9.post(r10)
            goto L_0x0037
        L_0x0092:
            r0 = move-exception
            r1 = r0
            monitor-exit(r14)     // Catch:{ all -> 0x0092 }
            throw r1
        L_0x0096:
            r5 = r17
            r7 = r19
            goto L_0x000f
        L_0x009c:
            com.google.android.gms.internal.cv r1 = new com.google.android.gms.internal.cv
            r2 = 1
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1390cp.mo15027a(long, long):com.google.android.gms.internal.cv");
    }

    public void cancel() {
        synchronized (this.f2806mH) {
            this.f2809qj = true;
            if (this.f2810qk != null) {
                this.f2810qk.cancel();
            }
        }
    }
}
