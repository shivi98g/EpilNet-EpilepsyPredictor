package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class LeaderboardScoreRef extends C0705d implements LeaderboardScore {
    private final PlayerRef adE;

    LeaderboardScoreRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.adE = new PlayerRef(dataHolder, i);
    }

    public boolean equals(Object obj) {
        return LeaderboardScoreEntity.m3680a(this, obj);
    }

    public String getDisplayRank() {
        return getString("display_rank");
    }

    public void getDisplayRank(CharArrayBuffer charArrayBuffer) {
        mo11079a("display_rank", charArrayBuffer);
    }

    public String getDisplayScore() {
        return getString("display_score");
    }

    public void getDisplayScore(CharArrayBuffer charArrayBuffer) {
        mo11079a("display_score", charArrayBuffer);
    }

    public long getRank() {
        return getLong("rank");
    }

    public long getRawScore() {
        return getLong("raw_score");
    }

    public Player getScoreHolder() {
        if (mo11082aS("external_player_id")) {
            return null;
        }
        return this.adE;
    }

    public String getScoreHolderDisplayName() {
        return mo11082aS("external_player_id") ? getString("default_display_name") : this.adE.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer) {
        if (mo11082aS("external_player_id")) {
            mo11079a("default_display_name", charArrayBuffer);
        } else {
            this.adE.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        if (mo11082aS("external_player_id")) {
            return null;
        }
        return this.adE.getHiResImageUri();
    }

    public String getScoreHolderHiResImageUrl() {
        if (mo11082aS("external_player_id")) {
            return null;
        }
        return this.adE.getHiResImageUrl();
    }

    public Uri getScoreHolderIconImageUri() {
        return mo11082aS("external_player_id") ? mo11081aR("default_display_image_uri") : this.adE.getIconImageUri();
    }

    public String getScoreHolderIconImageUrl() {
        return mo11082aS("external_player_id") ? getString("default_display_image_url") : this.adE.getIconImageUrl();
    }

    public String getScoreTag() {
        return getString("score_tag");
    }

    public long getTimestampMillis() {
        return getLong("achieved_timestamp");
    }

    public int hashCode() {
        return LeaderboardScoreEntity.m3679a(this);
    }

    /* renamed from: mJ */
    public LeaderboardScore freeze() {
        return new LeaderboardScoreEntity(this);
    }

    public String toString() {
        return LeaderboardScoreEntity.m3681b(this);
    }
}
