package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;

public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Parcelable.Creator<GameEntity> CREATOR = new GameEntityCreatorCompat();

    /* renamed from: CK */
    private final int f1636CK;

    /* renamed from: Fo */
    private final String f1637Fo;

    /* renamed from: OS */
    private final String f1638OS;

    /* renamed from: UO */
    private final String f1639UO;

    /* renamed from: WA */
    private final String f1640WA;

    /* renamed from: WB */
    private final String f1641WB;

    /* renamed from: WC */
    private final String f1642WC;

    /* renamed from: WD */
    private final Uri f1643WD;

    /* renamed from: WE */
    private final Uri f1644WE;

    /* renamed from: WF */
    private final Uri f1645WF;

    /* renamed from: WG */
    private final boolean f1646WG;

    /* renamed from: WH */
    private final boolean f1647WH;

    /* renamed from: WI */
    private final String f1648WI;

    /* renamed from: WJ */
    private final int f1649WJ;

    /* renamed from: WK */
    private final int f1650WK;

    /* renamed from: WL */
    private final int f1651WL;

    /* renamed from: WM */
    private final boolean f1652WM;

    /* renamed from: WN */
    private final boolean f1653WN;

    /* renamed from: WO */
    private final String f1654WO;

    /* renamed from: WP */
    private final String f1655WP;

    /* renamed from: WQ */
    private final String f1656WQ;

    /* renamed from: WR */
    private final boolean f1657WR;

    /* renamed from: WS */
    private final boolean f1658WS;

    /* renamed from: WT */
    private final boolean f1659WT;

    /* renamed from: WU */
    private final String f1660WU;

    static final class GameEntityCreatorCompat extends GameEntityCreator {
        GameEntityCreatorCompat() {
        }

        /* renamed from: cl */
        public GameEntity createFromParcel(Parcel parcel) {
            if (GameEntity.m2564c(GameEntity.m5171ht()) || GameEntity.m5169aW(GameEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            String readString8 = parcel.readString();
            Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
            String readString9 = parcel.readString();
            return new GameEntity(5, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString9 == null ? null : Uri.parse(readString9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, (String) null, (String) null, (String) null, false, false, false, (String) null);
        }
    }

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11) {
        this.f1636CK = i;
        this.f1637Fo = str;
        this.f1638OS = str2;
        this.f1640WA = str3;
        this.f1641WB = str4;
        this.f1639UO = str5;
        this.f1642WC = str6;
        this.f1643WD = uri;
        this.f1654WO = str8;
        this.f1644WE = uri2;
        this.f1655WP = str9;
        this.f1645WF = uri3;
        this.f1656WQ = str10;
        this.f1646WG = z;
        this.f1647WH = z2;
        this.f1648WI = str7;
        this.f1649WJ = i2;
        this.f1650WK = i3;
        this.f1651WL = i4;
        this.f1652WM = z3;
        this.f1653WN = z4;
        this.f1657WR = z5;
        this.f1658WS = z6;
        this.f1659WT = z7;
        this.f1660WU = str11;
    }

    public GameEntity(Game game) {
        this.f1636CK = 5;
        this.f1637Fo = game.getApplicationId();
        this.f1640WA = game.getPrimaryCategory();
        this.f1641WB = game.getSecondaryCategory();
        this.f1639UO = game.getDescription();
        this.f1642WC = game.getDeveloperName();
        this.f1638OS = game.getDisplayName();
        this.f1643WD = game.getIconImageUri();
        this.f1654WO = game.getIconImageUrl();
        this.f1644WE = game.getHiResImageUri();
        this.f1655WP = game.getHiResImageUrl();
        this.f1645WF = game.getFeaturedImageUri();
        this.f1656WQ = game.getFeaturedImageUrl();
        this.f1646WG = game.mo13018ky();
        this.f1647WH = game.mo13015kA();
        this.f1648WI = game.mo13016kB();
        this.f1649WJ = game.mo13017kC();
        this.f1650WK = game.getAchievementTotalCount();
        this.f1651WL = game.getLeaderboardCount();
        this.f1652WM = game.isRealTimeMultiplayerEnabled();
        this.f1653WN = game.isTurnBasedMultiplayerEnabled();
        this.f1657WR = game.isMuted();
        this.f1658WS = game.mo13019kz();
        this.f1659WT = game.areSnapshotsEnabled();
        this.f1660WU = game.getThemeColor();
    }

    /* renamed from: a */
    static int m2026a(Game game) {
        return C1781jv.hashCode(game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.mo13018ky()), Boolean.valueOf(game.mo13015kA()), game.mo13016kB(), Integer.valueOf(game.mo13017kC()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.mo13019kz()), Boolean.valueOf(game.areSnapshotsEnabled()), game.getThemeColor());
    }

    /* renamed from: a */
    static boolean m2027a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        if (C1781jv.equal(game2.getApplicationId(), game.getApplicationId()) && C1781jv.equal(game2.getDisplayName(), game.getDisplayName()) && C1781jv.equal(game2.getPrimaryCategory(), game.getPrimaryCategory()) && C1781jv.equal(game2.getSecondaryCategory(), game.getSecondaryCategory()) && C1781jv.equal(game2.getDescription(), game.getDescription()) && C1781jv.equal(game2.getDeveloperName(), game.getDeveloperName()) && C1781jv.equal(game2.getIconImageUri(), game.getIconImageUri()) && C1781jv.equal(game2.getHiResImageUri(), game.getHiResImageUri()) && C1781jv.equal(game2.getFeaturedImageUri(), game.getFeaturedImageUri()) && C1781jv.equal(Boolean.valueOf(game2.mo13018ky()), Boolean.valueOf(game.mo13018ky())) && C1781jv.equal(Boolean.valueOf(game2.mo13015kA()), Boolean.valueOf(game.mo13015kA())) && C1781jv.equal(game2.mo13016kB(), game.mo13016kB()) && C1781jv.equal(Integer.valueOf(game2.mo13017kC()), Integer.valueOf(game.mo13017kC())) && C1781jv.equal(Integer.valueOf(game2.getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) && C1781jv.equal(Integer.valueOf(game2.getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) && C1781jv.equal(Boolean.valueOf(game2.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()))) {
            if (C1781jv.equal(Boolean.valueOf(game2.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled() && C1781jv.equal(Boolean.valueOf(game2.isMuted()), Boolean.valueOf(game.isMuted())) && C1781jv.equal(Boolean.valueOf(game2.mo13019kz()), Boolean.valueOf(game.mo13019kz())))) && C1781jv.equal(Boolean.valueOf(game2.areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())) && C1781jv.equal(game2.getThemeColor(), game.getThemeColor())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static String m2028b(Game game) {
        return C1781jv.m5348h(game).mo15935a("ApplicationId", game.getApplicationId()).mo15935a("DisplayName", game.getDisplayName()).mo15935a("PrimaryCategory", game.getPrimaryCategory()).mo15935a("SecondaryCategory", game.getSecondaryCategory()).mo15935a("Description", game.getDescription()).mo15935a("DeveloperName", game.getDeveloperName()).mo15935a("IconImageUri", game.getIconImageUri()).mo15935a("IconImageUrl", game.getIconImageUrl()).mo15935a("HiResImageUri", game.getHiResImageUri()).mo15935a("HiResImageUrl", game.getHiResImageUrl()).mo15935a("FeaturedImageUri", game.getFeaturedImageUri()).mo15935a("FeaturedImageUrl", game.getFeaturedImageUrl()).mo15935a("PlayEnabledGame", Boolean.valueOf(game.mo13018ky())).mo15935a("InstanceInstalled", Boolean.valueOf(game.mo13015kA())).mo15935a("InstancePackageName", game.mo13016kB()).mo15935a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).mo15935a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).mo15935a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).mo15935a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).mo15935a("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).mo15935a("ThemeColor", game.getThemeColor()).toString();
    }

    public boolean areSnapshotsEnabled() {
        return this.f1659WT;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2027a(this, obj);
    }

    public Game freeze() {
        return this;
    }

    public int getAchievementTotalCount() {
        return this.f1650WK;
    }

    public String getApplicationId() {
        return this.f1637Fo;
    }

    public String getDescription() {
        return this.f1639UO;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1639UO, charArrayBuffer);
    }

    public String getDeveloperName() {
        return this.f1642WC;
    }

    public void getDeveloperName(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1642WC, charArrayBuffer);
    }

    public String getDisplayName() {
        return this.f1638OS;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1638OS, charArrayBuffer);
    }

    public Uri getFeaturedImageUri() {
        return this.f1645WF;
    }

    public String getFeaturedImageUrl() {
        return this.f1656WQ;
    }

    public Uri getHiResImageUri() {
        return this.f1644WE;
    }

    public String getHiResImageUrl() {
        return this.f1655WP;
    }

    public Uri getIconImageUri() {
        return this.f1643WD;
    }

    public String getIconImageUrl() {
        return this.f1654WO;
    }

    public int getLeaderboardCount() {
        return this.f1651WL;
    }

    public String getPrimaryCategory() {
        return this.f1640WA;
    }

    public String getSecondaryCategory() {
        return this.f1641WB;
    }

    public String getThemeColor() {
        return this.f1660WU;
    }

    public int getVersionCode() {
        return this.f1636CK;
    }

    public int hashCode() {
        return m2026a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isMuted() {
        return this.f1657WR;
    }

    public boolean isRealTimeMultiplayerEnabled() {
        return this.f1652WM;
    }

    public boolean isTurnBasedMultiplayerEnabled() {
        return this.f1653WN;
    }

    /* renamed from: kA */
    public boolean mo13015kA() {
        return this.f1647WH;
    }

    /* renamed from: kB */
    public String mo13016kB() {
        return this.f1648WI;
    }

    /* renamed from: kC */
    public int mo13017kC() {
        return this.f1649WJ;
    }

    /* renamed from: ky */
    public boolean mo13018ky() {
        return this.f1646WG;
    }

    /* renamed from: kz */
    public boolean mo13019kz() {
        return this.f1658WS;
    }

    public String toString() {
        return m2028b((Game) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo15802hu()) {
            GameEntityCreator.m2038a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f1637Fo);
        parcel.writeString(this.f1638OS);
        parcel.writeString(this.f1640WA);
        parcel.writeString(this.f1641WB);
        parcel.writeString(this.f1639UO);
        parcel.writeString(this.f1642WC);
        String str = null;
        parcel.writeString(this.f1643WD == null ? null : this.f1643WD.toString());
        parcel.writeString(this.f1644WE == null ? null : this.f1644WE.toString());
        if (this.f1645WF != null) {
            str = this.f1645WF.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.f1646WG ? 1 : 0);
        parcel.writeInt(this.f1647WH ? 1 : 0);
        parcel.writeString(this.f1648WI);
        parcel.writeInt(this.f1649WJ);
        parcel.writeInt(this.f1650WK);
        parcel.writeInt(this.f1651WL);
    }
}
