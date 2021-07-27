package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardVariantRef extends C0705d implements LeaderboardVariant {
    LeaderboardVariantRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public boolean equals(Object obj) {
        return LeaderboardVariantEntity.m3688a(this, obj);
    }

    public int getCollection() {
        return getInteger("collection");
    }

    public String getDisplayPlayerRank() {
        return getString("player_display_rank");
    }

    public String getDisplayPlayerScore() {
        return getString("player_display_score");
    }

    public long getNumScores() {
        if (mo11082aS("total_scores")) {
            return -1;
        }
        return getLong("total_scores");
    }

    public long getPlayerRank() {
        if (mo11082aS("player_rank")) {
            return -1;
        }
        return getLong("player_rank");
    }

    public String getPlayerScoreTag() {
        return getString("player_score_tag");
    }

    public long getRawPlayerScore() {
        if (mo11082aS("player_raw_score")) {
            return -1;
        }
        return getLong("player_raw_score");
    }

    public int getTimeSpan() {
        return getInteger("timespan");
    }

    public boolean hasPlayerInfo() {
        return !mo11082aS("player_raw_score");
    }

    public int hashCode() {
        return LeaderboardVariantEntity.m3687a(this);
    }

    /* renamed from: mK */
    public String mo14307mK() {
        return getString("top_page_token_next");
    }

    /* renamed from: mL */
    public String mo14308mL() {
        return getString("window_page_token_prev");
    }

    /* renamed from: mM */
    public String mo14309mM() {
        return getString("window_page_token_next");
    }

    /* renamed from: mN */
    public LeaderboardVariant freeze() {
        return new LeaderboardVariantEntity(this);
    }

    public String toString() {
        return LeaderboardVariantEntity.m3689b(this);
    }
}
