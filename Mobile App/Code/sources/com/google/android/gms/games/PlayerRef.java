package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

public final class PlayerRef extends C0705d implements Player {

    /* renamed from: Xm */
    private final PlayerLevelInfo f1705Xm;

    /* renamed from: Xv */
    private final PlayerColumnNames f1706Xv;

    /* renamed from: Xw */
    private final MostRecentGameInfoRef f1707Xw;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, (String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        PlayerLevel playerLevel;
        this.f1706Xv = new PlayerColumnNames(str);
        this.f1707Xw = new MostRecentGameInfoRef(dataHolder, i, this.f1706Xv);
        if (m2071kG()) {
            int integer = getInteger(this.f1706Xv.acV);
            int integer2 = getInteger(this.f1706Xv.acY);
            PlayerLevel playerLevel2 = new PlayerLevel(integer, getLong(this.f1706Xv.acW), getLong(this.f1706Xv.acX));
            if (integer != integer2) {
                playerLevel = new PlayerLevel(integer2, getLong(this.f1706Xv.acX), getLong(this.f1706Xv.acZ));
            } else {
                playerLevel = playerLevel2;
            }
            this.f1705Xm = new PlayerLevelInfo(getLong(this.f1706Xv.acU), getLong(this.f1706Xv.ada), playerLevel2, playerLevel);
            return;
        }
        this.f1705Xm = null;
    }

    /* renamed from: kG */
    private boolean m2071kG() {
        return !mo11082aS(this.f1706Xv.acU) && getLong(this.f1706Xv.acU) != -1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return PlayerEntity.m2057a(this, obj);
    }

    public Player freeze() {
        return new PlayerEntity(this);
    }

    public String getDisplayName() {
        return getString(this.f1706Xv.acM);
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        mo11079a(this.f1706Xv.acM, charArrayBuffer);
    }

    public Uri getHiResImageUri() {
        return mo11081aR(this.f1706Xv.acP);
    }

    public String getHiResImageUrl() {
        return getString(this.f1706Xv.acQ);
    }

    public Uri getIconImageUri() {
        return mo11081aR(this.f1706Xv.acN);
    }

    public String getIconImageUrl() {
        return getString(this.f1706Xv.acO);
    }

    public long getLastPlayedWithTimestamp() {
        if (!mo11080aQ(this.f1706Xv.acT) || mo11082aS(this.f1706Xv.acT)) {
            return -1;
        }
        return getLong(this.f1706Xv.acT);
    }

    public PlayerLevelInfo getLevelInfo() {
        return this.f1705Xm;
    }

    public String getPlayerId() {
        return getString(this.f1706Xv.acL);
    }

    public long getRetrievedTimestamp() {
        return getLong(this.f1706Xv.acR);
    }

    public String getTitle() {
        return getString(this.f1706Xv.adb);
    }

    public void getTitle(CharArrayBuffer charArrayBuffer) {
        mo11079a(this.f1706Xv.adb, charArrayBuffer);
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return PlayerEntity.m2058b((Player) this);
    }

    public boolean isProfileVisible() {
        return getBoolean(this.f1706Xv.add);
    }

    /* renamed from: kE */
    public int mo13061kE() {
        return getInteger(this.f1706Xv.acS);
    }

    /* renamed from: kF */
    public MostRecentGameInfo mo13062kF() {
        if (mo11082aS(this.f1706Xv.ade)) {
            return null;
        }
        return this.f1707Xw;
    }

    public String toString() {
        return PlayerEntity.m2061c(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) freeze()).writeToParcel(parcel, i);
    }
}
