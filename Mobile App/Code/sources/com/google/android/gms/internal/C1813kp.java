package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1811ko;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.kp */
public class C1813kp implements Parcelable.Creator<C1811ko> {
    /* renamed from: a */
    static void m5420a(C1811ko koVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, koVar.getVersionCode());
        C0723b.m776c(parcel, 2, koVar.mo15987hH(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: K */
    public C1811ko createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m723c(parcel, F, C1811ko.C1812a.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1811ko(i, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aL */
    public C1811ko[] newArray(int i) {
        return new C1811ko[i];
    }
}
