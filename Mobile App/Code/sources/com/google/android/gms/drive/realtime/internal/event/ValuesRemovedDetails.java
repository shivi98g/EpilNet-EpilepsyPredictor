package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesRemovedDetails implements SafeParcelable {
    public static final Parcelable.Creator<ValuesRemovedDetails> CREATOR = new C0920i();

    /* renamed from: CK */
    final int f1269CK;

    /* renamed from: SO */
    final int f1270SO;

    /* renamed from: SP */
    final int f1271SP;

    /* renamed from: Tm */
    final String f1272Tm;

    /* renamed from: Tn */
    final int f1273Tn;
    final int mIndex;

    ValuesRemovedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.f1269CK = i;
        this.mIndex = i2;
        this.f1270SO = i3;
        this.f1271SP = i4;
        this.f1272Tm = str;
        this.f1273Tn = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0920i.m1439a(this, parcel, i);
    }
}
