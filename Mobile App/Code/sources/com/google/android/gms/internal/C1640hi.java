package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.hi */
public class C1640hi implements Parcelable.Creator<C1639hh> {
    /* renamed from: a */
    static void m4801a(C1639hh hhVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, hhVar.f3627CX, false);
        C0723b.m775c(parcel, 1000, hhVar.f3626CK);
        C0723b.m759a(parcel, 3, (Parcelable) hhVar.f3628CY, i, false);
        C0723b.m775c(parcel, 4, hhVar.f3629CZ);
        C0723b.m767a(parcel, 5, hhVar.f3630Da, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: L */
    public C1639hh[] newArray(int i) {
        return new C1639hh[i];
    }

    /* renamed from: n */
    public C1639hh createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        C1649hp hpVar = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                str = C0721a.m736o(parcel, F);
            } else if (aH != 1000) {
                switch (aH) {
                    case 3:
                        hpVar = (C1649hp) C0721a.m716a(parcel, F, C1649hp.CREATOR);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 5:
                        bArr = C0721a.m739r(parcel, F);
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
            return new C1639hh(i, str, hpVar, i2, bArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
