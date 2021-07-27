package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.g */
public class C2348g implements Parcelable.Creator<LatLngBounds> {
    /* renamed from: a */
    static void m6835a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, latLngBounds.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) latLngBounds.southwest, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) latLngBounds.northeast, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dd */
    public LatLngBounds createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        LatLng latLng = null;
        int i = 0;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    latLng = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new LatLngBounds(i, latLng, latLng2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eZ */
    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
