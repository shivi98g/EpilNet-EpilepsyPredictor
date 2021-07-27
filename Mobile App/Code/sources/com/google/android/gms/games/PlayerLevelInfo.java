package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

public final class PlayerLevelInfo implements SafeParcelable {
    public static final PlayerLevelInfoCreator CREATOR = new PlayerLevelInfoCreator();

    /* renamed from: CK */
    private final int f1700CK;

    /* renamed from: Xr */
    private final long f1701Xr;

    /* renamed from: Xs */
    private final long f1702Xs;

    /* renamed from: Xt */
    private final PlayerLevel f1703Xt;

    /* renamed from: Xu */
    private final PlayerLevel f1704Xu;

    PlayerLevelInfo(int i, long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        C1785jx.m5353K(j != -1);
        C1785jx.m5364i(playerLevel);
        C1785jx.m5364i(playerLevel2);
        this.f1700CK = i;
        this.f1701Xr = j;
        this.f1702Xs = j2;
        this.f1703Xt = playerLevel;
        this.f1704Xu = playerLevel2;
    }

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        this(1, j, j2, playerLevel, playerLevel2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return C1781jv.equal(Long.valueOf(this.f1701Xr), Long.valueOf(playerLevelInfo.f1701Xr)) && C1781jv.equal(Long.valueOf(this.f1702Xs), Long.valueOf(playerLevelInfo.f1702Xs)) && C1781jv.equal(this.f1703Xt, playerLevelInfo.f1703Xt) && C1781jv.equal(this.f1704Xu, playerLevelInfo.f1704Xu);
    }

    public PlayerLevel getCurrentLevel() {
        return this.f1703Xt;
    }

    public long getCurrentXpTotal() {
        return this.f1701Xr;
    }

    public long getLastLevelUpTimestamp() {
        return this.f1702Xs;
    }

    public PlayerLevel getNextLevel() {
        return this.f1704Xu;
    }

    public int getVersionCode() {
        return this.f1700CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Long.valueOf(this.f1701Xr), Long.valueOf(this.f1702Xs), this.f1703Xt, this.f1704Xu);
    }

    public boolean isMaxLevel() {
        return this.f1703Xt.equals(this.f1704Xu);
    }

    public void writeToParcel(Parcel parcel, int i) {
        PlayerLevelInfoCreator.m2070a(this, parcel, i);
    }
}
