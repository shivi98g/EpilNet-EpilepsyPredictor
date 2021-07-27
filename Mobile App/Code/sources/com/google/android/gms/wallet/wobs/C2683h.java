package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.wobs.h */
public class C2683h implements Parcelable.Creator<C2682g> {
    /* renamed from: a */
    static void m7859a(C2682g gVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, gVar.getVersionCode());
        C0723b.m775c(parcel, 2, gVar.awN);
        C0723b.m763a(parcel, 3, gVar.awO, false);
        C0723b.m753a(parcel, 4, gVar.awP);
        C0723b.m763a(parcel, 5, gVar.awQ, false);
        C0723b.m755a(parcel, 6, gVar.awR);
        C0723b.m775c(parcel, 7, gVar.awS);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ef */
    public C2682g createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        double d = 0.0d;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 3:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 4:
                    d = C0721a.m734m(parcel2, F);
                    break;
                case 5:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 6:
                    j = C0721a.m730i(parcel2, F);
                    break;
                case 7:
                    i3 = C0721a.m728g(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2682g(i, i2, str, d, str2, j, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: go */
    public C2682g[] newArray(int i) {
        return new C2682g[i];
    }
}
