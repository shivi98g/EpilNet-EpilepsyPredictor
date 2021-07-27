package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.hp */
public class C1649hp implements SafeParcelable {
    public static final C1651hq CREATOR = new C1651hq();

    /* renamed from: CK */
    final int f3641CK;

    /* renamed from: Dh */
    public final String f3642Dh;

    /* renamed from: Di */
    public final boolean f3643Di;

    /* renamed from: Dj */
    public final boolean f3644Dj;

    /* renamed from: Dk */
    public final String f3645Dk;

    /* renamed from: Dl */
    public final C1641hj[] f3646Dl;

    /* renamed from: Dm */
    final int[] f3647Dm;

    /* renamed from: Dn */
    public final String f3648Dn;
    public final String name;
    public final int weight;

    /* renamed from: com.google.android.gms.internal.hp$a */
    public static final class C1650a {

        /* renamed from: Do */
        private String f3649Do;

        /* renamed from: Dp */
        private boolean f3650Dp;

        /* renamed from: Dq */
        private int f3651Dq = 1;

        /* renamed from: Dr */
        private boolean f3652Dr;

        /* renamed from: Ds */
        private String f3653Ds;

        /* renamed from: Dt */
        private final List<C1641hj> f3654Dt = new ArrayList();

        /* renamed from: Du */
        private BitSet f3655Du;

        /* renamed from: Dv */
        private String f3656Dv;
        private final String mName;

        public C1650a(String str) {
            this.mName = str;
        }

        /* renamed from: G */
        public C1650a mo15554G(boolean z) {
            this.f3650Dp = z;
            return this;
        }

        /* renamed from: H */
        public C1650a mo15555H(boolean z) {
            this.f3652Dr = z;
            return this;
        }

        /* renamed from: Q */
        public C1650a mo15556Q(int i) {
            if (this.f3655Du == null) {
                this.f3655Du = new BitSet();
            }
            this.f3655Du.set(i);
            return this;
        }

        /* renamed from: at */
        public C1650a mo15557at(String str) {
            this.f3649Do = str;
            return this;
        }

        /* renamed from: au */
        public C1650a mo15558au(String str) {
            this.f3656Dv = str;
            return this;
        }

        /* renamed from: fG */
        public C1649hp mo15559fG() {
            int[] iArr;
            if (this.f3655Du != null) {
                iArr = new int[this.f3655Du.cardinality()];
                int i = 0;
                int nextSetBit = this.f3655Du.nextSetBit(0);
                while (nextSetBit >= 0) {
                    iArr[i] = nextSetBit;
                    nextSetBit = this.f3655Du.nextSetBit(nextSetBit + 1);
                    i++;
                }
            } else {
                iArr = null;
            }
            return new C1649hp(this.mName, this.f3649Do, this.f3650Dp, this.f3651Dq, this.f3652Dr, this.f3653Ds, (C1641hj[]) this.f3654Dt.toArray(new C1641hj[this.f3654Dt.size()]), iArr, this.f3656Dv);
        }
    }

    C1649hp(int i, String str, String str2, boolean z, int i2, boolean z2, String str3, C1641hj[] hjVarArr, int[] iArr, String str4) {
        this.f3641CK = i;
        this.name = str;
        this.f3642Dh = str2;
        this.f3643Di = z;
        this.weight = i2;
        this.f3644Dj = z2;
        this.f3645Dk = str3;
        this.f3646Dl = hjVarArr;
        this.f3647Dm = iArr;
        this.f3648Dn = str4;
    }

    C1649hp(String str, String str2, boolean z, int i, boolean z2, String str3, C1641hj[] hjVarArr, int[] iArr, String str4) {
        this(2, str, str2, z, i, z2, str3, hjVarArr, iArr, str4);
    }

    public int describeContents() {
        C1651hq hqVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1649hp)) {
            return false;
        }
        C1649hp hpVar = (C1649hp) obj;
        return this.name.equals(hpVar.name) && this.f3642Dh.equals(hpVar.f3642Dh) && this.f3643Di == hpVar.f3643Di;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1651hq hqVar = CREATOR;
        C1651hq.m4822a(this, parcel, i);
    }
}
