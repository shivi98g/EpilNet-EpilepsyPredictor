package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.analytics.u */
class C0587u extends BroadcastReceiver {

    /* renamed from: yR */
    static final String f283yR = C0587u.class.getName();

    /* renamed from: yS */
    private final C0556aj f284yS;

    C0587u(C0556aj ajVar) {
        this.f284yS = ajVar;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f284yS.mo10374C(!intent.getBooleanExtra("noConnectivity", false));
        } else if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(f283yR)) {
            this.f284yS.mo10376ey();
        }
    }

    /* renamed from: z */
    public void mo10477z(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
        intentFilter2.addCategory(context.getPackageName());
        context.registerReceiver(this, intentFilter2);
    }
}
