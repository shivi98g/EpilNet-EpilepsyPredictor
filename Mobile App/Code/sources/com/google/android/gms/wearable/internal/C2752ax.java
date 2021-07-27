package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wearable.internal.ax */
public class C2752ax implements Parcelable.Creator<C2751aw> {
    /* renamed from: a */
    static void m8081a(C2751aw awVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, awVar.versionCode);
        C0723b.m775c(parcel, 2, awVar.statusCode);
        C0723b.m755a(parcel, 3, awVar.ayc);
        C0723b.m776c(parcel, 4, awVar.aye, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eE */
    public C2751aw createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        long j = 0;
        ArrayList<C2742an> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    j = C0721a.m730i(parcel, F);
                    break;
                case 4:
                    arrayList = C0721a.m723c(parcel, F, C2742an.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2751aw(i, i2, j, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gO */
    public C2751aw[] newArray(int i) {
        return new C2751aw[i];
    }
}
