package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.query.internal.b */
public class C0890b implements Parcelable.Creator<FieldOnlyFilter> {
    /* renamed from: a */
    static void m1359a(FieldOnlyFilter fieldOnlyFilter, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, fieldOnlyFilter.f1174CK);
        C0723b.m759a(parcel, 1, (Parcelable) fieldOnlyFilter.f1175Si, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aT */
    public FieldOnlyFilter createFromParcel(Parcel parcel) {
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
            return new FieldOnlyFilter(i, metadataBundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ci */
    public FieldOnlyFilter[] newArray(int i) {
        return new FieldOnlyFilter[i];
    }
}
