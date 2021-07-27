package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

public final class LoadMatchesResponse {
    private final InvitationBuffer aes;
    private final TurnBasedMatchBuffer aet;
    private final TurnBasedMatchBuffer aeu;
    private final TurnBasedMatchBuffer aev;

    public LoadMatchesResponse(Bundle bundle) {
        DataHolder a = m3746a(bundle, 0);
        TurnBasedMatchBuffer turnBasedMatchBuffer = null;
        if (a != null) {
            this.aes = new InvitationBuffer(a);
        } else {
            this.aes = null;
        }
        DataHolder a2 = m3746a(bundle, 1);
        if (a2 != null) {
            this.aet = new TurnBasedMatchBuffer(a2);
        } else {
            this.aet = null;
        }
        DataHolder a3 = m3746a(bundle, 2);
        if (a3 != null) {
            this.aeu = new TurnBasedMatchBuffer(a3);
        } else {
            this.aeu = null;
        }
        DataHolder a4 = m3746a(bundle, 3);
        this.aev = a4 != null ? new TurnBasedMatchBuffer(a4) : turnBasedMatchBuffer;
    }

    /* renamed from: a */
    private static DataHolder m3746a(Bundle bundle, int i) {
        String dZ = TurnBasedMatchTurnStatus.m3548dZ(i);
        if (!bundle.containsKey(dZ)) {
            return null;
        }
        return (DataHolder) bundle.getParcelable(dZ);
    }

    @Deprecated
    public void close() {
        release();
    }

    public TurnBasedMatchBuffer getCompletedMatches() {
        return this.aev;
    }

    public InvitationBuffer getInvitations() {
        return this.aes;
    }

    public TurnBasedMatchBuffer getMyTurnMatches() {
        return this.aet;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches() {
        return this.aeu;
    }

    public boolean hasData() {
        if (this.aes != null && this.aes.getCount() > 0) {
            return true;
        }
        if (this.aet != null && this.aet.getCount() > 0) {
            return true;
        }
        if (this.aeu == null || this.aeu.getCount() <= 0) {
            return this.aev != null && this.aev.getCount() > 0;
        }
        return true;
    }

    public void release() {
        if (this.aes != null) {
            this.aes.release();
        }
        if (this.aet != null) {
            this.aet.release();
        }
        if (this.aeu != null) {
            this.aeu.release();
        }
        if (this.aev != null) {
            this.aev.release();
        }
    }
}
