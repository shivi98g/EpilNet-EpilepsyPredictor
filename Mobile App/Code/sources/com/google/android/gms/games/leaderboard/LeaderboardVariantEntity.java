package com.google.android.gms.games.leaderboard;

import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.internal.C1781jv;

public final class LeaderboardVariantEntity implements LeaderboardVariant {
    private final int adF;
    private final int adG;
    private final boolean adH;
    private final long adI;
    private final String adJ;
    private final long adK;
    private final String adL;
    private final String adM;
    private final long adN;
    private final String adO;
    private final String adP;
    private final String adQ;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardVariant) {
        this.adF = leaderboardVariant.getTimeSpan();
        this.adG = leaderboardVariant.getCollection();
        this.adH = leaderboardVariant.hasPlayerInfo();
        this.adI = leaderboardVariant.getRawPlayerScore();
        this.adJ = leaderboardVariant.getDisplayPlayerScore();
        this.adK = leaderboardVariant.getPlayerRank();
        this.adL = leaderboardVariant.getDisplayPlayerRank();
        this.adM = leaderboardVariant.getPlayerScoreTag();
        this.adN = leaderboardVariant.getNumScores();
        this.adO = leaderboardVariant.mo14307mK();
        this.adP = leaderboardVariant.mo14308mL();
        this.adQ = leaderboardVariant.mo14309mM();
    }

    /* renamed from: a */
    static int m3687a(LeaderboardVariant leaderboardVariant) {
        return C1781jv.hashCode(Integer.valueOf(leaderboardVariant.getTimeSpan()), Integer.valueOf(leaderboardVariant.getCollection()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo()), Long.valueOf(leaderboardVariant.getRawPlayerScore()), leaderboardVariant.getDisplayPlayerScore(), Long.valueOf(leaderboardVariant.getPlayerRank()), leaderboardVariant.getDisplayPlayerRank(), Long.valueOf(leaderboardVariant.getNumScores()), leaderboardVariant.mo14307mK(), leaderboardVariant.mo14309mM(), leaderboardVariant.mo14308mL());
    }

    /* renamed from: a */
    static boolean m3688a(LeaderboardVariant leaderboardVariant, Object obj) {
        if (!(obj instanceof LeaderboardVariant)) {
            return false;
        }
        if (leaderboardVariant == obj) {
            return true;
        }
        LeaderboardVariant leaderboardVariant2 = (LeaderboardVariant) obj;
        return C1781jv.equal(Integer.valueOf(leaderboardVariant2.getTimeSpan()), Integer.valueOf(leaderboardVariant.getTimeSpan())) && C1781jv.equal(Integer.valueOf(leaderboardVariant2.getCollection()), Integer.valueOf(leaderboardVariant.getCollection())) && C1781jv.equal(Boolean.valueOf(leaderboardVariant2.hasPlayerInfo()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo())) && C1781jv.equal(Long.valueOf(leaderboardVariant2.getRawPlayerScore()), Long.valueOf(leaderboardVariant.getRawPlayerScore())) && C1781jv.equal(leaderboardVariant2.getDisplayPlayerScore(), leaderboardVariant.getDisplayPlayerScore()) && C1781jv.equal(Long.valueOf(leaderboardVariant2.getPlayerRank()), Long.valueOf(leaderboardVariant.getPlayerRank())) && C1781jv.equal(leaderboardVariant2.getDisplayPlayerRank(), leaderboardVariant.getDisplayPlayerRank()) && C1781jv.equal(Long.valueOf(leaderboardVariant2.getNumScores()), Long.valueOf(leaderboardVariant.getNumScores())) && C1781jv.equal(leaderboardVariant2.mo14307mK(), leaderboardVariant.mo14307mK()) && C1781jv.equal(leaderboardVariant2.mo14309mM(), leaderboardVariant.mo14309mM()) && C1781jv.equal(leaderboardVariant2.mo14308mL(), leaderboardVariant.mo14308mL());
    }

    /* renamed from: b */
    static String m3689b(LeaderboardVariant leaderboardVariant) {
        return C1781jv.m5348h(leaderboardVariant).mo15935a("TimeSpan", TimeSpan.m3547dZ(leaderboardVariant.getTimeSpan())).mo15935a("Collection", LeaderboardCollection.m3544dZ(leaderboardVariant.getCollection())).mo15935a("RawPlayerScore", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getRawPlayerScore()) : "none").mo15935a("DisplayPlayerScore", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerScore() : "none").mo15935a("PlayerRank", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getPlayerRank()) : "none").mo15935a("DisplayPlayerRank", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerRank() : "none").mo15935a("NumScores", Long.valueOf(leaderboardVariant.getNumScores())).mo15935a("TopPageNextToken", leaderboardVariant.mo14307mK()).mo15935a("WindowPageNextToken", leaderboardVariant.mo14309mM()).mo15935a("WindowPagePrevToken", leaderboardVariant.mo14308mL()).toString();
    }

    public boolean equals(Object obj) {
        return m3688a(this, obj);
    }

    public int getCollection() {
        return this.adG;
    }

    public String getDisplayPlayerRank() {
        return this.adL;
    }

    public String getDisplayPlayerScore() {
        return this.adJ;
    }

    public long getNumScores() {
        return this.adN;
    }

    public long getPlayerRank() {
        return this.adK;
    }

    public String getPlayerScoreTag() {
        return this.adM;
    }

    public long getRawPlayerScore() {
        return this.adI;
    }

    public int getTimeSpan() {
        return this.adF;
    }

    public boolean hasPlayerInfo() {
        return this.adH;
    }

    public int hashCode() {
        return m3687a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mK */
    public String mo14307mK() {
        return this.adO;
    }

    /* renamed from: mL */
    public String mo14308mL() {
        return this.adP;
    }

    /* renamed from: mM */
    public String mo14309mM() {
        return this.adQ;
    }

    /* renamed from: mN */
    public LeaderboardVariant freeze() {
        return this;
    }

    public String toString() {
        return m3689b(this);
    }
}
