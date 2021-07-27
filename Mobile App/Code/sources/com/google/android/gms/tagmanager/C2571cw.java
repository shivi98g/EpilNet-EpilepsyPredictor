package com.google.android.gms.tagmanager;

/* renamed from: com.google.android.gms.tagmanager.cw */
class C2571cw implements C2534cg {

    /* renamed from: BF */
    private final long f4447BF;

    /* renamed from: BG */
    private final int f4448BG;

    /* renamed from: BH */
    private double f4449BH;

    /* renamed from: BJ */
    private final Object f4450BJ;
    private long aty;

    public C2571cw() {
        this(60, 2000);
    }

    public C2571cw(int i, long j) {
        this.f4450BJ = new Object();
        this.f4448BG = i;
        this.f4449BH = (double) this.f4448BG;
        this.f4447BF = j;
    }

    /* renamed from: fe */
    public boolean mo18670fe() {
        synchronized (this.f4450BJ) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f4449BH < ((double) this.f4448BG)) {
                double d = ((double) (currentTimeMillis - this.aty)) / ((double) this.f4447BF);
                if (d > 0.0d) {
                    this.f4449BH = Math.min((double) this.f4448BG, this.f4449BH + d);
                }
            }
            this.aty = currentTimeMillis;
            if (this.f4449BH >= 1.0d) {
                this.f4449BH -= 1.0d;
                return true;
            }
            C2504bh.m7246W("No more tokens available.");
            return false;
        }
    }
}
