package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StorageStats implements SafeParcelable {
    public static final Parcelable.Creator<StorageStats> CREATOR = new C0744g();

    /* renamed from: CK */
    final int f877CK;

    /* renamed from: OM */
    final long f878OM;

    /* renamed from: ON */
    final long f879ON;

    /* renamed from: OO */
    final long f880OO;

    /* renamed from: OP */
    final long f881OP;

    /* renamed from: OQ */
    final int f882OQ;

    StorageStats(int i, long j, long j2, long j3, long j4, int i2) {
        this.f877CK = i;
        this.f878OM = j;
        this.f879ON = j2;
        this.f880OO = j3;
        this.f881OP = j4;
        this.f882OQ = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0744g.m846a(this, parcel, i);
    }
}
