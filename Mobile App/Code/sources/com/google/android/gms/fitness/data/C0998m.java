package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.data.m */
public class C0998m implements Parcelable.Creator<RawBucket> {
    /* renamed from: a */
    static void m1751a(RawBucket rawBucket, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m755a(parcel, 1, rawBucket.f1393LW);
        C0723b.m775c(parcel, 1000, rawBucket.f1392CK);
        C0723b.m755a(parcel, 2, rawBucket.f1394TO);
        C0723b.m759a(parcel, 3, (Parcelable) rawBucket.f1395TQ, i, false);
        C0723b.m775c(parcel, 4, rawBucket.f1396UI);
        C0723b.m776c(parcel, 5, rawBucket.f1397Ua, false);
        C0723b.m775c(parcel, 6, rawBucket.f1398Ub);
        C0723b.m766a(parcel, 7, rawBucket.f1399Uc);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bz */
    public RawBucket createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        Session session = null;
        ArrayList<RawDataSet> arrayList = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
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
                        session = (Session) C0721a.m716a(parcel2, F, Session.CREATOR);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 5:
                        arrayList = C0721a.m723c(parcel2, F, RawDataSet.CREATOR);
                        break;
                    case 6:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 7:
                        z = C0721a.m724c(parcel2, F);
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
            return new RawBucket(i, j, j2, session, i2, arrayList, i3, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: cS */
    public RawBucket[] newArray(int i) {
        return new RawBucket[i];
    }
}
