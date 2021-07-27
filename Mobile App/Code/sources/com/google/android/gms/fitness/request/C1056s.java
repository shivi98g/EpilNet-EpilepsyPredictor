package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.s */
public class C1056s implements Parcelable.Creator<SessionInsertRequest> {
    /* renamed from: a */
    static void m1939a(SessionInsertRequest sessionInsertRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) sessionInsertRequest.getSession(), i, false);
        C0723b.m775c(parcel, 1000, sessionInsertRequest.getVersionCode());
        C0723b.m776c(parcel, 2, sessionInsertRequest.getDataSets(), false);
        C0723b.m776c(parcel, 3, sessionInsertRequest.getAggregateDataPoints(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bS */
    public SessionInsertRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Session session = null;
        int i = 0;
        ArrayList<DataSet> arrayList = null;
        ArrayList<DataPoint> arrayList2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        session = (Session) C0721a.m716a(parcel, F, Session.CREATOR);
                        break;
                    case 2:
                        arrayList = C0721a.m723c(parcel, F, DataSet.CREATOR);
                        break;
                    case 3:
                        arrayList2 = C0721a.m723c(parcel, F, DataPoint.CREATOR);
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
            return new SessionInsertRequest(i, session, arrayList, arrayList2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dn */
    public SessionInsertRequest[] newArray(int i) {
        return new SessionInsertRequest[i];
    }
}
