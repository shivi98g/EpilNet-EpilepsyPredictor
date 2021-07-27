package com.google.android.gms.internal;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.lj */
public class C1838lj {
    /* renamed from: a */
    public static void m5535a(StringBuilder sb, HashMap<String, String> hashMap) {
        String str;
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            String str2 = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str2 == null) {
                str = "null";
            } else {
                sb.append("\"");
                sb.append(str2);
                str = "\"";
            }
            sb.append(str);
        }
        sb.append("}");
    }
}
