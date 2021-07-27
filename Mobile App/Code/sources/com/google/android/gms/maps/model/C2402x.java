package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.x */
public class C2402x {
    /* renamed from: a */
    static void m6939a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, tileOverlayOptions.getVersionCode());
        C0723b.m757a(parcel, 2, tileOverlayOptions.mo18095og(), false);
        C0723b.m766a(parcel, 3, tileOverlayOptions.isVisible());
        C0723b.m754a(parcel, 4, tileOverlayOptions.getZIndex());
        C0723b.m751H(parcel, H);
    }
}
