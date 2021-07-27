package com.google.android.gms.internal;

import android.util.Log;
import com.google.ads.AdRequest;

@C1507ey
/* renamed from: com.google.android.gms.internal.gr */
public final class C1607gr {
    /* renamed from: S */
    public static void m4705S(String str) {
        if (m4714v(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: T */
    public static void m4706T(String str) {
        if (m4714v(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: U */
    public static void m4707U(String str) {
        if (m4714v(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: V */
    public static void m4708V(String str) {
        if (m4714v(2)) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: W */
    public static void m4709W(String str) {
        if (m4714v(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: a */
    public static void m4710a(String str, Throwable th) {
        if (m4714v(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: b */
    public static void m4711b(String str, Throwable th) {
        if (m4714v(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: c */
    public static void m4712c(String str, Throwable th) {
        if (m4714v(4)) {
            Log.i(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: d */
    public static void m4713d(String str, Throwable th) {
        if (m4714v(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: v */
    public static boolean m4714v(int i) {
        return (i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i)) && i != 2;
    }
}
