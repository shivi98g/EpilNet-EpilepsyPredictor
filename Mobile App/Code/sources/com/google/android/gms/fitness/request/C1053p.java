package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.p */
public class C1053p implements Parcelable.Creator<C1052o> {
    /* renamed from: a */
    static void m1931a(C1052o oVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) oVar.getDataSource(), i, false);
        C0723b.m775c(parcel, 1000, oVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) oVar.getDataType(), i, false);
        C0723b.m757a(parcel, 3, oVar.mo12810kg(), false);
        C0723b.m775c(parcel, 4, oVar.f1586VX);
        C0723b.m775c(parcel, 5, oVar.f1587VY);
        C0723b.m755a(parcel, 6, oVar.mo12804jI());
        C0723b.m755a(parcel, 7, oVar.mo12807kd());
        C0723b.m759a(parcel, 8, (Parcelable) oVar.mo12805kb(), i, false);
        C0723b.m755a(parcel, 9, oVar.mo12806kc());
        C0723b.m775c(parcel, 10, oVar.getAccuracyMode());
        C0723b.m776c(parcel, 11, oVar.mo12808ke(), false);
        C0723b.m755a(parcel, 12, oVar.mo12809kf());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bQ */
    public C1052o createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        DataSource dataSource = null;
        DataType dataType = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        dataSource = (DataSource) C0721a.m716a(parcel2, F, DataSource.CREATOR);
                        break;
                    case 2:
                        dataType = (DataType) C0721a.m716a(parcel2, F, DataType.CREATOR);
                        break;
                    case 3:
                        iBinder = C0721a.m737p(parcel2, F);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 5:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 6:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 7:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 8:
                        pendingIntent = (PendingIntent) C0721a.m716a(parcel2, F, PendingIntent.CREATOR);
                        break;
                    case 9:
                        j3 = C0721a.m730i(parcel2, F);
                        break;
                    case 10:
                        i4 = C0721a.m728g(parcel2, F);
                        break;
                    case 11:
                        arrayList = C0721a.m723c(parcel2, F, LocationRequest.CREATOR);
                        break;
                    case 12:
                        j4 = C0721a.m730i(parcel2, F);
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
            return new C1052o(i, dataSource, dataType, iBinder, i2, i3, j, j2, pendingIntent, j3, i4, arrayList, j4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: dk */
    public C1052o[] newArray(int i) {
        return new C1052o[i];
    }
}
