package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.cw */
public final class C1400cw {
    /* renamed from: a */
    public static List<String> m4207a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m4208a(Context context, String str, C1574fy fyVar, String str2, boolean z, List<String> list) {
        String str3 = z ? "1" : "0";
        for (String replaceAll : list) {
            String replaceAll2 = replaceAll.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", fyVar.f3457vE.f2828qz).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", C1579ga.f3484vY).replaceAll("@gw_seqnum@", fyVar.f3450tO);
            if (fyVar.f3442qP != null) {
                replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", fyVar.f3442qP.f2814qo).replaceAll("@gw_allocid@", fyVar.f3442qP.f2816qq);
            }
            new C1605gp(context, str, replaceAll2).start();
        }
    }
}
