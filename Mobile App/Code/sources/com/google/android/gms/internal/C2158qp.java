package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.qp */
public final class C2158qp {
    private final int ayV;
    private final byte[] buffer;
    private int position;

    /* renamed from: com.google.android.gms.internal.qp$a */
    public static class C2159a extends IOException {
        C2159a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private C2158qp(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.position = i;
        this.ayV = i + i2;
    }

    /* renamed from: D */
    public static int m6380D(long j) {
        return m6382G(j);
    }

    /* renamed from: E */
    public static int m6381E(long j) {
        return m6382G(m6383I(j));
    }

    /* renamed from: G */
    public static int m6382G(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: I */
    public static long m6383I(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: X */
    public static int m6384X(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m6385b(int i, double d) {
        return m6401hc(i) + m6398f(d);
    }

    /* renamed from: b */
    public static int m6386b(int i, C2166qw qwVar) {
        return (m6401hc(i) * 2) + m6393d(qwVar);
    }

    /* renamed from: b */
    public static int m6387b(int i, byte[] bArr) {
        return m6401hc(i) + m6406s(bArr);
    }

    /* renamed from: b */
    public static C2158qp m6388b(byte[] bArr, int i, int i2) {
        return new C2158qp(bArr, i, i2);
    }

    /* renamed from: c */
    public static int m6389c(int i, float f) {
        return m6401hc(i) + m6395e(f);
    }

    /* renamed from: c */
    public static int m6390c(int i, C2166qw qwVar) {
        return m6401hc(i) + m6397e(qwVar);
    }

    /* renamed from: c */
    public static int m6391c(int i, boolean z) {
        return m6401hc(i) + m6384X(z);
    }

    /* renamed from: d */
    public static int m6392d(int i, long j) {
        return m6401hc(i) + m6380D(j);
    }

    /* renamed from: d */
    public static int m6393d(C2166qw qwVar) {
        return qwVar.mo17098rZ();
    }

    /* renamed from: dk */
    public static int m6394dk(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m6402he(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: e */
    public static int m6395e(float f) {
        return 4;
    }

    /* renamed from: e */
    public static int m6396e(int i, long j) {
        return m6401hc(i) + m6381E(j);
    }

    /* renamed from: e */
    public static int m6397e(C2166qw qwVar) {
        int rZ = qwVar.mo17098rZ();
        return m6402he(rZ) + rZ;
    }

    /* renamed from: f */
    public static int m6398f(double d) {
        return 8;
    }

    /* renamed from: gZ */
    public static int m6399gZ(int i) {
        if (i >= 0) {
            return m6402he(i);
        }
        return 10;
    }

    /* renamed from: ha */
    public static int m6400ha(int i) {
        return m6402he(m6403hg(i));
    }

    /* renamed from: hc */
    public static int m6401hc(int i) {
        return m6402he(C2169qz.m6497y(i, 0));
    }

    /* renamed from: he */
    public static int m6402he(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: hg */
    public static int m6403hg(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: j */
    public static int m6404j(int i, String str) {
        return m6401hc(i) + m6394dk(str);
    }

    /* renamed from: q */
    public static C2158qp m6405q(byte[] bArr) {
        return m6388b(bArr, 0, bArr.length);
    }

    /* renamed from: s */
    public static int m6406s(byte[] bArr) {
        return m6402he(bArr.length) + bArr.length;
    }

    /* renamed from: v */
    public static int m6407v(int i, int i2) {
        return m6401hc(i) + m6399gZ(i2);
    }

    /* renamed from: w */
    public static int m6408w(int i, int i2) {
        return m6401hc(i) + m6400ha(i2);
    }

    /* renamed from: B */
    public void mo17039B(long j) throws IOException {
        mo17041F(j);
    }

    /* renamed from: C */
    public void mo17040C(long j) throws IOException {
        mo17041F(m6383I(j));
    }

    /* renamed from: F */
    public void mo17041F(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo17061hb((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo17061hb((int) j);
    }

    /* renamed from: H */
    public void mo17042H(long j) throws IOException {
        mo17061hb(((int) j) & 255);
        mo17061hb(((int) (j >> 8)) & 255);
        mo17061hb(((int) (j >> 16)) & 255);
        mo17061hb(((int) (j >> 24)) & 255);
        mo17061hb(((int) (j >> 32)) & 255);
        mo17061hb(((int) (j >> 40)) & 255);
        mo17061hb(((int) (j >> 48)) & 255);
        mo17061hb(((int) (j >> 56)) & 255);
    }

    /* renamed from: W */
    public void mo17043W(boolean z) throws IOException {
        mo17061hb(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo17044a(int i, double d) throws IOException {
        mo17070x(i, 1);
        mo17058e(d);
    }

    /* renamed from: a */
    public void mo17045a(int i, C2166qw qwVar) throws IOException {
        mo17070x(i, 2);
        mo17054c(qwVar);
    }

    /* renamed from: a */
    public void mo17046a(int i, byte[] bArr) throws IOException {
        mo17070x(i, 2);
        mo17064r(bArr);
    }

    /* renamed from: b */
    public void mo17047b(byte b) throws IOException {
        if (this.position == this.ayV) {
            throw new C2159a(this.position, this.ayV);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    /* renamed from: b */
    public void mo17048b(int i, float f) throws IOException {
        mo17070x(i, 5);
        mo17056d(f);
    }

    /* renamed from: b */
    public void mo17049b(int i, long j) throws IOException {
        mo17070x(i, 0);
        mo17039B(j);
    }

    /* renamed from: b */
    public void mo17050b(int i, String str) throws IOException {
        mo17070x(i, 2);
        mo17057dj(str);
    }

    /* renamed from: b */
    public void mo17051b(int i, boolean z) throws IOException {
        mo17070x(i, 0);
        mo17043W(z);
    }

    /* renamed from: b */
    public void mo17052b(C2166qw qwVar) throws IOException {
        qwVar.mo11551a(this);
    }

    /* renamed from: c */
    public void mo17053c(int i, long j) throws IOException {
        mo17070x(i, 0);
        mo17040C(j);
    }

    /* renamed from: c */
    public void mo17054c(C2166qw qwVar) throws IOException {
        mo17062hd(qwVar.mo17097rY());
        qwVar.mo11551a(this);
    }

    /* renamed from: c */
    public void mo17055c(byte[] bArr, int i, int i2) throws IOException {
        if (this.ayV - this.position >= i2) {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
            return;
        }
        throw new C2159a(this.position, this.ayV);
    }

    /* renamed from: d */
    public void mo17056d(float f) throws IOException {
        mo17063hf(Float.floatToIntBits(f));
    }

    /* renamed from: dj */
    public void mo17057dj(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        mo17062hd(bytes.length);
        mo17068t(bytes);
    }

    /* renamed from: e */
    public void mo17058e(double d) throws IOException {
        mo17042H(Double.doubleToLongBits(d));
    }

    /* renamed from: gX */
    public void mo17059gX(int i) throws IOException {
        if (i >= 0) {
            mo17062hd(i);
        } else {
            mo17041F((long) i);
        }
    }

    /* renamed from: gY */
    public void mo17060gY(int i) throws IOException {
        mo17062hd(m6403hg(i));
    }

    /* renamed from: hb */
    public void mo17061hb(int i) throws IOException {
        mo17047b((byte) i);
    }

    /* renamed from: hd */
    public void mo17062hd(int i) throws IOException {
        while ((i & -128) != 0) {
            mo17061hb((i & 127) | 128);
            i >>>= 7;
        }
        mo17061hb(i);
    }

    /* renamed from: hf */
    public void mo17063hf(int i) throws IOException {
        mo17061hb(i & 255);
        mo17061hb((i >> 8) & 255);
        mo17061hb((i >> 16) & 255);
        mo17061hb((i >> 24) & 255);
    }

    /* renamed from: r */
    public void mo17064r(byte[] bArr) throws IOException {
        mo17062hd(bArr.length);
        mo17068t(bArr);
    }

    /* renamed from: rO */
    public int mo17065rO() {
        return this.ayV - this.position;
    }

    /* renamed from: rP */
    public void mo17066rP() {
        if (mo17065rO() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: t */
    public void mo17067t(int i, int i2) throws IOException {
        mo17070x(i, 0);
        mo17059gX(i2);
    }

    /* renamed from: t */
    public void mo17068t(byte[] bArr) throws IOException {
        mo17055c(bArr, 0, bArr.length);
    }

    /* renamed from: u */
    public void mo17069u(int i, int i2) throws IOException {
        mo17070x(i, 0);
        mo17060gY(i2);
    }

    /* renamed from: x */
    public void mo17070x(int i, int i2) throws IOException {
        mo17062hd(C2169qz.m6497y(i, i2));
    }
}
