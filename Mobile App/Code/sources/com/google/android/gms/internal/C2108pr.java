package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pr */
public class C2108pr implements Parcelable.Creator<C2089pi.C2098g> {
    /* renamed from: a */
    static void m6198a(C2089pi.C2098g gVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = gVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, gVar.f4205CK);
        }
        if (set.contains(2)) {
            C0723b.m766a(parcel, 2, gVar.apR);
        }
        if (set.contains(3)) {
            C0723b.m763a(parcel, 3, gVar.mValue, true);
        }
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dH */
    public C2089pi.C2098g createFromParcel(Parcel parcel) {
        int i;
        int G = C0721a.m714G(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i2 = C0721a.m728g(parcel, F);
                    i = 1;
                    break;
                case 2:
                    z = C0721a.m724c(parcel, F);
                    i = 2;
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    i = 3;
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == G) {
            return new C2089pi.C2098g(hashSet, i2, z, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fF */
    public C2089pi.C2098g[] newArray(int i) {
        return new C2089pi.C2098g[i];
    }
}
