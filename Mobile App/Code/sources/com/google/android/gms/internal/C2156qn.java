package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.qn */
public class C2156qn {
    private final byte[] ayJ = new byte[256];
    private int ayK;
    private int ayL;

    public C2156qn(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.ayJ[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.ayJ[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.ayJ[i2];
            this.ayJ[i2] = this.ayJ[b];
            this.ayJ[b] = b2;
        }
        this.ayK = 0;
        this.ayL = 0;
    }

    /* renamed from: o */
    public void mo17009o(byte[] bArr) {
        int i = this.ayK;
        int i2 = this.ayL;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.ayJ[i]) & 255;
            byte b = this.ayJ[i];
            this.ayJ[i] = this.ayJ[i2];
            this.ayJ[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.ayJ[(this.ayJ[i] + this.ayJ[i2]) & 255]);
        }
        this.ayK = i;
        this.ayL = i2;
    }
}
