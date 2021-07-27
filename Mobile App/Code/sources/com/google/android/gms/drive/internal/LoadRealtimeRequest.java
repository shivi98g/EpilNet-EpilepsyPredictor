package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class LoadRealtimeRequest implements SafeParcelable {
    public static final Parcelable.Creator<LoadRealtimeRequest> CREATOR = new C0767aj();

    /* renamed from: CK */
    final int f967CK;

    /* renamed from: Oj */
    final DriveId f968Oj;

    /* renamed from: QF */
    final boolean f969QF;

    LoadRealtimeRequest(int i, DriveId driveId, boolean z) {
        this.f967CK = i;
        this.f968Oj = driveId;
        this.f969QF = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0767aj.m993a(this, parcel, i);
    }
}
