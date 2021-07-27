package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

@C1507ey
/* renamed from: com.google.android.gms.internal.ab */
public class C1261ab {

    /* renamed from: mu */
    private final C1263a f2274mu;

    /* renamed from: mv */
    private final Runnable f2275mv;
    /* access modifiers changed from: private */

    /* renamed from: mw */
    public C1303av f2276mw;
    /* access modifiers changed from: private */

    /* renamed from: mx */
    public boolean f2277mx;

    /* renamed from: my */
    private boolean f2278my;

    /* renamed from: mz */
    private long f2279mz;

    /* renamed from: com.google.android.gms.internal.ab$a */
    public static class C1263a {
        private final Handler mHandler;

        public C1263a(Handler handler) {
            this.mHandler = handler;
        }

        public boolean postDelayed(Runnable runnable, long j) {
            return this.mHandler.postDelayed(runnable, j);
        }

        public void removeCallbacks(Runnable runnable) {
            this.mHandler.removeCallbacks(runnable);
        }
    }

    public C1261ab(C2182u uVar) {
        this(uVar, new C1263a(C1606gq.f3553wR));
    }

    C1261ab(final C2182u uVar, C1263a aVar) {
        this.f2277mx = false;
        this.f2278my = false;
        this.f2279mz = 0;
        this.f2274mu = aVar;
        this.f2275mv = new Runnable() {

            /* renamed from: mA */
            private final WeakReference<C2182u> f2280mA = new WeakReference<>(uVar);

            public void run() {
                boolean unused = C1261ab.this.f2277mx = false;
                C2182u uVar = (C2182u) this.f2280mA.get();
                if (uVar != null) {
                    uVar.mo17139b(C1261ab.this.f2276mw);
                }
            }
        };
    }

    /* renamed from: a */
    public void mo14685a(C1303av avVar, long j) {
        if (this.f2277mx) {
            C1607gr.m4709W("An ad refresh is already scheduled.");
            return;
        }
        this.f2276mw = avVar;
        this.f2277mx = true;
        this.f2279mz = j;
        if (!this.f2278my) {
            C1607gr.m4707U("Scheduling ad refresh " + j + " milliseconds from now.");
            this.f2274mu.postDelayed(this.f2275mv, j);
        }
    }

    /* renamed from: aD */
    public boolean mo14686aD() {
        return this.f2277mx;
    }

    /* renamed from: c */
    public void mo14687c(C1303av avVar) {
        mo14685a(avVar, 60000);
    }

    public void cancel() {
        this.f2277mx = false;
        this.f2274mu.removeCallbacks(this.f2275mv);
    }

    public void pause() {
        this.f2278my = true;
        if (this.f2277mx) {
            this.f2274mu.removeCallbacks(this.f2275mv);
        }
    }

    public void resume() {
        this.f2278my = false;
        if (this.f2277mx) {
            this.f2277mx = false;
            mo14685a(this.f2276mw, this.f2279mz);
        }
    }
}
