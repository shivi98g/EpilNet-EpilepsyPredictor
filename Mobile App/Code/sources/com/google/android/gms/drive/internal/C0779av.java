package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.internal.av */
public class C0779av implements Parcelable.Creator<OnResourceIdSetResponse> {
    /* renamed from: a */
    static void m1032a(OnResourceIdSetResponse onResourceIdSetResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onResourceIdSetResponse.getVersionCode());
        C0723b.m774b(parcel, 2, onResourceIdSetResponse.mo11439iF(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aA */
    public OnResourceIdSetResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m710C(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OnResourceIdSetResponse(i, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bP */
    public OnResourceIdSetResponse[] newArray(int i) {
        return new OnResourceIdSetResponse[i];
    }
}
