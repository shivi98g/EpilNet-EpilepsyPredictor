package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetDriveIdFromUniqueIdentifierRequest implements SafeParcelable {
    public static final Parcelable.Creator<GetDriveIdFromUniqueIdentifierRequest> CREATOR = new C0752ac();

    /* renamed from: CK */
    final int f960CK;

    /* renamed from: QC */
    final String f961QC;

    /* renamed from: QD */
    final boolean f962QD;

    GetDriveIdFromUniqueIdentifierRequest(int i, String str, boolean z) {
        this.f960CK = i;
        this.f961QC = str;
        this.f962QD = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0752ac.m880a(this, parcel, i);
    }
}
