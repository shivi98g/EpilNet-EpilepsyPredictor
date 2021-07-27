package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.pz */
public class C2117pz implements Parcelable.Creator<C2116py> {
    /* renamed from: a */
    static void m6217a(C2116py pyVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, pyVar.getVersionCode());
        C0723b.m770a(parcel, 2, pyVar.avY, false);
        C0723b.m771a(parcel, 3, pyVar.avZ, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dY */
    public C2116py createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String[] strArr = null;
        byte[][] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    strArr = C0721a.m708A(parcel, F);
                    break;
                case 3:
                    bArr = C0721a.m740s(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2116py(i, strArr, bArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gf */
    public C2116py[] newArray(int i) {
        return new C2116py[i];
    }
}
