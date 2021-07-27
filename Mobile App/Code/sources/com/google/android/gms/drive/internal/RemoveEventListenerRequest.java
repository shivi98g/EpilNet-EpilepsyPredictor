package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemoveEventListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator<RemoveEventListenerRequest> CREATOR = new C0787bc();

    /* renamed from: CK */
    final int f1011CK;

    /* renamed from: Oj */
    final DriveId f1012Oj;

    /* renamed from: Pm */
    final int f1013Pm;

    RemoveEventListenerRequest(int i, DriveId driveId, int i2) {
        this.f1011CK = i;
        this.f1012Oj = driveId;
        this.f1013Pm = i2;
    }

    public RemoveEventListenerRequest(DriveId driveId, int i) {
        this(1, driveId, i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0787bc.m1056a(this, parcel, i);
    }
}
