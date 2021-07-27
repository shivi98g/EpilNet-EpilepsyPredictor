package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.result.g */
public class C1074g implements Parcelable.Creator<SessionStopResult> {
    /* renamed from: a */
    static void m2007a(SessionStopResult sessionStopResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, sessionStopResult.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) sessionStopResult.getStatus(), i, false);
        C0723b.m776c(parcel, 3, sessionStopResult.getSessions(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cj */
    public SessionStopResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Status status = null;
        int i = 0;
        ArrayList<Session> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 2:
                        status = (Status) C0721a.m716a(parcel, F, Status.CREATOR);
                        break;
                    case 3:
                        arrayList = C0721a.m723c(parcel, F, Session.CREATOR);
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
            return new SessionStopResult(i, status, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dE */
    public SessionStopResult[] newArray(int i) {
        return new SessionStopResult[i];
    }
}
