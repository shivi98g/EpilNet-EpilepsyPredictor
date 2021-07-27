package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.StorageStats;

public class OnStorageStatsResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnStorageStatsResponse> CREATOR = new C0780aw();

    /* renamed from: CK */
    final int f997CK;

    /* renamed from: QS */
    StorageStats f998QS;

    OnStorageStatsResponse(int i, StorageStats storageStats) {
        this.f997CK = i;
        this.f998QS = storageStats;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0780aw.m1035a(this, parcel, i);
    }
}
