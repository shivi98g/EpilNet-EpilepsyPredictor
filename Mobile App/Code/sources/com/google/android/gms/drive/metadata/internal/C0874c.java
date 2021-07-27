package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

/* renamed from: com.google.android.gms.drive.metadata.internal.c */
public class C0874c implements Parcelable.Creator<CustomProperty> {
    /* renamed from: a */
    static void m1268a(CustomProperty customProperty, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, customProperty.f1149CK);
        C0723b.m759a(parcel, 2, (Parcelable) customProperty.f1150Rg, i, false);
        C0723b.m763a(parcel, 3, customProperty.mValue, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aO */
    public CustomProperty createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        CustomPropertyKey customPropertyKey = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    customPropertyKey = (CustomPropertyKey) C0721a.m716a(parcel, F, CustomPropertyKey.CREATOR);
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CustomProperty(i, customPropertyKey, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cd */
    public CustomProperty[] newArray(int i) {
        return new CustomProperty[i];
    }
}
