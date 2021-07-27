package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.kl */
public class C1808kl implements Parcelable.Creator<C1807kk> {
    /* renamed from: a */
    static void m5405a(C1807kk kkVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, kkVar.f3968CK);
        C0723b.m763a(parcel, 2, kkVar.f3969ND, false);
        C0723b.m775c(parcel, 3, kkVar.f3970NE);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: I */
    public C1807kk createFromParcel(Parcel parcel) {
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
            return new C1807kk(i, str, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aJ */
    public C1807kk[] newArray(int i) {
        return new C1807kk[i];
    }
}
