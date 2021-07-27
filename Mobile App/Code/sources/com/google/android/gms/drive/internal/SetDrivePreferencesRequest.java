package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

public class SetDrivePreferencesRequest implements SafeParcelable {
    public static final Parcelable.Creator<SetDrivePreferencesRequest> CREATOR = new C0788bd();

    /* renamed from: CK */
    final int f1014CK;

    /* renamed from: QN */
    final DrivePreferences f1015QN;

    SetDrivePreferencesRequest(int i, DrivePreferences drivePreferences) {
        this.f1014CK = i;
        this.f1015QN = drivePreferences;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0788bd.m1059a(this, parcel, i);
    }
}
