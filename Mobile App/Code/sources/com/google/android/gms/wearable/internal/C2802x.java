package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wearable.internal.x */
public class C2802x implements SafeParcelable {
    public static final Parcelable.Creator<C2802x> CREATOR = new C2803y();
    public final C2791m axM;
    public final int statusCode;
    public final int versionCode;

    C2802x(int i, int i2, C2791m mVar) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axM = mVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2803y.m8195a(this, parcel, i);
    }
}
