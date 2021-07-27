package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1488eo;

@C1507ey
/* renamed from: com.google.android.gms.internal.ee */
public class C1473ee extends C1488eo.C1489a implements ServiceConnection {

    /* renamed from: nB */
    private final Activity f3009nB;

    /* renamed from: sF */
    private C1469eb f3010sF;

    /* renamed from: sG */
    private final C1476eh f3011sG;

    /* renamed from: sI */
    private C1480ek f3012sI;

    /* renamed from: sO */
    private Context f3013sO;

    /* renamed from: sP */
    private C1482em f3014sP;

    /* renamed from: sQ */
    private C1474ef f3015sQ;

    /* renamed from: sR */
    private C1479ej f3016sR;

    /* renamed from: sS */
    private String f3017sS = null;

    public C1473ee(Activity activity) {
        this.f3009nB = activity;
        this.f3011sG = C1476eh.m4369j(this.f3009nB.getApplicationContext());
    }

    /* renamed from: a */
    public static void m4366a(Context context, boolean z, C1468ea eaVar) {
        Intent intent = new Intent();
        intent.setClassName(context, InAppPurchaseActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        C1468ea.m4345a(intent, eaVar);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private void m4367a(String str, boolean z, int i, Intent intent) {
        if (this.f3016sR != null) {
            this.f3016sR.mo15228a(str, z, i, intent, this.f3015sQ);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                int d = C1478ei.m4378d(intent);
                if (i2 != -1 || d != 0) {
                    this.f3011sG.mo15220a(this.f3015sQ);
                } else if (this.f3012sI.mo15229a(this.f3017sS, i2, intent)) {
                    z = true;
                }
                this.f3014sP.recordPlayBillingResolution(d);
                this.f3009nB.finish();
                m4367a(this.f3014sP.getProductId(), z, i2, intent);
            } catch (RemoteException e) {
                C1607gr.m4709W("Fail to process purchase result.");
                this.f3009nB.finish();
            } catch (Throwable th) {
                this.f3017sS = null;
                throw th;
            }
            this.f3017sS = null;
        }
    }

    public void onCreate() {
        Activity activity;
        int i;
        C1468ea c = C1468ea.m4346c(this.f3009nB.getIntent());
        this.f3016sR = c.f2993sB;
        this.f3012sI = c.f2991md;
        this.f3014sP = c.f2994sz;
        this.f3010sF = new C1469eb(this.f3009nB.getApplicationContext());
        this.f3013sO = c.f2992sA;
        if (this.f3009nB.getResources().getConfiguration().orientation == 2) {
            activity = this.f3009nB;
            i = 6;
        } else {
            activity = this.f3009nB;
            i = 7;
        }
        activity.setRequestedOrientation(i);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE);
        this.f3009nB.bindService(intent, this, 1);
    }

    public void onDestroy() {
        this.f3009nB.unbindService(this);
        this.f3010sF.destroy();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3010sF.mo15196t(iBinder);
        try {
            this.f3017sS = this.f3012sI.mo15230cC();
            Bundle a = this.f3010sF.mo15192a(this.f3009nB.getPackageName(), this.f3014sP.getProductId(), this.f3017sS);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int b = C1478ei.m4377b(a);
                this.f3014sP.recordPlayBillingResolution(b);
                m4367a(this.f3014sP.getProductId(), false, b, (Intent) null);
                this.f3009nB.finish();
                return;
            }
            this.f3015sQ = new C1474ef(this.f3014sP.getProductId(), this.f3017sS);
            this.f3011sG.mo15221b(this.f3015sQ);
            Activity activity = this.f3009nB;
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intent intent = new Intent();
            Integer num = 0;
            int intValue = num.intValue();
            Integer num2 = 0;
            int intValue2 = num2.intValue();
            Integer num3 = 0;
            activity.startIntentSenderForResult(intentSender, 1001, intent, intValue, intValue2, num3.intValue());
        } catch (IntentSender.SendIntentException | RemoteException e) {
            C1607gr.m4713d("Error when connecting in-app billing service", e);
            this.f3009nB.finish();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C1607gr.m4707U("In-app billing service disconnected.");
        this.f3010sF.destroy();
    }
}
