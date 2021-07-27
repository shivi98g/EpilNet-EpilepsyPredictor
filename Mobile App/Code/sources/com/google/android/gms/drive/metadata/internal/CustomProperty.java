package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.internal.C1785jx;

public class CustomProperty implements SafeParcelable {
    public static final Parcelable.Creator<CustomProperty> CREATOR = new C0874c();

    /* renamed from: CK */
    final int f1149CK;

    /* renamed from: Rg */
    final CustomPropertyKey f1150Rg;
    final String mValue;

    CustomProperty(int i, CustomPropertyKey customPropertyKey, String str) {
        this.f1149CK = i;
        C1785jx.m5359b(customPropertyKey, (Object) "key");
        this.f1150Rg = customPropertyKey;
        this.mValue = str;
    }

    public CustomProperty(CustomPropertyKey customPropertyKey, String str) {
        this(1, customPropertyKey, str);
    }

    public int describeContents() {
        return 0;
    }

    public String getValue() {
        return this.mValue;
    }

    /* renamed from: iX */
    public CustomPropertyKey mo11776iX() {
        return this.f1150Rg;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0874c.m1268a(this, parcel, i);
    }
}
