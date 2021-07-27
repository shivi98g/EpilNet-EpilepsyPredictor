package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.nt */
public class C2011nt implements Parcelable.Creator<C2010ns> {
    /* renamed from: a */
    static void m5974a(C2010ns nsVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, nsVar.mo16389np());
        C0723b.m775c(parcel, 1000, nsVar.getVersionCode());
        C0723b.m775c(parcel, 2, nsVar.mo16390ns());
        C0723b.m759a(parcel, 3, (Parcelable) nsVar.mo16391nt(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cP */
    public C2010ns createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        C2012nu nuVar = null;
        int i2 = -1;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i3 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 3:
                        nuVar = (C2012nu) C0721a.m716a(parcel, F, C2012nu.CREATOR);
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
            return new C2010ns(i, i3, i2, nuVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eL */
    public C2010ns[] newArray(int i) {
        return new C2010ns[i];
    }
}
