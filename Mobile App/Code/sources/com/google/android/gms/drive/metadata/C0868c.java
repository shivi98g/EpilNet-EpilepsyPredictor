package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.metadata.c */
public class C0868c implements Parcelable.Creator<CustomPropertyKey> {
    /* renamed from: a */
    static void m1246a(CustomPropertyKey customPropertyKey, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, customPropertyKey.f1139CK);
        C0723b.m763a(parcel, 2, customPropertyKey.f1140KP, false);
        C0723b.m775c(parcel, 3, customPropertyKey.mVisibility);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aM */
    public CustomPropertyKey createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CustomPropertyKey(i, str, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cb */
    public CustomPropertyKey[] newArray(int i) {
        return new CustomPropertyKey[i];
    }
}
