package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

@C1507ey
/* renamed from: com.google.android.gms.internal.eb */
public class C1469eb {
    private final Context mContext;

    /* renamed from: sC */
    private Object f2995sC;

    public C1469eb(Context context) {
        this.mContext = context;
    }

    /* renamed from: a */
    public Bundle mo15192a(String str, String str2, String str3) {
        try {
            Class<?> loadClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getBuyIntent", new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}).invoke(loadClass.cast(this.f2995sC), new Object[]{3, str, str2, "inapp", str3});
        } catch (Exception e) {
            C1607gr.m4713d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return null;
        }
    }

    /* renamed from: c */
    public int mo15193c(String str, String str2) {
        try {
            Class<?> loadClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return ((Integer) loadClass.getDeclaredMethod("consumePurchase", new Class[]{Integer.TYPE, String.class, String.class}).invoke(loadClass.cast(this.f2995sC), new Object[]{3, str, str2})).intValue();
        } catch (Exception e) {
            C1607gr.m4713d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return 5;
        }
    }

    /* renamed from: d */
    public Bundle mo15194d(String str, String str2) {
        try {
            Class<?> loadClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getPurchases", new Class[]{Integer.TYPE, String.class, String.class, String.class}).invoke(loadClass.cast(this.f2995sC), new Object[]{3, str, "inapp", str2});
        } catch (Exception e) {
            C1607gr.m4713d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return null;
        }
    }

    public void destroy() {
        this.f2995sC = null;
    }

    /* renamed from: t */
    public void mo15196t(IBinder iBinder) {
        try {
            this.f2995sC = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{iBinder});
        } catch (Exception e) {
            C1607gr.m4709W("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
        }
    }
}
