package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.tagmanager.DataLayer;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.d */
class C2579d implements DataLayer.C2452b {

    /* renamed from: lM */
    private final Context f4452lM;

    public C2579d(Context context) {
        this.f4452lM = context;
    }

    /* renamed from: C */
    public void mo18608C(Map<String, Object> map) {
        String queryParameter;
        Object obj;
        Object obj2 = map.get("gtm.url");
        if (obj2 == null && (obj = map.get("gtm")) != null && (obj instanceof Map)) {
            obj2 = ((Map) obj).get(PlusShare.KEY_CALL_TO_ACTION_URL);
        }
        if (obj2 != null && (obj2 instanceof String) && (queryParameter = Uri.parse((String) obj2).getQueryParameter("referrer")) != null) {
            C2490ay.m7221f(this.f4452lM, queryParameter);
        }
    }
}
