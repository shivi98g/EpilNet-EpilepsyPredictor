package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

@C1507ey
/* renamed from: com.google.android.gms.internal.eu */
public class C1503eu implements InAppPurchaseResult {

    /* renamed from: te */
    private final C1494eq f3041te;

    public C1503eu(C1494eq eqVar) {
        this.f3041te = eqVar;
    }

    public void finishPurchase() {
        try {
            this.f3041te.finishPurchase();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward finishPurchase to InAppPurchaseResult", e);
        }
    }

    public String getProductId() {
        try {
            return this.f3041te.getProductId();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward getProductId to InAppPurchaseResult", e);
            return null;
        }
    }

    public Intent getPurchaseData() {
        try {
            return this.f3041te.getPurchaseData();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return null;
        }
    }

    public int getResultCode() {
        try {
            return this.f3041te.getResultCode();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return 0;
        }
    }

    public boolean isVerified() {
        try {
            return this.f3041te.isVerified();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not forward isVerified to InAppPurchaseResult", e);
            return false;
        }
    }
}
