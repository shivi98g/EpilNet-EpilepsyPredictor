package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.ot */
public class C2056ot implements Parcelable.Creator<C2052or> {
    /* renamed from: a */
    static void m6063a(C2052or orVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, orVar.versionCode);
        C0723b.m755a(parcel, 2, orVar.amW);
        C0723b.m763a(parcel, 3, orVar.tag, false);
        C0723b.m767a(parcel, 4, orVar.amX, false);
        C0723b.m756a(parcel, 5, orVar.amY, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dt */
    public C2052or createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    j = C0721a.m730i(parcel, F);
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    bArr = C0721a.m739r(parcel, F);
                    break;
                case 5:
                    bundle = C0721a.m738q(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2052or(i, j, str, bArr, bundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fq */
    public C2052or[] newArray(int i) {
        return new C2052or[i];
    }
}
