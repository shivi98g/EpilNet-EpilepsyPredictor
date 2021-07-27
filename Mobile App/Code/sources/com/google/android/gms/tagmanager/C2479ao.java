package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ao */
class C2479ao extends C2474aj {

    /* renamed from: ID */
    private static final String f4406ID = C1259a.HASH.toString();
    private static final String arp = C1308b.ARG0.toString();
    private static final String arr = C1308b.INPUT_FORMAT.toString();
    private static final String arv = C1308b.ALGORITHM.toString();

    public C2479ao() {
        super(f4406ID, arp);
    }

    /* renamed from: d */
    private byte[] m7187d(String str, byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String str;
        byte[] bArr;
        C1408d.C1409a aVar = map.get(arp);
        if (aVar == null || aVar == C2590di.m7548rb()) {
            return C2590di.m7548rb();
        }
        String j = C2590di.m7533j(aVar);
        C1408d.C1409a aVar2 = map.get(arv);
        String j2 = aVar2 == null ? "MD5" : C2590di.m7533j(aVar2);
        C1408d.C1409a aVar3 = map.get(arr);
        String j3 = aVar3 == null ? "text" : C2590di.m7533j(aVar3);
        if ("text".equals(j3)) {
            bArr = j.getBytes();
        } else if ("base16".equals(j3)) {
            bArr = C2602j.m7597co(j);
        } else {
            str = "Hash: unknown input format: " + j3;
            C2504bh.m7243T(str);
            return C2590di.m7548rb();
        }
        try {
            return C2590di.m7551u(C2602j.m7598d(m7187d(j2, bArr)));
        } catch (NoSuchAlgorithmException e) {
            str = "Hash: unknown algorithm: " + j2;
        }
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
