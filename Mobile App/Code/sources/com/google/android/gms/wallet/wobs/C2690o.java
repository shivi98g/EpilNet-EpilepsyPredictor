package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.wobs.o */
public class C2690o implements Parcelable.Creator<C2689n> {
    /* renamed from: a */
    static void m7871a(C2689n nVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, nVar.getVersionCode());
        C0723b.m763a(parcel, 2, nVar.awW, false);
        C0723b.m763a(parcel, 3, nVar.description, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ej */
    public C2689n createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2689n(i, str, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gs */
    public C2689n[] newArray(int i) {
        return new C2689n[i];
    }
}
