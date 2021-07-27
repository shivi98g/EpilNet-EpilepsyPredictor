package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.u */
public class C1006u implements Parcelable.Creator<Value> {
    /* renamed from: a */
    static void m1772a(Value value, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, value.getFormat());
        C0723b.m775c(parcel, 1000, value.getVersionCode());
        C0723b.m766a(parcel, 2, value.isSet());
        C0723b.m754a(parcel, 3, value.mo12424jL());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bF */
    public Value createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        z = C0721a.m724c(parcel, F);
                        break;
                    case 3:
                        f = C0721a.m733l(parcel, F);
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
            return new Value(i, i2, z, f);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cZ */
    public Value[] newArray(int i) {
        return new Value[i];
    }
}
