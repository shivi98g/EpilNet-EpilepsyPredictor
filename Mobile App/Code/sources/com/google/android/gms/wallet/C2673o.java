package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.o */
public class C2673o implements Parcelable.Creator<ProxyCard> {
    /* renamed from: a */
    static void m7844a(ProxyCard proxyCard, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, proxyCard.getVersionCode());
        C0723b.m763a(parcel, 2, proxyCard.avP, false);
        C0723b.m763a(parcel, 3, proxyCard.avQ, false);
        C0723b.m775c(parcel, 4, proxyCard.avR);
        C0723b.m775c(parcel, 5, proxyCard.avS);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dW */
    public ProxyCard createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ProxyCard(i, str, str2, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gd */
    public ProxyCard[] newArray(int i) {
        return new ProxyCard[i];
    }
}
