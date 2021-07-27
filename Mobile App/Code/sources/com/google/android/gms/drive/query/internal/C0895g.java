package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.query.internal.g */
public class C0895g implements Parcelable.Creator<HasFilter> {
    /* renamed from: a */
    static void m1376a(HasFilter hasFilter, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, hasFilter.f1189CK);
        C0723b.m759a(parcel, 1, (Parcelable) hasFilter.f1190Si, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aW */
    public HasFilter createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                metadataBundle = (MetadataBundle) C0721a.m716a(parcel, F, MetadataBundle.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new HasFilter(i, metadataBundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cl */
    public HasFilter[] newArray(int i) {
        return new HasFilter[i];
    }
}
