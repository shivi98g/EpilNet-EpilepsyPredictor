package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.common.api.e */
public class C0690e implements Parcelable.Creator<Scope> {
    /* renamed from: a */
    static void m597a(Scope scope, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, scope.f660CK);
        C0723b.m763a(parcel, 2, scope.mo10975gO(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: am */
    public Scope[] newArray(int i) {
        return new Scope[i];
    }

    /* renamed from: z */
    public Scope createFromParcel(Parcel parcel) {
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
            return new Scope(i, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
