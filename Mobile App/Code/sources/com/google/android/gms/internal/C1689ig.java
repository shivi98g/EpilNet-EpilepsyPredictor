package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.ig */
public class C1689ig implements Parcelable.Creator<C1688if> {
    /* renamed from: a */
    static void m4951a(C1688if ifVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, ifVar.responseCode);
        C0723b.m775c(parcel, 1000, ifVar.versionCode);
        C0723b.m756a(parcel, 2, ifVar.f3700Ep, false);
        C0723b.m767a(parcel, 3, ifVar.f3701Eq, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: U */
    public C1688if[] newArray(int i) {
        return new C1688if[i];
    }

    /* renamed from: t */
    public C1688if createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Bundle bundle = null;
        byte[] bArr = null;
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
                    case 3:
                        bArr = C0721a.m739r(parcel, F);
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
            return new C1688if(i, i2, bundle, bArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
