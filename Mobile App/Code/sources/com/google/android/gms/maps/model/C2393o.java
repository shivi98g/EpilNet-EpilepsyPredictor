package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.o */
public class C2393o implements Parcelable.Creator<PolylineOptions> {
    /* renamed from: a */
    static void m6916a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, polylineOptions.getVersionCode());
        C0723b.m776c(parcel, 2, polylineOptions.getPoints(), false);
        C0723b.m754a(parcel, 3, polylineOptions.getWidth());
        C0723b.m775c(parcel, 4, polylineOptions.getColor());
        C0723b.m754a(parcel, 5, polylineOptions.getZIndex());
        C0723b.m766a(parcel, 6, polylineOptions.isVisible());
        C0723b.m766a(parcel, 7, polylineOptions.isGeodesic());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dh */
    public PolylineOptions createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m723c(parcel, F, LatLng.CREATOR);
                    break;
                case 3:
                    f = C0721a.m733l(parcel, F);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    f2 = C0721a.m733l(parcel, F);
                    break;
                case 6:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 7:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new PolylineOptions(i, arrayList, f, i2, f2, z, z2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fd */
    public PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
