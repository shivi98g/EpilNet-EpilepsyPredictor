package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameRef;

public final class ExperienceEventRef extends C0705d implements ExperienceEvent {
    private final GameRef acr;

    public ExperienceEventRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.acr = mo11082aS("external_game_id") ? null : new GameRef(this.f790JG, this.f791KZ);
    }

    public String getIconImageUrl() {
        return getString("icon_url");
    }
}
