package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.z */
public class C2404z {
    /* renamed from: a */
    static void m6943a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, visibleRegion.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) visibleRegion.nearLeft, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) visibleRegion.nearRight, i, false);
        C0723b.m759a(parcel, 4, (Parcelable) visibleRegion.farLeft, i, false);
        C0723b.m759a(parcel, 5, (Parcelable) visibleRegion.farRight, i, false);
        C0723b.m759a(parcel, 6, (Parcelable) visibleRegion.latLngBounds, i, false);
        C0723b.m751H(parcel, H);
    }
}
