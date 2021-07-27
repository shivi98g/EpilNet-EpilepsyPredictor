package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

@C1507ey
/* renamed from: com.google.android.gms.internal.el */
public class C1481el {
    /* renamed from: F */
    public static PublicKey m4384F(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            C1607gr.m4706T("Invalid key specification.");
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static boolean m4385a(PublicKey publicKey, String str, String str2) {
        String str3;
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(Base64.decode(str2, 0))) {
                return true;
            }
            C1607gr.m4706T("Signature verification failed.");
            return false;
        } catch (NoSuchAlgorithmException e) {
            str3 = "NoSuchAlgorithmException.";
            C1607gr.m4706T(str3);
            return false;
        } catch (InvalidKeyException e2) {
            str3 = "Invalid key specification.";
            C1607gr.m4706T(str3);
            return false;
        } catch (SignatureException e3) {
            str3 = "Signature exception.";
            C1607gr.m4706T(str3);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m4386b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return m4385a(m4384F(str), str2, str3);
        }
        C1607gr.m4706T("Purchase verification failed: missing data.");
        return false;
    }
}
