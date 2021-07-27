package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

public class AppContentSectionEntityCreator implements Parcelable.Creator<AppContentSectionEntity> {
    /* renamed from: a */
    static void m2176a(AppContentSectionEntity appContentSectionEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, appContentSectionEntity.getActions(), false);
        C0723b.m775c(parcel, 1000, appContentSectionEntity.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) appContentSectionEntity.mo13248kY(), i, false);
        C0723b.m776c(parcel, 3, appContentSectionEntity.mo13249kZ(), false);
        C0723b.m763a(parcel, 4, appContentSectionEntity.mo13245kI(), false);
        C0723b.m756a(parcel, 5, appContentSectionEntity.mo13246kP(), false);
        C0723b.m763a(parcel, 6, appContentSectionEntity.mo13247kQ(), false);
        C0723b.m763a(parcel, 7, appContentSectionEntity.getTitle(), false);
        C0723b.m763a(parcel, 8, appContentSectionEntity.getType(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cr */
    public AppContentSectionEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList arrayList = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, AppContentActionEntity.CREATOR);
                        break;
                    case 2:
                        uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                        break;
                    case 3:
                        arrayList2 = C0721a.m723c(parcel, F, AppContentCardEntity.CREATOR);
                        break;
                    case 4:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 5:
                        bundle = C0721a.m738q(parcel, F);
                        break;
                    case 6:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 7:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    case 8:
                        str4 = C0721a.m736o(parcel, F);
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
            return new AppContentSectionEntity(i, arrayList, uri, arrayList2, str, bundle, str2, str3, str4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dM */
    public AppContentSectionEntity[] newArray(int i) {
        return new AppContentSectionEntity[i];
    }
}
