package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

public class AppContentActionEntityCreator implements Parcelable.Creator<AppContentActionEntity> {
    /* renamed from: a */
    static void m2088a(AppContentActionEntity appContentActionEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, appContentActionEntity.mo13158kH(), false);
        C0723b.m775c(parcel, 1000, appContentActionEntity.getVersionCode());
        C0723b.m763a(parcel, 2, appContentActionEntity.mo13159kI(), false);
        C0723b.m756a(parcel, 3, appContentActionEntity.getExtras(), false);
        C0723b.m763a(parcel, 4, appContentActionEntity.getLabel(), false);
        C0723b.m763a(parcel, 5, appContentActionEntity.mo13160kJ(), false);
        C0723b.m763a(parcel, 6, appContentActionEntity.getType(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cn */
    public AppContentActionEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList arrayList = null;
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
                        arrayList = C0721a.m723c(parcel, F, AppContentConditionEntity.CREATOR);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        bundle = C0721a.m738q(parcel, F);
                        break;
                    case 4:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 5:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    case 6:
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
            return new AppContentActionEntity(i, arrayList, str, bundle, str2, str3, str4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dI */
    public AppContentActionEntity[] newArray(int i) {
        return new AppContentActionEntity[i];
    }
}
