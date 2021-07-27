package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.h */
public class C2349h {
    /* renamed from: a */
    static void m6838a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, latLngBounds.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) latLngBounds.southwest, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) latLngBounds.northeast, i, false);
        C0723b.m751H(parcel, H);
    }
}
