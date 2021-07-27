package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.wearable.C2703c;

/* renamed from: com.google.android.gms.wearable.internal.s */
public class C2797s implements Parcelable.Creator<C2796r> {
    /* renamed from: a */
    static void m8186a(C2796r rVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, rVar.versionCode);
        C0723b.m775c(parcel, 2, rVar.statusCode);
        C0723b.m759a(parcel, 3, (Parcelable) rVar.axJ, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: es */
    public C2796r createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        C2703c cVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    cVar = (C2703c) C0721a.m716a(parcel, F, C2703c.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2796r(i, i2, cVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gB */
    public C2796r[] newArray(int i) {
        return new C2796r[i];
    }
}
