package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wearable.internal.at */
public class C2748at implements SafeParcelable {
    public static final Parcelable.Creator<C2748at> CREATOR = new C2749au();
    public final int ayd;
    public final int statusCode;
    public final int versionCode;

    C2748at(int i, int i2, int i3) {
        this.versionCode = i;
        this.statusCode = i2;
        this.ayd = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2749au.m8077a(this, parcel, i);
    }
}
