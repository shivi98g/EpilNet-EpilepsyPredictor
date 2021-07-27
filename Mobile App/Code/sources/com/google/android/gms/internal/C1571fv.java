package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.support.p000v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

@C1507ey
/* renamed from: com.google.android.gms.internal.fv */
public final class C1571fv {

    /* renamed from: vA */
    public final boolean f3418vA;

    /* renamed from: vB */
    public final boolean f3419vB;

    /* renamed from: vC */
    public final int f3420vC;

    /* renamed from: vg */
    public final int f3421vg;

    /* renamed from: vh */
    public final boolean f3422vh;

    /* renamed from: vi */
    public final boolean f3423vi;

    /* renamed from: vj */
    public final String f3424vj;

    /* renamed from: vk */
    public final String f3425vk;

    /* renamed from: vl */
    public final boolean f3426vl;

    /* renamed from: vm */
    public final boolean f3427vm;

    /* renamed from: vn */
    public final boolean f3428vn;

    /* renamed from: vo */
    public final String f3429vo;

    /* renamed from: vp */
    public final String f3430vp;

    /* renamed from: vq */
    public final int f3431vq;

    /* renamed from: vr */
    public final int f3432vr;

    /* renamed from: vs */
    public final int f3433vs;

    /* renamed from: vt */
    public final int f3434vt;

    /* renamed from: vu */
    public final int f3435vu;

    /* renamed from: vv */
    public final int f3436vv;

    /* renamed from: vw */
    public final float f3437vw;

    /* renamed from: vx */
    public final int f3438vx;

    /* renamed from: vy */
    public final int f3439vy;

    /* renamed from: vz */
    public final double f3440vz;

    public C1571fv(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Locale locale = Locale.getDefault();
        PackageManager packageManager = context.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f3421vg = audioManager.getMode();
        boolean z = true;
        this.f3422vh = m4568a(packageManager, "geo:0,0?q=donuts") != null;
        this.f3423vi = m4568a(packageManager, "http://www.google.com") != null;
        this.f3424vj = telephonyManager.getNetworkOperator();
        this.f3425vk = locale.getCountry();
        this.f3426vl = C1606gq.m4702dA();
        this.f3427vm = audioManager.isMusicActive();
        this.f3428vn = audioManager.isSpeakerphoneOn();
        this.f3429vo = locale.getLanguage();
        this.f3430vp = m4569a(packageManager);
        this.f3431vq = audioManager.getStreamVolume(3);
        this.f3432vr = m4567a(context, connectivityManager, packageManager);
        this.f3433vs = telephonyManager.getNetworkType();
        this.f3434vt = telephonyManager.getPhoneType();
        this.f3435vu = audioManager.getRingerMode();
        this.f3436vv = audioManager.getStreamVolume(2);
        this.f3437vw = displayMetrics.density;
        this.f3438vx = displayMetrics.widthPixels;
        this.f3439vy = displayMetrics.heightPixels;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.f3440vz = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (!(intExtra == 2 || intExtra == 5)) {
                z = false;
            }
            this.f3418vA = z;
        } else {
            this.f3440vz = -1.0d;
            this.f3418vA = false;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3419vB = connectivityManager.isActiveNetworkMetered();
            if (connectivityManager.getActiveNetworkInfo() != null) {
                this.f3420vC = connectivityManager.getActiveNetworkInfo().getDetailedState().ordinal();
                return;
            }
        } else {
            this.f3419vB = false;
        }
        this.f3420vC = -1;
    }

    /* renamed from: a */
    private static int m4567a(Context context, ConnectivityManager connectivityManager, PackageManager packageManager) {
        if (!C1591gi.m4655a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            return -2;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    /* renamed from: a */
    private static ResolveInfo m4568a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* renamed from: a */
    private static String m4569a(PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a = m4568a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null || (activityInfo = a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionCode + "." + activityInfo.packageName;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }
}
