package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest implements SafeParcelable {
    public static final Parcelable.Creator<QueryRequest> CREATOR = new C0786bb();

    /* renamed from: CK */
    final int f1009CK;

    /* renamed from: QV */
    final Query f1010QV;

    QueryRequest(int i, Query query) {
        this.f1009CK = i;
        this.f1010QV = query;
    }

    public QueryRequest(Query query) {
        this(1, query);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0786bb.m1053a(this, parcel, i);
    }
}
