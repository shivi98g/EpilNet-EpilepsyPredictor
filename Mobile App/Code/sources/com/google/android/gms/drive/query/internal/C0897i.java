package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.drive.query.internal.i */
public class C0897i implements Parcelable.Creator<LogicalFilter> {
    /* renamed from: a */
    static void m1382a(LogicalFilter logicalFilter, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, logicalFilter.f1195CK);
        C0723b.m759a(parcel, 1, (Parcelable) logicalFilter.f1197Sh, i, false);
        C0723b.m776c(parcel, 2, logicalFilter.f1198Su, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aY */
    public LogicalFilter createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Operator operator = null;
        int i = 0;
        ArrayList<FilterHolder> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        operator = (Operator) C0721a.m716a(parcel, F, Operator.CREATOR);
                        break;
                    case 2:
                        arrayList = C0721a.m723c(parcel, F, FilterHolder.CREATOR);
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
            return new LogicalFilter(i, operator, (List<FilterHolder>) arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cn */
    public LogicalFilter[] newArray(int i) {
        return new LogicalFilter[i];
    }
}
