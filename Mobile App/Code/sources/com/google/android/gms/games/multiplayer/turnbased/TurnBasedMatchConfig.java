package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;

public abstract class TurnBasedMatchConfig {

    public static final class Builder {
        int adW;
        ArrayList<String> ael;
        Bundle aem;
        int aew;

        private Builder() {
            this.adW = -1;
            this.ael = new ArrayList<>();
            this.aem = null;
            this.aew = 2;
        }

        public Builder addInvitedPlayer(String str) {
            C1785jx.m5364i(str);
            this.ael.add(str);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList<String> arrayList) {
            C1785jx.m5364i(arrayList);
            this.ael.addAll(arrayList);
            return this;
        }

        public TurnBasedMatchConfig build() {
            return new TurnBasedMatchConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle) {
            this.aem = bundle;
            return this;
        }

        public Builder setVariant(int i) {
            C1785jx.m5361b(i == -1 || i > 0, (Object) "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            this.adW = i;
            return this;
        }
    }

    protected TurnBasedMatchConfig() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Bundle createAutoMatchCriteria(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt(Multiplayer.EXTRA_MIN_AUTOMATCH_PLAYERS, i);
        bundle.putInt(Multiplayer.EXTRA_MAX_AUTOMATCH_PLAYERS, i2);
        bundle.putLong(Multiplayer.EXTRA_EXCLUSIVE_BIT_MASK, j);
        return bundle;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String[] getInvitedPlayerIds();

    public abstract int getVariant();

    /* renamed from: mO */
    public abstract int mo14482mO();
}
