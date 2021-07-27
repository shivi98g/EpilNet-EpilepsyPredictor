package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.b */
public class C2249b {
    /* renamed from: a */
    static void m6707a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, googleMapOptions.getVersionCode());
        C0723b.m752a(parcel, 2, googleMapOptions.mo17356nD());
        C0723b.m752a(parcel, 3, googleMapOptions.mo17357nE());
        C0723b.m775c(parcel, 4, googleMapOptions.getMapType());
        C0723b.m759a(parcel, 5, (Parcelable) googleMapOptions.getCamera(), i, false);
        C0723b.m752a(parcel, 6, googleMapOptions.mo17358nF());
        C0723b.m752a(parcel, 7, googleMapOptions.mo17359nG());
        C0723b.m752a(parcel, 8, googleMapOptions.mo17360nH());
        C0723b.m752a(parcel, 9, googleMapOptions.mo17361nI());
        C0723b.m752a(parcel, 10, googleMapOptions.mo17362nJ());
        C0723b.m752a(parcel, 11, googleMapOptions.mo17363nK());
        C0723b.m751H(parcel, H);
    }
}
