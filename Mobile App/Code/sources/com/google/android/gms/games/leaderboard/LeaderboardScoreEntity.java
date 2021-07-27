package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1833le;

public final class LeaderboardScoreEntity implements LeaderboardScore {
    private final PlayerEntity adA;
    private final String adB;
    private final String adC;
    private final String adD;
    private final long ads;
    private final String adt;
    private final String adu;
    private final long adv;
    private final long adw;
    private final String adx;
    private final Uri ady;
    private final Uri adz;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardScore) {
        this.ads = leaderboardScore.getRank();
        this.adt = (String) C1785jx.m5364i(leaderboardScore.getDisplayRank());
        this.adu = (String) C1785jx.m5364i(leaderboardScore.getDisplayScore());
        this.adv = leaderboardScore.getRawScore();
        this.adw = leaderboardScore.getTimestampMillis();
        this.adx = leaderboardScore.getScoreHolderDisplayName();
        this.ady = leaderboardScore.getScoreHolderIconImageUri();
        this.adz = leaderboardScore.getScoreHolderHiResImageUri();
        Player scoreHolder = leaderboardScore.getScoreHolder();
        this.adA = scoreHolder == null ? null : (PlayerEntity) scoreHolder.freeze();
        this.adB = leaderboardScore.getScoreTag();
        this.adC = leaderboardScore.getScoreHolderIconImageUrl();
        this.adD = leaderboardScore.getScoreHolderHiResImageUrl();
    }

    /* renamed from: a */
    static int m3679a(LeaderboardScore leaderboardScore) {
        return C1781jv.hashCode(Long.valueOf(leaderboardScore.getRank()), leaderboardScore.getDisplayRank(), Long.valueOf(leaderboardScore.getRawScore()), leaderboardScore.getDisplayScore(), Long.valueOf(leaderboardScore.getTimestampMillis()), leaderboardScore.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolder());
    }

    /* renamed from: a */
    static boolean m3680a(LeaderboardScore leaderboardScore, Object obj) {
        if (!(obj instanceof LeaderboardScore)) {
            return false;
        }
        if (leaderboardScore == obj) {
            return true;
        }
        LeaderboardScore leaderboardScore2 = (LeaderboardScore) obj;
        return C1781jv.equal(Long.valueOf(leaderboardScore2.getRank()), Long.valueOf(leaderboardScore.getRank())) && C1781jv.equal(leaderboardScore2.getDisplayRank(), leaderboardScore.getDisplayRank()) && C1781jv.equal(Long.valueOf(leaderboardScore2.getRawScore()), Long.valueOf(leaderboardScore.getRawScore())) && C1781jv.equal(leaderboardScore2.getDisplayScore(), leaderboardScore.getDisplayScore()) && C1781jv.equal(Long.valueOf(leaderboardScore2.getTimestampMillis()), Long.valueOf(leaderboardScore.getTimestampMillis())) && C1781jv.equal(leaderboardScore2.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderDisplayName()) && C1781jv.equal(leaderboardScore2.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderIconImageUri()) && C1781jv.equal(leaderboardScore2.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolderHiResImageUri()) && C1781jv.equal(leaderboardScore2.getScoreHolder(), leaderboardScore.getScoreHolder()) && C1781jv.equal(leaderboardScore2.getScoreTag(), leaderboardScore.getScoreTag());
    }

    /* renamed from: b */
    static String m3681b(LeaderboardScore leaderboardScore) {
        return C1781jv.m5348h(leaderboardScore).mo15935a("Rank", Long.valueOf(leaderboardScore.getRank())).mo15935a("DisplayRank", leaderboardScore.getDisplayRank()).mo15935a("Score", Long.valueOf(leaderboardScore.getRawScore())).mo15935a("DisplayScore", leaderboardScore.getDisplayScore()).mo15935a("Timestamp", Long.valueOf(leaderboardScore.getTimestampMillis())).mo15935a("DisplayName", leaderboardScore.getScoreHolderDisplayName()).mo15935a("IconImageUri", leaderboardScore.getScoreHolderIconImageUri()).mo15935a("IconImageUrl", leaderboardScore.getScoreHolderIconImageUrl()).mo15935a("HiResImageUri", leaderboardScore.getScoreHolderHiResImageUri()).mo15935a("HiResImageUrl", leaderboardScore.getScoreHolderHiResImageUrl()).mo15935a("Player", leaderboardScore.getScoreHolder() == null ? null : leaderboardScore.getScoreHolder()).mo15935a("ScoreTag", leaderboardScore.getScoreTag()).toString();
    }

    public boolean equals(Object obj) {
        return m3680a(this, obj);
    }

    public String getDisplayRank() {
        return this.adt;
    }

    public void getDisplayRank(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.adt, charArrayBuffer);
    }

    public String getDisplayScore() {
        return this.adu;
    }

    public void getDisplayScore(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.adu, charArrayBuffer);
    }

    public long getRank() {
        return this.ads;
    }

    public long getRawScore() {
        return this.adv;
    }

    public Player getScoreHolder() {
        return this.adA;
    }

    public String getScoreHolderDisplayName() {
        return this.adA == null ? this.adx : this.adA.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer) {
        if (this.adA == null) {
            C1833le.m5524b(this.adx, charArrayBuffer);
        } else {
            this.adA.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        return this.adA == null ? this.adz : this.adA.getHiResImageUri();
    }

    public String getScoreHolderHiResImageUrl() {
        return this.adA == null ? this.adD : this.adA.getHiResImageUrl();
    }

    public Uri getScoreHolderIconImageUri() {
        return this.adA == null ? this.ady : this.adA.getIconImageUri();
    }

    public String getScoreHolderIconImageUrl() {
        return this.adA == null ? this.adC : this.adA.getIconImageUrl();
    }

    public String getScoreTag() {
        return this.adB;
    }

    public long getTimestampMillis() {
        return this.adw;
    }

    public int hashCode() {
        return m3679a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mJ */
    public LeaderboardScore freeze() {
        return this;
    }

    public String toString() {
        return m3681b(this);
    }
}
