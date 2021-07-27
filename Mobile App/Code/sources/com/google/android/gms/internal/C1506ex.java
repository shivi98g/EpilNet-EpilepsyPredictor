package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@C1507ey
/* renamed from: com.google.android.gms.internal.ex */
public class C1506ex implements Thread.UncaughtExceptionHandler {
    private Context mContext;

    /* renamed from: tf */
    private Thread.UncaughtExceptionHandler f3044tf;

    /* renamed from: tg */
    private Thread.UncaughtExceptionHandler f3045tg;

    /* renamed from: th */
    private C1608gs f3046th;

    public C1506ex(Context context, C1608gs gsVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f3044tf = uncaughtExceptionHandler;
        this.f3045tg = uncaughtExceptionHandler2;
        this.mContext = context;
        this.f3046th = gsVar;
    }

    /* renamed from: a */
    public static C1506ex m4406a(Context context, Thread thread, C1608gs gsVar) {
        if (context == null || thread == null || gsVar == null) {
            return null;
        }
        C1579ga.m4591bN();
        if (!m4409k(context)) {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        C1506ex exVar = new C1506ex(context, gsVar, uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtExceptionHandler != null && (uncaughtExceptionHandler instanceof C1506ex)) {
            return (C1506ex) uncaughtExceptionHandler;
        }
        try {
            thread.setUncaughtExceptionHandler(exVar);
            return exVar;
        } catch (SecurityException e) {
            C1607gr.m4712c("Fail to set UncaughtExceptionHandler.", e);
            return null;
        }
    }

    /* renamed from: cD */
    private String m4407cD() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    /* renamed from: d */
    private Throwable m4408d(Throwable th) {
        Bundle bN = C1579ga.m4591bN();
        if (bN != null && bN.getBoolean("gads:sdk_crash_report_full_stacktrace", false)) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (mo15253G(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    if (!mo15254H(stackTraceElement.getClassName())) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: k */
    private static boolean m4409k(Context context) {
        Bundle bN = C1579ga.m4591bN();
        return bN != null && bN.getBoolean("gads:sdk_crash_report_enabled", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo15253G(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("com.google.android.gms.ads") || str.startsWith("com.google.ads")) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C1507ey.class);
        } catch (Exception e) {
            C1607gr.m4710a("Fail to check class type for class " + str, e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo15254H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("android.") || str.startsWith("java.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15255a(Throwable th) {
        if (th == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        while (th != null) {
            boolean z3 = z2;
            boolean z4 = z;
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (mo15253G(stackTraceElement.getClassName())) {
                    z4 = true;
                }
                if (getClass().getName().equals(stackTraceElement.getClassName())) {
                    z3 = true;
                }
            }
            th = th.getCause();
            z = z4;
            z2 = z3;
        }
        return z && !z2;
    }

    /* renamed from: b */
    public void mo15256b(Throwable th) {
        Throwable d;
        if (m4409k(this.mContext) && (d = m4408d(th)) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo15257c(d));
            C1591gi.m4648a(this.mContext, this.f3046th.f3554wS, (List<String>) arrayList, C1579ga.m4598dn());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo15257c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", m4407cD()).appendQueryParameter("js", this.f3046th.f3554wS).appendQueryParameter("appid", this.mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringWriter.toString()).toString();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (mo15255a(th)) {
            mo15256b(th);
            if (Looper.getMainLooper().getThread() != thread) {
                return;
            }
        }
        if (this.f3044tf != null) {
            uncaughtExceptionHandler = this.f3044tf;
        } else if (this.f3045tg != null) {
            uncaughtExceptionHandler = this.f3045tg;
        } else {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
