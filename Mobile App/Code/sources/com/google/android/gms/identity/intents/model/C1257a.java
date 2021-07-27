package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.identity.intents.model.a */
public class C1257a implements Parcelable.Creator<CountrySpecification> {
    /* renamed from: a */
    static void m3822a(CountrySpecification countrySpecification, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, countrySpecification.getVersionCode());
        C0723b.m763a(parcel, 2, countrySpecification.f2177vk, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cG */
    public CountrySpecification createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CountrySpecification(i, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: et */
    public CountrySpecification[] newArray(int i) {
        return new CountrySpecification[i];
    }
}
