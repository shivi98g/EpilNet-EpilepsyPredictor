package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;

public final class TurnBasedMatchConfigImpl extends TurnBasedMatchConfig {
    private final int adW;
    private final Bundle aem;
    private final String[] aeo;
    private final int aew;

    TurnBasedMatchConfigImpl(TurnBasedMatchConfig.Builder builder) {
        this.adW = builder.adW;
        this.aew = builder.aew;
        this.aem = builder.aem;
        this.aeo = (String[]) builder.ael.toArray(new String[builder.ael.size()]);
    }

    public Bundle getAutoMatchCriteria() {
        return this.aem;
    }

    public String[] getInvitedPlayerIds() {
        return this.aeo;
    }

    public int getVariant() {
        return this.adW;
    }

    /* renamed from: mO */
    public int mo14482mO() {
        return this.aew;
    }
}
