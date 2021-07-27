package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValueChangedDetails implements SafeParcelable {
    public static final Parcelable.Creator<ValueChangedDetails> CREATOR = new C0918g();

    /* renamed from: CK */
    final int f1262CK;

    /* renamed from: Tj */
    final int f1263Tj;

    ValueChangedDetails(int i, int i2) {
        this.f1262CK = i;
        this.f1263Tj = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0918g.m1433a(this, parcel, i);
    }
}
