package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.r */
public class C2396r implements Parcelable.Creator<StreetViewPanoramaLink> {
    /* renamed from: a */
    static void m6923a(StreetViewPanoramaLink streetViewPanoramaLink, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, streetViewPanoramaLink.getVersionCode());
        C0723b.m763a(parcel, 2, streetViewPanoramaLink.panoId, false);
        C0723b.m754a(parcel, 3, streetViewPanoramaLink.bearing);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dj */
    public StreetViewPanoramaLink createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        float f = 0.0f;
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
                    f = C0721a.m733l(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new StreetViewPanoramaLink(i, str, f);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ff */
    public StreetViewPanoramaLink[] newArray(int i) {
        return new StreetViewPanoramaLink[i];
    }
}
