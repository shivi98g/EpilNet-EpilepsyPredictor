package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.internal.C1785jx;

public final class RoomConfigImpl extends RoomConfig {

    /* renamed from: YG */
    private final String f2138YG;
    private final int adW;
    private final RoomUpdateListener aeh;
    private final RoomStatusUpdateListener aei;
    private final RealTimeMessageReceivedListener aej;
    private final Bundle aem;
    private final boolean aen;
    private final String[] aeo;

    RoomConfigImpl(RoomConfig.Builder builder) {
        this.aeh = builder.aeh;
        this.aei = builder.aei;
        this.aej = builder.aej;
        this.f2138YG = builder.aek;
        this.adW = builder.adW;
        this.aem = builder.aem;
        this.aen = builder.aen;
        this.aeo = (String[]) builder.ael.toArray(new String[builder.ael.size()]);
        if (this.aej == null) {
            C1785jx.m5355a(this.aen, "Must either enable sockets OR specify a message listener");
        }
    }

    public Bundle getAutoMatchCriteria() {
        return this.aem;
    }

    public String getInvitationId() {
        return this.f2138YG;
    }

    public String[] getInvitedPlayerIds() {
        return this.aeo;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener() {
        return this.aej;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener() {
        return this.aei;
    }

    public RoomUpdateListener getRoomUpdateListener() {
        return this.aeh;
    }

    public int getVariant() {
        return this.adW;
    }

    public boolean isSocketEnabled() {
        return this.aen;
    }
}
