package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.ei */
public final class C1478ei {
    /* renamed from: D */
    public static String m4375D(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str).getString("developerPayload");
        } catch (JSONException e) {
            C1607gr.m4709W("Fail to parse purchase data");
            return null;
        }
    }

    /* renamed from: E */
    public static String m4376E(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str).getString("purchaseToken");
        } catch (JSONException e) {
            C1607gr.m4709W("Fail to parse purchase data");
            return null;
        }
    }

    /* renamed from: b */
    public static int m4377b(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            C1607gr.m4709W("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            C1607gr.m4709W("Unexpected type for intent response code. " + obj.getClass().getName());
            return 5;
        }
    }

    /* renamed from: d */
    public static int m4378d(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            C1607gr.m4709W("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            C1607gr.m4709W("Unexpected type for intent response code. " + obj.getClass().getName());
            return 5;
        }
    }

    /* renamed from: e */
    public static String m4379e(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("INAPP_PURCHASE_DATA");
    }

    /* renamed from: f */
    public static String m4380f(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("INAPP_DATA_SIGNATURE");
    }
}
