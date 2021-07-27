package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.wobs.m */
public class C2688m implements Parcelable.Creator<C2687l> {
    /* renamed from: a */
    static void m7868a(C2687l lVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, lVar.getVersionCode());
        C0723b.m755a(parcel, 2, lVar.awU);
        C0723b.m755a(parcel, 3, lVar.awV);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ei */
    public C2687l createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
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
                    j2 = C0721a.m730i(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2687l(i, j, j2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gr */
    public C2687l[] newArray(int i) {
        return new C2687l[i];
    }
}
