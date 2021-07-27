package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesAddedDetails implements SafeParcelable {
    public static final Parcelable.Creator<ValuesAddedDetails> CREATOR = new C0919h();

    /* renamed from: CK */
    final int f1264CK;

    /* renamed from: SO */
    final int f1265SO;

    /* renamed from: SP */
    final int f1266SP;

    /* renamed from: Tk */
    final String f1267Tk;

    /* renamed from: Tl */
    final int f1268Tl;
    final int mIndex;

    ValuesAddedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.f1264CK = i;
        this.mIndex = i2;
        this.f1265SO = i3;
        this.f1266SP = i4;
        this.f1267Tk = str;
        this.f1268Tl = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0919h.m1436a(this, parcel, i);
    }
}
