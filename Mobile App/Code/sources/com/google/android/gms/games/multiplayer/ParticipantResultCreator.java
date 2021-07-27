package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class ParticipantResultCreator implements Parcelable.Creator<ParticipantResult> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3725a(ParticipantResult participantResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, participantResult.getParticipantId(), false);
        C0723b.m775c(parcel, 1000, participantResult.getVersionCode());
        C0723b.m775c(parcel, 2, participantResult.getResult());
        C0723b.m775c(parcel, 3, participantResult.getPlacing());
        C0723b.m751H(parcel, H);
    }

    public ParticipantResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 3:
                        i3 = C0721a.m728g(parcel, F);
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
            return new ParticipantResult(i, str, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public ParticipantResult[] newArray(int i) {
        return new ParticipantResult[i];
    }
}
