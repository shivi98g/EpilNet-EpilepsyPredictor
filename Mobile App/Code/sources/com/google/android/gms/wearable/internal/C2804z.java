package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wearable.internal.z */
public class C2804z implements SafeParcelable {
    public static final Parcelable.Creator<C2804z> CREATOR = new C2708aa();
    public final ParcelFileDescriptor axN;
    public final int statusCode;
    public final int versionCode;

    C2804z(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axN = parcelFileDescriptor;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2708aa.m7930a(this, parcel, i | 1);
    }
}
