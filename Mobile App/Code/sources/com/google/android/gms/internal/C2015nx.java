package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.nx */
public class C2015nx implements Parcelable.Creator<C2014nw> {
    /* renamed from: a */
    static void m5984a(C2014nw nwVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, nwVar.f4151CK);
        C0723b.m763a(parcel, 2, nwVar.mo16414nw(), false);
        C0723b.m763a(parcel, 3, nwVar.getTag(), false);
        C0723b.m763a(parcel, 4, nwVar.getSource(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cR */
    public C2014nw createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
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
                    str3 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2014nw(i, str, str2, str3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eN */
    public C2014nw[] newArray(int i) {
        return new C2014nw[i];
    }
}
