package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class GameBadgeEntityCreator implements Parcelable.Creator<GameBadgeEntity> {
    /* renamed from: a */
    static void m3611a(GameBadgeEntity gameBadgeEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, gameBadgeEntity.getType());
        C0723b.m775c(parcel, 1000, gameBadgeEntity.getVersionCode());
        C0723b.m763a(parcel, 2, gameBadgeEntity.getTitle(), false);
        C0723b.m763a(parcel, 3, gameBadgeEntity.getDescription(), false);
        C0723b.m759a(parcel, 4, (Parcelable) gameBadgeEntity.getIconImageUri(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cv */
    public GameBadgeEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 4:
                        uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
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
            return new GameBadgeEntity(i, i2, str, str2, uri);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ed */
    public GameBadgeEntity[] newArray(int i) {
        return new GameBadgeEntity[i];
    }
}
