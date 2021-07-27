package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public class GameRequestClusterCreator implements Parcelable.Creator<GameRequestCluster> {
    /* renamed from: a */
    static void m3662a(GameRequestCluster gameRequestCluster, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, gameRequestCluster.mo14248mD(), false);
        C0723b.m775c(parcel, 1000, gameRequestCluster.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cy */
    public GameRequestCluster createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                arrayList = C0721a.m723c(parcel, F, GameRequestEntity.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new GameRequestCluster(i, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ej */
    public GameRequestCluster[] newArray(int i) {
        return new GameRequestCluster[i];
    }
}
