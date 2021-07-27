package com.google.android.gms.analytics;

/* renamed from: com.google.android.gms.analytics.ad */
class C0549ad implements C0554ah {

    /* renamed from: BF */
    private final long f194BF;

    /* renamed from: BG */
    private final int f195BG;

    /* renamed from: BH */
    private double f196BH;

    /* renamed from: BI */
    private long f197BI;

    /* renamed from: BJ */
    private final Object f198BJ;

    /* renamed from: BK */
    private final String f199BK;

    public C0549ad(int i, long j, String str) {
        this.f198BJ = new Object();
        this.f195BG = i;
        this.f196BH = (double) this.f195BG;
        this.f194BF = j;
        this.f199BK = str;
    }

    public C0549ad(String str) {
        this(60, 2000, str);
    }

    /* renamed from: fe */
    public boolean mo10353fe() {
        synchronized (this.f198BJ) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f196BH < ((double) this.f195BG)) {
                double d = ((double) (currentTimeMillis - this.f197BI)) / ((double) this.f194BF);
                if (d > 0.0d) {
                    this.f196BH = Math.min((double) this.f195BG, this.f196BH + d);
                }
            }
            this.f197BI = currentTimeMillis;
            if (this.f196BH >= 1.0d) {
                this.f196BH -= 1.0d;
                return true;
            }
            C0550ae.m106W("Excessive " + this.f199BK + " detected; call ignored.");
            return false;
        }
    }
}
