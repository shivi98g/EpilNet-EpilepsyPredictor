package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C1742je;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;

public final class AchievementEntity implements SafeParcelable, Achievement {
    public static final AchievementEntityCreator CREATOR = new AchievementEntityCreator();

    /* renamed from: CK */
    private final int f1708CK;

    /* renamed from: Gt */
    private final int f1709Gt;

    /* renamed from: UO */
    private final String f1710UO;

    /* renamed from: XA */
    private final Uri f1711XA;

    /* renamed from: XB */
    private final String f1712XB;

    /* renamed from: XC */
    private final int f1713XC;

    /* renamed from: XD */
    private final String f1714XD;

    /* renamed from: XE */
    private final PlayerEntity f1715XE;

    /* renamed from: XF */
    private final int f1716XF;

    /* renamed from: XG */
    private final String f1717XG;

    /* renamed from: XH */
    private final long f1718XH;

    /* renamed from: XI */
    private final long f1719XI;

    /* renamed from: Xx */
    private final String f1720Xx;

    /* renamed from: Xy */
    private final Uri f1721Xy;

    /* renamed from: Xz */
    private final String f1722Xz;
    private final String mName;
    private final int mState;

    AchievementEntity(int i, String str, int i2, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i3, String str6, PlayerEntity playerEntity, int i4, int i5, String str7, long j, long j2) {
        this.f1708CK = i;
        this.f1720Xx = str;
        this.f1709Gt = i2;
        this.mName = str2;
        this.f1710UO = str3;
        this.f1721Xy = uri;
        this.f1722Xz = str4;
        this.f1711XA = uri2;
        this.f1712XB = str5;
        this.f1713XC = i3;
        this.f1714XD = str6;
        this.f1715XE = playerEntity;
        this.mState = i4;
        this.f1716XF = i5;
        this.f1717XG = str7;
        this.f1718XH = j;
        this.f1719XI = j2;
    }

    public AchievementEntity(Achievement achievement) {
        this.f1708CK = 1;
        this.f1720Xx = achievement.getAchievementId();
        this.f1709Gt = achievement.getType();
        this.mName = achievement.getName();
        this.f1710UO = achievement.getDescription();
        this.f1721Xy = achievement.getUnlockedImageUri();
        this.f1722Xz = achievement.getUnlockedImageUrl();
        this.f1711XA = achievement.getRevealedImageUri();
        this.f1712XB = achievement.getRevealedImageUrl();
        this.f1715XE = (PlayerEntity) achievement.getPlayer().freeze();
        this.mState = achievement.getState();
        this.f1718XH = achievement.getLastUpdatedTimestamp();
        this.f1719XI = achievement.getXpValue();
        if (achievement.getType() == 1) {
            this.f1713XC = achievement.getTotalSteps();
            this.f1714XD = achievement.getFormattedTotalSteps();
            this.f1716XF = achievement.getCurrentSteps();
            this.f1717XG = achievement.getFormattedCurrentSteps();
        } else {
            this.f1713XC = 0;
            this.f1714XD = null;
            this.f1716XF = 0;
            this.f1717XG = null;
        }
        C1742je.m5156f(this.f1720Xx);
        C1742je.m5156f(this.f1710UO);
    }

    /* renamed from: a */
    static int m2074a(Achievement achievement) {
        int i;
        int i2;
        if (achievement.getType() == 1) {
            i2 = achievement.getCurrentSteps();
            i = achievement.getTotalSteps();
        } else {
            i2 = 0;
            i = 0;
        }
        return C1781jv.hashCode(achievement.getAchievementId(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.getXpValue()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.getPlayer(), Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: a */
    static boolean m2075a(Achievement achievement, Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        Achievement achievement2 = (Achievement) obj;
        if (achievement.getType() == 1) {
            z2 = C1781jv.equal(Integer.valueOf(achievement2.getCurrentSteps()), Integer.valueOf(achievement.getCurrentSteps()));
            z = C1781jv.equal(Integer.valueOf(achievement2.getTotalSteps()), Integer.valueOf(achievement.getTotalSteps()));
        } else {
            z2 = true;
            z = true;
        }
        return C1781jv.equal(achievement2.getAchievementId(), achievement.getAchievementId()) && C1781jv.equal(achievement2.getName(), achievement.getName()) && C1781jv.equal(Integer.valueOf(achievement2.getType()), Integer.valueOf(achievement.getType())) && C1781jv.equal(achievement2.getDescription(), achievement.getDescription()) && C1781jv.equal(Long.valueOf(achievement2.getXpValue()), Long.valueOf(achievement.getXpValue())) && C1781jv.equal(Integer.valueOf(achievement2.getState()), Integer.valueOf(achievement.getState())) && C1781jv.equal(Long.valueOf(achievement2.getLastUpdatedTimestamp()), Long.valueOf(achievement.getLastUpdatedTimestamp())) && C1781jv.equal(achievement2.getPlayer(), achievement.getPlayer()) && z2 && z;
    }

    /* renamed from: b */
    static String m2076b(Achievement achievement) {
        C1781jv.C1783a a = C1781jv.m5348h(achievement).mo15935a("Id", achievement.getAchievementId()).mo15935a("Type", Integer.valueOf(achievement.getType())).mo15935a("Name", achievement.getName()).mo15935a("Description", achievement.getDescription()).mo15935a("Player", achievement.getPlayer()).mo15935a("State", Integer.valueOf(achievement.getState()));
        if (achievement.getType() == 1) {
            a.mo15935a("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            a.mo15935a("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return a.toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2075a(this, obj);
    }

    public Achievement freeze() {
        return this;
    }

    public String getAchievementId() {
        return this.f1720Xx;
    }

    public int getCurrentSteps() {
        return this.f1716XF;
    }

    public String getDescription() {
        return this.f1710UO;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1710UO, charArrayBuffer);
    }

    public String getFormattedCurrentSteps() {
        return this.f1717XG;
    }

    public void getFormattedCurrentSteps(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1717XG, charArrayBuffer);
    }

    public String getFormattedTotalSteps() {
        return this.f1714XD;
    }

    public void getFormattedTotalSteps(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1714XD, charArrayBuffer);
    }

    public long getLastUpdatedTimestamp() {
        return this.f1718XH;
    }

    public String getName() {
        return this.mName;
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.mName, charArrayBuffer);
    }

    public Player getPlayer() {
        return this.f1715XE;
    }

    public Uri getRevealedImageUri() {
        return this.f1711XA;
    }

    public String getRevealedImageUrl() {
        return this.f1712XB;
    }

    public int getState() {
        return this.mState;
    }

    public int getTotalSteps() {
        return this.f1713XC;
    }

    public int getType() {
        return this.f1709Gt;
    }

    public Uri getUnlockedImageUri() {
        return this.f1721Xy;
    }

    public String getUnlockedImageUrl() {
        return this.f1722Xz;
    }

    public int getVersionCode() {
        return this.f1708CK;
    }

    public long getXpValue() {
        return this.f1719XI;
    }

    public int hashCode() {
        return m2074a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m2076b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AchievementEntityCreator.m2077a(this, parcel, i);
    }
}
