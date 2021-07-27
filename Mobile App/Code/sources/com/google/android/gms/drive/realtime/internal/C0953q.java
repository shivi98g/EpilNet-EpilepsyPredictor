package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.q */
public class C0953q implements Parcelable.Creator<ParcelableIndexReference> {
    /* renamed from: a */
    static void m1570a(ParcelableIndexReference parcelableIndexReference, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, parcelableIndexReference.f1224CK);
        C0723b.m763a(parcel, 2, parcelableIndexReference.f1225SM, false);
        C0723b.m775c(parcel, 3, parcelableIndexReference.mIndex);
        C0723b.m766a(parcel, 4, parcelableIndexReference.f1226SN);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bf */
    public ParcelableIndexReference createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    z = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ParcelableIndexReference(i, str, i2, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cv */
    public ParcelableIndexReference[] newArray(int i) {
        return new ParcelableIndexReference[i];
    }
}
