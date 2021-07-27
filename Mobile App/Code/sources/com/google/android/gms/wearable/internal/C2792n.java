package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.n */
public class C2792n implements Parcelable.Creator<C2791m> {
    /* renamed from: a */
    static void m8179a(C2791m mVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, mVar.f4562CK);
        C0723b.m759a(parcel, 2, (Parcelable) mVar.getUri(), i, false);
        C0723b.m756a(parcel, 4, mVar.mo19608rk(), false);
        C0723b.m767a(parcel, 5, mVar.getData(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eq */
    public C2791m createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Uri uri = null;
        int i = 0;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                    break;
                case 4:
                    bundle = C0721a.m738q(parcel, F);
                    break;
                case 5:
                    bArr = C0721a.m739r(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2791m(i, uri, bundle, bArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gz */
    public C2791m[] newArray(int i) {
        return new C2791m[i];
    }
}
