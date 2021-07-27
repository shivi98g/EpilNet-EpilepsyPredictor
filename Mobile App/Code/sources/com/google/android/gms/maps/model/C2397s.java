package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.s */
public class C2397s implements Parcelable.Creator<StreetViewPanoramaLocation> {
    /* renamed from: a */
    static void m6926a(StreetViewPanoramaLocation streetViewPanoramaLocation, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, streetViewPanoramaLocation.getVersionCode());
        C0723b.m769a(parcel, 2, (T[]) streetViewPanoramaLocation.links, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) streetViewPanoramaLocation.position, i, false);
        C0723b.m763a(parcel, 4, streetViewPanoramaLocation.panoId, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dk */
    public StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        int i = 0;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C0721a.m722b(parcel, F, StreetViewPanoramaLink.CREATOR);
                    break;
                case 3:
                    latLng = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                    break;
                case 4:
                    str = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new StreetViewPanoramaLocation(i, streetViewPanoramaLinkArr, latLng, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fg */
    public StreetViewPanoramaLocation[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
