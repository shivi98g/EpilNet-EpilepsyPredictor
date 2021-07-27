package com.google.android.gms.internal;

import com.google.android.gms.internal.C1555fn;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.fp */
public class C1560fp implements C1555fn.C1558a<C1342bu> {
    /* renamed from: c */
    public C1342bu mo15317a(C1555fn fnVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        return new C1342bu(jSONObject.getString("headline"), fnVar.mo15306a(jSONObject, "image", true).get(), jSONObject.getString("body"), fnVar.mo15306a(jSONObject, "secondary_image", false).get(), jSONObject.getString("call_to_action"), jSONObject.getString("attribution"));
    }
}
