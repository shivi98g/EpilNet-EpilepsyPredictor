package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.internal.b */
public class C2354b implements Parcelable.Creator<C2353a> {
    /* renamed from: a */
    static void m6845a(C2353a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, aVar.getVersionCode());
        C0723b.m752a(parcel, 2, aVar.mo18150oh());
        C0723b.m756a(parcel, 3, aVar.mo18151oi(), false);
        C0723b.m759a(parcel, 4, (Parcelable) aVar.getBitmap(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dp */
    public C2353a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Bundle bundle = null;
        Bitmap bitmap = null;
        byte b = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    b = C0721a.m726e(parcel, F);
                    break;
                case 3:
                    bundle = C0721a.m738q(parcel, F);
                    break;
                case 4:
                    bitmap = (Bitmap) C0721a.m716a(parcel, F, Bitmap.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2353a(i, b, bundle, bitmap);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fl */
    public C2353a[] newArray(int i) {
        return new C2353a[i];
    }
}
