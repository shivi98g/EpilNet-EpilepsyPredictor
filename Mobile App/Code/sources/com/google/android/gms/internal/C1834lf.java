package com.google.android.gms.internal;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.lf */
public final class C1834lf implements C1832ld {

    /* renamed from: Of */
    private static C1834lf f4004Of;

    /* renamed from: if */
    public static synchronized C1832ld m5525if() {
        C1834lf lfVar;
        synchronized (C1834lf.class) {
            if (f4004Of == null) {
                f4004Of = new C1834lf();
            }
            lfVar = f4004Of;
        }
        return lfVar;
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
