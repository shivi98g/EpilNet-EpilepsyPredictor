package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;
import java.util.ArrayList;

public final class LeaderboardEntity implements Leaderboard {

    /* renamed from: OS */
    private final String f2116OS;

    /* renamed from: WD */
    private final Uri f2117WD;

    /* renamed from: WO */
    private final String f2118WO;
    private final String adn;
    private final int ado;
    private final ArrayList<LeaderboardVariantEntity> adp;
    private final Game adq;

    public LeaderboardEntity(Leaderboard leaderboard) {
        this.adn = leaderboard.getLeaderboardId();
        this.f2116OS = leaderboard.getDisplayName();
        this.f2117WD = leaderboard.getIconImageUri();
        this.f2118WO = leaderboard.getIconImageUrl();
        this.ado = leaderboard.getScoreOrder();
        Game game = leaderboard.getGame();
        this.adq = game == null ? null : new GameEntity(game);
        ArrayList<LeaderboardVariant> variants = leaderboard.getVariants();
        int size = variants.size();
        this.adp = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.adp.add((LeaderboardVariantEntity) variants.get(i).freeze());
        }
    }

    /* renamed from: a */
    static int m3672a(Leaderboard leaderboard) {
        return C1781jv.hashCode(leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants());
    }

    /* renamed from: a */
    static boolean m3673a(Leaderboard leaderboard, Object obj) {
        if (!(obj instanceof Leaderboard)) {
            return false;
        }
        if (leaderboard == obj) {
            return true;
        }
        Leaderboard leaderboard2 = (Leaderboard) obj;
        return C1781jv.equal(leaderboard2.getLeaderboardId(), leaderboard.getLeaderboardId()) && C1781jv.equal(leaderboard2.getDisplayName(), leaderboard.getDisplayName()) && C1781jv.equal(leaderboard2.getIconImageUri(), leaderboard.getIconImageUri()) && C1781jv.equal(Integer.valueOf(leaderboard2.getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())) && C1781jv.equal(leaderboard2.getVariants(), leaderboard.getVariants());
    }

    /* renamed from: b */
    static String m3674b(Leaderboard leaderboard) {
        return C1781jv.m5348h(leaderboard).mo15935a("LeaderboardId", leaderboard.getLeaderboardId()).mo15935a("DisplayName", leaderboard.getDisplayName()).mo15935a("IconImageUri", leaderboard.getIconImageUri()).mo15935a("IconImageUrl", leaderboard.getIconImageUrl()).mo15935a("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).mo15935a("Variants", leaderboard.getVariants()).toString();
    }

    public boolean equals(Object obj) {
        return m3673a(this, obj);
    }

    public String getDisplayName() {
        return this.f2116OS;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f2116OS, charArrayBuffer);
    }

    public Game getGame() {
        return this.adq;
    }

    public Uri getIconImageUri() {
        return this.f2117WD;
    }

    public String getIconImageUrl() {
        return this.f2118WO;
    }

    public String getLeaderboardId() {
        return this.adn;
    }

    public int getScoreOrder() {
        return this.ado;
    }

    public ArrayList<LeaderboardVariant> getVariants() {
        return new ArrayList<>(this.adp);
    }

    public int hashCode() {
        return m3672a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mG */
    public Leaderboard freeze() {
        return this;
    }

    public String toString() {
        return m3674b(this);
    }
}
