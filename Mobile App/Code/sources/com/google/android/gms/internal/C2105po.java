package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.po */
public class C2105po implements Parcelable.Creator<C2089pi.C2094c> {
    /* renamed from: a */
    static void m6189a(C2089pi.C2094c cVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = cVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, cVar.f4198CK);
        }
        if (set.contains(2)) {
            C0723b.m763a(parcel, 2, cVar.f4199vf, true);
        }
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dE */
    public C2089pi.C2094c createFromParcel(Parcel parcel) {
        int i;
        int G = C0721a.m714G(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i2 = C0721a.m728g(parcel, F);
                    i = 1;
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    i = 2;
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == G) {
            return new C2089pi.C2094c(hashSet, i2, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fC */
    public C2089pi.C2094c[] newArray(int i) {
        return new C2089pi.C2094c[i];
    }
}
