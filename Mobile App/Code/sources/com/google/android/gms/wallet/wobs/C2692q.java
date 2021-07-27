package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.wobs.q */
public class C2692q implements Parcelable.Creator<C2691p> {
    /* renamed from: a */
    static void m7874a(C2691p pVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, pVar.getVersionCode());
        C0723b.m763a(parcel, 2, pVar.awT, false);
        C0723b.m763a(parcel, 3, pVar.f4521tU, false);
        C0723b.m759a(parcel, 4, (Parcelable) pVar.awX, i, false);
        C0723b.m759a(parcel, 5, (Parcelable) pVar.awY, i, false);
        C0723b.m759a(parcel, 6, (Parcelable) pVar.awZ, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ek */
    public C2691p createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        C2687l lVar = null;
        C2689n nVar = null;
        C2689n nVar2 = null;
        int i = 0;
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
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    lVar = (C2687l) C0721a.m716a(parcel, F, C2687l.CREATOR);
                    break;
                case 5:
                    nVar = (C2689n) C0721a.m716a(parcel, F, C2689n.CREATOR);
                    break;
                case 6:
                    nVar2 = (C2689n) C0721a.m716a(parcel, F, C2689n.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2691p(i, str, str2, lVar, nVar, nVar2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gt */
    public C2691p[] newArray(int i) {
        return new C2691p[i];
    }
}
