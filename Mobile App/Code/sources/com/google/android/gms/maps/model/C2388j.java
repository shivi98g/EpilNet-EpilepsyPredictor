package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.j */
public class C2388j {
    /* renamed from: a */
    static void m6907a(LatLng latLng, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, latLng.getVersionCode());
        C0723b.m753a(parcel, 2, latLng.latitude);
        C0723b.m753a(parcel, 3, latLng.longitude);
        C0723b.m751H(parcel, H);
    }
}
