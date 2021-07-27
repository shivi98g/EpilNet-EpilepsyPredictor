package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.u */
public class C2399u implements Parcelable.Creator<Tile> {
    /* renamed from: a */
    static void m6932a(Tile tile, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, tile.getVersionCode());
        C0723b.m775c(parcel, 2, tile.width);
        C0723b.m775c(parcel, 3, tile.height);
        C0723b.m767a(parcel, 4, tile.data, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dm */
    public Tile createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        byte[] bArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    bArr = C0721a.m739r(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new Tile(i, i3, i2, bArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fi */
    public Tile[] newArray(int i) {
        return new Tile[i];
    }
}
