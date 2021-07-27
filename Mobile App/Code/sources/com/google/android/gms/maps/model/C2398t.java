package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.t */
public class C2398t implements Parcelable.Creator<StreetViewPanoramaOrientation> {
    /* renamed from: a */
    static void m6929a(StreetViewPanoramaOrientation streetViewPanoramaOrientation, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, streetViewPanoramaOrientation.getVersionCode());
        C0723b.m754a(parcel, 2, streetViewPanoramaOrientation.tilt);
        C0723b.m754a(parcel, 3, streetViewPanoramaOrientation.bearing);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dl */
    public StreetViewPanoramaOrientation createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    f = C0721a.m733l(parcel, F);
                    break;
                case 3:
                    f2 = C0721a.m733l(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new StreetViewPanoramaOrientation(i, f, f2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fh */
    public StreetViewPanoramaOrientation[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
