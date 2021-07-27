package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.y */
public class C2403y implements Parcelable.Creator<VisibleRegion> {
    /* renamed from: a */
    static void m6940a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, visibleRegion.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) visibleRegion.nearLeft, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) visibleRegion.nearRight, i, false);
        C0723b.m759a(parcel, 4, (Parcelable) visibleRegion.farLeft, i, false);
        C0723b.m759a(parcel, 5, (Parcelable) visibleRegion.farRight, i, false);
        C0723b.m759a(parcel, 6, (Parcelable) visibleRegion.latLngBounds, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: do */
    public VisibleRegion createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        int i = 0;
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
                case 4:
                    latLng3 = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                    break;
                case 5:
                    latLng4 = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C0721a.m716a(parcel, F, LatLngBounds.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new VisibleRegion(i, latLng, latLng2, latLng3, latLng4, latLngBounds);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fk */
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
