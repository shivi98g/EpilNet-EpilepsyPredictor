package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.bv */
public class C1343bv {

    /* renamed from: pM */
    private C2182u f2723pM;

    /* renamed from: pN */
    private C1276ah f2724pN;

    /* renamed from: pO */
    private JSONObject f2725pO;

    /* renamed from: com.google.android.gms.internal.bv$a */
    public interface C1344a {
        /* renamed from: a */
        void mo14948a(C1343bv bvVar);
    }

    public C1343bv(C2182u uVar, C1276ah ahVar, JSONObject jSONObject) {
        this.f2723pM = uVar;
        this.f2724pN = ahVar;
        this.f2725pO = jSONObject;
    }

    /* renamed from: aw */
    public void mo14967aw() {
        this.f2723pM.mo14844an();
    }

    /* renamed from: b */
    public void mo14968b(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset", i);
            jSONObject.put("template", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad", this.f2725pO);
            jSONObject2.put("click", jSONObject);
            this.f2724pN.mo14742a("google.afma.nativeAds.handleClick", jSONObject2);
        } catch (JSONException e) {
            C1607gr.m4711b("Unable to create click JSON.", e);
        }
    }
}
