package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0724c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public class PlusCommonExtras implements SafeParcelable {
    public static final C2441f CREATOR = new C2441f();
    public static String TAG = "PlusCommonExtras";

    /* renamed from: CK */
    private final int f4371CK;
    private String anN;
    private String anO;

    public PlusCommonExtras() {
        this.f4371CK = 1;
        this.anN = "";
        this.anO = "";
    }

    PlusCommonExtras(int i, String str, String str2) {
        this.f4371CK = i;
        this.anN = str;
        this.anO = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusCommonExtras)) {
            return false;
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
        return this.f4371CK == plusCommonExtras.f4371CK && C1781jv.equal(this.anN, plusCommonExtras.anN) && C1781jv.equal(this.anO, plusCommonExtras.anO);
    }

    public int getVersionCode() {
        return this.f4371CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f4371CK), this.anN, this.anO);
    }

    /* renamed from: ox */
    public String mo18411ox() {
        return this.anN;
    }

    /* renamed from: oy */
    public String mo18412oy() {
        return this.anO;
    }

    /* renamed from: q */
    public void mo18413q(Bundle bundle) {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", C0724c.m781a(this));
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("versionCode", Integer.valueOf(this.f4371CK)).mo15935a("Gpsrc", this.anN).mo15935a("ClientCallingPackage", this.anO).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2441f.m7077a(this, parcel, i);
    }
}
