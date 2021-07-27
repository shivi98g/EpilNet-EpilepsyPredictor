package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.f */
public class C2347f {
    /* renamed from: a */
    static void m6834a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
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
}
