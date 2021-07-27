package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.d */
public class C2345d {
    /* renamed from: a */
    static void m6830a(CircleOptions circleOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, circleOptions.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) circleOptions.getCenter(), i, false);
        C0723b.m753a(parcel, 3, circleOptions.getRadius());
        C0723b.m754a(parcel, 4, circleOptions.getStrokeWidth());
        C0723b.m775c(parcel, 5, circleOptions.getStrokeColor());
        C0723b.m775c(parcel, 6, circleOptions.getFillColor());
        C0723b.m754a(parcel, 7, circleOptions.getZIndex());
        C0723b.m766a(parcel, 8, circleOptions.isVisible());
        C0723b.m751H(parcel, H);
    }
}
