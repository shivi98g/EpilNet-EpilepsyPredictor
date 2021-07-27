package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.ne */
public class C1972ne implements Parcelable.Creator<C1971nd> {
    /* renamed from: a */
    static void m5805a(C1971nd ndVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, ndVar.uid);
        C0723b.m775c(parcel, 1000, ndVar.getVersionCode());
        C0723b.m763a(parcel, 2, ndVar.packageName, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cL */
    public C1971nd createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel, F);
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
            return new C1971nd(i, i2, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eF */
    public C1971nd[] newArray(int i) {
        return new C1971nd[i];
    }
}
