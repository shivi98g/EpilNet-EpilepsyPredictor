package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenFileIntentSenderRequest implements SafeParcelable {
    public static final Parcelable.Creator<OpenFileIntentSenderRequest> CREATOR = new C0785ba();

    /* renamed from: CK */
    final int f1005CK;

    /* renamed from: OH */
    final String f1006OH;

    /* renamed from: OI */
    final String[] f1007OI;

    /* renamed from: OJ */
    final DriveId f1008OJ;

    OpenFileIntentSenderRequest(int i, String str, String[] strArr, DriveId driveId) {
        this.f1005CK = i;
        this.f1006OH = str;
        this.f1007OI = strArr;
        this.f1008OJ = driveId;
    }

    public OpenFileIntentSenderRequest(String str, String[] strArr, DriveId driveId) {
        this(1, str, strArr, driveId);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0785ba.m1050a(this, parcel, i);
    }
}
