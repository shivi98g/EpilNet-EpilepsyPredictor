package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.metadata.internal.h */
public class C0879h implements Parcelable.Creator<MetadataBundle> {
    /* renamed from: a */
    static void m1292a(MetadataBundle metadataBundle, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, metadataBundle.f1151CK);
        C0723b.m756a(parcel, 2, metadataBundle.f1152Ri, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aP */
    public MetadataBundle createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    bundle = C0721a.m738q(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new MetadataBundle(i, bundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ce */
    public MetadataBundle[] newArray(int i) {
        return new MetadataBundle[i];
    }
}
