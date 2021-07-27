package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.p */
public class C0952p implements Parcelable.Creator<ParcelableCollaborator> {
    /* renamed from: a */
    static void m1567a(ParcelableCollaborator parcelableCollaborator, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, parcelableCollaborator.f1216CK);
        C0723b.m766a(parcel, 2, parcelableCollaborator.f1218SH);
        C0723b.m766a(parcel, 3, parcelableCollaborator.f1219SI);
        C0723b.m763a(parcel, 4, parcelableCollaborator.f1223vZ, false);
        C0723b.m763a(parcel, 5, parcelableCollaborator.f1220SJ, false);
        C0723b.m763a(parcel, 6, parcelableCollaborator.f1217OS, false);
        C0723b.m763a(parcel, 7, parcelableCollaborator.f1221SK, false);
        C0723b.m763a(parcel, 8, parcelableCollaborator.f1222SL, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: be */
    public ParcelableCollaborator createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
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
                    z = C0721a.m724c(parcel, F);
                    break;
                case 3:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                case 4:
                    str = C0721a.m736o(parcel, F);
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
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ParcelableCollaborator(i, z, z2, str, str2, str3, str4, str5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cu */
    public ParcelableCollaborator[] newArray(int i) {
        return new ParcelableCollaborator[i];
    }
}
