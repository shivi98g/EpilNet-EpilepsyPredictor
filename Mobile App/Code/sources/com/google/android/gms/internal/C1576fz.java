package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@C1507ey
/* renamed from: com.google.android.gms.internal.fz */
public class C1576fz {

    /* renamed from: mH */
    private final Object f3469mH;

    /* renamed from: uQ */
    private boolean f3470uQ;

    /* renamed from: vL */
    private final C1579ga f3471vL;

    /* renamed from: vM */
    private final LinkedList<C1577a> f3472vM;

    /* renamed from: vN */
    private final String f3473vN;

    /* renamed from: vO */
    private final String f3474vO;

    /* renamed from: vP */
    private long f3475vP;

    /* renamed from: vQ */
    private long f3476vQ;

    /* renamed from: vR */
    private long f3477vR;

    /* renamed from: vS */
    private long f3478vS;

    /* renamed from: vT */
    private long f3479vT;

    /* renamed from: vU */
    private long f3480vU;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.fz$a */
    private static final class C1577a {

        /* renamed from: vV */
        private long f3481vV = -1;

        /* renamed from: vW */
        private long f3482vW = -1;

        /* renamed from: cZ */
        public long mo15345cZ() {
            return this.f3482vW;
        }

        /* renamed from: da */
        public void mo15346da() {
            this.f3482vW = SystemClock.elapsedRealtime();
        }

        /* renamed from: db */
        public void mo15347db() {
            this.f3481vV = SystemClock.elapsedRealtime();
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", this.f3481vV);
            bundle.putLong("tclose", this.f3482vW);
            return bundle;
        }
    }

    public C1576fz(C1579ga gaVar, String str, String str2) {
        this.f3469mH = new Object();
        this.f3475vP = -1;
        this.f3476vQ = -1;
        this.f3470uQ = false;
        this.f3477vR = -1;
        this.f3478vS = 0;
        this.f3479vT = -1;
        this.f3480vU = -1;
        this.f3471vL = gaVar;
        this.f3473vN = str;
        this.f3474vO = str2;
        this.f3472vM = new LinkedList<>();
    }

    public C1576fz(String str, String str2) {
        this(C1579ga.m4593dc(), str, str2);
    }

    /* renamed from: cW */
    public void mo15336cW() {
        synchronized (this.f3469mH) {
            if (this.f3480vU != -1 && this.f3476vQ == -1) {
                this.f3476vQ = SystemClock.elapsedRealtime();
                this.f3471vL.mo15353a(this);
            }
            C1579ga gaVar = this.f3471vL;
            C1579ga.m4595dh().mo15374cW();
        }
    }

    /* renamed from: cX */
    public void mo15337cX() {
        synchronized (this.f3469mH) {
            if (this.f3480vU != -1) {
                C1577a aVar = new C1577a();
                aVar.mo15347db();
                this.f3472vM.add(aVar);
                this.f3478vS++;
                C1579ga gaVar = this.f3471vL;
                C1579ga.m4595dh().mo15375cX();
                this.f3471vL.mo15353a(this);
            }
        }
    }

    /* renamed from: cY */
    public void mo15338cY() {
        synchronized (this.f3469mH) {
            if (this.f3480vU != -1 && !this.f3472vM.isEmpty()) {
                C1577a last = this.f3472vM.getLast();
                if (last.mo15345cZ() == -1) {
                    last.mo15346da();
                    this.f3471vL.mo15353a(this);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo15339e(C1303av avVar) {
        synchronized (this.f3469mH) {
            this.f3479vT = SystemClock.elapsedRealtime();
            C1579ga gaVar = this.f3471vL;
            C1579ga.m4595dh().mo15373b(avVar, this.f3479vT);
        }
    }

    /* renamed from: j */
    public void mo15340j(long j) {
        synchronized (this.f3469mH) {
            this.f3480vU = j;
            if (this.f3480vU != -1) {
                this.f3471vL.mo15353a(this);
            }
        }
    }

    /* renamed from: k */
    public void mo15341k(long j) {
        synchronized (this.f3469mH) {
            if (this.f3480vU != -1) {
                this.f3475vP = j;
                this.f3471vL.mo15353a(this);
            }
        }
    }

    public Bundle toBundle() {
        Bundle bundle;
        synchronized (this.f3469mH) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f3473vN);
            bundle.putString("slotid", this.f3474vO);
            bundle.putBoolean("ismediation", this.f3470uQ);
            bundle.putLong("treq", this.f3479vT);
            bundle.putLong("tresponse", this.f3480vU);
            bundle.putLong("timp", this.f3476vQ);
            bundle.putLong("tload", this.f3477vR);
            bundle.putLong("pcc", this.f3478vS);
            bundle.putLong("tfetch", this.f3475vP);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3472vM.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1577a) it.next()).toBundle());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: v */
    public void mo15343v(boolean z) {
        synchronized (this.f3469mH) {
            if (this.f3480vU != -1) {
                this.f3477vR = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f3476vQ = this.f3477vR;
                    this.f3471vL.mo15353a(this);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo15344w(boolean z) {
        synchronized (this.f3469mH) {
            if (this.f3480vU != -1) {
                this.f3470uQ = z;
                this.f3471vL.mo15353a(this);
            }
        }
    }
}
