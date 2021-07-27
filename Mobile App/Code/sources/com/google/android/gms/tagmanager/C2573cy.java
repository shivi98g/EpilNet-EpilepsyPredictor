package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.tagmanager.cy */
class C2573cy extends C2572cx {
    private static C2573cy atJ;
    /* access modifiers changed from: private */

    /* renamed from: yT */
    public static final Object f4451yT = new Object();
    /* access modifiers changed from: private */
    public C2485at atA;
    private volatile C2482ar atB;
    /* access modifiers changed from: private */
    public int atC = 1800000;
    private boolean atD = true;
    private boolean atE = false;
    private boolean atF = true;
    private C2486au atG = new C2486au() {
        /* renamed from: B */
        public void mo18662B(boolean z) {
            C2573cy.this.mo18822a(z, C2573cy.this.connected);
        }
    };
    private C2511bo atH;
    /* access modifiers changed from: private */
    public boolean atI = false;
    private Context atz;
    /* access modifiers changed from: private */
    public boolean connected = true;
    /* access modifiers changed from: private */
    public Handler handler;

    private C2573cy() {
    }

    /* renamed from: ev */
    private void m7484ev() {
        this.atH = new C2511bo(this);
        this.atH.mo18688z(this.atz);
    }

    /* renamed from: ew */
    private void m7485ew() {
        this.handler = new Handler(this.atz.getMainLooper(), new Handler.Callback() {
            public boolean handleMessage(Message message) {
                if (1 == message.what && C2573cy.f4451yT.equals(message.obj)) {
                    C2573cy.this.dispatch();
                    if (C2573cy.this.atC > 0 && !C2573cy.this.atI) {
                        C2573cy.this.handler.sendMessageDelayed(C2573cy.this.handler.obtainMessage(1, C2573cy.f4451yT), (long) C2573cy.this.atC);
                    }
                }
                return true;
            }
        });
        if (this.atC > 0) {
            this.handler.sendMessageDelayed(this.handler.obtainMessage(1, f4451yT), (long) this.atC);
        }
    }

    /* renamed from: qN */
    public static C2573cy m7487qN() {
        if (atJ == null) {
            atJ = new C2573cy();
        }
        return atJ;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public synchronized void mo18818C(boolean z) {
        mo18822a(this.atI, z);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18821a(android.content.Context r2, com.google.android.gms.tagmanager.C2482ar r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.Context r0 = r1.atz     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0015 }
            r1.atz = r2     // Catch:{ all -> 0x0015 }
            com.google.android.gms.tagmanager.ar r2 = r1.atB     // Catch:{ all -> 0x0015 }
            if (r2 != 0) goto L_0x0013
            r1.atB = r3     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r1)
            return
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2573cy.mo18821a(android.content.Context, com.google.android.gms.tagmanager.ar):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo18822a(boolean z, boolean z2) {
        String str;
        if (this.atI != z || this.connected != z2) {
            if (z || !z2) {
                if (this.atC > 0) {
                    this.handler.removeMessages(1, f4451yT);
                }
            }
            if (!z && z2 && this.atC > 0) {
                this.handler.sendMessageDelayed(this.handler.obtainMessage(1, f4451yT), (long) this.atC);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("PowerSaveMode ");
            if (!z) {
                if (z2) {
                    str = "terminated.";
                    sb.append(str);
                    C2504bh.m7245V(sb.toString());
                    this.atI = z;
                    this.connected = z2;
                }
            }
            str = "initiated.";
            sb.append(str);
            C2504bh.m7245V(sb.toString());
            this.atI = z;
            this.connected = z2;
        }
    }

    public synchronized void dispatch() {
        if (!this.atE) {
            C2504bh.m7245V("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.atD = true;
            return;
        }
        this.atB.mo18655b(new Runnable() {
            public void run() {
                C2573cy.this.atA.dispatch();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ey */
    public synchronized void mo18820ey() {
        if (!this.atI && this.connected && this.atC > 0) {
            this.handler.removeMessages(1, f4451yT);
            this.handler.sendMessage(this.handler.obtainMessage(1, f4451yT));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qO */
    public synchronized C2485at mo18823qO() {
        if (this.atA == null) {
            if (this.atz == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.atA = new C2526cb(this.atG, this.atz);
        }
        if (this.handler == null) {
            m7485ew();
        }
        this.atE = true;
        if (this.atD) {
            dispatch();
            this.atD = false;
        }
        if (this.atH == null && this.atF) {
            m7484ev();
        }
        return this.atA;
    }
}
