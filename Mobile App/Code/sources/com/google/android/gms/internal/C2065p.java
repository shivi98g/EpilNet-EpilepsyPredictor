package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.p */
class C2065p implements C1963n {

    /* renamed from: lb */
    private C2158qp f4171lb;

    /* renamed from: lc */
    private byte[] f4172lc;

    /* renamed from: ld */
    private final int f4173ld;

    public C2065p(int i) {
        this.f4173ld = i;
        reset();
    }

    /* renamed from: D */
    public byte[] mo16226D() throws IOException {
        int rO = this.f4171lb.mo17065rO();
        if (rO < 0) {
            throw new IOException();
        } else if (rO == 0) {
            return this.f4172lc;
        } else {
            byte[] bArr = new byte[(this.f4172lc.length - rO)];
            System.arraycopy(this.f4172lc, 0, bArr, 0, bArr.length);
            return bArr;
        }
    }

    /* renamed from: b */
    public void mo16227b(int i, long j) throws IOException {
        this.f4171lb.mo17049b(i, j);
    }

    /* renamed from: b */
    public void mo16228b(int i, String str) throws IOException {
        this.f4171lb.mo17050b(i, str);
    }

    public void reset() {
        this.f4172lc = new byte[this.f4173ld];
        this.f4171lb = C2158qp.m6405q(this.f4172lc);
    }
}
