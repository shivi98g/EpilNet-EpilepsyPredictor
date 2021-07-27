package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.r */
public class C1003r implements Parcelable.Creator<C1002q> {
    /* renamed from: a */
    static void m1765a(C1002q qVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) qVar.getSession(), i, false);
        C0723b.m775c(parcel, 1000, qVar.f1448CK);
        C0723b.m759a(parcel, 2, (Parcelable) qVar.mo12503jH(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bD */
    public C1002q createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Session session = null;
        int i = 0;
        DataSet dataSet = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        session = (Session) C0721a.m716a(parcel, F, Session.CREATOR);
                        break;
                    case 2:
                        dataSet = (DataSet) C0721a.m716a(parcel, F, DataSet.CREATOR);
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
            return new C1002q(i, session, dataSet);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cX */
    public C1002q[] newArray(int i) {
        return new C1002q[i];
    }
}
