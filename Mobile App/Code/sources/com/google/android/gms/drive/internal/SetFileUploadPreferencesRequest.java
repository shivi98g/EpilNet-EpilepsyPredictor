package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SetFileUploadPreferencesRequest implements SafeParcelable {
    public static final Parcelable.Creator<SetFileUploadPreferencesRequest> CREATOR = new C0789be();

    /* renamed from: CK */
    final int f1016CK;

    /* renamed from: QK */
    final FileUploadPreferencesImpl f1017QK;

    SetFileUploadPreferencesRequest(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.f1016CK = i;
        this.f1017QK = fileUploadPreferencesImpl;
    }

    public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this(1, fileUploadPreferencesImpl);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0789be.m1062a(this, parcel, i);
    }
}
