package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.tagmanager.ci */
class C2536ci extends C2584dd {

    /* renamed from: ID */
    private static final String f4441ID = C1259a.REGEX.toString();
    private static final String asy = C1308b.IGNORE_CASE.toString();

    public C2536ci() {
        super(f4441ID);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18639a(String str, String str2, Map<String, C1408d.C1409a> map) {
        try {
            return Pattern.compile(str2, C2590di.m7537n(map.get(asy)).booleanValue() ? 66 : 64).matcher(str).find();
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
