package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.C1742je;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new PlayerEntityCreatorCompat();

    /* renamed from: CK */
    private final int f1682CK;

    /* renamed from: OH */
    private final String f1683OH;

    /* renamed from: OS */
    private final String f1684OS;

    /* renamed from: WD */
    private final Uri f1685WD;

    /* renamed from: WE */
    private final Uri f1686WE;

    /* renamed from: WO */
    private final String f1687WO;

    /* renamed from: WP */
    private final String f1688WP;

    /* renamed from: Xh */
    private final String f1689Xh;

    /* renamed from: Xi */
    private final long f1690Xi;

    /* renamed from: Xj */
    private final int f1691Xj;

    /* renamed from: Xk */
    private final long f1692Xk;

    /* renamed from: Xl */
    private final MostRecentGameInfoEntity f1693Xl;

    /* renamed from: Xm */
    private final PlayerLevelInfo f1694Xm;

    /* renamed from: Xn */
    private final boolean f1695Xn;

    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator {
        PlayerEntityCreatorCompat() {
        }

        /* renamed from: cm */
        public PlayerEntity createFromParcel(Parcel parcel) {
            if (PlayerEntity.m2564c(PlayerEntity.m5171ht()) || PlayerEntity.m5169aW(PlayerEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            return new PlayerEntity(11, readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 == null ? null : Uri.parse(readString4), parcel.readLong(), -1, -1, (String) null, (String) null, (String) null, (MostRecentGameInfoEntity) null, (PlayerLevelInfo) null, true);
        }
    }

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j, int i2, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z) {
        this.f1682CK = i;
        this.f1689Xh = str;
        this.f1684OS = str2;
        this.f1685WD = uri;
        this.f1687WO = str3;
        this.f1686WE = uri2;
        this.f1688WP = str4;
        this.f1690Xi = j;
        this.f1691Xj = i2;
        this.f1692Xk = j2;
        this.f1683OH = str5;
        this.f1695Xn = z;
        this.f1693Xl = mostRecentGameInfoEntity;
        this.f1694Xm = playerLevelInfo;
    }

    public PlayerEntity(Player player) {
        this.f1682CK = 11;
        this.f1689Xh = player.getPlayerId();
        this.f1684OS = player.getDisplayName();
        this.f1685WD = player.getIconImageUri();
        this.f1687WO = player.getIconImageUrl();
        this.f1686WE = player.getHiResImageUri();
        this.f1688WP = player.getHiResImageUrl();
        this.f1690Xi = player.getRetrievedTimestamp();
        this.f1691Xj = player.mo13061kE();
        this.f1692Xk = player.getLastPlayedWithTimestamp();
        this.f1683OH = player.getTitle();
        this.f1695Xn = player.isProfileVisible();
        MostRecentGameInfo kF = player.mo13062kF();
        this.f1693Xl = kF == null ? null : new MostRecentGameInfoEntity(kF);
        this.f1694Xm = player.getLevelInfo();
        C1742je.m5156f(this.f1689Xh);
        C1742je.m5156f(this.f1684OS);
        C1742je.m5152K(this.f1690Xi > 0);
    }

    /* renamed from: a */
    static boolean m2057a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return C1781jv.equal(player2.getPlayerId(), player.getPlayerId()) && C1781jv.equal(player2.getDisplayName(), player.getDisplayName()) && C1781jv.equal(player2.getIconImageUri(), player.getIconImageUri()) && C1781jv.equal(player2.getHiResImageUri(), player.getHiResImageUri()) && C1781jv.equal(Long.valueOf(player2.getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) && C1781jv.equal(player2.getTitle(), player.getTitle()) && C1781jv.equal(player2.getLevelInfo(), player.getLevelInfo());
    }

    /* renamed from: b */
    static int m2058b(Player player) {
        return C1781jv.hashCode(player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo());
    }

    /* renamed from: c */
    static String m2061c(Player player) {
        return C1781jv.m5348h(player).mo15935a("PlayerId", player.getPlayerId()).mo15935a("DisplayName", player.getDisplayName()).mo15935a("IconImageUri", player.getIconImageUri()).mo15935a("IconImageUrl", player.getIconImageUrl()).mo15935a("HiResImageUri", player.getHiResImageUri()).mo15935a("HiResImageUrl", player.getHiResImageUrl()).mo15935a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).mo15935a("Title", player.getTitle()).mo15935a("LevelInfo", player.getLevelInfo()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2057a(this, obj);
    }

    public Player freeze() {
        return this;
    }

    public String getDisplayName() {
        return this.f1684OS;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1684OS, charArrayBuffer);
    }

    public Uri getHiResImageUri() {
        return this.f1686WE;
    }

    public String getHiResImageUrl() {
        return this.f1688WP;
    }

    public Uri getIconImageUri() {
        return this.f1685WD;
    }

    public String getIconImageUrl() {
        return this.f1687WO;
    }

    public long getLastPlayedWithTimestamp() {
        return this.f1692Xk;
    }

    public PlayerLevelInfo getLevelInfo() {
        return this.f1694Xm;
    }

    public String getPlayerId() {
        return this.f1689Xh;
    }

    public long getRetrievedTimestamp() {
        return this.f1690Xi;
    }

    public String getTitle() {
        return this.f1683OH;
    }

    public void getTitle(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1683OH, charArrayBuffer);
    }

    public int getVersionCode() {
        return this.f1682CK;
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return m2058b((Player) this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isProfileVisible() {
        return this.f1695Xn;
    }

    /* renamed from: kE */
    public int mo13061kE() {
        return this.f1691Xj;
    }

    /* renamed from: kF */
    public MostRecentGameInfo mo13062kF() {
        return this.f1693Xl;
    }

    public String toString() {
        return m2061c(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo15802hu()) {
            PlayerEntityCreator.m2066a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f1689Xh);
        parcel.writeString(this.f1684OS);
        String str = null;
        parcel.writeString(this.f1685WD == null ? null : this.f1685WD.toString());
        if (this.f1686WE != null) {
            str = this.f1686WE.toString();
        }
        parcel.writeString(str);
        parcel.writeLong(this.f1690Xi);
    }
}
