package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.C0585s;
import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;
import java.util.Map;

public class Product {

    /* renamed from: CD */
    Map<String, String> f237CD = new HashMap();

    /* renamed from: aq */
    public Map<String, String> mo10414aq(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f237CD.entrySet()) {
            hashMap.put(str + ((String) next.getKey()), next.getValue());
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void put(String str, String str2) {
        C1785jx.m5359b(str, (Object) "Name should be non-null");
        this.f237CD.put(str, str2);
    }

    public Product setBrand(String str) {
        put("br", str);
        return this;
    }

    public Product setCategory(String str) {
        put("ca", str);
        return this;
    }

    public Product setCouponCode(String str) {
        put("cc", str);
        return this;
    }

    public Product setCustomDimension(int i, String str) {
        put(C0585s.m257E(i), str);
        return this;
    }

    public Product setCustomMetric(int i, int i2) {
        put(C0585s.m258F(i), Integer.toString(i2));
        return this;
    }

    public Product setId(String str) {
        put("id", str);
        return this;
    }

    public Product setName(String str) {
        put("nm", str);
        return this;
    }

    public Product setPosition(int i) {
        put("ps", Integer.toString(i));
        return this;
    }

    public Product setPrice(double d) {
        put("pr", Double.toString(d));
        return this;
    }

    public Product setQuantity(int i) {
        put("qt", Integer.toString(i));
        return this;
    }

    public Product setVariant(String str) {
        put("va", str);
        return this;
    }
}
