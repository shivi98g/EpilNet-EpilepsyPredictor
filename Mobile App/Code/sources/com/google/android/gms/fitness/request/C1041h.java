package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.h */
public class C1041h implements Parcelable.Creator<DataSourcesRequest> {
    /* renamed from: a */
    static void m1906a(DataSourcesRequest dataSourcesRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, dataSourcesRequest.getDataTypes(), false);
        C0723b.m775c(parcel, 1000, dataSourcesRequest.getVersionCode());
        C0723b.m764a(parcel, 2, dataSourcesRequest.mo12583jZ(), false);
        C0723b.m766a(parcel, 3, dataSourcesRequest.mo12582jY());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bM */
    public DataSourcesRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList<DataType> arrayList = null;
        int i = 0;
        ArrayList<Integer> arrayList2 = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, DataType.CREATOR);
                        break;
                    case 2:
                        arrayList2 = C0721a.m709B(parcel, F);
                        break;
                    case 3:
                        z = C0721a.m724c(parcel, F);
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
            return new DataSourcesRequest(i, arrayList, arrayList2, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dg */
    public DataSourcesRequest[] newArray(int i) {
        return new DataSourcesRequest[i];
    }
}
