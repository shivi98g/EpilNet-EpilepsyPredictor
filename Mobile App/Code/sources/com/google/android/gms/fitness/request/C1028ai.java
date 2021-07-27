package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.request.ai */
public class C1028ai implements Parcelable.Creator<C1027ah> {
    /* renamed from: a */
    static void m1876a(C1027ah ahVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, ahVar.getVersionCode());
        C0723b.m763a(parcel, 2, ahVar.getDeviceAddress(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cb */
    public C1027ah createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 2) {
                str = C0721a.m736o(parcel, F);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1027ah(i, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dw */
    public C1027ah[] newArray(int i) {
        return new C1027ah[i];
    }
}
