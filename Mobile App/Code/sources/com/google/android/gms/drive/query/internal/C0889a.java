package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.query.internal.a */
public class C0889a implements Parcelable.Creator<ComparisonFilter> {
    /* renamed from: a */
    static void m1356a(ComparisonFilter comparisonFilter, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, comparisonFilter.f1170CK);
        C0723b.m759a(parcel, 1, (Parcelable) comparisonFilter.f1171Sh, i, false);
        C0723b.m759a(parcel, 2, (Parcelable) comparisonFilter.f1172Si, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aS */
    public ComparisonFilter createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Operator operator = null;
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        operator = (Operator) C0721a.m716a(parcel, F, Operator.CREATOR);
                        break;
                    case 2:
                        metadataBundle = (MetadataBundle) C0721a.m716a(parcel, F, MetadataBundle.CREATOR);
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
            return new ComparisonFilter(i, operator, metadataBundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ch */
    public ComparisonFilter[] newArray(int i) {
        return new ComparisonFilter[i];
    }
}
