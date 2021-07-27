package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.Session;

/* renamed from: com.google.android.gms.fitness.request.x */
public class C1063x implements Parcelable.Creator<C1060w> {
    /* renamed from: a */
    static void m1954a(C1060w wVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) wVar.getSession(), i, false);
        C0723b.m775c(parcel, 1000, wVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bV */
    public C1060w createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Session session = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                session = (Session) C0721a.m716a(parcel, F, Session.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1060w(i, session);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dq */
    public C1060w[] newArray(int i) {
        return new C1060w[i];
    }
}
