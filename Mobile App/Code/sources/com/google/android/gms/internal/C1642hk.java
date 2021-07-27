package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.hk */
public class C1642hk implements Parcelable.Creator<C1641hj> {
    /* renamed from: a */
    static void m4804a(C1641hj hjVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, hjVar.f3633id);
        C0723b.m775c(parcel, 1000, hjVar.f3631CK);
        C0723b.m756a(parcel, 2, hjVar.f3632Db, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: M */
    public C1641hj[] newArray(int i) {
        return new C1641hj[i];
    }

    /* renamed from: o */
    public C1641hj createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        bundle = C0721a.m738q(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1641hj(i, i2, bundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
