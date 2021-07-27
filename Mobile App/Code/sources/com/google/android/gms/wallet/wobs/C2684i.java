package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.wobs.i */
public class C2684i implements Parcelable.Creator<C2681f> {
    /* renamed from: a */
    static void m7862a(C2681f fVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, fVar.getVersionCode());
        C0723b.m763a(parcel, 2, fVar.label, false);
        C0723b.m759a(parcel, 3, (Parcelable) fVar.awM, i, false);
        C0723b.m763a(parcel, 4, fVar.type, false);
        C0723b.m759a(parcel, 5, (Parcelable) fVar.avm, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eg */
    public C2681f createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        C2682g gVar = null;
        String str2 = null;
        C2687l lVar = null;
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
                    gVar = (C2682g) C0721a.m716a(parcel, F, C2682g.CREATOR);
                    break;
                case 4:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 5:
                    lVar = (C2687l) C0721a.m716a(parcel, F, C2687l.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2681f(i, str, gVar, str2, lVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gp */
    public C2681f[] newArray(int i) {
        return new C2681f[i];
    }
}
