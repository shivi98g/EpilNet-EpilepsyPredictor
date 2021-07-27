package com.google.android.gms.analytics;

import android.util.Log;

/* renamed from: com.google.android.gms.analytics.p */
class C0582p implements Logger {

    /* renamed from: yM */
    private int f282yM = 2;

    C0582p() {
    }

    /* renamed from: af */
    private String m249af(String str) {
        return Thread.currentThread().toString() + ": " + str;
    }

    public void error(Exception exc) {
        if (this.f282yM <= 3) {
            Log.e("GAV4", (String) null, exc);
        }
    }

    public void error(String str) {
        if (this.f282yM <= 3) {
            Log.e("GAV4", m249af(str));
        }
    }

    public int getLogLevel() {
        return this.f282yM;
    }

    public void info(String str) {
        if (this.f282yM <= 1) {
            Log.i("GAV4", m249af(str));
        }
    }

    public void setLogLevel(int i) {
        this.f282yM = i;
    }

    public void verbose(String str) {
        if (this.f282yM <= 0) {
            Log.v("GAV4", m249af(str));
        }
    }

    public void warn(String str) {
        if (this.f282yM <= 2) {
            Log.w("GAV4", m249af(str));
        }
    }
}
