package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1649hp;

/* renamed from: com.google.android.gms.internal.hh */
public class C1639hh implements SafeParcelable {
    public static final C1640hi CREATOR = new C1640hi();

    /* renamed from: CV */
    public static final int f3624CV = Integer.parseInt("-1");

    /* renamed from: CW */
    private static final C1649hp f3625CW = new C1649hp.C1650a("SsbContext").mo15554G(true).mo15557at("blob").mo15559fG();

    /* renamed from: CK */
    final int f3626CK;

    /* renamed from: CX */
    public final String f3627CX;

    /* renamed from: CY */
    final C1649hp f3628CY;

    /* renamed from: CZ */
    public final int f3629CZ;

    /* renamed from: Da */
    public final byte[] f3630Da;

    C1639hh(int i, String str, C1649hp hpVar, int i2, byte[] bArr) {
        boolean z = i2 == f3624CV || C1648ho.m4813P(i2) != null;
        C1785jx.m5361b(z, (Object) "Invalid section type " + i2);
        this.f3626CK = i;
        this.f3627CX = str;
        this.f3628CY = hpVar;
        this.f3629CZ = i2;
        this.f3630Da = bArr;
        String fE = mo15527fE();
        if (fE != null) {
            throw new IllegalArgumentException(fE);
        }
    }

    public C1639hh(String str, C1649hp hpVar) {
        this(1, str, hpVar, f3624CV, (byte[]) null);
    }

    public C1639hh(String str, C1649hp hpVar, String str2) {
        this(1, str, hpVar, C1648ho.m4814as(str2), (byte[]) null);
    }

    public C1639hh(byte[] bArr, C1649hp hpVar) {
        this(1, (String) null, hpVar, f3624CV, bArr);
    }

    public int describeContents() {
        C1640hi hiVar = CREATOR;
        return 0;
    }

    /* renamed from: fE */
    public String mo15527fE() {
        if (this.f3629CZ != f3624CV && C1648ho.m4813P(this.f3629CZ) == null) {
            return "Invalid section type " + this.f3629CZ;
        } else if (this.f3627CX == null || this.f3630Da == null) {
            return null;
        } else {
            return "Both content and blobContent set";
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1640hi hiVar = CREATOR;
        C1640hi.m4801a(this, parcel, i);
    }
}
