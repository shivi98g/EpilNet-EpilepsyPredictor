package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import java.util.Arrays;

/* renamed from: com.google.android.gms.plus.internal.h */
public class C2443h implements SafeParcelable {
    public static final C2444i CREATOR = new C2444i();

    /* renamed from: CK */
    private final int f4381CK;

    /* renamed from: DZ */
    private final String f4382DZ;
    private final String[] anQ;
    private final String[] anR;
    private final String[] anS;
    private final String anT;
    private final String anU;
    private final String anV;
    private final String anW;
    private final PlusCommonExtras anX;

    C2443h(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.f4381CK = i;
        this.f4382DZ = str;
        this.anQ = strArr;
        this.anR = strArr2;
        this.anS = strArr3;
        this.anT = str2;
        this.anU = str3;
        this.anV = str4;
        this.anW = str5;
        this.anX = plusCommonExtras;
    }

    public C2443h(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.f4381CK = 1;
        this.f4382DZ = str;
        this.anQ = strArr;
        this.anR = strArr2;
        this.anS = strArr3;
        this.anT = str2;
        this.anU = str3;
        this.anV = str4;
        this.anW = null;
        this.anX = plusCommonExtras;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2443h)) {
            return false;
        }
        C2443h hVar = (C2443h) obj;
        return this.f4381CK == hVar.f4381CK && C1781jv.equal(this.f4382DZ, hVar.f4382DZ) && Arrays.equals(this.anQ, hVar.anQ) && Arrays.equals(this.anR, hVar.anR) && Arrays.equals(this.anS, hVar.anS) && C1781jv.equal(this.anT, hVar.anT) && C1781jv.equal(this.anU, hVar.anU) && C1781jv.equal(this.anV, hVar.anV) && C1781jv.equal(this.anW, hVar.anW) && C1781jv.equal(this.anX, hVar.anX);
    }

    public String getAccountName() {
        return this.f4382DZ;
    }

    public int getVersionCode() {
        return this.f4381CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f4381CK), this.f4382DZ, this.anQ, this.anR, this.anS, this.anT, this.anU, this.anV, this.anW, this.anX);
    }

    /* renamed from: oA */
    public String[] mo18485oA() {
        return this.anR;
    }

    /* renamed from: oB */
    public String[] mo18486oB() {
        return this.anS;
    }

    /* renamed from: oC */
    public String mo18487oC() {
        return this.anT;
    }

    /* renamed from: oD */
    public String mo18488oD() {
        return this.anU;
    }

    /* renamed from: oE */
    public String mo18489oE() {
        return this.anV;
    }

    /* renamed from: oF */
    public String mo18490oF() {
        return this.anW;
    }

    /* renamed from: oG */
    public PlusCommonExtras mo18491oG() {
        return this.anX;
    }

    /* renamed from: oH */
    public Bundle mo18492oH() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        this.anX.mo18413q(bundle);
        return bundle;
    }

    /* renamed from: oz */
    public String[] mo18493oz() {
        return this.anQ;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("versionCode", Integer.valueOf(this.f4381CK)).mo15935a("accountName", this.f4382DZ).mo15935a("requestedScopes", this.anQ).mo15935a("visibleActivities", this.anR).mo15935a("requiredFeatures", this.anS).mo15935a("packageNameForAuth", this.anT).mo15935a("callingPackageName", this.anU).mo15935a("applicationName", this.anV).mo15935a("extra", this.anX.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2444i.m7092a(this, parcel, i);
    }
}
