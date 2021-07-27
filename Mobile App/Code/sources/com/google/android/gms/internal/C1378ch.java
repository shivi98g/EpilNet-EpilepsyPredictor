package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.ch */
public class C1378ch implements C1374cd {

    /* renamed from: qb */
    static final Map<String, Integer> f2797qb = new HashMap();

    static {
        f2797qb.put("resize", 1);
        f2797qb.put("playVideo", 2);
        f2797qb.put("storePicture", 3);
        f2797qb.put("createCalendarEvent", 4);
    }

    /* renamed from: a */
    public void mo14738a(C1610gu guVar, Map<String, String> map) {
        int intValue = f2797qb.get(map.get("a")).intValue();
        if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new C1435dj(guVar, map).execute();
                    return;
                case 4:
                    new C1431dh(guVar, map).execute();
                    return;
                default:
                    C1607gr.m4707U("Unknown MRAID command called.");
                    return;
            }
        } else {
            new C1434di(guVar, map).execute();
        }
    }
}
