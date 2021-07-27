package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1832ld;

/* renamed from: com.google.android.gms.tagmanager.bf */
class C2501bf implements C2534cg {

    /* renamed from: BF */
    private final long f4419BF;

    /* renamed from: BG */
    private final int f4420BG;

    /* renamed from: BH */
    private double f4421BH;

    /* renamed from: BI */
    private long f4422BI;

    /* renamed from: BJ */
    private final Object f4423BJ = new Object();

    /* renamed from: BK */
    private final String f4424BK;
    private final long arU;

    /* renamed from: wb */
    private final C1832ld f4425wb;

    public C2501bf(int i, long j, long j2, String str, C1832ld ldVar) {
        this.f4420BG = i;
        this.f4421BH = (double) this.f4420BG;
        this.f4419BF = j;
        this.arU = j2;
        this.f4424BK = str;
        this.f4425wb = ldVar;
    }

    /* renamed from: fe */
    public boolean mo18670fe() {
        synchronized (this.f4423BJ) {
            long currentTimeMillis = this.f4425wb.currentTimeMillis();
            if (currentTimeMillis - this.f4422BI < this.arU) {
                C2504bh.m7246W("Excessive " + this.f4424BK + " detected; call ignored.");
                return false;
            }
            if (this.f4421BH < ((double) this.f4420BG)) {
                double d = ((double) (currentTimeMillis - this.f4422BI)) / ((double) this.f4419BF);
                if (d > 0.0d) {
                    this.f4421BH = Math.min((double) this.f4420BG, this.f4421BH + d);
                }
            }
            this.f4422BI = currentTimeMillis;
            if (this.f4421BH >= 1.0d) {
                this.f4421BH -= 1.0d;
                return true;
            }
            C2504bh.m7246W("Excessive " + this.f4424BK + " detected; call ignored.");
            return false;
        }
    }
}
