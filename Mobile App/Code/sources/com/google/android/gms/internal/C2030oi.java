package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.oi */
public class C2030oi implements Parcelable.Creator<C2029oh> {
    /* renamed from: a */
    static void m6015a(C2029oh ohVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, ohVar.akg, false);
        C0723b.m775c(parcel, 1000, ohVar.versionCode);
        C0723b.m763a(parcel, 2, ohVar.akh, false);
        C0723b.m763a(parcel, 3, ohVar.aki, false);
        C0723b.m763a(parcel, 4, ohVar.akj, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cW */
    public C2029oh createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    case 4:
                        str4 = C0721a.m736o(parcel, F);
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
            return new C2029oh(i, str, str2, str3, str4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eS */
    public C2029oh[] newArray(int i) {
        return new C2029oh[i];
    }
}
