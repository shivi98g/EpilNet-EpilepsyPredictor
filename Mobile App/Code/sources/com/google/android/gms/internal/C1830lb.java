package com.google.android.gms.internal;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.lb */
public final class C1830lb {
    /* renamed from: d */
    public static String m5518d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: e */
    public static String m5519e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }
}
