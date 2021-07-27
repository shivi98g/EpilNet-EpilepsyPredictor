package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1494eq;

@C1507ey
/* renamed from: com.google.android.gms.internal.eg */
public final class C1475eg extends C1494eq.C1495a implements ServiceConnection {
    private Context mContext;

    /* renamed from: sF */
    private C1469eb f3021sF;

    /* renamed from: sM */
    private String f3022sM;

    /* renamed from: sQ */
    private C1474ef f3023sQ;

    /* renamed from: sW */
    private boolean f3024sW = false;

    /* renamed from: sX */
    private int f3025sX;

    /* renamed from: sY */
    private Intent f3026sY;

    public C1475eg(Context context, String str, boolean z, int i, Intent intent, C1474ef efVar) {
        this.f3022sM = str;
        this.f3025sX = i;
        this.f3026sY = intent;
        this.f3024sW = z;
        this.mContext = context;
        this.f3023sQ = efVar;
    }

    public void finishPurchase() {
        int d = C1478ei.m4378d(this.f3026sY);
        if (this.f3025sX == -1 && d == 0) {
            this.f3021sF = new C1469eb(this.mContext);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE);
            this.mContext.bindService(intent, this, 1);
        }
    }

    public String getProductId() {
        return this.f3022sM;
    }

    public Intent getPurchaseData() {
        return this.f3026sY;
    }

    public int getResultCode() {
        return this.f3025sX;
    }

    public boolean isVerified() {
        return this.f3024sW;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1607gr.m4707U("In-app billing service connected.");
        this.f3021sF.mo15196t(iBinder);
        String E = C1478ei.m4376E(C1478ei.m4379e(this.f3026sY));
        if (E != null) {
            if (this.f3021sF.mo15193c(this.mContext.getPackageName(), E) == 0) {
                C1476eh.m4369j(this.mContext).mo15220a(this.f3023sQ);
            }
            this.mContext.unbindService(this);
            this.f3021sF.destroy();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C1607gr.m4707U("In-app billing service disconnected.");
        this.f3021sF.destroy();
    }
}
