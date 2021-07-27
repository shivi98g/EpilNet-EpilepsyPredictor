package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.nr */
public class C2009nr implements Parcelable.Creator<C2008nq> {
    /* renamed from: a */
    static void m5968a(C2008nq nqVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m766a(parcel, 1, nqVar.mo16379nr());
        C0723b.m775c(parcel, 1000, nqVar.f4148CK);
        C0723b.m776c(parcel, 2, nqVar.ahn, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cO */
    public C2008nq createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        z = C0721a.m724c(parcel, F);
                        break;
                    case 2:
                        arrayList = C0721a.m723c(parcel, F, C2020oa.CREATOR);
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
            return new C2008nq(i, z, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eK */
    public C2008nq[] newArray(int i) {
        return new C2008nq[i];
    }
}
