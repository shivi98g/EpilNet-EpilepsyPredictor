package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

@C1507ey
/* renamed from: com.google.android.gms.internal.gg */
public final class C1586gg {
    /* renamed from: a */
    public static void m4633a(Context context, boolean z) {
        SharedPreferences.Editor edit = m4634n(context).edit();
        edit.putBoolean("use_https", z);
        edit.commit();
    }

    /* renamed from: n */
    private static SharedPreferences m4634n(Context context) {
        return context.getSharedPreferences("admob", 0);
    }

    /* renamed from: o */
    public static boolean m4635o(Context context) {
        return m4634n(context).getBoolean("use_https", true);
    }
}
