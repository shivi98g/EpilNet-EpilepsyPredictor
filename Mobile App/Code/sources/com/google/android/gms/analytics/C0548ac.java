package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.ac */
public class C0548ac {
    /* renamed from: a */
    public static String m100a(C0547ab abVar, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(abVar.mo10349fa());
        if (abVar.mo10351fc() > 0) {
            long fc = j - abVar.mo10351fc();
            if (fc >= 0) {
                sb.append("&qt");
                sb.append("=");
                sb.append(fc);
            }
        }
        sb.append("&z");
        sb.append("=");
        sb.append(abVar.mo10350fb());
        return sb.toString();
    }

    public static String encode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("URL encoding failed for: " + str);
        }
    }

    /* renamed from: z */
    static Map<String, String> m101z(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((String) next.getKey()).startsWith("&") && next.getValue() != null) {
                String substring = ((String) next.getKey()).substring(1);
                if (!TextUtils.isEmpty(substring)) {
                    hashMap.put(substring, next.getValue());
                }
            }
        }
        return hashMap;
    }
}
