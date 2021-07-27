package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.common.data.b */
public class C0703b implements Parcelable.Creator<C0702a> {
    /* renamed from: a */
    static void m649a(C0702a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, aVar.f782CK);
        C0723b.m759a(parcel, 2, (Parcelable) aVar.f784KS, i, false);
        C0723b.m775c(parcel, 3, aVar.f783Gt);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: A */
    public C0702a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C0721a.m716a(parcel, F, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C0702a(i, parcelFileDescriptor, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ar */
    public C0702a[] newArray(int i) {
        return new C0702a[i];
    }
}
