package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: com.google.android.gms.maps.c */
public class C2250c implements Parcelable.Creator<StreetViewPanoramaOptions> {
    /* renamed from: a */
    static void m6708a(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, streetViewPanoramaOptions.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) streetViewPanoramaOptions.getStreetViewPanoramaCamera(), i, false);
        C0723b.m763a(parcel, 3, streetViewPanoramaOptions.getPanoramaId(), false);
        C0723b.m759a(parcel, 4, (Parcelable) streetViewPanoramaOptions.getPosition(), i, false);
        C0723b.m761a(parcel, 5, streetViewPanoramaOptions.getRadius(), false);
        C0723b.m752a(parcel, 6, streetViewPanoramaOptions.mo17471nS());
        C0723b.m752a(parcel, 7, streetViewPanoramaOptions.mo17470nI());
        C0723b.m752a(parcel, 8, streetViewPanoramaOptions.mo17472nT());
        C0723b.m752a(parcel, 9, streetViewPanoramaOptions.mo17473nU());
        C0723b.m752a(parcel, 10, streetViewPanoramaOptions.mo17469nE());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cY */
    public StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C0721a.m716a(parcel, F, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    latLng = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                    break;
                case 5:
                    num = C0721a.m729h(parcel, F);
                    break;
                case 6:
                    b = C0721a.m726e(parcel, F);
                    break;
                case 7:
                    b2 = C0721a.m726e(parcel, F);
                    break;
                case 8:
                    b3 = C0721a.m726e(parcel, F);
                    break;
                case 9:
                    b4 = C0721a.m726e(parcel, F);
                    break;
                case 10:
                    b5 = C0721a.m726e(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new StreetViewPanoramaOptions(i, streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eU */
    public StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
