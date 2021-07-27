package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pn */
public class C2104pn implements Parcelable.Creator<C2089pi.C2091b.C2093b> {
    /* renamed from: a */
    static void m6186a(C2089pi.C2091b.C2093b bVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = bVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, bVar.f4194CK);
        }
        if (set.contains(2)) {
            C0723b.m775c(parcel, 2, bVar.f4196lj);
        }
        if (set.contains(3)) {
            C0723b.m763a(parcel, 3, bVar.f4197vf, true);
        }
        if (set.contains(4)) {
            C0723b.m775c(parcel, 4, bVar.f4195li);
        }
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dD */
    public C2089pi.C2091b.C2093b createFromParcel(Parcel parcel) {
        int i;
        int G = C0721a.m714G(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        String str = null;
        int i4 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i4 = C0721a.m728g(parcel, F);
                    i = 1;
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    i = 2;
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    i = 3;
                    break;
                case 4:
                    i3 = C0721a.m728g(parcel, F);
                    i = 4;
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == G) {
            return new C2089pi.C2091b.C2093b(hashSet, i4, i2, str, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fB */
    public C2089pi.C2091b.C2093b[] newArray(int i) {
        return new C2089pi.C2091b.C2093b[i];
    }
}
