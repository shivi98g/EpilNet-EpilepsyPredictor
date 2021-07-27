package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.result.c */
public class C1070c implements Parcelable.Creator<DataSourcesResult> {
    /* renamed from: a */
    static void m1995a(DataSourcesResult dataSourcesResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, dataSourcesResult.getDataSources(), false);
        C0723b.m775c(parcel, 1000, dataSourcesResult.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) dataSourcesResult.getStatus(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cf */
    public DataSourcesResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList<DataSource> arrayList = null;
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, DataSource.CREATOR);
                        break;
                    case 2:
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
            return new DataSourcesResult(i, arrayList, status);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dA */
    public DataSourcesResult[] newArray(int i) {
        return new DataSourcesResult[i];
    }
}
