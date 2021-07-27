package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest implements SafeParcelable {
    public static final Parcelable.Creator<CloseContentsRequest> CREATOR = new C0798g();

    /* renamed from: CK */
    final int f930CK;

    /* renamed from: Pr */
    final Contents f931Pr;

    /* renamed from: Pt */
    final Boolean f932Pt;

    CloseContentsRequest(int i, Contents contents, Boolean bool) {
        this.f930CK = i;
        this.f931Pr = contents;
        this.f932Pt = bool;
    }

    public CloseContentsRequest(Contents contents, boolean z) {
        this(1, contents, Boolean.valueOf(z));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0798g.m1097a(this, parcel, i);
    }
}
