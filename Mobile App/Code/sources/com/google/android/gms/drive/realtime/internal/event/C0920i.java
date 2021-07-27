package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.event.i */
public class C0920i implements Parcelable.Creator<ValuesRemovedDetails> {
    /* renamed from: a */
    static void m1439a(ValuesRemovedDetails valuesRemovedDetails, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, valuesRemovedDetails.f1269CK);
        C0723b.m775c(parcel, 2, valuesRemovedDetails.mIndex);
        C0723b.m775c(parcel, 3, valuesRemovedDetails.f1270SO);
        C0723b.m775c(parcel, 4, valuesRemovedDetails.f1271SP);
        C0723b.m763a(parcel, 5, valuesRemovedDetails.f1272Tm, false);
        C0723b.m775c(parcel, 6, valuesRemovedDetails.f1273Tn);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bo */
    public ValuesRemovedDetails createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    i4 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 6:
                    i5 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ValuesRemovedDetails(i, i2, i3, i4, str, i5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cE */
    public ValuesRemovedDetails[] newArray(int i) {
        return new ValuesRemovedDetails[i];
    }
}
