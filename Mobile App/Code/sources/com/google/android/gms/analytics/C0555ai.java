package com.google.android.gms.analytics;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: com.google.android.gms.analytics.ai */
class C0555ai implements C0583q {

    /* renamed from: Cc */
    private static C0555ai f221Cc;

    /* renamed from: xO */
    private static Object f222xO = new Object();
    private final Context mContext;

    protected C0555ai(Context context) {
        this.mContext = context;
    }

    /* renamed from: fl */
    public static C0555ai m132fl() {
        C0555ai aiVar;
        synchronized (f222xO) {
            aiVar = f221Cc;
        }
        return aiVar;
    }

    /* renamed from: y */
    public static void m133y(Context context) {
        synchronized (f222xO) {
            if (f221Cc == null) {
                f221Cc = new C0555ai(context);
            }
        }
    }

    /* renamed from: ac */
    public boolean mo10372ac(String str) {
        return "&sr".equals(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: fm */
    public String mo10373fm() {
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }

    public String getValue(String str) {
        if (str != null && str.equals("&sr")) {
            return mo10373fm();
        }
        return null;
    }
}
