package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.kn */
public class C1810kn implements Parcelable.Creator<C1809km> {
    /* renamed from: a */
    static void m5411a(C1809km kmVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, kmVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) kmVar.mo15975hF(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: J */
    public C1809km createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        C1811ko koVar = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    koVar = (C1811ko) C0721a.m716a(parcel, F, C1811ko.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1809km(i, koVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aK */
    public C1809km[] newArray(int i) {
        return new C1809km[i];
    }
}
