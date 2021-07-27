package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ao */
public abstract class C1293ao {

    /* renamed from: nS */
    private static MessageDigest f2372nS = null;

    /* renamed from: mH */
    protected Object f2373mH = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: bf */
    public MessageDigest mo14796bf() {
        synchronized (this.f2373mH) {
            if (f2372nS != null) {
                MessageDigest messageDigest = f2372nS;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f2372nS = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e) {
                }
            }
            MessageDigest messageDigest2 = f2372nS;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract byte[] mo14797l(String str);
}
