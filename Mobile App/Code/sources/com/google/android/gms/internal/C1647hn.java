package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1643hl;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.hn */
public class C1647hn implements Parcelable.Creator<C1643hl.C1645b> {
    /* renamed from: a */
    static void m4810a(C1643hl.C1645b bVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, bVar.f3636CK);
        C0723b.m759a(parcel, 1, (Parcelable) bVar.f3637Dd, i, false);
        C0723b.m776c(parcel, 2, bVar.f3638De, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: O */
    public C1643hl.C1645b[] newArray(int i) {
        return new C1643hl.C1645b[i];
    }

    /* renamed from: q */
    public C1643hl.C1645b createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Status status = null;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        status = (Status) C0721a.m716a(parcel, F, Status.CREATOR);
                        break;
                    case 2:
                        arrayList = C0721a.m723c(parcel, F, C1652hr.CREATOR);
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
            return new C1643hl.C1645b(i, status, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
