package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.internal.f */
public class C2358f implements Parcelable.Creator<C2357e> {
    /* renamed from: a */
    static void m6853a(C2357e eVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, eVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) eVar.mo18168oj(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dr */
    public C2357e createFromParcel(Parcel parcel) {
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
            return new C2357e(i, aVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fn */
    public C2357e[] newArray(int i) {
        return new C2357e[i];
    }
}
