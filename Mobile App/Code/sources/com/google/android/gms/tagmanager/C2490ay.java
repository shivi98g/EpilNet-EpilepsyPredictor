package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ay */
class C2490ay {
    private static String arH;
    static Map<String, String> arI = new HashMap();

    C2490ay() {
    }

    /* renamed from: cH */
    static void m7217cH(String str) {
        synchronized (C2490ay.class) {
            arH = str;
        }
    }

    /* renamed from: d */
    static void m7218d(Context context, String str) {
        C2577cz.m7494a(context, "gtm_install_referrer", "referrer", str);
        m7221f(context, str);
    }

    /* renamed from: e */
    static String m7219e(Context context, String str) {
        if (arH == null) {
            synchronized (C2490ay.class) {
                if (arH == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    arH = sharedPreferences != null ? sharedPreferences.getString("referrer", "") : "";
                }
            }
        }
        return m7222w(arH, str);
    }

    /* renamed from: f */
    static String m7220f(Context context, String str, String str2) {
        String str3 = arI.get(str);
        if (str3 == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str3 = sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
            arI.put(str, str3);
        }
        return m7222w(str3, str2);
    }

    /* renamed from: f */
    static void m7221f(Context context, String str) {
        String w = m7222w(str, "conv");
        if (w != null && w.length() > 0) {
            arI.put(w, str);
            C2577cz.m7494a(context, "gtm_click_referrers", w, str);
        }
    }

    /* renamed from: w */
    static String m7222w(String str, String str2) {
        if (str2 != null) {
            return Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
        } else if (str.length() > 0) {
            return str;
        } else {
            return null;
        }
    }
}
