package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.ik */
public class C1695ik implements Parcelable.Creator<C1694ij> {
    /* renamed from: a */
    static void m4961a(C1694ij ijVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, ijVar.getVersionCode());
        C0723b.m763a(parcel, 2, ijVar.mo15633fT(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ac */
    public C1694ij[] newArray(int i) {
        return new C1694ij[i];
    }

    /* renamed from: x */
    public C1694ij createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1694ij(i, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
