package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.b */
public class C2647b implements Parcelable.Creator<Cart> {
    /* renamed from: a */
    static void m7724a(Cart cart, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, cart.getVersionCode());
        C0723b.m763a(parcel, 2, cart.auF, false);
        C0723b.m763a(parcel, 3, cart.auG, false);
        C0723b.m776c(parcel, 4, cart.auH, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dK */
    public Cart createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        ArrayList<LineItem> arrayList = new ArrayList<>();
        String str2 = null;
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
                    arrayList = C0721a.m723c(parcel, F, LineItem.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new Cart(i, str, str2, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fR */
    public Cart[] newArray(int i) {
        return new Cart[i];
    }
}
