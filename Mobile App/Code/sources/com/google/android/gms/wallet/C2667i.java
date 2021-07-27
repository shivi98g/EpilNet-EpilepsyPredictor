package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.i */
public class C2667i implements Parcelable.Creator<LineItem> {
    /* renamed from: a */
    static void m7826a(LineItem lineItem, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, lineItem.getVersionCode());
        C0723b.m763a(parcel, 2, lineItem.description, false);
        C0723b.m763a(parcel, 3, lineItem.auZ, false);
        C0723b.m763a(parcel, 4, lineItem.ava, false);
        C0723b.m763a(parcel, 5, lineItem.auF, false);
        C0723b.m775c(parcel, 6, lineItem.avb);
        C0723b.m763a(parcel, 7, lineItem.auG, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dQ */
    public LineItem createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    str3 = C0721a.m736o(parcel, F);
                    break;
                case 5:
                    str4 = C0721a.m736o(parcel, F);
                    break;
                case 6:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 7:
                    str5 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new LineItem(i, str, str2, str3, str4, i2, str5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fX */
    public LineItem[] newArray(int i) {
        return new LineItem[i];
    }
}
