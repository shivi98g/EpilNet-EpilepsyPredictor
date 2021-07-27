package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AuthorizeAccessRequest implements SafeParcelable {
    public static final Parcelable.Creator<AuthorizeAccessRequest> CREATOR = new C0784b();

    /* renamed from: CK */
    final int f916CK;

    /* renamed from: Oj */
    final DriveId f917Oj;

    /* renamed from: Pn */
    final long f918Pn;

    AuthorizeAccessRequest(int i, long j, DriveId driveId) {
        this.f916CK = i;
        this.f918Pn = j;
        this.f917Oj = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0784b.m1047a(this, parcel, i);
    }
}
