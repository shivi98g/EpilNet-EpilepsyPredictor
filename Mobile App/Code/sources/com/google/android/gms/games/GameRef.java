package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;

public final class GameRef extends C0705d implements Game {
    public GameRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public boolean areSnapshotsEnabled() {
        return getInteger("snapshots_enabled") > 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return GameEntity.m2027a(this, obj);
    }

    public Game freeze() {
        return new GameEntity(this);
    }

    public int getAchievementTotalCount() {
        return getInteger("achievement_total_count");
    }

    public String getApplicationId() {
        return getString("external_game_id");
    }

    public String getDescription() {
        return getString("game_description");
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        mo11079a("game_description", charArrayBuffer);
    }

    public String getDeveloperName() {
        return getString("developer_name");
    }

    public void getDeveloperName(CharArrayBuffer charArrayBuffer) {
        mo11079a("developer_name", charArrayBuffer);
    }

    public String getDisplayName() {
        return getString("display_name");
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        mo11079a("display_name", charArrayBuffer);
    }

    public Uri getFeaturedImageUri() {
        return mo11081aR("featured_image_uri");
    }

    public String getFeaturedImageUrl() {
        return getString("featured_image_url");
    }

    public Uri getHiResImageUri() {
        return mo11081aR("game_hi_res_image_uri");
    }

    public String getHiResImageUrl() {
        return getString("game_hi_res_image_url");
    }

    public Uri getIconImageUri() {
        return mo11081aR("game_icon_image_uri");
    }

    public String getIconImageUrl() {
        return getString("game_icon_image_url");
    }

    public int getLeaderboardCount() {
        return getInteger("leaderboard_count");
    }

    public String getPrimaryCategory() {
        return getString("primary_category");
    }

    public String getSecondaryCategory() {
        return getString("secondary_category");
    }

    public String getThemeColor() {
        return getString("theme_color");
    }

    public int hashCode() {
        return GameEntity.m2026a(this);
    }

    public boolean isMuted() {
        return getBoolean("muted");
    }

    public boolean isRealTimeMultiplayerEnabled() {
        return getInteger("real_time_support") > 0;
    }

    public boolean isTurnBasedMultiplayerEnabled() {
        return getInteger("turn_based_support") > 0;
    }

    /* renamed from: kA */
    public boolean mo13015kA() {
        return getInteger("installed") > 0;
    }

    /* renamed from: kB */
    public String mo13016kB() {
        return getString("package_name");
    }

    /* renamed from: kC */
    public int mo13017kC() {
        return getInteger("gameplay_acl_status");
    }

    /* renamed from: ky */
    public boolean mo13018ky() {
        return getBoolean("play_enabled_game");
    }

    /* renamed from: kz */
    public boolean mo13019kz() {
        return getBoolean("identity_sharing_confirmed");
    }

    public String toString() {
        return GameEntity.m2028b((Game) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) freeze()).writeToParcel(parcel, i);
    }
}
