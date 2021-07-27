package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wearable.internal.p */
public class C2794p implements SafeParcelable {
    public static final Parcelable.Creator<C2794p> CREATOR = new C2795q();
    public final int axI;
    public final int statusCode;
    public final int versionCode;

    C2794p(int i, int i2, int i3) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axI = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2795q.m8183a(this, parcel, i);
    }
}
