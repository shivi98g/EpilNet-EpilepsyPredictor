package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wearable.internal.ap */
public class C2744ap implements SafeParcelable {
    public static final Parcelable.Creator<C2744ap> CREATOR = new C2745aq();
    public final C2791m axM;
    public final int statusCode;
    public final int versionCode;

    C2744ap(int i, int i2, C2791m mVar) {
        this.versionCode = i;
        this.statusCode = i2;
        this.axM = mVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2745aq.m8070a(this, parcel, i);
    }
}
