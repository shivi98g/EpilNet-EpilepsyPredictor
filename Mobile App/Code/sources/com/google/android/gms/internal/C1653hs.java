package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.hs */
public class C1653hs implements Parcelable.Creator<C1652hr> {
    /* renamed from: a */
    static void m4833a(C1652hr hrVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) hrVar.f3658Dw, i, false);
        C0723b.m775c(parcel, 1000, hrVar.f3657CK);
        C0723b.m755a(parcel, 2, hrVar.f3659Dx);
        C0723b.m775c(parcel, 3, hrVar.f3660Dy);
        C0723b.m763a(parcel, 4, hrVar.f3662pc, false);
        C0723b.m759a(parcel, 5, (Parcelable) hrVar.f3661Dz, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: S */
    public C1652hr[] newArray(int i) {
        return new C1652hr[i];
    }

    /* renamed from: s */
    public C1652hr createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        C1637hf hfVar = null;
        String str = null;
        C1634hd hdVar = null;
        long j = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        hfVar = (C1637hf) C0721a.m716a(parcel, F, C1637hf.CREATOR);
                        break;
                    case 2:
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 3:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 4:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 5:
                        hdVar = (C1634hd) C0721a.m716a(parcel, F, C1634hd.CREATOR);
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
            return new C1652hr(i, hfVar, j, i2, str, hdVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
