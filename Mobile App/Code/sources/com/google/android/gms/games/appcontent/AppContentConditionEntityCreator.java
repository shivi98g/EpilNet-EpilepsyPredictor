package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class AppContentConditionEntityCreator implements Parcelable.Creator<AppContentConditionEntity> {
    /* renamed from: a */
    static void m2150a(AppContentConditionEntity appContentConditionEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, appContentConditionEntity.mo13223kT(), false);
        C0723b.m775c(parcel, 1000, appContentConditionEntity.getVersionCode());
        C0723b.m763a(parcel, 2, appContentConditionEntity.mo13224kU(), false);
        C0723b.m763a(parcel, 3, appContentConditionEntity.mo13225kV(), false);
        C0723b.m756a(parcel, 4, appContentConditionEntity.mo13226kW(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cq */
    public AppContentConditionEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
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
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    case 4:
                        bundle = C0721a.m738q(parcel, F);
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
            return new AppContentConditionEntity(i, str, str2, str3, bundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dL */
    public AppContentConditionEntity[] newArray(int i) {
        return new AppContentConditionEntity[i];
    }
}
