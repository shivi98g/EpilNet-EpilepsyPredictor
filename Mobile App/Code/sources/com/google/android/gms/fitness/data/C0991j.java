package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.j */
public class C0991j implements Parcelable.Creator<Field> {
    /* renamed from: a */
    static void m1740a(Field field, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, field.getName(), false);
        C0723b.m775c(parcel, 1000, field.getVersionCode());
        C0723b.m775c(parcel, 2, field.getFormat());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: by */
    public Field createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new Field(i, str, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cR */
    public Field[] newArray(int i) {
        return new Field[i];
    }
}
