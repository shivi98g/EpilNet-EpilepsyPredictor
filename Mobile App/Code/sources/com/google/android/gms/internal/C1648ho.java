package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ho */
public class C1648ho {

    /* renamed from: Df */
    private static final String[] f3639Df = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"};

    /* renamed from: Dg */
    private static final Map<String, Integer> f3640Dg = new HashMap(f3639Df.length);

    static {
        for (int i = 0; i < f3639Df.length; i++) {
            f3640Dg.put(f3639Df[i], Integer.valueOf(i));
        }
    }

    /* renamed from: P */
    public static String m4813P(int i) {
        if (i < 0 || i >= f3639Df.length) {
            return null;
        }
        return f3639Df[i];
    }

    /* renamed from: as */
    public static int m4814as(String str) {
        Integer num = f3640Dg.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("[" + str + "] is not a valid global search section name");
    }

    /* renamed from: fF */
    public static int m4815fF() {
        return f3639Df.length;
    }
}
