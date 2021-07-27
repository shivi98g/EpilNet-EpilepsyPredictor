package com.google.android.gms.internal;

@C1507ey
/* renamed from: com.google.android.gms.internal.gf */
public abstract class C1584gf {

    /* renamed from: mv */
    private final Runnable f3519mv = new Runnable() {
        public final void run() {
            Thread unused = C1584gf.this.f3520wu = Thread.currentThread();
            C1584gf.this.mo15197cx();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: wu */
    public volatile Thread f3520wu;

    public final void cancel() {
        onStop();
        if (this.f3520wu != null) {
            this.f3520wu.interrupt();
        }
    }

    /* renamed from: cx */
    public abstract void mo15197cx();

    public abstract void onStop();

    public final void start() {
        C1587gh.m4636a(this.f3519mv);
    }
}
