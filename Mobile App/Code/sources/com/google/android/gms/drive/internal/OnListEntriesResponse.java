package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.C0746i;

public class OnListEntriesResponse extends C0746i implements SafeParcelable {
    public static final Parcelable.Creator<OnListEntriesResponse> CREATOR = new C0775ar();

    /* renamed from: CK */
    final int f986CK;

    /* renamed from: PJ */
    final boolean f987PJ;

    /* renamed from: QQ */
    final DataHolder f988QQ;

    OnListEntriesResponse(int i, DataHolder dataHolder, boolean z) {
        this.f986CK = i;
        this.f988QQ = dataHolder;
        this.f987PJ = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo11369I(Parcel parcel, int i) {
        C0775ar.m1020a(this, parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iR */
    public DataHolder mo11428iR() {
        return this.f988QQ;
    }

    /* renamed from: iS */
    public boolean mo11429iS() {
        return this.f987PJ;
    }
}
