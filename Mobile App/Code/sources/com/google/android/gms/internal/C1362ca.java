package com.google.android.gms.internal;

import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.ca */
public final class C1362ca implements C1374cd {

    /* renamed from: pP */
    private final C1363cb f2785pP;

    public C1362ca(C1363cb cbVar) {
        this.f2785pP = cbVar;
    }

    /* renamed from: a */
    public void mo14738a(C1610gu guVar, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            C1607gr.m4709W("App event with no name parameter.");
        } else {
            this.f2785pP.onAppEvent(str, map.get("info"));
        }
    }
}
