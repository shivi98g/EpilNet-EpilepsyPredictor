package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.C1488eo;
import com.google.android.gms.internal.C1501et;
import com.google.android.gms.internal.C1607gr;

public final class InAppPurchaseActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
    public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";

    /* renamed from: xz */
    private C1488eo f104xz;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (this.f104xz != null) {
                this.f104xz.onActivityResult(i, i2, intent);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onActivityResult to in-app purchase manager:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f104xz = C1501et.m4401e(this);
        if (this.f104xz == null) {
            C1607gr.m4709W("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try {
            this.f104xz.onCreate();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onCreate to in-app purchase manager:", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f104xz != null) {
                this.f104xz.onDestroy();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward onDestroy to in-app purchase manager:", e);
        }
        super.onDestroy();
    }
}
