package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* renamed from: com.google.android.gms.wearable.internal.v */
public class C2800v implements SafeParcelable {
    public static final Parcelable.Creator<C2800v> CREATOR = new C2801w();
    public final List<C2740al> axL;
    public final int statusCode;
    public final int versionCode;

    C2800v(int i, int i2, List<C2740al> list) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axL = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2801w.m8192a(this, parcel, i);
    }
}
