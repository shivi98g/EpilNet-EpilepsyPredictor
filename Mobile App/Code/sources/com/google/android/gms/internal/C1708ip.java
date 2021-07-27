package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.ip */
public class C1708ip implements Parcelable.Creator<C1707io> {
    /* renamed from: a */
    static void m5041a(C1707io ioVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, ioVar.getVersionCode());
        C0723b.m753a(parcel, 2, ioVar.mo15685fZ());
        C0723b.m766a(parcel, 3, ioVar.mo15688gi());
        C0723b.m775c(parcel, 4, ioVar.mo15689gj());
        C0723b.m759a(parcel, 5, (Parcelable) ioVar.getApplicationMetadata(), i, false);
        C0723b.m775c(parcel, 6, ioVar.mo15690gk());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ai */
    public C1707io[] newArray(int i) {
        return new C1707io[i];
    }

    /* renamed from: y */
    public C1707io createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        double d = 0.0d;
        ApplicationMetadata applicationMetadata = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    d = C0721a.m734m(parcel, F);
                    break;
                case 3:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) C0721a.m716a(parcel, F, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1707io(i, d, z, i2, applicationMetadata, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
