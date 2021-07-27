package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.query.a */
public class C0886a implements Parcelable.Creator<Query> {
    /* renamed from: a */
    static void m1329a(Query query, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, query.f1154CK);
        C0723b.m759a(parcel, 1, (Parcelable) query.f1155RY, i, false);
        C0723b.m763a(parcel, 3, query.f1156RZ, false);
        C0723b.m759a(parcel, 4, (Parcelable) query.f1157Sa, i, false);
        C0723b.m774b(parcel, 5, query.f1158Sb, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aQ */
    public Query createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        LogicalFilter logicalFilter = null;
        String str = null;
        SortOrder sortOrder = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                logicalFilter = (LogicalFilter) C0721a.m716a(parcel, F, LogicalFilter.CREATOR);
            } else if (aH != 1000) {
                switch (aH) {
                    case 3:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 4:
                        sortOrder = (SortOrder) C0721a.m716a(parcel, F, SortOrder.CREATOR);
                        break;
                    case 5:
                        arrayList = C0721a.m710C(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new Query(i, logicalFilter, str, sortOrder, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cf */
    public Query[] newArray(int i) {
        return new Query[i];
    }
}
