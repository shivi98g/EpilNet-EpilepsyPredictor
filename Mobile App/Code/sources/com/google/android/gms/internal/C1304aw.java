package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.aw */
public class C1304aw implements Parcelable.Creator<C1303av> {
    /* renamed from: a */
    static void m3943a(C1303av avVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, avVar.versionCode);
        C0723b.m755a(parcel, 2, avVar.f2385od);
        C0723b.m756a(parcel, 3, avVar.extras, false);
        C0723b.m775c(parcel, 4, avVar.f2386oe);
        C0723b.m774b(parcel, 5, avVar.f2387of, false);
        C0723b.m766a(parcel, 6, avVar.f2388og);
        C0723b.m775c(parcel, 7, avVar.f2389oh);
        C0723b.m766a(parcel, 8, avVar.f2390oi);
        C0723b.m763a(parcel, 9, avVar.f2391oj, false);
        C0723b.m759a(parcel, 10, (Parcelable) avVar.f2392ok, i, false);
        C0723b.m759a(parcel, 11, (Parcelable) avVar.f2393ol, i, false);
        C0723b.m763a(parcel, 12, avVar.f2394om, false);
        C0723b.m756a(parcel, 13, avVar.f2395on, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: b */
    public C1303av createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        C1327bj bjVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        long j = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    j = C0721a.m730i(parcel2, F);
                    break;
                case 3:
                    bundle = C0721a.m738q(parcel2, F);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 5:
                    arrayList = C0721a.m710C(parcel2, F);
                    break;
                case 6:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 7:
                    i3 = C0721a.m728g(parcel2, F);
                    break;
                case 8:
                    z2 = C0721a.m724c(parcel2, F);
                    break;
                case 9:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 10:
                    bjVar = (C1327bj) C0721a.m716a(parcel2, F, C1327bj.CREATOR);
                    break;
                case 11:
                    location = (Location) C0721a.m716a(parcel2, F, Location.CREATOR);
                    break;
                case 12:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 13:
                    bundle2 = C0721a.m738q(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1303av(i, j, bundle, i2, arrayList, z, i3, z2, str, bjVar, location, str2, bundle2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: f */
    public C1303av[] newArray(int i) {
        return new C1303av[i];
    }
}
