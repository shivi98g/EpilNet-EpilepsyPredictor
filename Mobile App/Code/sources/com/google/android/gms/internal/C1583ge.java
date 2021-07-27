package com.google.android.gms.internal;

import android.content.Context;
import android.support.p000v4.app.NotificationCompat;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

@C1507ey
/* renamed from: com.google.android.gms.internal.ge */
public final class C1583ge {

    /* renamed from: ut */
    private static final Object f3517ut = new Object();

    /* renamed from: wt */
    private static String f3518wt;

    /* renamed from: a */
    public static String m4628a(Context context, String str, String str2) {
        String str3;
        synchronized (f3517ut) {
            if (f3518wt == null && !TextUtils.isEmpty(str)) {
                m4629b(context, str, str2);
            }
            str3 = f3518wt;
        }
        return str3;
    }

    /* renamed from: b */
    private static void m4629b(Context context, String str, String str2) {
        String str3;
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (C1591gi.m4656a(classLoader, cls, split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            str3 = String.format(Locale.US, "%X", new Object[]{bigInteger2});
        } catch (Throwable th) {
            str3 = NotificationCompat.CATEGORY_ERROR;
        }
        f3518wt = str3;
    }

    /* renamed from: dr */
    public static String m4630dr() {
        String str;
        synchronized (f3517ut) {
            str = f3518wt;
        }
        return str;
    }
}
