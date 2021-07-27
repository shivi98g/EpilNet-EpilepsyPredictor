package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDeviceUsagePreferenceResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnDeviceUsagePreferenceResponse> CREATOR = new C0770am();

    /* renamed from: CK */
    final int f973CK;

    /* renamed from: QK */
    final FileUploadPreferencesImpl f974QK;

    OnDeviceUsagePreferenceResponse(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.f973CK = i;
        this.f974QK = fileUploadPreferencesImpl;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iN */
    public FileUploadPreferencesImpl mo11413iN() {
        return this.f974QK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0770am.m1005a(this, parcel, i);
    }
}
