package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.request.ae */
public class C1022ae implements Parcelable.Creator<C1021ad> {
    /* renamed from: a */
    static void m1864a(C1021ad adVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m757a(parcel, 1, adVar.mo12693km(), false);
        C0723b.m775c(parcel, 1000, adVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bZ */
    public C1021ad createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                iBinder = C0721a.m737p(parcel, F);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1021ad(i, iBinder);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: du */
    public C1021ad[] newArray(int i) {
        return new C1021ad[i];
    }
}
