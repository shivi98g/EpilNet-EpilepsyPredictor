package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.g */
public class C1040g implements Parcelable.Creator<DataReadRequest> {
    /* renamed from: a */
    static void m1903a(DataReadRequest dataReadRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, dataReadRequest.getDataTypes(), false);
        C0723b.m775c(parcel, 1000, dataReadRequest.getVersionCode());
        C0723b.m776c(parcel, 2, dataReadRequest.getDataSources(), false);
        C0723b.m755a(parcel, 3, dataReadRequest.mo12561jo());
        C0723b.m755a(parcel, 4, dataReadRequest.mo12562jp());
        C0723b.m776c(parcel, 5, dataReadRequest.getAggregatedDataTypes(), false);
        C0723b.m776c(parcel, 6, dataReadRequest.getAggregatedDataSources(), false);
        C0723b.m775c(parcel, 7, dataReadRequest.getBucketType());
        C0723b.m755a(parcel, 8, dataReadRequest.mo12560jX());
        C0723b.m759a(parcel, 9, (Parcelable) dataReadRequest.getActivityDataSource(), i, false);
        C0723b.m775c(parcel, 10, dataReadRequest.getLimit());
        C0723b.m766a(parcel, 12, dataReadRequest.mo12559jW());
        C0723b.m766a(parcel, 13, dataReadRequest.mo12558jV());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bL */
    public DataReadRequest createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        ArrayList<DataType> arrayList = null;
        ArrayList<DataSource> arrayList2 = null;
        ArrayList<DataType> arrayList3 = null;
        ArrayList<DataSource> arrayList4 = null;
        DataSource dataSource = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel2, F, DataType.CREATOR);
                        break;
                    case 2:
                        arrayList2 = C0721a.m723c(parcel2, F, DataSource.CREATOR);
                        break;
                    case 3:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 4:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 5:
                        arrayList3 = C0721a.m723c(parcel2, F, DataType.CREATOR);
                        break;
                    case 6:
                        arrayList4 = C0721a.m723c(parcel2, F, DataSource.CREATOR);
                        break;
                    case 7:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 8:
                        j3 = C0721a.m730i(parcel2, F);
                        break;
                    case 9:
                        dataSource = (DataSource) C0721a.m716a(parcel2, F, DataSource.CREATOR);
                        break;
                    case 10:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    default:
                        switch (aH) {
                            case 12:
                                z = C0721a.m724c(parcel2, F);
                                break;
                            case 13:
                                z2 = C0721a.m724c(parcel2, F);
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
            return new DataReadRequest(i, arrayList, arrayList2, j, j2, arrayList3, arrayList4, i2, j3, dataSource, i3, z, z2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: df */
    public DataReadRequest[] newArray(int i) {
        return new DataReadRequest[i];
    }
}
