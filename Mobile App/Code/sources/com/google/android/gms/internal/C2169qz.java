package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.qz */
public final class C2169qz {
    public static final int[] azj = new int[0];
    public static final long[] azk = new long[0];
    public static final float[] azl = new float[0];
    public static final double[] azm = new double[0];
    public static final boolean[] azn = new boolean[0];
    public static final String[] azo = new String[0];
    public static final byte[][] azp = new byte[0][];
    public static final byte[] azq = new byte[0];

    /* renamed from: b */
    public static final int m6494b(C2157qo qoVar, int i) throws IOException {
        int position = qoVar.getPosition();
        qoVar.mo17013gQ(i);
        int i2 = 1;
        while (qoVar.mo17037rz() == i) {
            qoVar.mo17013gQ(i);
            i2++;
        }
        qoVar.mo17016gU(position);
        return i2;
    }

    /* renamed from: hk */
    static int m6495hk(int i) {
        return i & 7;
    }

    /* renamed from: hl */
    public static int m6496hl(int i) {
        return i >>> 3;
    }

    /* renamed from: y */
    static int m6497y(int i, int i2) {
        return (i << 3) | i2;
    }
}
