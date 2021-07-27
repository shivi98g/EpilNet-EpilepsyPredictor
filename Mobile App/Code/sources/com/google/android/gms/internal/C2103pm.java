package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pm */
public class C2103pm implements Parcelable.Creator<C2089pi.C2091b.C2092a> {
    /* renamed from: a */
    static void m6183a(C2089pi.C2091b.C2092a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = aVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, aVar.f4193CK);
        }
        if (set.contains(2)) {
            C0723b.m775c(parcel, 2, aVar.apJ);
        }
        if (set.contains(3)) {
            C0723b.m775c(parcel, 3, aVar.apK);
        }
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dC */
    public C2089pi.C2091b.C2092a createFromParcel(Parcel parcel) {
        int i;
        int G = C0721a.m714G(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i2 = C0721a.m728g(parcel, F);
                    i = 1;
                    break;
                case 2:
                    i3 = C0721a.m728g(parcel, F);
                    i = 2;
                    break;
                case 3:
                    i4 = C0721a.m728g(parcel, F);
                    i = 3;
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == G) {
            return new C2089pi.C2091b.C2092a(hashSet, i2, i3, i4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fA */
    public C2089pi.C2091b.C2092a[] newArray(int i) {
        return new C2089pi.C2091b.C2092a[i];
    }
}
