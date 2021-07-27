package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.plus.internal.i */
public class C2444i implements Parcelable.Creator<C2443h> {
    /* renamed from: a */
    static void m7092a(C2443h hVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, hVar.getAccountName(), false);
        C0723b.m775c(parcel, 1000, hVar.getVersionCode());
        C0723b.m770a(parcel, 2, hVar.mo18493oz(), false);
        C0723b.m770a(parcel, 3, hVar.mo18485oA(), false);
        C0723b.m770a(parcel, 4, hVar.mo18486oB(), false);
        C0723b.m763a(parcel, 5, hVar.mo18487oC(), false);
        C0723b.m763a(parcel, 6, hVar.mo18488oD(), false);
        C0723b.m763a(parcel, 7, hVar.mo18489oE(), false);
        C0723b.m763a(parcel, 8, hVar.mo18490oF(), false);
        C0723b.m759a(parcel, 9, (Parcelable) hVar.mo18491oG(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dw */
    public C2443h createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PlusCommonExtras plusCommonExtras = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        strArr = C0721a.m708A(parcel, F);
                        break;
                    case 3:
                        strArr2 = C0721a.m708A(parcel, F);
                        break;
                    case 4:
                        strArr3 = C0721a.m708A(parcel, F);
                        break;
                    case 5:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 6:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    case 7:
                        str4 = C0721a.m736o(parcel, F);
                        break;
                    case 8:
                        str5 = C0721a.m736o(parcel, F);
                        break;
                    case 9:
                        plusCommonExtras = (PlusCommonExtras) C0721a.m716a(parcel, F, PlusCommonExtras.CREATOR);
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
            return new C2443h(i, str, strArr, strArr2, strArr3, str2, str3, str4, str5, plusCommonExtras);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fu */
    public C2443h[] newArray(int i) {
        return new C2443h[i];
    }
}
