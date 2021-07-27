package com.google.android.gms.games.request;

import android.os.Parcel;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestRef extends C0705d implements GameRequest {

    /* renamed from: Ya */
    private final int f2161Ya;

    public GameRequestRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f2161Ya = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return GameRequestEntity.m3782a(this, obj);
    }

    public GameRequest freeze() {
        return new GameRequestEntity(this);
    }

    public long getCreationTimestamp() {
        return getLong("creation_timestamp");
    }

    public byte[] getData() {
        return getByteArray("data");
    }

    public long getExpirationTimestamp() {
        return getLong("expiration_timestamp");
    }

    public Game getGame() {
        return new GameRef(this.f790JG, this.f791KZ);
    }

    public int getRecipientStatus(String str) {
        for (int i = this.f791KZ; i < this.f791KZ + this.f2161Ya; i++) {
            int au = this.f790JG.mo11047au(i);
            if (this.f790JG.mo11049c("recipient_external_player_id", i, au).equals(str)) {
                return this.f790JG.mo11048b("recipient_status", i, au);
            }
        }
        return -1;
    }

    public List<Player> getRecipients() {
        ArrayList arrayList = new ArrayList(this.f2161Ya);
        for (int i = 0; i < this.f2161Ya; i++) {
            arrayList.add(new PlayerRef(this.f790JG, this.f791KZ + i, "recipient_"));
        }
        return arrayList;
    }

    public String getRequestId() {
        return getString("external_request_id");
    }

    public Player getSender() {
        return new PlayerRef(this.f790JG, mo11084gW(), "sender_");
    }

    public int getStatus() {
        return getInteger(NotificationCompat.CATEGORY_STATUS);
    }

    public int getType() {
        return getInteger("type");
    }

    public int hashCode() {
        return GameRequestEntity.m3781a(this);
    }

    public boolean isConsumed(String str) {
        return getRecipientStatus(str) == 1;
    }

    public String toString() {
        return GameRequestEntity.m3784c(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameRequestEntity) freeze()).writeToParcel(parcel, i);
    }
}
