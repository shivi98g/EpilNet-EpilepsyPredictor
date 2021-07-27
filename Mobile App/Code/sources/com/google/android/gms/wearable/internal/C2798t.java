package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.C2703c;

/* renamed from: com.google.android.gms.wearable.internal.t */
public class C2798t implements SafeParcelable {
    public static final Parcelable.Creator<C2798t> CREATOR = new C2799u();
    public final C2703c[] axK;
    public final int statusCode;
    public final int versionCode;

    C2798t(int i, int i2, C2703c[] cVarArr) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axK = cVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2799u.m8189a(this, parcel, i);
    }
}
