package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.cr */
public final class C1393cr {

    /* renamed from: qA */
    public final long f2820qA;

    /* renamed from: qB */
    public int f2821qB;

    /* renamed from: qC */
    public int f2822qC;

    /* renamed from: qu */
    public final List<C1392cq> f2823qu;

    /* renamed from: qv */
    public final long f2824qv;

    /* renamed from: qw */
    public final List<String> f2825qw;

    /* renamed from: qx */
    public final List<String> f2826qx;

    /* renamed from: qy */
    public final List<String> f2827qy;

    /* renamed from: qz */
    public final String f2828qz;

    public C1393cr(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (C1607gr.m4714v(2)) {
            C1607gr.m4708V("Mediation Response JSON: " + jSONObject.toString(2));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            C1392cq cqVar = new C1392cq(jSONArray.getJSONObject(i2));
            arrayList.add(cqVar);
            if (i < 0 && m4185a(cqVar)) {
                i = i2;
            }
        }
        this.f2821qB = i;
        this.f2822qC = jSONArray.length();
        this.f2823qu = Collections.unmodifiableList(arrayList);
        this.f2828qz = jSONObject.getString("qdata");
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        long j = -1;
        if (optJSONObject != null) {
            this.f2824qv = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f2825qw = C1400cw.m4207a(optJSONObject, "click_urls");
            this.f2826qx = C1400cw.m4207a(optJSONObject, "imp_urls");
            this.f2827qy = C1400cw.m4207a(optJSONObject, "nofill_urls");
            long optLong = optJSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j = 1000 * optLong;
            }
        } else {
            this.f2824qv = -1;
            this.f2825qw = null;
            this.f2826qx = null;
            this.f2827qy = null;
        }
        this.f2820qA = j;
    }

    /* renamed from: a */
    private boolean m4185a(C1392cq cqVar) {
        for (String equals : cqVar.f2815qp) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
