package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.a */
public class C0661a implements Parcelable.Creator<ApplicationMetadata> {
    /* renamed from: a */
    static void m462a(ApplicationMetadata applicationMetadata, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, applicationMetadata.getVersionCode());
        C0723b.m763a(parcel, 2, applicationMetadata.getApplicationId(), false);
        C0723b.m763a(parcel, 3, applicationMetadata.getName(), false);
        C0723b.m776c(parcel, 4, applicationMetadata.getImages(), false);
        C0723b.m774b(parcel, 5, applicationMetadata.f460Fq, false);
        C0723b.m763a(parcel, 6, applicationMetadata.getSenderAppIdentifier(), false);
        C0723b.m759a(parcel, 7, (Parcelable) applicationMetadata.mo10600fP(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: V */
    public ApplicationMetadata[] newArray(int i) {
        return new ApplicationMetadata[i];
    }

    /* renamed from: u */
    public ApplicationMetadata createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        ArrayList<WebImage> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Uri uri = null;
        int i = 0;
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
                case 4:
                    arrayList = C0721a.m723c(parcel, F, WebImage.CREATOR);
                    break;
                case 5:
                    arrayList2 = C0721a.m710C(parcel, F);
                    break;
                case 6:
                    str3 = C0721a.m736o(parcel, F);
                    break;
                case 7:
                    uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ApplicationMetadata(i, str, str2, arrayList, arrayList2, str3, uri);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
