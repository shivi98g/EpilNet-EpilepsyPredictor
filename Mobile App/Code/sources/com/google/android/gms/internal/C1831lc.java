package com.google.android.gms.internal;

import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.lc */
public final class C1831lc {

    /* renamed from: Oe */
    private static Pattern f4003Oe = null;

    /* renamed from: K */
    public static boolean m5520K(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /* renamed from: aS */
    public static int m5521aS(int i) {
        return i / 1000;
    }

    /* renamed from: aT */
    public static int m5522aT(int i) {
        return (i % 1000) / 100;
    }

    /* renamed from: aU */
    public static boolean m5523aU(int i) {
        return m5522aT(i) == 3;
    }
}
