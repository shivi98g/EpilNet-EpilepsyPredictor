package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.d */
public class C1035d implements Parcelable.Creator<DataDeleteRequest> {
    /* renamed from: a */
    static void m1892a(DataDeleteRequest dataDeleteRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m755a(parcel, 1, dataDeleteRequest.mo12533jo());
        C0723b.m775c(parcel, 1000, dataDeleteRequest.getVersionCode());
        C0723b.m755a(parcel, 2, dataDeleteRequest.mo12534jp());
        C0723b.m776c(parcel, 3, dataDeleteRequest.getDataSources(), false);
        C0723b.m776c(parcel, 4, dataDeleteRequest.getDataTypes(), false);
        C0723b.m776c(parcel, 5, dataDeleteRequest.getSessions(), false);
        C0723b.m766a(parcel, 6, dataDeleteRequest.mo12531jR());
        C0723b.m766a(parcel, 7, dataDeleteRequest.mo12532jS());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bJ */
    public DataDeleteRequest createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList<DataSource> arrayList = null;
        ArrayList<DataType> arrayList2 = null;
        ArrayList<Session> arrayList3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
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
                        arrayList = C0721a.m723c(parcel2, F, DataSource.CREATOR);
                        break;
                    case 4:
                        arrayList2 = C0721a.m723c(parcel2, F, DataType.CREATOR);
                        break;
                    case 5:
                        arrayList3 = C0721a.m723c(parcel2, F, Session.CREATOR);
                        break;
                    case 6:
                        z = C0721a.m724c(parcel2, F);
                        break;
                    case 7:
                        z2 = C0721a.m724c(parcel2, F);
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
            return new DataDeleteRequest(i, j, j2, arrayList, arrayList2, arrayList3, z, z2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: dd */
    public DataDeleteRequest[] newArray(int i) {
        return new DataDeleteRequest[i];
    }
}
