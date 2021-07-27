package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.o */
public class C2018o {

    /* renamed from: kZ */
    private final SecureRandom f4153kZ;

    /* renamed from: ky */
    private final C1880m f4154ky;

    /* renamed from: com.google.android.gms.internal.o$a */
    public class C2019a extends Exception {
        public C2019a() {
        }

        public C2019a(Throwable th) {
            super(th);
        }
    }

    public C2018o(C1880m mVar, SecureRandom secureRandom) {
        this.f4154ky = mVar;
        this.f4153kZ = secureRandom;
    }

    /* renamed from: c */
    static void m5991c(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    /* renamed from: b */
    public byte[] mo16433b(String str) throws C2019a {
        try {
            byte[] a = this.f4154ky.mo15185a(str, false);
            if (a.length != 32) {
                throw new C2019a();
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            m5991c(bArr);
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new C2019a(e);
        }
    }

    /* renamed from: c */
    public byte[] mo16434c(byte[] bArr, String str) throws C2019a {
        if (bArr.length != 16) {
            throw new C2019a();
        }
        try {
            byte[] a = this.f4154ky.mo15185a(str, false);
            if (a.length <= 16) {
                throw new C2019a();
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(bArr3);
        } catch (NoSuchAlgorithmException e) {
            throw new C2019a(e);
        } catch (InvalidKeyException e2) {
            throw new C2019a(e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C2019a(e3);
        } catch (NoSuchPaddingException e4) {
            throw new C2019a(e4);
        } catch (BadPaddingException e5) {
            throw new C2019a(e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new C2019a(e6);
        } catch (IllegalArgumentException e7) {
            throw new C2019a(e7);
        }
    }
}
