package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ac */
class C2467ac extends C2474aj {

    /* renamed from: ID */
    private static final String f4399ID = C1259a.ENCODE.toString();
    private static final String arp = C1308b.ARG0.toString();
    private static final String arq = C1308b.NO_PADDING.toString();
    private static final String arr = C1308b.INPUT_FORMAT.toString();
    private static final String ars = C1308b.OUTPUT_FORMAT.toString();

    public C2467ac() {
        super(f4399ID, arp);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String str;
        byte[] bArr;
        String str2;
        C1408d.C1409a aVar = map.get(arp);
        if (aVar == null || aVar == C2590di.m7548rb()) {
            return C2590di.m7548rb();
        }
        String j = C2590di.m7533j(aVar);
        C1408d.C1409a aVar2 = map.get(arr);
        String j2 = aVar2 == null ? "text" : C2590di.m7533j(aVar2);
        C1408d.C1409a aVar3 = map.get(ars);
        String j3 = aVar3 == null ? "base16" : C2590di.m7533j(aVar3);
        int i = 2;
        C1408d.C1409a aVar4 = map.get(arq);
        if (aVar4 != null && C2590di.m7537n(aVar4).booleanValue()) {
            i = 3;
        }
        try {
            if ("text".equals(j2)) {
                bArr = j.getBytes();
            } else if ("base16".equals(j2)) {
                bArr = C2602j.m7597co(j);
            } else if ("base64".equals(j2)) {
                bArr = Base64.decode(j, i);
            } else if ("base64url".equals(j2)) {
                bArr = Base64.decode(j, i | 8);
            } else {
                C2504bh.m7243T("Encode: unknown input format: " + j2);
                return C2590di.m7548rb();
            }
            if ("base16".equals(j3)) {
                str2 = C2602j.m7598d(bArr);
            } else if ("base64".equals(j3)) {
                str2 = Base64.encodeToString(bArr, i);
            } else if ("base64url".equals(j3)) {
                str2 = Base64.encodeToString(bArr, i | 8);
            } else {
                str = "Encode: unknown output format: " + j3;
                C2504bh.m7243T(str);
                return C2590di.m7548rb();
            }
            return C2590di.m7551u(str2);
        } catch (IllegalArgumentException e) {
            str = "Encode: invalid input:";
        }
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
