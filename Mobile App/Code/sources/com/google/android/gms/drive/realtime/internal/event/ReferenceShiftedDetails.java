package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ReferenceShiftedDetails implements SafeParcelable {
    public static final Parcelable.Creator<ReferenceShiftedDetails> CREATOR = new C0915d();

    /* renamed from: CK */
    final int f1253CK;

    /* renamed from: Te */
    final String f1254Te;

    /* renamed from: Tf */
    final String f1255Tf;

    /* renamed from: Tg */
    final int f1256Tg;

    /* renamed from: Th */
    final int f1257Th;

    ReferenceShiftedDetails(int i, String str, String str2, int i2, int i3) {
        this.f1253CK = i;
        this.f1254Te = str;
        this.f1255Tf = str2;
        this.f1256Tg = i2;
        this.f1257Th = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0915d.m1424a(this, parcel, i);
    }
}
