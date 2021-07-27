package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1829la;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.wobs.e */
public class C2680e implements Parcelable.Creator<C2679d> {
    /* renamed from: a */
    static void m7856a(C2679d dVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, dVar.getVersionCode());
        C0723b.m763a(parcel, 2, dVar.awJ, false);
        C0723b.m763a(parcel, 3, dVar.awK, false);
        C0723b.m776c(parcel, 4, dVar.awL, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ee */
    public C2679d createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        ArrayList<C2677b> ie = C1829la.m5517ie();
        String str2 = null;
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
                    ie = C0721a.m723c(parcel, F, C2677b.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2679d(i, str, str2, ie);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gn */
    public C2679d[] newArray(int i) {
        return new C2679d[i];
    }
}
