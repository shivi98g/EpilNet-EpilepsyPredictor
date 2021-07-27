package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.query.internal.d */
public class C0892d implements Parcelable.Creator<FilterHolder> {
    /* renamed from: a */
    static void m1365a(FilterHolder filterHolder, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) filterHolder.f1181Sl, i, false);
        C0723b.m775c(parcel, 1000, filterHolder.f1180CK);
        C0723b.m759a(parcel, 2, (Parcelable) filterHolder.f1182Sm, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) filterHolder.f1183Sn, i, false);
        C0723b.m759a(parcel, 4, (Parcelable) filterHolder.f1184So, i, false);
        C0723b.m759a(parcel, 5, (Parcelable) filterHolder.f1185Sp, i, false);
        C0723b.m759a(parcel, 6, (Parcelable) filterHolder.f1186Sq, i, false);
        C0723b.m759a(parcel, 7, (Parcelable) filterHolder.f1187Sr, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aV */
    public FilterHolder createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ComparisonFilter comparisonFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        LogicalFilter logicalFilter = null;
        NotFilter notFilter = null;
        InFilter inFilter = null;
        MatchAllFilter matchAllFilter = null;
        HasFilter hasFilter = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        comparisonFilter = (ComparisonFilter) C0721a.m716a(parcel, F, ComparisonFilter.CREATOR);
                        break;
                    case 2:
                        fieldOnlyFilter = (FieldOnlyFilter) C0721a.m716a(parcel, F, FieldOnlyFilter.CREATOR);
                        break;
                    case 3:
                        logicalFilter = (LogicalFilter) C0721a.m716a(parcel, F, LogicalFilter.CREATOR);
                        break;
                    case 4:
                        notFilter = (NotFilter) C0721a.m716a(parcel, F, NotFilter.CREATOR);
                        break;
                    case 5:
                        inFilter = (InFilter) C0721a.m716a(parcel, F, InFilter.CREATOR);
                        break;
                    case 6:
                        matchAllFilter = (MatchAllFilter) C0721a.m716a(parcel, F, MatchAllFilter.CREATOR);
                        break;
                    case 7:
                        hasFilter = (HasFilter) C0721a.m716a(parcel, F, HasFilter.CREATOR);
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
            return new FilterHolder(i, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter, hasFilter);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ck */
    public FilterHolder[] newArray(int i) {
        return new FilterHolder[i];
    }
}
