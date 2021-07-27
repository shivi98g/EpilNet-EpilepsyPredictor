package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;
import java.util.Map;

public class Promotion {
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_VIEW = "view";

    /* renamed from: CD */
    Map<String, String> f239CD = new HashMap();

    /* renamed from: aq */
    public Map<String, String> mo10439aq(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f239CD.entrySet()) {
            hashMap.put(str + ((String) next.getKey()), next.getValue());
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void put(String str, String str2) {
        C1785jx.m5359b(str, (Object) "Name should be non-null");
        this.f239CD.put(str, str2);
    }

    public Promotion setCreative(String str) {
        put("cr", str);
        return this;
    }

    public Promotion setId(String str) {
        put("id", str);
        return this;
    }

    public Promotion setName(String str) {
        put("nm", str);
        return this;
    }

    public Promotion setPosition(String str) {
        put("ps", str);
        return this;
    }
}
