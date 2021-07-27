package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.C1497er;

@C1507ey
/* renamed from: com.google.android.gms.internal.ew */
public final class C1505ew extends C1497er.C1498a {

    /* renamed from: oN */
    private final PlayStorePurchaseListener f3043oN;

    public C1505ew(PlayStorePurchaseListener playStorePurchaseListener) {
        this.f3043oN = playStorePurchaseListener;
    }

    /* renamed from: a */
    public void mo15247a(C1494eq eqVar) {
        this.f3043oN.onInAppPurchaseFinished(new C1503eu(eqVar));
    }

    public boolean isValidPurchase(String str) {
        return this.f3043oN.isValidPurchase(str);
    }
}
