package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

public class AppContentCardEntityCreator implements Parcelable.Creator<AppContentCardEntity> {
    /* renamed from: a */
    static void m2126a(AppContentCardEntity appContentCardEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, appContentCardEntity.getActions(), false);
        C0723b.m775c(parcel, 1000, appContentCardEntity.getVersionCode());
        C0723b.m776c(parcel, 2, appContentCardEntity.mo13203kN(), false);
        C0723b.m776c(parcel, 3, appContentCardEntity.mo13200kH(), false);
        C0723b.m763a(parcel, 4, appContentCardEntity.mo13201kI(), false);
        C0723b.m775c(parcel, 5, appContentCardEntity.mo13204kO());
        C0723b.m763a(parcel, 6, appContentCardEntity.getDescription(), false);
        C0723b.m756a(parcel, 7, appContentCardEntity.mo13205kP(), false);
        C0723b.m759a(parcel, 8, (Parcelable) appContentCardEntity.getIconImageUri(), i, false);
        C0723b.m759a(parcel, 9, (Parcelable) appContentCardEntity.mo13202kL(), i, false);
        C0723b.m763a(parcel, 10, appContentCardEntity.mo13206kQ(), false);
        C0723b.m763a(parcel, 11, appContentCardEntity.getTitle(), false);
        C0723b.m775c(parcel, 12, appContentCardEntity.mo13207kR());
        C0723b.m763a(parcel, 13, appContentCardEntity.getType(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cp */
    public AppContentCardEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel2, F, AppContentActionEntity.CREATOR);
                        break;
                    case 2:
                        arrayList2 = C0721a.m723c(parcel2, F, AppContentAnnotationEntity.CREATOR);
                        break;
                    case 3:
                        arrayList3 = C0721a.m723c(parcel2, F, AppContentConditionEntity.CREATOR);
                        break;
                    case 4:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 5:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 6:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 7:
                        bundle = C0721a.m738q(parcel2, F);
                        break;
                    case 8:
                        uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 9:
                        uri2 = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 10:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 11:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    case 12:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 13:
                        str5 = C0721a.m736o(parcel2, F);
                        break;
                    default:
                        C0721a.m721b(parcel2, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new AppContentCardEntity(i, arrayList, arrayList2, arrayList3, str, i2, str2, bundle, uri, uri2, str3, str4, i3, str5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: dK */
    public AppContentCardEntity[] newArray(int i) {
        return new AppContentCardEntity[i];
    }
}
