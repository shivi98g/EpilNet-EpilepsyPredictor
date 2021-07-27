package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.t */
public class C1057t implements Parcelable.Creator<SessionReadRequest> {
    /* renamed from: a */
    static void m1942a(SessionReadRequest sessionReadRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, sessionReadRequest.getSessionName(), false);
        C0723b.m775c(parcel, 1000, sessionReadRequest.getVersionCode());
        C0723b.m763a(parcel, 2, sessionReadRequest.getSessionId(), false);
        C0723b.m755a(parcel, 3, sessionReadRequest.mo12646jo());
        C0723b.m755a(parcel, 4, sessionReadRequest.mo12647jp());
        C0723b.m776c(parcel, 5, sessionReadRequest.getDataTypes(), false);
        C0723b.m776c(parcel, 6, sessionReadRequest.getDataSources(), false);
        C0723b.m766a(parcel, 7, sessionReadRequest.mo12648kj());
        C0723b.m766a(parcel, 8, sessionReadRequest.mo12645jV());
        C0723b.m774b(parcel, 9, sessionReadRequest.getExcludedPackages(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bT */
    public SessionReadRequest createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        ArrayList<DataType> arrayList = null;
        ArrayList<DataSource> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 3:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 4:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 5:
                        arrayList = C0721a.m723c(parcel2, F, DataType.CREATOR);
                        break;
                    case 6:
                        arrayList2 = C0721a.m723c(parcel2, F, DataSource.CREATOR);
                        break;
                    case 7:
                        z = C0721a.m724c(parcel2, F);
                        break;
                    case 8:
                        z2 = C0721a.m724c(parcel2, F);
                        break;
                    case 9:
                        arrayList3 = C0721a.m710C(parcel2, F);
                        break;
                    default:
                        C0721a.m721b(parcel2, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new SessionReadRequest(i, str, str2, j, j2, arrayList, arrayList2, z, z2, arrayList3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: do */
    public SessionReadRequest[] newArray(int i) {
        return new SessionReadRequest[i];
    }
}
