package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.aa */
class C1260aa implements C1264ac {

    /* renamed from: mt */
    private C1610gu f2273mt;

    public C1260aa(C1610gu guVar) {
        this.f2273mt = guVar;
    }

    /* renamed from: a */
    public void mo14684a(C1267af afVar, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        this.f2273mt.mo15418a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }
}
