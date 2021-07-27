package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;

@C1507ey
/* renamed from: com.google.android.gms.internal.bl */
public class C1329bl {
    private final Context mContext;

    public C1329bl(Context context) {
        C1785jx.m5359b(context, (Object) "Context can not be null");
        this.mContext = context;
    }

    /* renamed from: bs */
    public static boolean m4020bs() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    public boolean mo14926a(Intent intent) {
        C1785jx.m5359b(intent, (Object) "Intent can not be null");
        return !this.mContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: bo */
    public boolean mo14927bo() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return mo14926a(intent);
    }

    /* renamed from: bp */
    public boolean mo14928bp() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return mo14926a(intent);
    }

    /* renamed from: bq */
    public boolean mo14929bq() {
        return m4020bs() && this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: br */
    public boolean mo14930br() {
        return false;
    }

    /* renamed from: bt */
    public boolean mo14931bt() {
        return Build.VERSION.SDK_INT >= 14 && mo14926a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
