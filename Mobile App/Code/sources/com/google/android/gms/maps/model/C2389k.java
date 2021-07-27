package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.k */
public class C2389k implements Parcelable.Creator<MarkerOptions> {
    /* renamed from: a */
    static void m6908a(MarkerOptions markerOptions, Parcel parcel, int i) {
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
        C0723b.m766a(parcel, 10, markerOptions.isFlat());
        C0723b.m754a(parcel, 11, markerOptions.getRotation());
        C0723b.m754a(parcel, 12, markerOptions.getInfoWindowAnchorU());
        C0723b.m754a(parcel, 13, markerOptions.getInfoWindowAnchorV());
        C0723b.m754a(parcel, 14, markerOptions.getAlpha());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: df */
    public MarkerOptions createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f5 = 0.5f;
        float f6 = 1.0f;
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
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 4:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 5:
                    iBinder = C0721a.m737p(parcel2, F);
                    break;
                case 6:
                    f = C0721a.m733l(parcel2, F);
                    break;
                case 7:
                    f2 = C0721a.m733l(parcel2, F);
                    break;
                case 8:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 9:
                    z2 = C0721a.m724c(parcel2, F);
                    break;
                case 10:
                    z3 = C0721a.m724c(parcel2, F);
                    break;
                case 11:
                    f3 = C0721a.m733l(parcel2, F);
                    break;
                case 12:
                    f5 = C0721a.m733l(parcel2, F);
                    break;
                case 13:
                    f4 = C0721a.m733l(parcel2, F);
                    break;
                case 14:
                    f6 = C0721a.m733l(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f5, f4, f6);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: fb */
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
