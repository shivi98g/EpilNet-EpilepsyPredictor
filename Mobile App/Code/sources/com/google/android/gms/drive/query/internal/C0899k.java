package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.query.internal.k */
public class C0899k implements Parcelable.Creator<NotFilter> {
    /* renamed from: a */
    static void m1388a(NotFilter notFilter, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, notFilter.f1200CK);
        C0723b.m759a(parcel, 1, (Parcelable) notFilter.f1201Sv, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ba */
    public NotFilter createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                filterHolder = (FilterHolder) C0721a.m716a(parcel, F, FilterHolder.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new NotFilter(i, filterHolder);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cp */
    public NotFilter[] newArray(int i) {
        return new NotFilter[i];
    }
}
