package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.w */
public class C2401w implements Parcelable.Creator<TileOverlayOptions> {
    /* renamed from: a */
    static void m6936a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, tileOverlayOptions.getVersionCode());
        C0723b.m757a(parcel, 2, tileOverlayOptions.mo18095og(), false);
        C0723b.m766a(parcel, 3, tileOverlayOptions.isVisible());
        C0723b.m754a(parcel, 4, tileOverlayOptions.getZIndex());
        C0723b.m766a(parcel, 5, tileOverlayOptions.getFadeIn());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dn */
    public TileOverlayOptions createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        IBinder iBinder = null;
        float f = 0.0f;
        boolean z2 = true;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    iBinder = C0721a.m737p(parcel, F);
                    break;
                case 3:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 4:
                    f = C0721a.m733l(parcel, F);
                    break;
                case 5:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new TileOverlayOptions(i, iBinder, z, f, z2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fj */
    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
