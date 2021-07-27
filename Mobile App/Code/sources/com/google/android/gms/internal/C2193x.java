package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.internal.C2182u;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@C1507ey
/* renamed from: com.google.android.gms.internal.x */
class C2193x implements C1578g, Runnable {

    /* renamed from: lB */
    private C2182u.C2188b f4270lB;

    /* renamed from: mp */
    private final List<Object[]> f4271mp = new Vector();

    /* renamed from: mq */
    private final AtomicReference<C1578g> f4272mq = new AtomicReference<>();

    /* renamed from: mr */
    CountDownLatch f4273mr = new CountDownLatch(1);

    public C2193x(C2182u.C2188b bVar) {
        this.f4270lB = bVar;
        if (C1606gq.m4703dB()) {
            C1587gh.m4636a(this);
        } else {
            run();
        }
    }

    /* renamed from: aB */
    private void m6593aB() {
        if (!this.f4271mp.isEmpty()) {
            for (Object[] next : this.f4271mp) {
                if (next.length == 1) {
                    this.f4272mq.get().mo15352a((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    this.f4272mq.get().mo15351a(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r2.getApplicationContext();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Context m6594i(android.content.Context r2) {
        /*
            r1 = this;
            boolean r0 = r1.mo17155aC()
            if (r0 != 0) goto L_0x0007
            return r2
        L_0x0007:
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 != 0) goto L_0x000e
            return r2
        L_0x000e:
            r2 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2193x.m6594i(android.content.Context):android.content.Context");
    }

    /* renamed from: a */
    public String mo15349a(Context context) {
        C1578g gVar;
        if (!mo17154aA() || (gVar = this.f4272mq.get()) == null) {
            return "";
        }
        m6593aB();
        return gVar.mo15349a(m6594i(context));
    }

    /* renamed from: a */
    public String mo15350a(Context context, String str) {
        C1578g gVar;
        if (!mo17154aA() || (gVar = this.f4272mq.get()) == null) {
            return "";
        }
        m6593aB();
        return gVar.mo15350a(m6594i(context), str);
    }

    /* renamed from: a */
    public void mo15351a(int i, int i2, int i3) {
        C1578g gVar = this.f4272mq.get();
        if (gVar != null) {
            m6593aB();
            gVar.mo15351a(i, i2, i3);
            return;
        }
        this.f4271mp.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public void mo15352a(MotionEvent motionEvent) {
        C1578g gVar = this.f4272mq.get();
        if (gVar != null) {
            m6593aB();
            gVar.mo15352a(motionEvent);
            return;
        }
        this.f4271mp.add(new Object[]{motionEvent});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17153a(C1578g gVar) {
        this.f4272mq.set(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public boolean mo17154aA() {
        try {
            this.f4273mr.await();
            return true;
        } catch (InterruptedException e) {
            C1607gr.m4713d("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aC */
    public boolean mo17155aC() {
        return C1579ga.m4591bN().getBoolean("gads:spam_app_context:enabled", false);
    }

    public void run() {
        try {
            mo17153a((C1578g) C1733j.m5138a(this.f4270lB.f4243lO.f3554wS, m6594i(this.f4270lB.f4241lM)));
        } finally {
            this.f4273mr.countDown();
            this.f4270lB = null;
        }
    }
}
