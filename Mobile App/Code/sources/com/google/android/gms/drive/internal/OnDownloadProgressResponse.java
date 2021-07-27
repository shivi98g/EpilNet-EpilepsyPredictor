package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDownloadProgressResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnDownloadProgressResponse> CREATOR = new C0771an();

    /* renamed from: CK */
    final int f975CK;

    /* renamed from: QL */
    final long f976QL;

    /* renamed from: QM */
    final long f977QM;

    OnDownloadProgressResponse(int i, long j, long j2) {
        this.f975CK = i;
        this.f976QL = j;
        this.f977QM = j2;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iO */
    public long mo11416iO() {
        return this.f976QL;
    }

    /* renamed from: iP */
    public long mo11417iP() {
        return this.f977QM;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0771an.m1008a(this, parcel, i);
    }
}
