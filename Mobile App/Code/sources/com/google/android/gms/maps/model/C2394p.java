package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.p */
public class C2394p {
    /* renamed from: a */
    static void m6919a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, polylineOptions.getVersionCode());
        C0723b.m776c(parcel, 2, polylineOptions.getPoints(), false);
        C0723b.m754a(parcel, 3, polylineOptions.getWidth());
        C0723b.m775c(parcel, 4, polylineOptions.getColor());
        C0723b.m754a(parcel, 5, polylineOptions.getZIndex());
        C0723b.m766a(parcel, 6, polylineOptions.isVisible());
        C0723b.m766a(parcel, 7, polylineOptions.isGeodesic());
        C0723b.m751H(parcel, H);
    }
}
