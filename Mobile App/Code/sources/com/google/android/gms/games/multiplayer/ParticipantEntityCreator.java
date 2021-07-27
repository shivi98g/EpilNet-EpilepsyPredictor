package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.PlayerEntity;

public class ParticipantEntityCreator implements Parcelable.Creator<ParticipantEntity> {
    /* renamed from: a */
    static void m3721a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, participantEntity.getParticipantId(), false);
        C0723b.m775c(parcel, 1000, participantEntity.getVersionCode());
        C0723b.m763a(parcel, 2, participantEntity.getDisplayName(), false);
        C0723b.m759a(parcel, 3, (Parcelable) participantEntity.getIconImageUri(), i, false);
        C0723b.m759a(parcel, 4, (Parcelable) participantEntity.getHiResImageUri(), i, false);
        C0723b.m775c(parcel, 5, participantEntity.getStatus());
        C0723b.m763a(parcel, 6, participantEntity.mo14349le(), false);
        C0723b.m766a(parcel, 7, participantEntity.isConnectedToRoom());
        C0723b.m759a(parcel, 8, (Parcelable) participantEntity.getPlayer(), i, false);
        C0723b.m775c(parcel, 9, participantEntity.getCapabilities());
        C0723b.m759a(parcel, 10, (Parcelable) participantEntity.getResult(), i, false);
        C0723b.m763a(parcel, 11, participantEntity.getIconImageUrl(), false);
        C0723b.m763a(parcel, 12, participantEntity.getHiResImageUrl(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cA */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        PlayerEntity playerEntity = null;
        ParticipantResult participantResult = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 3:
                        uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 4:
                        uri2 = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 5:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 6:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 7:
                        z = C0721a.m724c(parcel2, F);
                        break;
                    case 8:
                        playerEntity = (PlayerEntity) C0721a.m716a(parcel2, F, PlayerEntity.CREATOR);
                        break;
                    case 9:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 10:
                        participantResult = (ParticipantResult) C0721a.m716a(parcel2, F, ParticipantResult.CREATOR);
                        break;
                    case 11:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    case 12:
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
            return new ParticipantEntity(i, str, str2, uri, uri2, i2, str3, z, playerEntity, i3, participantResult, str4, str5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: em */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
