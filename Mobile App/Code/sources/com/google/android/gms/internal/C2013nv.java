package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.nv */
public class C2013nv implements Parcelable.Creator<C2012nu> {
    /* renamed from: a */
    static void m5980a(C2012nu nuVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, nuVar.ahn, false);
        C0723b.m775c(parcel, 1000, nuVar.f4150CK);
        C0723b.m763a(parcel, 2, nuVar.mo16401nu(), false);
        C0723b.m766a(parcel, 3, nuVar.mo16402nv());
        C0723b.m776c(parcel, 4, nuVar.aht, false);
        C0723b.m774b(parcel, 6, nuVar.ahu, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cQ */
    public C2012nu createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 6) {
                arrayList3 = C0721a.m710C(parcel, F);
            } else if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, C2020oa.CREATOR);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        z = C0721a.m724c(parcel, F);
                        break;
                    case 4:
                        arrayList2 = C0721a.m723c(parcel, F, C2024oe.CREATOR);
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
            return new C2012nu(i, arrayList, str, z, arrayList2, arrayList3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eM */
    public C2012nu[] newArray(int i) {
        return new C2012nu[i];
    }
}
