package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.C0746i;

public class OnListParentsResponse extends C0746i implements SafeParcelable {
    public static final Parcelable.Creator<OnListParentsResponse> CREATOR = new C0776as();

    /* renamed from: CK */
    final int f989CK;

    /* renamed from: QR */
    final DataHolder f990QR;

    OnListParentsResponse(int i, DataHolder dataHolder) {
        this.f989CK = i;
        this.f990QR = dataHolder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo11369I(Parcel parcel, int i) {
        C0776as.m1023a(this, parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iT */
    public DataHolder mo11431iT() {
        return this.f990QR;
    }
}
