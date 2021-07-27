package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.a */
public class C2701a implements Parcelable.Creator<Asset> {
    /* renamed from: a */
    static void m7907a(Asset asset, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, asset.f4522CK);
        C0723b.m767a(parcel, 2, asset.getData(), false);
        C0723b.m763a(parcel, 3, asset.getDigest(), false);
        C0723b.m759a(parcel, 4, (Parcelable) asset.axb, i, false);
        C0723b.m759a(parcel, 5, (Parcelable) asset.uri, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: el */
    public Asset createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        byte[] bArr = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    bArr = C0721a.m739r(parcel, F);
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C0721a.m716a(parcel, F, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new Asset(i, bArr, str, parcelFileDescriptor, uri);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gu */
    public Asset[] newArray(int i) {
        return new Asset[i];
    }
}
