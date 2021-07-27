package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.query.internal.l */
public class C0900l implements Parcelable.Creator<Operator> {
    /* renamed from: a */
    static void m1391a(Operator operator, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, operator.f1211CK);
        C0723b.m763a(parcel, 1, operator.mTag, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bb */
    public Operator createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                str = C0721a.m736o(parcel, F);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new Operator(i, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cq */
    public Operator[] newArray(int i) {
        return new Operator[i];
    }
}
