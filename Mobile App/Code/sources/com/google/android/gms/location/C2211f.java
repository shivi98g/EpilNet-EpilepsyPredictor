package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.location.f */
public class C2211f implements Parcelable.Creator<C2210e> {
    /* renamed from: a */
    static void m6637a(C2210e eVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, eVar.agw);
        C0723b.m775c(parcel, 1000, eVar.getVersionCode());
        C0723b.m775c(parcel, 2, eVar.agx);
        C0723b.m755a(parcel, 3, eVar.agy);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cK */
    public C2210e createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        long j = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 3:
                        j = C0721a.m730i(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i3 = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2210e(i3, i, i2, j);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eE */
    public C2210e[] newArray(int i) {
        return new C2210e[i];
    }
}
