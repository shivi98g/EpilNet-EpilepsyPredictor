package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1398cv;

@C1507ey
/* renamed from: com.google.android.gms.internal.cu */
public final class C1396cu implements C1398cv.C1399a {

    /* renamed from: lA */
    private final C1402cy f2832lA;
    private final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: mH */
    public final Object f2833mH = new Object();

    /* renamed from: mw */
    private final C1303av f2834mw;

    /* renamed from: qF */
    private final String f2835qF;

    /* renamed from: qG */
    private final long f2836qG;

    /* renamed from: qH */
    private final C1392cq f2837qH;

    /* renamed from: qI */
    private final C1306ay f2838qI;

    /* renamed from: qJ */
    private final C1608gs f2839qJ;
    /* access modifiers changed from: private */

    /* renamed from: qK */
    public C1405cz f2840qK;
    /* access modifiers changed from: private */

    /* renamed from: qL */
    public int f2841qL = -2;

    public C1396cu(Context context, String str, C1402cy cyVar, C1393cr crVar, C1392cq cqVar, C1303av avVar, C1306ay ayVar, C1608gs gsVar) {
        this.mContext = context;
        this.f2832lA = cyVar;
        this.f2837qH = cqVar;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f2835qF = m4200bO();
        } else {
            this.f2835qF = str;
        }
        this.f2836qG = crVar.f2824qv != -1 ? crVar.f2824qv : 10000;
        this.f2834mw = avVar;
        this.f2838qI = ayVar;
        this.f2839qJ = gsVar;
    }

    /* renamed from: a */
    private void m4195a(long j, long j2, long j3, long j4) {
        while (this.f2841qL == -2) {
            m4199b(j, j2, j3, j4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4196a(C1395ct ctVar) {
        try {
            if (this.f2839qJ.f3556wU < 4100000) {
                if (this.f2838qI.f2398oq) {
                    this.f2840qK.mo15053a(C0970e.m1613k(this.mContext), this.f2834mw, this.f2837qH.f2819qt, ctVar);
                } else {
                    this.f2840qK.mo15055a(C0970e.m1613k(this.mContext), this.f2838qI, this.f2834mw, this.f2837qH.f2819qt, (C1410da) ctVar);
                }
            } else if (this.f2838qI.f2398oq) {
                this.f2840qK.mo15054a(C0970e.m1613k(this.mContext), this.f2834mw, this.f2837qH.f2819qt, this.f2837qH.f2813qn, (C1410da) ctVar);
            } else {
                this.f2840qK.mo15056a(C0970e.m1613k(this.mContext), this.f2838qI, this.f2834mw, this.f2837qH.f2819qt, this.f2837qH.f2813qn, ctVar);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not request ad from mediation adapter.", e);
            mo15045k(5);
        }
    }

    /* renamed from: b */
    private void m4199b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        long j6 = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || j6 <= 0) {
            C1607gr.m4707U("Timed out waiting for adapter.");
            this.f2841qL = 3;
            return;
        }
        try {
            this.f2833mH.wait(Math.min(j5, j6));
        } catch (InterruptedException e) {
            this.f2841qL = -1;
        }
    }

    /* renamed from: bO */
    private String m4200bO() {
        try {
            return (TextUtils.isEmpty(this.f2837qH.f2817qr) || !this.f2832lA.mo15049y(this.f2837qH.f2817qr)) ? "com.google.ads.mediation.customevent.CustomEventAdapter" : "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        } catch (RemoteException e) {
            C1607gr.m4709W("Fail to determine the custom event's version, assuming the old one.");
            return "com.google.ads.mediation.customevent.CustomEventAdapter";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bP */
    public C1405cz m4201bP() {
        C1607gr.m4707U("Instantiating mediation adapter: " + this.f2835qF);
        try {
            return this.f2832lA.mo15048x(this.f2835qF);
        } catch (RemoteException e) {
            C1607gr.m4710a("Could not instantiate mediation adapter: " + this.f2835qF, e);
            return null;
        }
    }

    /* renamed from: b */
    public C1398cv mo15043b(long j, long j2) {
        C1398cv cvVar;
        synchronized (this.f2833mH) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final C1395ct ctVar = new C1395ct();
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    synchronized (C1396cu.this.f2833mH) {
                        if (C1396cu.this.f2841qL == -2) {
                            C1405cz unused = C1396cu.this.f2840qK = C1396cu.this.m4201bP();
                            if (C1396cu.this.f2840qK == null) {
                                C1396cu.this.mo15045k(4);
                                return;
                            }
                            ctVar.mo15036a((C1398cv.C1399a) C1396cu.this);
                            C1396cu.this.m4196a(ctVar);
                        }
                    }
                }
            });
            m4195a(elapsedRealtime, this.f2836qG, j, j2);
            cvVar = new C1398cv(this.f2837qH, this.f2840qK, this.f2835qF, ctVar, this.f2841qL);
        }
        return cvVar;
    }

    public void cancel() {
        synchronized (this.f2833mH) {
            try {
                if (this.f2840qK != null) {
                    this.f2840qK.destroy();
                }
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not destroy mediation adapter.", e);
            }
            this.f2841qL = -1;
            this.f2833mH.notify();
        }
    }

    /* renamed from: k */
    public void mo15045k(int i) {
        synchronized (this.f2833mH) {
            this.f2841qL = i;
            this.f2833mH.notify();
        }
    }
}
