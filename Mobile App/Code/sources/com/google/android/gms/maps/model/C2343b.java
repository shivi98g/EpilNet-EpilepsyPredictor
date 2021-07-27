package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.b */
public class C2343b {
    /* renamed from: a */
    static void m6826a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, cameraPosition.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) cameraPosition.target, i, false);
        C0723b.m754a(parcel, 3, cameraPosition.zoom);
        C0723b.m754a(parcel, 4, cameraPosition.tilt);
        C0723b.m754a(parcel, 5, cameraPosition.bearing);
        C0723b.m751H(parcel, H);
    }
}
