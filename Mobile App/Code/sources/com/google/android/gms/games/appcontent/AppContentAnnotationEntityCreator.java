package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class AppContentAnnotationEntityCreator implements Parcelable.Creator<AppContentAnnotationEntity> {
    /* renamed from: a */
    static void m2101a(AppContentAnnotationEntity appContentAnnotationEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, appContentAnnotationEntity.getDescription(), false);
        C0723b.m775c(parcel, 1000, appContentAnnotationEntity.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) appContentAnnotationEntity.mo13179kL(), i, false);
        C0723b.m763a(parcel, 3, appContentAnnotationEntity.getTitle(), false);
        C0723b.m763a(parcel, 4, appContentAnnotationEntity.getType(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: co */
    public AppContentAnnotationEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                        break;
                    case 3:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 4:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new AppContentAnnotationEntity(i, str, uri, str2, str3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dJ */
    public AppContentAnnotationEntity[] newArray(int i) {
        return new AppContentAnnotationEntity[i];
    }
}
