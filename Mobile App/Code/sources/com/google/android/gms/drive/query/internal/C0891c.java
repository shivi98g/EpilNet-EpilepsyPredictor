package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.query.internal.c */
public class C0891c implements Parcelable.Creator<FieldWithSortOrder> {
    /* renamed from: a */
    static void m1362a(FieldWithSortOrder fieldWithSortOrder, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, fieldWithSortOrder.f1177CK);
        C0723b.m763a(parcel, 1, fieldWithSortOrder.f1178QY, false);
        C0723b.m766a(parcel, 2, fieldWithSortOrder.f1179Sk);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aU */
    public FieldWithSortOrder createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        z = C0721a.m724c(parcel, F);
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
            return new FieldWithSortOrder(i, str, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cj */
    public FieldWithSortOrder[] newArray(int i) {
        return new FieldWithSortOrder[i];
    }
}
