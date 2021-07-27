package com.google.android.gms.internal;

import android.os.Bundle;

@C1507ey
/* renamed from: com.google.android.gms.internal.gd */
public class C1582gd {

    /* renamed from: mH */
    private final Object f3512mH;

    /* renamed from: vL */
    private final C1579ga f3513vL;

    /* renamed from: vO */
    private final String f3514vO;

    /* renamed from: wr */
    private int f3515wr;

    /* renamed from: ws */
    private int f3516ws;

    C1582gd(C1579ga gaVar, String str) {
        this.f3512mH = new Object();
        this.f3513vL = gaVar;
        this.f3514vO = str;
    }

    public C1582gd(String str) {
        this(C1579ga.m4593dc(), str);
    }

    /* renamed from: d */
    public void mo15378d(int i, int i2) {
        synchronized (this.f3512mH) {
            this.f3515wr = i;
            this.f3516ws = i2;
            this.f3513vL.mo15354a(this.f3514vO, this);
        }
    }

    public Bundle toBundle() {
        Bundle bundle;
        synchronized (this.f3512mH) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f3515wr);
            bundle.putInt("pmnll", this.f3516ws);
        }
        return bundle;
    }
}
