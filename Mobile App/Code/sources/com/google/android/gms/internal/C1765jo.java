package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* renamed from: com.google.android.gms.internal.jo */
public class C1765jo {

    /* renamed from: No */
    private static final Uri f3939No = Uri.parse("http://plus.google.com/");

    /* renamed from: Np */
    private static final Uri f3940Np = f3939No.buildUpon().appendPath("circles").appendPath("find").build();

    /* renamed from: aY */
    public static Intent m5240aY(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: aZ */
    private static Uri m5241aZ(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }

    /* renamed from: ba */
    public static Intent m5242ba(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m5241aZ(str));
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE);
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: hE */
    public static Intent m5243hE() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
}
