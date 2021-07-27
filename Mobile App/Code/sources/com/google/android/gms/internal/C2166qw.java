package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.qw */
public abstract class C2166qw {
    protected volatile int azh = -1;

    /* renamed from: a */
    public static final <T extends C2166qw> T m6477a(T t, byte[] bArr) throws C2165qv {
        return m6479b(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static final void m6478a(C2166qw qwVar, byte[] bArr, int i, int i2) {
        try {
            C2158qp b = C2158qp.m6388b(bArr, i, i2);
            qwVar.mo11551a(b);
            b.mo17066rP();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: b */
    public static final <T extends C2166qw> T m6479b(T t, byte[] bArr, int i, int i2) throws C2165qv {
        try {
            C2157qo a = C2157qo.m6352a(bArr, i, i2);
            t.mo11552b(a);
            a.mo17012gP(0);
            return t;
        } catch (C2165qv e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: f */
    public static final byte[] m6480f(C2166qw qwVar) {
        byte[] bArr = new byte[qwVar.mo17098rZ()];
        m6478a(qwVar, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: a */
    public void mo11551a(C2158qp qpVar) throws IOException {
    }

    /* renamed from: b */
    public abstract C2166qw mo11552b(C2157qo qoVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo11553c() {
        return 0;
    }

    /* renamed from: rY */
    public int mo17097rY() {
        if (this.azh < 0) {
            mo17098rZ();
        }
        return this.azh;
    }

    /* renamed from: rZ */
    public int mo17098rZ() {
        int c = mo11553c();
        this.azh = c;
        return c;
    }

    public String toString() {
        return C2167qx.m6491g(this);
    }
}
