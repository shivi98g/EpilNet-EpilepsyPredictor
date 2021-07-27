package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.internal.C1485en;

@C1507ey
/* renamed from: com.google.android.gms.internal.es */
public final class C1500es extends C1485en.C1486a {

    /* renamed from: oM */
    private final InAppPurchaseListener f3039oM;

    public C1500es(InAppPurchaseListener inAppPurchaseListener) {
        this.f3039oM = inAppPurchaseListener;
    }

    /* renamed from: a */
    public void mo15234a(C1482em emVar) {
        this.f3039oM.onInAppPurchaseRequested(new C1504ev(emVar));
    }
}
