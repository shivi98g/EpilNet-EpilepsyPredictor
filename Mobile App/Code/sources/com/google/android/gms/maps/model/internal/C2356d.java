package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.internal.d */
public class C2356d implements Parcelable.Creator<C2355c> {
    /* renamed from: a */
    static void m6849a(C2355c cVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, cVar.getVersionCode());
        C0723b.m775c(parcel, 2, cVar.getType());
        C0723b.m756a(parcel, 3, cVar.mo18160oi(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dq */
    public C2355c createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Bundle bundle = null;
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
                    bundle = C0721a.m738q(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2355c(i, i2, bundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fm */
    public C2355c[] newArray(int i) {
        return new C2355c[i];
    }
}
