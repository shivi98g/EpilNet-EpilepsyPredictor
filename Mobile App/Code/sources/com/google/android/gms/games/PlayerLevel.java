package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

public final class PlayerLevel implements SafeParcelable {
    public static final PlayerLevelCreator CREATOR = new PlayerLevelCreator();

    /* renamed from: CK */
    private final int f1696CK;

    /* renamed from: Xo */
    private final int f1697Xo;

    /* renamed from: Xp */
    private final long f1698Xp;

    /* renamed from: Xq */
    private final long f1699Xq;

    PlayerLevel(int i, int i2, long j, long j2) {
        boolean z = false;
        C1785jx.m5355a(j >= 0, "Min XP must be positive!");
        C1785jx.m5355a(j2 > j ? true : z, "Max XP must be more than min XP!");
        this.f1696CK = i;
        this.f1697Xo = i2;
        this.f1698Xp = j;
        this.f1699Xq = j2;
    }

    public PlayerLevel(int i, long j, long j2) {
        this(1, i, j, j2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return C1781jv.equal(Integer.valueOf(playerLevel.getLevelNumber()), Integer.valueOf(getLevelNumber())) && C1781jv.equal(Long.valueOf(playerLevel.getMinXp()), Long.valueOf(getMinXp())) && C1781jv.equal(Long.valueOf(playerLevel.getMaxXp()), Long.valueOf(getMaxXp()));
    }

    public int getLevelNumber() {
        return this.f1697Xo;
    }

    public long getMaxXp() {
        return this.f1699Xq;
    }

    public long getMinXp() {
        return this.f1698Xp;
    }

    public int getVersionCode() {
        return this.f1696CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f1697Xo), Long.valueOf(this.f1698Xp), Long.valueOf(this.f1699Xq));
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("LevelNumber", Integer.valueOf(getLevelNumber())).mo15935a("MinXp", Long.valueOf(getMinXp())).mo15935a("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        PlayerLevelCreator.m2069a(this, parcel, i);
    }
}
