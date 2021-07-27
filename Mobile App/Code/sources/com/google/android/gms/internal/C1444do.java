package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C1507ey
/* renamed from: com.google.android.gms.internal.do */
public final class C1444do implements SafeParcelable {
    public static final C1443dn CREATOR = new C1443dn();
    public final String mimeType;
    public final String packageName;

    /* renamed from: rG */
    public final String f2936rG;

    /* renamed from: rH */
    public final String f2937rH;

    /* renamed from: rI */
    public final String f2938rI;

    /* renamed from: rJ */
    public final String f2939rJ;

    /* renamed from: rK */
    public final String f2940rK;
    public final int versionCode;

    public C1444do(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.versionCode = i;
        this.f2936rG = str;
        this.f2937rH = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.f2938rI = str5;
        this.f2939rJ = str6;
        this.f2940rK = str7;
    }

    public C1444do(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(1, str, str2, str3, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1443dn.m4284a(this, parcel, i);
    }
}
