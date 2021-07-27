package com.google.android.gms.internal;

import android.support.p000v4.view.ViewCompat;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ar */
public class C1298ar extends C1293ao {

    /* renamed from: nZ */
    private MessageDigest f2381nZ;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo14804a(String[] strArr) {
        byte[] bArr = new byte[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            bArr[i] = mo14805e(C1297aq.m3928o(strArr[i]));
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public byte mo14805e(int i) {
        return (byte) (((i & ViewCompat.MEASURED_STATE_MASK) >> 24) ^ (((i & 255) ^ ((65280 & i) >> 8)) ^ ((16711680 & i) >> 16)));
    }

    /* renamed from: l */
    public byte[] mo14797l(String str) {
        byte[] a = mo14804a(str.split(" "));
        this.f2381nZ = mo14796bf();
        synchronized (this.f2373mH) {
            if (this.f2381nZ == null) {
                byte[] bArr = new byte[0];
                return bArr;
            }
            this.f2381nZ.reset();
            this.f2381nZ.update(a);
            byte[] digest = this.f2381nZ.digest();
            int i = 4;
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(digest, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }
    }
}
