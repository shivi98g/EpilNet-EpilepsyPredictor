package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.e */
public class C2346e implements Parcelable.Creator<GroundOverlayOptions> {
    /* renamed from: a */
    static void m6831a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, groundOverlayOptions.getVersionCode());
        C0723b.m757a(parcel, 2, groundOverlayOptions.mo17876od(), false);
        C0723b.m759a(parcel, 3, (Parcelable) groundOverlayOptions.getLocation(), i, false);
        C0723b.m754a(parcel, 4, groundOverlayOptions.getWidth());
        C0723b.m754a(parcel, 5, groundOverlayOptions.getHeight());
        C0723b.m759a(parcel, 6, (Parcelable) groundOverlayOptions.getBounds(), i, false);
        C0723b.m754a(parcel, 7, groundOverlayOptions.getBearing());
        C0723b.m754a(parcel, 8, groundOverlayOptions.getZIndex());
        C0723b.m766a(parcel, 9, groundOverlayOptions.isVisible());
        C0723b.m754a(parcel, 10, groundOverlayOptions.getTransparency());
        C0723b.m754a(parcel, 11, groundOverlayOptions.getAnchorU());
        C0723b.m754a(parcel, 12, groundOverlayOptions.getAnchorV());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dc */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    iBinder = C0721a.m737p(parcel2, F);
                    break;
                case 3:
                    latLng = (LatLng) C0721a.m716a(parcel2, F, LatLng.CREATOR);
                    break;
                case 4:
                    f = C0721a.m733l(parcel2, F);
                    break;
                case 5:
                    f2 = C0721a.m733l(parcel2, F);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C0721a.m716a(parcel2, F, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C0721a.m733l(parcel2, F);
                    break;
                case 8:
                    f4 = C0721a.m733l(parcel2, F);
                    break;
                case 9:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 10:
                    f5 = C0721a.m733l(parcel2, F);
                    break;
                case 11:
                    f6 = C0721a.m733l(parcel2, F);
                    break;
                case 12:
                    f7 = C0721a.m733l(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eY */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
