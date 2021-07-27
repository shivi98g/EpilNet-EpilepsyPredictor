package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class LeaderboardRef extends C0705d implements Leaderboard {

    /* renamed from: Ya */
    private final int f2119Ya;
    private final Game adq;

    LeaderboardRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f2119Ya = i2;
        this.adq = new GameRef(dataHolder, i);
    }

    public boolean equals(Object obj) {
        return LeaderboardEntity.m3673a(this, obj);
    }

    public String getDisplayName() {
        return getString("name");
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        mo11079a("name", charArrayBuffer);
    }

    public Game getGame() {
        return this.adq;
    }

    public Uri getIconImageUri() {
        return mo11081aR("board_icon_image_uri");
    }

    public String getIconImageUrl() {
        return getString("board_icon_image_url");
    }

    public String getLeaderboardId() {
        return getString("external_leaderboard_id");
    }

    public int getScoreOrder() {
        return getInteger("score_order");
    }

    public ArrayList<LeaderboardVariant> getVariants() {
        ArrayList<LeaderboardVariant> arrayList = new ArrayList<>(this.f2119Ya);
        for (int i = 0; i < this.f2119Ya; i++) {
            arrayList.add(new LeaderboardVariantRef(this.f790JG, this.f791KZ + i));
        }
        return arrayList;
    }

    public int hashCode() {
        return LeaderboardEntity.m3672a(this);
    }

    /* renamed from: mG */
    public Leaderboard freeze() {
        return new LeaderboardEntity(this);
    }

    public String toString() {
        return LeaderboardEntity.m3674b(this);
    }
}
