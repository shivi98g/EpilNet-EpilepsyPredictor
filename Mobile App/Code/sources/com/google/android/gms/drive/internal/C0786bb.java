package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.query.Query;

/* renamed from: com.google.android.gms.drive.internal.bb */
public class C0786bb implements Parcelable.Creator<QueryRequest> {
    /* renamed from: a */
    static void m1053a(QueryRequest queryRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, queryRequest.f1009CK);
        C0723b.m759a(parcel, 2, (Parcelable) queryRequest.f1010QV, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aF */
    public QueryRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Query query = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    query = (Query) C0721a.m716a(parcel, F, Query.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new QueryRequest(i, query);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bU */
    public QueryRequest[] newArray(int i) {
        return new QueryRequest[i];
    }
}
