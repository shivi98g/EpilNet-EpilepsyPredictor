package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.C1343bv;
import com.google.android.gms.internal.C1531fc;
import com.google.android.gms.internal.C1574fy;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C1507ey
/* renamed from: com.google.android.gms.internal.fm */
public class C1553fm extends C1584gf {

    /* renamed from: mH */
    private final Object f3350mH;
    /* access modifiers changed from: private */

    /* renamed from: tA */
    public final C1531fc.C1532a f3351tA;

    /* renamed from: tB */
    private final C1574fy.C1575a f3352tB;

    /* renamed from: tn */
    private final C1548fj f3353tn;

    /* renamed from: ui */
    private final C1555fn f3354ui;

    /* renamed from: uj */
    private Future<C1574fy> f3355uj;

    public C1553fm(Context context, C2182u uVar, C1278ai aiVar, C1574fy.C1575a aVar, C1531fc.C1532a aVar2) {
        this(aVar, aVar2, new C1555fn(context, uVar, aiVar, new C1600gn(), aVar));
    }

    C1553fm(C1574fy.C1575a aVar, C1531fc.C1532a aVar2, C1555fn fnVar) {
        this.f3350mH = new Object();
        this.f3352tB = aVar;
        this.f3353tn = aVar.f3468vK;
        this.f3351tA = aVar2;
        this.f3354ui = fnVar;
    }

    /* renamed from: s */
    private C1574fy m4496s(int i) {
        C1303av avVar = this.f3352tB.f3467vJ.f3308tL;
        int i2 = this.f3353tn.orientation;
        long j = this.f3353tn.f3330qA;
        String str = this.f3352tB.f3467vJ.f3311tO;
        long j2 = this.f3353tn.f3338tX;
        C1306ay ayVar = this.f3352tB.f3462lS;
        long j3 = this.f3353tn.f3336tV;
        long j4 = this.f3352tB.f3465vG;
        long j5 = this.f3353tn.f3341ua;
        return new C1574fy(avVar, (C1610gu) null, (List<String>) null, i, (List<String>) null, (List<String>) null, i2, j, str, false, (C1392cq) null, (C1405cz) null, (String) null, (C1393cr) null, (C1395ct) null, j2, ayVar, j3, j4, j5, this.f3353tn.f3342ub, this.f3352tB.f3463vD, (C1343bv.C1344a) null);
    }

    /* renamed from: cx */
    public void mo15197cx() {
        int i = -1;
        final C1574fy fyVar = null;
        try {
            synchronized (this.f3350mH) {
                this.f3355uj = C1587gh.submit(this.f3354ui);
            }
            i = -2;
            fyVar = this.f3355uj.get(60000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            C1607gr.m4709W("Timed out waiting for native ad.");
            i = 2;
        } catch (ExecutionException e2) {
            i = 0;
        } catch (InterruptedException | CancellationException e3) {
        }
        if (fyVar == null) {
            fyVar = m4496s(i);
        }
        C1606gq.f3553wR.post(new Runnable() {
            public void run() {
                C1553fm.this.f3351tA.mo15278a(fyVar);
            }
        });
    }

    public void onStop() {
        synchronized (this.f3350mH) {
            if (this.f3355uj != null) {
                this.f3355uj.cancel(true);
            }
        }
    }
}
