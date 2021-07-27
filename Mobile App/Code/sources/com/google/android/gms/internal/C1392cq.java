package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.cq */
public final class C1392cq {

    /* renamed from: qn */
    public final String f2813qn;

    /* renamed from: qo */
    public final String f2814qo;

    /* renamed from: qp */
    public final List<String> f2815qp;

    /* renamed from: qq */
    public final String f2816qq;

    /* renamed from: qr */
    public final String f2817qr;

    /* renamed from: qs */
    public final List<String> f2818qs;

    /* renamed from: qt */
    public final String f2819qt;

    public C1392cq(JSONObject jSONObject) throws JSONException {
        this.f2814qo = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f2815qp = Collections.unmodifiableList(arrayList);
        String str = null;
        this.f2816qq = jSONObject.optString("allocation_id", (String) null);
        this.f2818qs = C1400cw.m4207a(jSONObject, "imp_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.f2813qn = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f2819qt = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f2817qr = optJSONObject2 != null ? optJSONObject2.optString("class_name") : str;
    }
}
