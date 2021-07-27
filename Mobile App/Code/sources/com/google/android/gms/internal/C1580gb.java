package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

@C1507ey
/* renamed from: com.google.android.gms.internal.gb */
public class C1580gb {

    /* renamed from: mH */
    private final Object f3505mH = new Object();

    /* renamed from: vZ */
    private final String f3506vZ;

    /* renamed from: wm */
    private int f3507wm = 0;

    /* renamed from: wn */
    private long f3508wn = -1;

    /* renamed from: wo */
    private long f3509wo = -1;

    /* renamed from: wp */
    private int f3510wp = 0;

    /* renamed from: wq */
    private int f3511wq = -1;

    public C1580gb(String str) {
        this.f3506vZ = str;
    }

    /* renamed from: m */
    public static boolean m4620m(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier != 0) {
            try {
                if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                    return true;
                }
                C1607gr.m4707U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                return false;
            } catch (PackageManager.NameNotFoundException e) {
                C1607gr.m4709W("Fail to fetch AdActivity theme");
            }
        }
        C1607gr.m4707U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        return false;
    }

    /* renamed from: b */
    public Bundle mo15372b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f3505mH) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f3506vZ);
            bundle.putLong("basets", this.f3509wo);
            bundle.putLong("currts", this.f3508wn);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f3511wq);
            bundle.putInt("pclick", this.f3507wm);
            bundle.putInt("pimp", this.f3510wp);
            bundle.putBoolean("support_transparent_background", m4620m(context));
        }
        return bundle;
    }

    /* renamed from: b */
    public void mo15373b(C1303av avVar, long j) {
        synchronized (this.f3505mH) {
            if (this.f3509wo == -1) {
                this.f3509wo = j;
                j = this.f3509wo;
            }
            this.f3508wn = j;
            if (avVar.extras == null || avVar.extras.getInt("gw", 2) != 1) {
                this.f3511wq++;
            }
        }
    }

    /* renamed from: cW */
    public void mo15374cW() {
        synchronized (this.f3505mH) {
            this.f3510wp++;
        }
    }

    /* renamed from: cX */
    public void mo15375cX() {
        synchronized (this.f3505mH) {
            this.f3507wm++;
        }
    }

    /* renamed from: dq */
    public long mo15376dq() {
        return this.f3509wo;
    }
}
