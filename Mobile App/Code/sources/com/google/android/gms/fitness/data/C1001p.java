package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.p */
public class C1001p implements Parcelable.Creator<Session> {
    /* renamed from: a */
    static void m1760a(Session session, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m755a(parcel, 1, session.mo12387jo());
        C0723b.m775c(parcel, 1000, session.getVersionCode());
        C0723b.m755a(parcel, 2, session.mo12388jp());
        C0723b.m763a(parcel, 3, session.getName(), false);
        C0723b.m763a(parcel, 4, session.getIdentifier(), false);
        C0723b.m763a(parcel, 5, session.getDescription(), false);
        C0723b.m775c(parcel, 7, session.mo12386jm());
        C0723b.m759a(parcel, 8, (Parcelable) session.mo12389jx(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bC */
    public Session createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        C0982a aVar = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 2:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 3:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 4:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 5:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    default:
                        switch (aH) {
                            case 7:
                                i2 = C0721a.m728g(parcel2, F);
                                break;
                            case 8:
                                aVar = (C0982a) C0721a.m716a(parcel2, F, C0982a.CREATOR);
                                break;
                            default:
                                C0721a.m721b(parcel2, F);
                                break;
                        }
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new Session(i, j, j2, str, str2, str3, i2, aVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: cW */
    public Session[] newArray(int i) {
        return new Session[i];
    }
}
