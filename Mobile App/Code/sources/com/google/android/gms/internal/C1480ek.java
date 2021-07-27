package com.google.android.gms.internal;

import android.content.Intent;

@C1507ey
/* renamed from: com.google.android.gms.internal.ek */
public class C1480ek {

    /* renamed from: oK */
    private final String f3032oK;

    public C1480ek(String str) {
        this.f3032oK = str;
    }

    /* renamed from: a */
    public boolean mo15229a(String str, int i, Intent intent) {
        String str2;
        if (str == null || intent == null) {
            return false;
        }
        String e = C1478ei.m4379e(intent);
        String f = C1478ei.m4380f(intent);
        if (e == null || f == null) {
            return false;
        }
        if (!str.equals(C1478ei.m4375D(e))) {
            str2 = "Developer payload not match.";
        } else if (this.f3032oK == null || C1481el.m4386b(this.f3032oK, e, f)) {
            return true;
        } else {
            str2 = "Fail to verify signature.";
        }
        C1607gr.m4709W(str2);
        return false;
    }

    /* renamed from: cC */
    public String mo15230cC() {
        return C1591gi.m4666dx();
    }
}
