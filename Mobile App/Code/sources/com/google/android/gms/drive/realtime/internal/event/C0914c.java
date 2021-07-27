package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.realtime.internal.event.c */
public class C0914c implements Parcelable.Creator<ParcelableEventList> {
    /* renamed from: a */
    static void m1421a(ParcelableEventList parcelableEventList, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, parcelableEventList.f1248CK);
        C0723b.m776c(parcel, 2, parcelableEventList.f1252mp, false);
        C0723b.m759a(parcel, 3, (Parcelable) parcelableEventList.f1249Tb, i, false);
        C0723b.m766a(parcel, 4, parcelableEventList.f1250Tc);
        C0723b.m774b(parcel, 5, parcelableEventList.f1251Td, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bi */
    public ParcelableEventList createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        ArrayList<ParcelableEvent> arrayList = null;
        DataHolder dataHolder = null;
        ArrayList<String> arrayList2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m723c(parcel, F, ParcelableEvent.CREATOR);
                    break;
                case 3:
                    dataHolder = (DataHolder) C0721a.m716a(parcel, F, DataHolder.CREATOR);
                    break;
                case 4:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 5:
                    arrayList2 = C0721a.m710C(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ParcelableEventList(i, arrayList, dataHolder, z, arrayList2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cy */
    public ParcelableEventList[] newArray(int i) {
        return new ParcelableEventList[i];
    }
}
