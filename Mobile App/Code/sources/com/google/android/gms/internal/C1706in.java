package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.in */
public final class C1706in {
    /* renamed from: a */
    public static <T> boolean m5031a(T t, T t2) {
        if (t == null && t2 == null) {
            return true;
        }
        return (t == null || t2 == null || !t.equals(t2)) ? false : true;
    }

    /* renamed from: aF */
    public static void m5032aF(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        } else if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else if (str.length() == "urn:x-cast:".length()) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* renamed from: aG */
    public static String m5033aG(String str) {
        return "urn:x-cast:" + str;
    }

    /* renamed from: b */
    public static long m5034b(double d) {
        return (long) (d * 1000.0d);
    }

    /* renamed from: b */
    public static String m5035b(Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    /* renamed from: o */
    public static double m5036o(long j) {
        return ((double) j) / 1000.0d;
    }
}
