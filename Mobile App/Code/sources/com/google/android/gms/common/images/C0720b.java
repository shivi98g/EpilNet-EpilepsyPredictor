package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.common.images.b */
public class C0720b implements Parcelable.Creator<WebImage> {
    /* renamed from: a */
    static void m705a(WebImage webImage, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, webImage.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) webImage.getUrl(), i, false);
        C0723b.m775c(parcel, 3, webImage.getWidth());
        C0723b.m775c(parcel, 4, webImage.getHeight());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: C */
    public WebImage createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new WebImage(i, uri, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aA */
    public WebImage[] newArray(int i) {
        return new WebImage[i];
    }
}
