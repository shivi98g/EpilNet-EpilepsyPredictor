package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.s */
public class C1004s implements Parcelable.Creator<Subscription> {
    /* renamed from: a */
    static void m1768a(Subscription subscription, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) subscription.getDataSource(), i, false);
        C0723b.m775c(parcel, 1000, subscription.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) subscription.getDataType(), i, false);
        C0723b.m755a(parcel, 3, subscription.mo12407jI());
        C0723b.m775c(parcel, 4, subscription.getAccuracyMode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bE */
    public Subscription createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        DataSource dataSource = null;
        DataType dataType = null;
        int i = 0;
        int i2 = 0;
        long j = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        dataSource = (DataSource) C0721a.m716a(parcel, F, DataSource.CREATOR);
                        break;
                    case 2:
                        dataType = (DataType) C0721a.m716a(parcel, F, DataType.CREATOR);
                        break;
                    case 3:
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel, F);
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
            return new Subscription(i, dataSource, dataType, j, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cY */
    public Subscription[] newArray(int i) {
        return new Subscription[i];
    }
}
