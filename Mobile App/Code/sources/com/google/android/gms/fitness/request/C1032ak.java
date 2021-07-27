package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

/* renamed from: com.google.android.gms.fitness.request.ak */
public class C1032ak implements Parcelable.Creator<C1029aj> {
    /* renamed from: a */
    static void m1885a(C1029aj ajVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) ajVar.getDataType(), i, false);
        C0723b.m775c(parcel, 1000, ajVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) ajVar.getDataSource(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cc */
    public C1029aj createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        DataType dataType = null;
        int i = 0;
        DataSource dataSource = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        dataType = (DataType) C0721a.m716a(parcel, F, DataType.CREATOR);
                        break;
                    case 2:
                        dataSource = (DataSource) C0721a.m716a(parcel, F, DataSource.CREATOR);
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
            return new C1029aj(i, dataType, dataSource);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dx */
    public C1029aj[] newArray(int i) {
        return new C1029aj[i];
    }
}
