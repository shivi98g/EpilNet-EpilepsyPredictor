package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnLoadRealtimeResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnLoadRealtimeResponse> CREATOR = new C0778au();

    /* renamed from: CK */
    final int f991CK;

    /* renamed from: wg */
    final boolean f992wg;

    OnLoadRealtimeResponse(int i, boolean z) {
        this.f991CK = i;
        this.f992wg = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0778au.m1029a(this, parcel, i);
    }
}
