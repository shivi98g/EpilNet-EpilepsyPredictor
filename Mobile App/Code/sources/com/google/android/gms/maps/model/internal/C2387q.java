package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.internal.q */
public class C2387q implements Parcelable.Creator<C2386p> {
    /* renamed from: a */
    static void m6904a(C2386p pVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, pVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) pVar.mo18311ol(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ds */
    public C2386p createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        C2353a aVar = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    aVar = (C2353a) C0721a.m716a(parcel, F, C2353a.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2386p(i, aVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fp */
    public C2386p[] newArray(int i) {
        return new C2386p[i];
    }
}
