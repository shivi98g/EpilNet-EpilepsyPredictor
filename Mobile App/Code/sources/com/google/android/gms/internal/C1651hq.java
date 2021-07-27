package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.hq */
public class C1651hq implements Parcelable.Creator<C1649hp> {
    /* renamed from: a */
    static void m4822a(C1649hp hpVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, hpVar.name, false);
        C0723b.m775c(parcel, 1000, hpVar.f3641CK);
        C0723b.m763a(parcel, 2, hpVar.f3642Dh, false);
        C0723b.m766a(parcel, 3, hpVar.f3643Di);
        C0723b.m775c(parcel, 4, hpVar.weight);
        C0723b.m766a(parcel, 5, hpVar.f3644Dj);
        C0723b.m763a(parcel, 6, hpVar.f3645Dk, false);
        C0723b.m769a(parcel, 7, (T[]) hpVar.f3646Dl, i, false);
        C0723b.m768a(parcel, 8, hpVar.f3647Dm, false);
        C0723b.m763a(parcel, 11, hpVar.f3648Dn, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: R */
    public C1649hp[] newArray(int i) {
        return new C1649hp[i];
    }

    /* renamed from: r */
    public C1649hp createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        C1641hj[] hjVarArr = null;
        int[] iArr = null;
        String str4 = null;
        int i2 = 1;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 11) {
                str4 = C0721a.m736o(parcel2, F);
            } else if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 3:
                        z = C0721a.m724c(parcel2, F);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 5:
                        z2 = C0721a.m724c(parcel2, F);
                        break;
                    case 6:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 7:
                        hjVarArr = (C1641hj[]) C0721a.m722b(parcel2, F, C1641hj.CREATOR);
                        break;
                    case 8:
                        iArr = C0721a.m742u(parcel2, F);
                        break;
                    default:
                        C0721a.m721b(parcel2, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1649hp(i, str, str2, z, i2, z2, str3, hjVarArr, iArr, str4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }
}
