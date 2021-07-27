package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.C1002q;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.result.f */
public class C1073f implements Parcelable.Creator<SessionReadResult> {
    /* renamed from: a */
    static void m2004a(SessionReadResult sessionReadResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, sessionReadResult.getSessions(), false);
        C0723b.m775c(parcel, 1000, sessionReadResult.getVersionCode());
        C0723b.m776c(parcel, 2, sessionReadResult.mo12928kv(), false);
        C0723b.m759a(parcel, 3, (Parcelable) sessionReadResult.getStatus(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ci */
    public SessionReadResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList<Session> arrayList = null;
        int i = 0;
        ArrayList<C1002q> arrayList2 = null;
        Status status = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, Session.CREATOR);
                        break;
                    case 2:
                        arrayList2 = C0721a.m723c(parcel, F, C1002q.CREATOR);
                        break;
                    case 3:
                        status = (Status) C0721a.m716a(parcel, F, Status.CREATOR);
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
            return new SessionReadResult(i, arrayList, arrayList2, status);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dD */
    public SessionReadResult[] newArray(int i) {
        return new SessionReadResult[i];
    }
}
