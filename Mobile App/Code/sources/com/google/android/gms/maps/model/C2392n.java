package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.n */
public class C2392n {
    /* renamed from: a */
    static void m6915a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, polygonOptions.getVersionCode());
        C0723b.m776c(parcel, 2, polygonOptions.getPoints(), false);
        C0723b.m777d(parcel, 3, polygonOptions.mo18002of(), false);
        C0723b.m754a(parcel, 4, polygonOptions.getStrokeWidth());
        C0723b.m775c(parcel, 5, polygonOptions.getStrokeColor());
        C0723b.m775c(parcel, 6, polygonOptions.getFillColor());
        C0723b.m754a(parcel, 7, polygonOptions.getZIndex());
        C0723b.m766a(parcel, 8, polygonOptions.isVisible());
        C0723b.m766a(parcel, 9, polygonOptions.isGeodesic());
        C0723b.m751H(parcel, H);
    }
}
