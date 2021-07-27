package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.i */
public class C2350i implements Parcelable.Creator<LatLng> {
    /* renamed from: a */
    static void m6839a(LatLng latLng, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, latLng.getVersionCode());
        C0723b.m753a(parcel, 2, latLng.latitude);
        C0723b.m753a(parcel, 3, latLng.longitude);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: de */
    public LatLng createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    d = C0721a.m734m(parcel, F);
                    break;
                case 3:
                    d2 = C0721a.m734m(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new LatLng(i, d, d2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fa */
    public LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
