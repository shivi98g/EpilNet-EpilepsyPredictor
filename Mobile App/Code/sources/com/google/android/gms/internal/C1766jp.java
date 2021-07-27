package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.jp */
public final class C1766jp {

    /* renamed from: Nq */
    private final String f3941Nq;

    public C1766jp(String str) {
        this.f3941Nq = (String) C1785jx.m5364i(str);
    }

    /* renamed from: a */
    public void mo15870a(Context context, String str, String str2, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < stackTrace.length && i < 2) {
            sb.append(stackTrace[i].toString());
            sb.append("\n");
            i++;
        }
        C2046oo ooVar = new C2046oo(context, 10);
        ooVar.mo16494a("GMS_WTF", (byte[]) null, "GMS_WTF", sb.toString());
        ooVar.send();
        if (mo15872aF(7)) {
            Log.e(str, str2, th);
            Log.wtf(str, str2, th);
        }
    }

    /* renamed from: a */
    public void mo15871a(String str, String str2, Throwable th) {
        if (mo15872aF(4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: aF */
    public boolean mo15872aF(int i) {
        return Log.isLoggable(this.f3941Nq, i);
    }

    /* renamed from: b */
    public void mo15873b(String str, String str2, Throwable th) {
        if (mo15872aF(5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: c */
    public void mo15874c(String str, String str2, Throwable th) {
        if (mo15872aF(6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: m */
    public void mo15875m(String str, String str2) {
        if (mo15872aF(3)) {
            Log.d(str, str2);
        }
    }

    /* renamed from: n */
    public void mo15876n(String str, String str2) {
        if (mo15872aF(2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: o */
    public void mo15877o(String str, String str2) {
        if (mo15872aF(5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: p */
    public void mo15878p(String str, String str2) {
        if (mo15872aF(6)) {
            Log.e(str, str2);
        }
    }
}
