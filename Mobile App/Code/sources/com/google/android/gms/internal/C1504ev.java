package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

@C1507ey
/* renamed from: com.google.android.gms.internal.ev */
public class C1504ev implements InAppPurchase {

    /* renamed from: sP */
    private final C1482em f3042sP;

    public C1504ev(C1482em emVar) {
        this.f3042sP = emVar;
    }

    public String getProductId() {
        try {
            return this.f3042sP.getProductId();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward getProductId to InAppPurchase", e);
            return null;
        }
    }

    public void recordPlayBillingResolution(int i) {
        try {
            this.f3042sP.recordPlayBillingResolution(i);
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward recordPlayBillingResolution to InAppPurchase", e);
        }
    }

    public void recordResolution(int i) {
        try {
            this.f3042sP.recordResolution(i);
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward recordResolution to InAppPurchase", e);
        }
    }
}
