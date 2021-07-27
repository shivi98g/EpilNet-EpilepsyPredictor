package com.google.android.gms.internal;

import com.google.android.gms.internal.C1555fn;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.fo */
public class C1559fo implements C1555fn.C1558a<C1341bt> {
    /* renamed from: b */
    public C1341bt mo15317a(C1555fn fnVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        return new C1341bt(jSONObject.getString("headline"), fnVar.mo15306a(jSONObject, "image", true).get(), jSONObject.getString("body"), fnVar.mo15306a(jSONObject, "app_icon", true).get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString("price"));
    }
}
