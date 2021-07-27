package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.p000v4.app.Fragment;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.jh */
public class C1746jh implements DialogInterface.OnClickListener {

    /* renamed from: Mx */
    private final Fragment f3886Mx;

    /* renamed from: My */
    private final int f3887My;
    private final Intent mIntent;

    /* renamed from: nB */
    private final Activity f3888nB;

    public C1746jh(Activity activity, Intent intent, int i) {
        this.f3888nB = activity;
        this.f3886Mx = null;
        this.mIntent = intent;
        this.f3887My = i;
    }

    public C1746jh(Fragment fragment, Intent intent, int i) {
        this.f3888nB = null;
        this.f3886Mx = fragment;
        this.mIntent = intent;
        this.f3887My = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.mIntent != null && this.f3886Mx != null) {
                this.f3886Mx.startActivityForResult(this.mIntent, this.f3887My);
            } else if (this.mIntent != null) {
                this.f3888nB.startActivityForResult(this.mIntent, this.f3887My);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
