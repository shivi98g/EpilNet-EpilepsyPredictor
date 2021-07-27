package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.j */
public class C2788j implements Parcelable.Creator<DataItemAssetParcelable> {
    /* renamed from: a */
    static void m8171a(DataItemAssetParcelable dataItemAssetParcelable, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, dataItemAssetParcelable.f4535CK);
        C0723b.m763a(parcel, 2, dataItemAssetParcelable.getId(), false);
        C0723b.m763a(parcel, 3, dataItemAssetParcelable.getDataItemKey(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ep */
    public DataItemAssetParcelable createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
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
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new DataItemAssetParcelable(i, str, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gy */
    public DataItemAssetParcelable[] newArray(int i) {
        return new DataItemAssetParcelable[i];
    }
}
