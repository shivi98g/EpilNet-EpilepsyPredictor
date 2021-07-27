package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest implements SafeParcelable {
    public static final Parcelable.Creator<CancelPendingActionsRequest> CREATOR = new C0795d();

    /* renamed from: CK */
    final int f919CK;

    /* renamed from: Pb */
    final List<String> f920Pb;

    CancelPendingActionsRequest(int i, List<String> list) {
        this.f919CK = i;
        this.f920Pb = list;
    }

    public CancelPendingActionsRequest(List<String> list) {
        this(1, list);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0795d.m1088a(this, parcel, i);
    }
}
