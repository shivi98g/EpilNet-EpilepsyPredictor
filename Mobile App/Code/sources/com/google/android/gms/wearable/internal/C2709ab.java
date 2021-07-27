package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wearable.internal.ab */
public class C2709ab implements SafeParcelable {
    public static final Parcelable.Creator<C2709ab> CREATOR = new C2710ac();
    public final C2740al axO;
    public final int statusCode;
    public final int versionCode;

    C2709ab(int i, int i2, C2740al alVar) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axO = alVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2710ac.m7933a(this, parcel, i);
    }
}
