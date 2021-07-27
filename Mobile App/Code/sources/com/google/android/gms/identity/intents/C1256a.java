package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.identity.intents.a */
public class C1256a implements Parcelable.Creator<UserAddressRequest> {
    /* renamed from: a */
    static void m3819a(UserAddressRequest userAddressRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, userAddressRequest.getVersionCode());
        C0723b.m776c(parcel, 2, userAddressRequest.afH, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cF */
    public UserAddressRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList<CountrySpecification> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m723c(parcel, F, CountrySpecification.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new UserAddressRequest(i, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: es */
    public UserAddressRequest[] newArray(int i) {
        return new UserAddressRequest[i];
    }
}
