package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.C2703c;

@Deprecated
/* renamed from: com.google.android.gms.wearable.internal.r */
public class C2796r implements SafeParcelable {
    public static final Parcelable.Creator<C2796r> CREATOR = new C2797s();
    public final C2703c axJ;
    public final int statusCode;
    public final int versionCode;

    C2796r(int i, int i2, C2703c cVar) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axJ = cVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2797s.m8186a(this, parcel, i);
    }
}
