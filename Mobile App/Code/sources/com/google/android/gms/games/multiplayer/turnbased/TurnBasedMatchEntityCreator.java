package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class TurnBasedMatchEntityCreator implements Parcelable.Creator<TurnBasedMatchEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3759a(TurnBasedMatchEntity turnBasedMatchEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) turnBasedMatchEntity.getGame(), i, false);
        C0723b.m763a(parcel, 2, turnBasedMatchEntity.getMatchId(), false);
        C0723b.m763a(parcel, 3, turnBasedMatchEntity.getCreatorId(), false);
        C0723b.m755a(parcel, 4, turnBasedMatchEntity.getCreationTimestamp());
        C0723b.m763a(parcel, 5, turnBasedMatchEntity.getLastUpdaterId(), false);
        C0723b.m755a(parcel, 6, turnBasedMatchEntity.getLastUpdatedTimestamp());
        C0723b.m763a(parcel, 7, turnBasedMatchEntity.getPendingParticipantId(), false);
        C0723b.m775c(parcel, 8, turnBasedMatchEntity.getStatus());
        C0723b.m775c(parcel, 10, turnBasedMatchEntity.getVariant());
        C0723b.m775c(parcel, 11, turnBasedMatchEntity.getVersion());
        C0723b.m767a(parcel, 12, turnBasedMatchEntity.getData(), false);
        C0723b.m776c(parcel, 13, turnBasedMatchEntity.getParticipants(), false);
        C0723b.m763a(parcel, 14, turnBasedMatchEntity.getRematchId(), false);
        C0723b.m767a(parcel, 15, turnBasedMatchEntity.getPreviousMatchData(), false);
        C0723b.m756a(parcel, 17, turnBasedMatchEntity.getAutoMatchCriteria(), false);
        C0723b.m775c(parcel, 16, turnBasedMatchEntity.getMatchNumber());
        C0723b.m775c(parcel, 1000, turnBasedMatchEntity.getVersionCode());
        C0723b.m766a(parcel, 19, turnBasedMatchEntity.isLocallyModified());
        C0723b.m775c(parcel, 18, turnBasedMatchEntity.getTurnStatus());
        C0723b.m763a(parcel, 21, turnBasedMatchEntity.getDescriptionParticipantId(), false);
        C0723b.m763a(parcel, 20, turnBasedMatchEntity.getDescription(), false);
        C0723b.m751H(parcel, H);
    }

    public TurnBasedMatchEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        byte[] bArr = null;
        ArrayList<ParticipantEntity> arrayList = null;
        String str5 = null;
        byte[] bArr2 = null;
        Bundle bundle = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        gameEntity = (GameEntity) C0721a.m716a(parcel2, F, GameEntity.CREATOR);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 3:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 4:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 5:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 6:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 7:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    case 8:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    default:
                        switch (aH) {
                            case 10:
                                i3 = C0721a.m728g(parcel2, F);
                                break;
                            case 11:
                                i4 = C0721a.m728g(parcel2, F);
                                break;
                            case 12:
                                bArr = C0721a.m739r(parcel2, F);
                                break;
                            case 13:
                                arrayList = C0721a.m723c(parcel2, F, ParticipantEntity.CREATOR);
                                break;
                            case 14:
                                str5 = C0721a.m736o(parcel2, F);
                                break;
                            case 15:
                                bArr2 = C0721a.m739r(parcel2, F);
                                break;
                            case 16:
                                i5 = C0721a.m728g(parcel2, F);
                                break;
                            case 17:
                                bundle = C0721a.m738q(parcel2, F);
                                break;
                            case 18:
                                i6 = C0721a.m728g(parcel2, F);
                                break;
                            case 19:
                                z = C0721a.m724c(parcel2, F);
                                break;
                            case 20:
                                str6 = C0721a.m736o(parcel2, F);
                                break;
                            case 21:
                                str7 = C0721a.m736o(parcel2, F);
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
            return new TurnBasedMatchEntity(i, gameEntity, str, str2, j, str3, j2, str4, i2, i3, i4, bArr, arrayList, str5, bArr2, i5, bundle, i6, z, str6, str7);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    public TurnBasedMatchEntity[] newArray(int i) {
        return new TurnBasedMatchEntity[i];
    }
}
