package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.PlatformType;
import com.google.android.gms.internal.C1781jv;

public final class GameInstanceRef extends C0705d implements GameInstance {
    GameInstanceRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String getApplicationId() {
        return getString("external_game_id");
    }

    public String getDisplayName() {
        return getString("instance_display_name");
    }

    public String getPackageName() {
        return getString("package_name");
    }

    /* renamed from: jC */
    public int mo14176jC() {
        return getInteger("platform_type");
    }

    /* renamed from: ml */
    public boolean mo14177ml() {
        return getInteger("real_time_support") > 0;
    }

    /* renamed from: mm */
    public boolean mo14178mm() {
        return getInteger("turn_based_support") > 0;
    }

    /* renamed from: mn */
    public boolean mo14179mn() {
        return getInteger("piracy_check") > 0;
    }

    /* renamed from: mo */
    public boolean mo14180mo() {
        return getInteger("installed") > 0;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("ApplicationId", getApplicationId()).mo15935a("DisplayName", getDisplayName()).mo15935a("SupportsRealTime", Boolean.valueOf(mo14177ml())).mo15935a("SupportsTurnBased", Boolean.valueOf(mo14178mm())).mo15935a("PlatformType", PlatformType.m3545dZ(mo14176jC())).mo15935a("PackageName", getPackageName()).mo15935a("PiracyCheckEnabled", Boolean.valueOf(mo14179mn())).mo15935a("Installed", Boolean.valueOf(mo14180mo())).toString();
    }
}
