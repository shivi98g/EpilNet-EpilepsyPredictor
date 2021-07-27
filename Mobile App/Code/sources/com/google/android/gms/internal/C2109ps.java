package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ps */
public class C2109ps implements Parcelable.Creator<C2089pi.C2099h> {
    /* renamed from: a */
    static void m6201a(C2089pi.C2099h hVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = hVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, hVar.f4206CK);
        }
        if (set.contains(3)) {
            C0723b.m775c(parcel, 3, hVar.mo16865oU());
        }
        if (set.contains(4)) {
            C0723b.m763a(parcel, 4, hVar.mValue, true);
        }
        if (set.contains(5)) {
            C0723b.m763a(parcel, 5, hVar.f4208XL, true);
        }
        if (set.contains(6)) {
            C0723b.m775c(parcel, 6, hVar.f4207Gt);
        }
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dI */
    public C2089pi.C2099h createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int G = C0721a.m714G(parcel);
        HashSet hashSet = new HashSet();
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1) {
                switch (aH) {
                    case 3:
                        i5 = C0721a.m728g(parcel, F);
                        i2 = 3;
                        break;
                    case 4:
                        str2 = C0721a.m736o(parcel, F);
                        i2 = 4;
                        break;
                    case 5:
                        str = C0721a.m736o(parcel, F);
                        i2 = 5;
                        break;
                    case 6:
                        i4 = C0721a.m728g(parcel, F);
                        i2 = 6;
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        continue;
                }
                i = Integer.valueOf(i2);
            } else {
                i3 = C0721a.m728g(parcel, F);
                i = 1;
            }
            hashSet.add(i);
        }
        if (parcel.dataPosition() == G) {
            return new C2089pi.C2099h(hashSet, i3, str, i4, str2, i5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fG */
    public C2089pi.C2099h[] newArray(int i) {
        return new C2089pi.C2099h[i];
    }
}
