package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames {
    public final String acL;
    public final String acM;
    public final String acN;
    public final String acO;
    public final String acP;
    public final String acQ;
    public final String acR;
    public final String acS;
    public final String acT;
    public final String acU;
    public final String acV;
    public final String acW;
    public final String acX;
    public final String acY;
    public final String acZ;
    public final String ada;
    public final String adb;
    public final String adc;
    public final String add;
    public final String ade;
    public final String adf;
    public final String adg;
    public final String adh;
    public final String adi;
    public final String adj;

    public PlayerColumnNames(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            this.acL = "external_player_id";
            this.acM = "profile_name";
            this.acN = "profile_icon_image_uri";
            this.acO = "profile_icon_image_url";
            this.acP = "profile_hi_res_image_uri";
            this.acQ = "profile_hi_res_image_url";
            this.acR = "last_updated";
            this.acS = "is_in_circles";
            this.acT = "played_with_timestamp";
            this.acU = "current_xp_total";
            this.acV = "current_level";
            this.acW = "current_level_min_xp";
            this.acX = "current_level_max_xp";
            this.acY = "next_level";
            this.acZ = "next_level_max_xp";
            this.ada = "last_level_up_timestamp";
            this.adb = "player_title";
            this.adc = "has_all_public_acls";
            this.add = "is_profile_visible";
            this.ade = "most_recent_external_game_id";
            this.adf = "most_recent_game_name";
            this.adg = "most_recent_activity_timestamp";
            this.adh = "most_recent_game_icon_uri";
            this.adi = "most_recent_game_hi_res_uri";
            str2 = "most_recent_game_featured_uri";
        } else {
            this.acL = str + "external_player_id";
            this.acM = str + "profile_name";
            this.acN = str + "profile_icon_image_uri";
            this.acO = str + "profile_icon_image_url";
            this.acP = str + "profile_hi_res_image_uri";
            this.acQ = str + "profile_hi_res_image_url";
            this.acR = str + "last_updated";
            this.acS = str + "is_in_circles";
            this.acT = str + "played_with_timestamp";
            this.acU = str + "current_xp_total";
            this.acV = str + "current_level";
            this.acW = str + "current_level_min_xp";
            this.acX = str + "current_level_max_xp";
            this.acY = str + "next_level";
            this.acZ = str + "next_level_max_xp";
            this.ada = str + "last_level_up_timestamp";
            this.adb = str + "player_title";
            this.adc = str + "has_all_public_acls";
            this.add = str + "is_profile_visible";
            this.ade = str + "most_recent_external_game_id";
            this.adf = str + "most_recent_game_name";
            this.adg = str + "most_recent_activity_timestamp";
            this.adh = str + "most_recent_game_icon_uri";
            this.adi = str + "most_recent_game_hi_res_uri";
            str2 = str + "most_recent_game_featured_uri";
        }
        this.adj = str2;
    }
}
