package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1811ko;

/* renamed from: com.google.android.gms.internal.kq */
public class C1814kq implements Parcelable.Creator<C1811ko.C1812a> {
    /* renamed from: a */
    static void m5423a(C1811ko.C1812a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, aVar.versionCode);
        C0723b.m763a(parcel, 2, aVar.f3977NJ, false);
        C0723b.m775c(parcel, 3, aVar.f3978NK);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: L */
    public C1811ko.C1812a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1811ko.C1812a(i, str, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aM */
    public C1811ko.C1812a[] newArray(int i) {
        return new C1811ko.C1812a[i];
    }
}
