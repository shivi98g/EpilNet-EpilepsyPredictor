package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.kz */
public class C1827kz implements Parcelable.Creator<C1826ky> {
    /* renamed from: a */
    static void m5503a(C1826ky kyVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, kyVar.getVersionCode());
        C0723b.m758a(parcel, 2, kyVar.mo16064ic(), false);
        C0723b.m759a(parcel, 3, (Parcelable) kyVar.mo16065id(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: Q */
    public C1826ky createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Parcel parcel2 = null;
        int i = 0;
        C1821kv kvVar = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    parcel2 = C0721a.m711D(parcel, F);
                    break;
                case 3:
                    kvVar = (C1821kv) C0721a.m716a(parcel, F, C1821kv.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1826ky(i, parcel2, kvVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aR */
    public C1826ky[] newArray(int i) {
        return new C1826ky[i];
    }
}
