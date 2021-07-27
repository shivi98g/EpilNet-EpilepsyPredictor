package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C1507ey
/* renamed from: com.google.android.gms.internal.ec */
public class C1470ec extends C1584gf implements ServiceConnection {
    /* access modifiers changed from: private */
    public Context mContext;

    /* renamed from: mH */
    private final Object f2996mH = new Object();

    /* renamed from: sD */
    private boolean f2997sD = false;
    /* access modifiers changed from: private */

    /* renamed from: sE */
    public C1497er f2998sE;

    /* renamed from: sF */
    private C1469eb f2999sF;

    /* renamed from: sG */
    private C1476eh f3000sG;

    /* renamed from: sH */
    private List<C1474ef> f3001sH = null;
    /* access modifiers changed from: private */

    /* renamed from: sI */
    public C1480ek f3002sI;

    public C1470ec(Context context, C1497er erVar, C1480ek ekVar) {
        this.mContext = context;
        this.f2998sE = erVar;
        this.f3002sI = ekVar;
        this.f2999sF = new C1469eb(context);
        this.f3000sG = C1476eh.m4369j(this.mContext);
        this.f3001sH = this.f3000sG.mo15223d(10);
    }

    /* renamed from: a */
    private void m4356a(final C1474ef efVar, String str, String str2) {
        final Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        C1606gq.f3553wR.post(new Runnable() {
            public void run() {
                C1497er c;
                C1475eg egVar;
                try {
                    if (C1470ec.this.f3002sI.mo15229a(efVar.f3019sU, -1, intent)) {
                        c = C1470ec.this.f2998sE;
                        egVar = new C1475eg(C1470ec.this.mContext, efVar.f3020sV, true, -1, intent, efVar);
                    } else {
                        c = C1470ec.this.f2998sE;
                        egVar = new C1475eg(C1470ec.this.mContext, efVar.f3020sV, false, -1, intent, efVar);
                    }
                    c.mo15247a(egVar);
                } catch (RemoteException e) {
                    C1607gr.m4709W("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    /* renamed from: b */
    private void m4358b(long j) {
        do {
            if (!m4360c(j)) {
                C1607gr.m4709W("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.f2997sD);
    }

    /* renamed from: c */
    private boolean m4360c(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f2996mH.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            C1607gr.m4709W("waitWithTimeout_lock interrupted");
            return true;
        }
    }

    /* renamed from: cy */
    private void m4361cy() {
        if (!this.f3001sH.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (C1474ef next : this.f3001sH) {
                hashMap.put(next.f3020sV, next);
            }
            String str = null;
            do {
                Bundle d = this.f2999sF.mo15194d(this.mContext.getPackageName(), str);
                if (d == null || C1478ei.m4377b(d) != 0) {
                    break;
                }
                ArrayList<String> stringArrayList = d.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = d.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = d.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                str = d.getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < stringArrayList.size(); i++) {
                    if (hashMap.containsKey(stringArrayList.get(i))) {
                        String str2 = stringArrayList.get(i);
                        String str3 = stringArrayList2.get(i);
                        String str4 = stringArrayList3.get(i);
                        C1474ef efVar = (C1474ef) hashMap.get(str2);
                        if (efVar.f3019sU.equals(C1478ei.m4375D(str3))) {
                            m4356a(efVar, str3, str4);
                            hashMap.remove(str2);
                        }
                    }
                }
                if (str == null) {
                    break;
                }
            } while (hashMap.isEmpty());
            for (String str5 : hashMap.keySet()) {
                this.f3000sG.mo15220a((C1474ef) hashMap.get(str5));
            }
        }
    }

    /* renamed from: cx */
    public void mo15197cx() {
        synchronized (this.f2996mH) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE);
            this.mContext.bindService(intent, this, 1);
            m4358b(SystemClock.elapsedRealtime());
            this.mContext.unbindService(this);
            this.f2999sF.destroy();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2996mH) {
            this.f2999sF.mo15196t(iBinder);
            m4361cy();
            this.f2997sD = true;
            this.f2996mH.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C1607gr.m4707U("In-app billing service disconnected.");
        this.f2999sF.destroy();
    }

    public void onStop() {
        synchronized (this.f2996mH) {
            this.mContext.unbindService(this);
            this.f2999sF.destroy();
        }
    }
}
