package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnContentsResponse> CREATOR = new C0769al();

    /* renamed from: CK */
    final int f970CK;

    /* renamed from: PW */
    final Contents f971PW;

    /* renamed from: QJ */
    final boolean f972QJ;

    OnContentsResponse(int i, Contents contents, boolean z) {
        this.f970CK = i;
        this.f971PW = contents;
        this.f972QJ = z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iL */
    public Contents mo11409iL() {
        return this.f971PW;
    }

    /* renamed from: iM */
    public boolean mo11410iM() {
        return this.f972QJ;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0769al.m1002a(this, parcel, i);
    }
}
