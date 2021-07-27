package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.px */
public class C2115px implements Parcelable.Creator<C2114pw> {
    /* renamed from: a */
    static void m6214a(C2114pw pwVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, pwVar.getVersionCode());
        C0723b.m768a(parcel, 2, pwVar.avX, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dX */
    public C2114pw createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    iArr = C0721a.m742u(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2114pw(i, iArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ge */
    public C2114pw[] newArray(int i) {
        return new C2114pw[i];
    }
}
