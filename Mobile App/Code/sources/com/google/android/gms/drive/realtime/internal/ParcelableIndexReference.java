package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableIndexReference implements SafeParcelable {
    public static final Parcelable.Creator<ParcelableIndexReference> CREATOR = new C0953q();

    /* renamed from: CK */
    final int f1224CK;

    /* renamed from: SM */
    final String f1225SM;

    /* renamed from: SN */
    final boolean f1226SN;
    final int mIndex;

    ParcelableIndexReference(int i, String str, int i2, boolean z) {
        this.f1224CK = i;
        this.f1225SM = str;
        this.mIndex = i2;
        this.f1226SN = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0953q.m1570a(this, parcel, i);
    }
}
