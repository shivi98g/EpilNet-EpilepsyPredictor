package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.hg */
public class C1638hg implements Parcelable.Creator<C1637hf> {
    /* renamed from: a */
    static void m4797a(C1637hf hfVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, hfVar.f3621CS, false);
        C0723b.m775c(parcel, 1000, hfVar.f3620CK);
        C0723b.m763a(parcel, 2, hfVar.f3622CT, false);
        C0723b.m763a(parcel, 3, hfVar.f3623CU, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: K */
    public C1637hf[] newArray(int i) {
        return new C1637hf[i];
    }

    /* renamed from: m */
    public C1637hf createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        str3 = C0721a.m736o(parcel, F);
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
            return new C1637hf(i, str, str2, str3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
