package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.realtime.internal.event.b */
public class C0913b implements Parcelable.Creator<ParcelableEvent> {
    /* renamed from: a */
    static void m1418a(ParcelableEvent parcelableEvent, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, parcelableEvent.f1233CK);
        C0723b.m763a(parcel, 2, parcelableEvent.f1247vZ, false);
        C0723b.m763a(parcel, 3, parcelableEvent.f1234SJ, false);
        C0723b.m774b(parcel, 4, parcelableEvent.f1236SQ, false);
        C0723b.m766a(parcel, 5, parcelableEvent.f1237SR);
        C0723b.m763a(parcel, 6, parcelableEvent.f1235SM, false);
        C0723b.m763a(parcel, 7, parcelableEvent.f1238SS, false);
        C0723b.m759a(parcel, 8, (Parcelable) parcelableEvent.f1239ST, i, false);
        C0723b.m759a(parcel, 9, (Parcelable) parcelableEvent.f1240SU, i, false);
        C0723b.m759a(parcel, 10, (Parcelable) parcelableEvent.f1241SV, i, false);
        C0723b.m759a(parcel, 11, (Parcelable) parcelableEvent.f1242SW, i, false);
        C0723b.m759a(parcel, 12, (Parcelable) parcelableEvent.f1243SX, i, false);
        C0723b.m759a(parcel, 13, (Parcelable) parcelableEvent.f1244SY, i, false);
        C0723b.m759a(parcel, 14, (Parcelable) parcelableEvent.f1245SZ, i, false);
        C0723b.m759a(parcel, 15, (Parcelable) parcelableEvent.f1246Ta, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bh */
    public ParcelableEvent createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        String str4 = null;
        TextInsertedDetails textInsertedDetails = null;
        TextDeletedDetails textDeletedDetails = null;
        ValuesAddedDetails valuesAddedDetails = null;
        ValuesRemovedDetails valuesRemovedDetails = null;
        ValuesSetDetails valuesSetDetails = null;
        ValueChangedDetails valueChangedDetails = null;
        ReferenceShiftedDetails referenceShiftedDetails = null;
        ObjectChangedDetails objectChangedDetails = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 4:
                    arrayList = C0721a.m710C(parcel2, F);
                    break;
                case 5:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 6:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 7:
                    str4 = C0721a.m736o(parcel2, F);
                    break;
                case 8:
                    textInsertedDetails = (TextInsertedDetails) C0721a.m716a(parcel2, F, TextInsertedDetails.CREATOR);
                    break;
                case 9:
                    textDeletedDetails = (TextDeletedDetails) C0721a.m716a(parcel2, F, TextDeletedDetails.CREATOR);
                    break;
                case 10:
                    valuesAddedDetails = (ValuesAddedDetails) C0721a.m716a(parcel2, F, ValuesAddedDetails.CREATOR);
                    break;
                case 11:
                    valuesRemovedDetails = (ValuesRemovedDetails) C0721a.m716a(parcel2, F, ValuesRemovedDetails.CREATOR);
                    break;
                case 12:
                    valuesSetDetails = (ValuesSetDetails) C0721a.m716a(parcel2, F, ValuesSetDetails.CREATOR);
                    break;
                case 13:
                    valueChangedDetails = (ValueChangedDetails) C0721a.m716a(parcel2, F, ValueChangedDetails.CREATOR);
                    break;
                case 14:
                    referenceShiftedDetails = (ReferenceShiftedDetails) C0721a.m716a(parcel2, F, ReferenceShiftedDetails.CREATOR);
                    break;
                case 15:
                    objectChangedDetails = (ObjectChangedDetails) C0721a.m716a(parcel2, F, ObjectChangedDetails.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ParcelableEvent(i, str, str2, arrayList, z, str3, str4, textInsertedDetails, textDeletedDetails, valuesAddedDetails, valuesRemovedDetails, valuesSetDetails, valueChangedDetails, referenceShiftedDetails, objectChangedDetails);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: cx */
    public ParcelableEvent[] newArray(int i) {
        return new ParcelableEvent[i];
    }
}
