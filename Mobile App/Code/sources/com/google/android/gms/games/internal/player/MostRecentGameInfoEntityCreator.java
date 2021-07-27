package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class MostRecentGameInfoEntityCreator implements Parcelable.Creator<MostRecentGameInfoEntity> {
    /* renamed from: a */
    static void m3649a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, mostRecentGameInfoEntity.mo14214mw(), false);
        C0723b.m775c(parcel, 1000, mostRecentGameInfoEntity.getVersionCode());
        C0723b.m763a(parcel, 2, mostRecentGameInfoEntity.mo14215mx(), false);
        C0723b.m755a(parcel, 3, mostRecentGameInfoEntity.mo14216my());
        C0723b.m759a(parcel, 4, (Parcelable) mostRecentGameInfoEntity.mo14217mz(), i, false);
        C0723b.m759a(parcel, 5, (Parcelable) mostRecentGameInfoEntity.mo14212mA(), i, false);
        C0723b.m759a(parcel, 6, (Parcelable) mostRecentGameInfoEntity.mo14213mB(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cx */
    public MostRecentGameInfoEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        int i = 0;
        long j = 0;
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
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 4:
                        uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                        break;
                    case 5:
                        uri2 = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                        break;
                    case 6:
                        uri3 = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
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
            return new MostRecentGameInfoEntity(i, str, str2, j, uri, uri2, uri3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ei */
    public MostRecentGameInfoEntity[] newArray(int i) {
        return new MostRecentGameInfoEntity[i];
    }
}
