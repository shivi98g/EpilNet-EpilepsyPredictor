package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;

public class GameRequestEntityCreator implements Parcelable.Creator<GameRequestEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3786a(GameRequestEntity gameRequestEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) gameRequestEntity.getGame(), i, false);
        C0723b.m775c(parcel, 1000, gameRequestEntity.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) gameRequestEntity.getSender(), i, false);
        C0723b.m767a(parcel, 3, gameRequestEntity.getData(), false);
        C0723b.m763a(parcel, 4, gameRequestEntity.getRequestId(), false);
        C0723b.m776c(parcel, 5, gameRequestEntity.getRecipients(), false);
        C0723b.m775c(parcel, 7, gameRequestEntity.getType());
        C0723b.m755a(parcel, 9, gameRequestEntity.getCreationTimestamp());
        C0723b.m755a(parcel, 10, gameRequestEntity.getExpirationTimestamp());
        C0723b.m756a(parcel, 11, gameRequestEntity.mo14554mS(), false);
        C0723b.m775c(parcel, 12, gameRequestEntity.getStatus());
        C0723b.m751H(parcel, H);
    }

    public GameRequestEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        byte[] bArr = null;
        String str = null;
        ArrayList<PlayerEntity> arrayList = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 7) {
                i2 = C0721a.m728g(parcel2, F);
            } else if (aH != 1000) {
                switch (aH) {
                    case 1:
                        gameEntity = (GameEntity) C0721a.m716a(parcel2, F, GameEntity.CREATOR);
                        break;
                    case 2:
                        playerEntity = (PlayerEntity) C0721a.m716a(parcel2, F, PlayerEntity.CREATOR);
                        break;
                    case 3:
                        bArr = C0721a.m739r(parcel2, F);
                        break;
                    case 4:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 5:
                        arrayList = C0721a.m723c(parcel2, F, PlayerEntity.CREATOR);
                        break;
                    default:
                        switch (aH) {
                            case 9:
                                j = C0721a.m730i(parcel2, F);
                                break;
                            case 10:
                                j2 = C0721a.m730i(parcel2, F);
                                break;
                            case 11:
                                bundle = C0721a.m738q(parcel2, F);
                                break;
                            case 12:
                                i3 = C0721a.m728g(parcel2, F);
                                break;
                            default:
                                C0721a.m721b(parcel2, F);
                                break;
                        }
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new GameRequestEntity(i, gameEntity, playerEntity, bArr, str, arrayList, i2, j, j2, bundle, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    public GameRequestEntity[] newArray(int i) {
        return new GameRequestEntity[i];
    }
}
