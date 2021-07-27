package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.v */
public class C2400v {
    /* renamed from: a */
    static void m6935a(Tile tile, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, tile.getVersionCode());
        C0723b.m775c(parcel, 2, tile.width);
        C0723b.m775c(parcel, 3, tile.height);
        C0723b.m767a(parcel, 4, tile.data, false);
        C0723b.m751H(parcel, H);
    }
}
