package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.c */
public class C2344c implements Parcelable.Creator<CircleOptions> {
    /* renamed from: a */
    static void m6827a(CircleOptions circleOptions, Parcel parcel, int i) {
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

    /* renamed from: db */
    public CircleOptions createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        LatLng latLng = null;
        double d = 0.0d;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    latLng = (LatLng) C0721a.m716a(parcel2, F, LatLng.CREATOR);
                    break;
                case 3:
                    d = C0721a.m734m(parcel2, F);
                    break;
                case 4:
                    f = C0721a.m733l(parcel2, F);
                    break;
                case 5:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 6:
                    i3 = C0721a.m728g(parcel2, F);
                    break;
                case 7:
                    f2 = C0721a.m733l(parcel2, F);
                    break;
                case 8:
                    z = C0721a.m724c(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CircleOptions(i, latLng, d, f, i2, i3, f2, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eX */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
