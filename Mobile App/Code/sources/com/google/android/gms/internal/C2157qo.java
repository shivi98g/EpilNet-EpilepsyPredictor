package com.google.android.gms.internal;

import android.support.p003v7.widget.ActivityChooserView;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.qo */
public final class C2157qo {
    private int ayM;
    private int ayN;
    private int ayO;
    private int ayP;
    private int ayQ;
    private int ayR = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int ayS;
    private int ayT = 64;
    private int ayU = 67108864;
    private final byte[] buffer;

    private C2157qo(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.ayM = i;
        this.ayN = i2 + i;
        this.ayP = i;
    }

    /* renamed from: A */
    public static long m6351A(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static C2157qo m6352a(byte[] bArr, int i, int i2) {
        return new C2157qo(bArr, i, i2);
    }

    /* renamed from: gR */
    public static int m6353gR(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: p */
    public static C2157qo m6354p(byte[] bArr) {
        return m6352a(bArr, 0, bArr.length);
    }

    /* renamed from: rK */
    private void m6355rK() {
        this.ayN += this.ayO;
        int i = this.ayN;
        if (i > this.ayR) {
            this.ayO = i - this.ayR;
            this.ayN -= this.ayO;
            return;
        }
        this.ayO = 0;
    }

    /* renamed from: a */
    public void mo17010a(C2166qw qwVar) throws IOException {
        int rG = mo17026rG();
        if (this.ayS >= this.ayT) {
            throw C2165qv.m6476rX();
        }
        int gS = mo17014gS(rG);
        this.ayS++;
        qwVar.mo11552b(this);
        mo17012gP(0);
        this.ayS--;
        mo17015gT(gS);
    }

    /* renamed from: a */
    public void mo17011a(C2166qw qwVar, int i) throws IOException {
        if (this.ayS >= this.ayT) {
            throw C2165qv.m6476rX();
        }
        this.ayS++;
        qwVar.mo11552b(this);
        mo17012gP(C2169qz.m6497y(i, 4));
        this.ayS--;
    }

    /* renamed from: gP */
    public void mo17012gP(int i) throws C2165qv {
        if (this.ayQ != i) {
            throw C2165qv.m6474rV();
        }
    }

    /* renamed from: gQ */
    public boolean mo17013gQ(int i) throws IOException {
        switch (C2169qz.m6495hk(i)) {
            case 0:
                mo17022rC();
                return true;
            case 1:
                mo17029rJ();
                return true;
            case 2:
                mo17018gW(mo17026rG());
                return true;
            case 3:
                mo17020rA();
                mo17012gP(C2169qz.m6497y(C2169qz.m6496hl(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                mo17028rI();
                return true;
            default:
                throw C2165qv.m6475rW();
        }
    }

    /* renamed from: gS */
    public int mo17014gS(int i) throws C2165qv {
        if (i < 0) {
            throw C2165qv.m6471rS();
        }
        int i2 = i + this.ayP;
        int i3 = this.ayR;
        if (i2 > i3) {
            throw C2165qv.m6470rR();
        }
        this.ayR = i2;
        m6355rK();
        return i3;
    }

    /* renamed from: gT */
    public void mo17015gT(int i) {
        this.ayR = i;
        m6355rK();
    }

    /* renamed from: gU */
    public void mo17016gU(int i) {
        if (i > this.ayP - this.ayM) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.ayP - this.ayM));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.ayP = this.ayM + i;
        }
    }

    /* renamed from: gV */
    public byte[] mo17017gV(int i) throws IOException {
        if (i < 0) {
            throw C2165qv.m6471rS();
        } else if (this.ayP + i > this.ayR) {
            mo17018gW(this.ayR - this.ayP);
            throw C2165qv.m6470rR();
        } else if (i <= this.ayN - this.ayP) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, this.ayP, bArr, 0, i);
            this.ayP += i;
            return bArr;
        } else {
            throw C2165qv.m6470rR();
        }
    }

    /* renamed from: gW */
    public void mo17018gW(int i) throws IOException {
        if (i < 0) {
            throw C2165qv.m6471rS();
        } else if (this.ayP + i > this.ayR) {
            mo17018gW(this.ayR - this.ayP);
            throw C2165qv.m6470rR();
        } else if (i <= this.ayN - this.ayP) {
            this.ayP += i;
        } else {
            throw C2165qv.m6470rR();
        }
    }

    public int getPosition() {
        return this.ayP - this.ayM;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: rA */
    public void mo17020rA() throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.mo17037rz()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo17013gQ(r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2157qo.mo17020rA():void");
    }

    /* renamed from: rB */
    public long mo17021rB() throws IOException {
        return mo17027rH();
    }

    /* renamed from: rC */
    public int mo17022rC() throws IOException {
        return mo17026rG();
    }

    /* renamed from: rD */
    public boolean mo17023rD() throws IOException {
        return mo17026rG() != 0;
    }

    /* renamed from: rE */
    public int mo17024rE() throws IOException {
        return m6353gR(mo17026rG());
    }

    /* renamed from: rF */
    public long mo17025rF() throws IOException {
        return m6351A(mo17027rH());
    }

    /* renamed from: rG */
    public int mo17026rG() throws IOException {
        int i;
        byte rN = mo17032rN();
        if (rN >= 0) {
            return rN;
        }
        byte b = rN & Byte.MAX_VALUE;
        byte rN2 = mo17032rN();
        if (rN2 >= 0) {
            i = rN2 << 7;
        } else {
            b |= (rN2 & Byte.MAX_VALUE) << 7;
            byte rN3 = mo17032rN();
            if (rN3 >= 0) {
                i = rN3 << 14;
            } else {
                b |= (rN3 & Byte.MAX_VALUE) << 14;
                byte rN4 = mo17032rN();
                if (rN4 >= 0) {
                    i = rN4 << 21;
                } else {
                    byte b2 = b | ((rN4 & Byte.MAX_VALUE) << 21);
                    byte rN5 = mo17032rN();
                    byte b3 = b2 | (rN5 << 28);
                    if (rN5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (mo17032rN() >= 0) {
                            return b3;
                        }
                    }
                    throw C2165qv.m6472rT();
                }
            }
        }
        return b | i;
    }

    /* renamed from: rH */
    public long mo17027rH() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte rN = mo17032rN();
            j |= ((long) (rN & Byte.MAX_VALUE)) << i;
            if ((rN & 128) == 0) {
                return j;
            }
        }
        throw C2165qv.m6472rT();
    }

    /* renamed from: rI */
    public int mo17028rI() throws IOException {
        return (mo17032rN() & 255) | ((mo17032rN() & 255) << 8) | ((mo17032rN() & 255) << 16) | ((mo17032rN() & 255) << 24);
    }

    /* renamed from: rJ */
    public long mo17029rJ() throws IOException {
        byte rN = mo17032rN();
        byte rN2 = mo17032rN();
        return ((((long) rN2) & 255) << 8) | (((long) rN) & 255) | ((((long) mo17032rN()) & 255) << 16) | ((((long) mo17032rN()) & 255) << 24) | ((((long) mo17032rN()) & 255) << 32) | ((((long) mo17032rN()) & 255) << 40) | ((((long) mo17032rN()) & 255) << 48) | ((((long) mo17032rN()) & 255) << 56);
    }

    /* renamed from: rL */
    public int mo17030rL() {
        if (this.ayR == Integer.MAX_VALUE) {
            return -1;
        }
        return this.ayR - this.ayP;
    }

    /* renamed from: rM */
    public boolean mo17031rM() {
        return this.ayP == this.ayN;
    }

    /* renamed from: rN */
    public byte mo17032rN() throws IOException {
        if (this.ayP == this.ayN) {
            throw C2165qv.m6470rR();
        }
        byte[] bArr = this.buffer;
        int i = this.ayP;
        this.ayP = i + 1;
        return bArr[i];
    }

    public byte[] readBytes() throws IOException {
        int rG = mo17026rG();
        if (rG > this.ayN - this.ayP || rG <= 0) {
            return mo17017gV(rG);
        }
        byte[] bArr = new byte[rG];
        System.arraycopy(this.buffer, this.ayP, bArr, 0, rG);
        this.ayP += rG;
        return bArr;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(mo17029rJ());
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(mo17028rI());
    }

    public String readString() throws IOException {
        int rG = mo17026rG();
        if (rG > this.ayN - this.ayP || rG <= 0) {
            return new String(mo17017gV(rG), "UTF-8");
        }
        String str = new String(this.buffer, this.ayP, rG, "UTF-8");
        this.ayP += rG;
        return str;
    }

    /* renamed from: rz */
    public int mo17037rz() throws IOException {
        if (mo17031rM()) {
            this.ayQ = 0;
            return 0;
        }
        this.ayQ = mo17026rG();
        if (this.ayQ != 0) {
            return this.ayQ;
        }
        throw C2165qv.m6473rU();
    }

    /* renamed from: s */
    public byte[] mo17038s(int i, int i2) {
        if (i2 == 0) {
            return C2169qz.azq;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.ayM + i, bArr, 0, i2);
        return bArr;
    }
}
