package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.tagmanager.ch */
class C2535ch extends C2474aj {

    /* renamed from: ID */
    private static final String f4440ID = C1259a.REGEX_GROUP.toString();
    private static final String asw = C1308b.ARG0.toString();
    private static final String asx = C1308b.ARG1.toString();
    private static final String asy = C1308b.IGNORE_CASE.toString();
    private static final String asz = C1308b.GROUP.toString();

    public C2535ch() {
        super(f4440ID, asw, asx);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        C1408d.C1409a aVar = map.get(asw);
        C1408d.C1409a aVar2 = map.get(asx);
        if (aVar == null || aVar == C2590di.m7548rb() || aVar2 == null || aVar2 == C2590di.m7548rb()) {
            return C2590di.m7548rb();
        }
        int i = 64;
        if (C2590di.m7537n(map.get(asy)).booleanValue()) {
            i = 66;
        }
        int i2 = 1;
        C1408d.C1409a aVar3 = map.get(asz);
        if (aVar3 != null) {
            Long l = C2590di.m7535l(aVar3);
            if (l == C2590di.m7542qW()) {
                return C2590di.m7548rb();
            }
            i2 = l.intValue();
            if (i2 < 0) {
                return C2590di.m7548rb();
            }
        }
        try {
            String j = C2590di.m7533j(aVar);
            String j2 = C2590di.m7533j(aVar2);
            String str = null;
            Matcher matcher = Pattern.compile(j2, i).matcher(j);
            if (matcher.find() && matcher.groupCount() >= i2) {
                str = matcher.group(i2);
            }
            return str == null ? C2590di.m7548rb() : C2590di.m7551u(str);
        } catch (PatternSyntaxException e) {
            return C2590di.m7548rb();
        }
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
