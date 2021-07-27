package com.google.android.gms.analytics;

/* renamed from: com.google.android.gms.analytics.s */
public final class C0585s {
    /* renamed from: A */
    public static String m253A(int i) {
        return m259d("&pr", i);
    }

    /* renamed from: B */
    public static String m254B(int i) {
        return m259d("&promo", i);
    }

    /* renamed from: C */
    public static String m255C(int i) {
        return m259d("pi", i);
    }

    /* renamed from: D */
    public static String m256D(int i) {
        return m259d("&il", i);
    }

    /* renamed from: E */
    public static String m257E(int i) {
        return m259d("cd", i);
    }

    /* renamed from: F */
    public static String m258F(int i) {
        return m259d("cm", i);
    }

    /* renamed from: d */
    private static String m259d(String str, int i) {
        if (i < 1) {
            C0550ae.m103T("index out of range for " + str + " (" + i + ")");
            return "";
        }
        return str + i;
    }

    /* renamed from: y */
    static String m260y(int i) {
        return m259d("&cd", i);
    }

    /* renamed from: z */
    static String m261z(int i) {
        return m259d("&cm", i);
    }
}
