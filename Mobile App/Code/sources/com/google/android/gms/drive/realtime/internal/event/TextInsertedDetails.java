package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TextInsertedDetails implements SafeParcelable {
    public static final Parcelable.Creator<TextInsertedDetails> CREATOR = new C0917f();

    /* renamed from: CK */
    final int f1260CK;

    /* renamed from: Ti */
    final int f1261Ti;
    final int mIndex;

    TextInsertedDetails(int i, int i2, int i3) {
        this.f1260CK = i;
        this.mIndex = i2;
        this.f1261Ti = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0917f.m1430a(this, parcel, i);
    }
}
