package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import com.google.android.gms.tagmanager.C2551cr;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.tagmanager.ba */
class C2495ba {
    /* renamed from: cI */
    public static C2551cr.C2555c m7230cI(String str) throws JSONException {
        C1408d.C1409a n = m7231n(new JSONObject(str));
        C2551cr.C2556d qo = C2551cr.C2555c.m7399qo();
        for (int i = 0; i < n.f2861gx.length; i++) {
            qo.mo18760a(C2551cr.C2553a.m7392qk().mo18753b(C1308b.INSTANCE_NAME.toString(), n.f2861gx[i]).mo18753b(C1308b.FUNCTION.toString(), C2590di.m7528cZ(C2607m.m7602ph())).mo18753b(C2607m.m7603pi(), n.f2862gy[i]).mo18755qn());
        }
        return qo.mo18764qr();
    }

    /* renamed from: n */
    private static C1408d.C1409a m7231n(Object obj) throws JSONException {
        return C2590di.m7551u(m7232o(obj));
    }

    /* renamed from: o */
    static Object m7232o(Object obj) throws JSONException {
        if (obj instanceof JSONArray) {
            throw new RuntimeException("JSONArrays are not supported");
        } else if (JSONObject.NULL.equals(obj)) {
            throw new RuntimeException("JSON nulls are not supported");
        } else if (!(obj instanceof JSONObject)) {
            return obj;
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, m7232o(jSONObject.get(next)));
            }
            return hashMap;
        }
    }
}
