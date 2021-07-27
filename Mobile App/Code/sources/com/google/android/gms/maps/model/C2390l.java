package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.l */
public class C2390l {
    /* renamed from: a */
    static void m6911a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, markerOptions.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) markerOptions.getPosition(), i, false);
        C0723b.m763a(parcel, 3, markerOptions.getTitle(), false);
        C0723b.m763a(parcel, 4, markerOptions.getSnippet(), false);
        C0723b.m757a(parcel, 5, markerOptions.mo17959oe(), false);
        C0723b.m754a(parcel, 6, markerOptions.getAnchorU());
        C0723b.m754a(parcel, 7, markerOptions.getAnchorV());
        C0723b.m766a(parcel, 8, markerOptions.isDraggable());
        C0723b.m766a(parcel, 9, markerOptions.isVisible());
        C0723b.m751H(parcel, H);
    }
}
