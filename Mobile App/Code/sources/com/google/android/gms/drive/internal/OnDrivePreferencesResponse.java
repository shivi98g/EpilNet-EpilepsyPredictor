package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

public class OnDrivePreferencesResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnDrivePreferencesResponse> CREATOR = new C0773ap();

    /* renamed from: CK */
    final int f980CK;

    /* renamed from: QN */
    DrivePreferences f981QN;

    OnDrivePreferencesResponse(int i, DrivePreferences drivePreferences) {
        this.f980CK = i;
        this.f981QN = drivePreferences;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0773ap.m1014a(this, parcel, i);
    }
}
