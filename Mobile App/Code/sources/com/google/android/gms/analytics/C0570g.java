package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.gms.analytics.g */
class C0570g implements C0583q {

    /* renamed from: xO */
    private static Object f240xO = new Object();

    /* renamed from: ye */
    private static C0570g f241ye;

    /* renamed from: ya */
    protected String f242ya;

    /* renamed from: yb */
    protected String f243yb;

    /* renamed from: yc */
    protected String f244yc;

    /* renamed from: yd */
    protected String f245yd;

    protected C0570g() {
    }

    private C0570g(Context context) {
        String str;
        PackageManager packageManager = context.getPackageManager();
        this.f244yc = context.getPackageName();
        this.f245yd = packageManager.getInstallerPackageName(this.f244yc);
        String str2 = this.f244yc;
        String str3 = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                str = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                try {
                    str3 = packageInfo.versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    C0550ae.m103T("Error retrieving package info: appName set to " + str);
                    this.f242ya = str;
                    this.f243yb = str3;
                }
            } else {
                str = str2;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            str = str2;
            C0550ae.m103T("Error retrieving package info: appName set to " + str);
            this.f242ya = str;
            this.f243yb = str3;
        }
        this.f242ya = str;
        this.f243yb = str3;
    }

    /* renamed from: dZ */
    public static C0570g m195dZ() {
        return f241ye;
    }

    /* renamed from: y */
    public static void m196y(Context context) {
        synchronized (f240xO) {
            if (f241ye == null) {
                f241ye = new C0570g(context);
            }
        }
    }

    /* renamed from: ac */
    public boolean mo10452ac(String str) {
        return "&an".equals(str) || "&av".equals(str) || "&aid".equals(str) || "&aiid".equals(str);
    }

    public String getValue(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("&an")) {
            return this.f242ya;
        }
        if (str.equals("&av")) {
            return this.f243yb;
        }
        if (str.equals("&aid")) {
            return this.f244yc;
        }
        if (str.equals("&aiid")) {
            return this.f245yd;
        }
        return null;
    }
}
