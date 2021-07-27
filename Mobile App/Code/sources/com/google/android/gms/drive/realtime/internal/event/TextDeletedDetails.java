package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TextDeletedDetails implements SafeParcelable {
    public static final Parcelable.Creator<TextDeletedDetails> CREATOR = new C0916e();

    /* renamed from: CK */
    final int f1258CK;

    /* renamed from: Ti */
    final int f1259Ti;
    final int mIndex;

    TextDeletedDetails(int i, int i2, int i3) {
        this.f1258CK = i;
        this.mIndex = i2;
        this.f1259Ti = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0916e.m1427a(this, parcel, i);
    }
}
