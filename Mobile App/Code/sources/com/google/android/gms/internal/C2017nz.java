package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.nz */
public class C2017nz implements Parcelable.Creator<C2016ny> {
    /* renamed from: a */
    static void m5988a(C2016ny nyVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, nyVar.f4152CK);
        C0723b.m759a(parcel, 2, (Parcelable) nyVar.mo16426nt(), i, false);
        C0723b.m755a(parcel, 3, nyVar.getInterval());
        C0723b.m775c(parcel, 4, nyVar.getPriority());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cS */
    public C2016ny createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        long j = C2016ny.ahz;
        int i = 0;
        C2012nu nuVar = null;
        int i2 = 102;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 2:
                        nuVar = (C2012nu) C0721a.m716a(parcel, F, C2012nu.CREATOR);
                        break;
                    case 3:
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel, F);
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
            return new C2016ny(i, nuVar, j, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eO */
    public C2016ny[] newArray(int i) {
        return new C2016ny[i];
    }
}
