package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wearable.internal.w */
public class C2801w implements Parcelable.Creator<C2800v> {
    /* renamed from: a */
    static void m8192a(C2800v vVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, vVar.versionCode);
        C0723b.m775c(parcel, 2, vVar.statusCode);
        C0723b.m776c(parcel, 3, vVar.axL, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eu */
    public C2800v createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList<C2740al> arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    arrayList = C0721a.m723c(parcel, F, C2740al.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2800v(i, i2, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gD */
    public C2800v[] newArray(int i) {
        return new C2800v[i];
    }
}
