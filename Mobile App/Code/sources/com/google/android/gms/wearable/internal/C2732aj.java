package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.aj */
public class C2732aj implements Parcelable.Creator<C2731ai> {
    /* renamed from: a */
    static void m8045a(C2731ai aiVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, aiVar.f4543CK);
        C0723b.m775c(parcel, 2, aiVar.getRequestId());
        C0723b.m763a(parcel, 3, aiVar.getPath(), false);
        C0723b.m767a(parcel, 4, aiVar.getData(), false);
        C0723b.m763a(parcel, 5, aiVar.getSourceNodeId(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ey */
    public C2731ai createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
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
                    str = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    bArr = C0721a.m739r(parcel, F);
                    break;
                case 5:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2731ai(i, i2, str, bArr, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gH */
    public C2731ai[] newArray(int i) {
        return new C2731ai[i];
    }
}
