package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.of */
public class C2025of implements Parcelable.Creator<C2024oe> {
    /* renamed from: a */
    static void m6005a(C2024oe oeVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, oeVar.f4161vc, false);
        C0723b.m775c(parcel, 1000, oeVar.f4160CK);
        C0723b.m775c(parcel, 2, oeVar.ake);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cV */
    public C2024oe createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel, F);
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
            return new C2024oe(i, str, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eR */
    public C2024oe[] newArray(int i) {
        return new C2024oe[i];
    }
}
