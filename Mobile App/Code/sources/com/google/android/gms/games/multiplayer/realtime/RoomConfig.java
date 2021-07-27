package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class RoomConfig {

    public static final class Builder {
        int adW;
        final RoomUpdateListener aeh;
        RoomStatusUpdateListener aei;
        RealTimeMessageReceivedListener aej;
        String aek;
        ArrayList<String> ael;
        Bundle aem;
        boolean aen;

        private Builder(RoomUpdateListener roomUpdateListener) {
            this.aek = null;
            this.adW = -1;
            this.ael = new ArrayList<>();
            this.aen = false;
            this.aeh = (RoomUpdateListener) C1785jx.m5359b(roomUpdateListener, (Object) "Must provide a RoomUpdateListener");
        }

        public Builder addPlayersToInvite(ArrayList<String> arrayList) {
            C1785jx.m5364i(arrayList);
            this.ael.addAll(arrayList);
            return this;
        }

        public Builder addPlayersToInvite(String... strArr) {
            C1785jx.m5364i(strArr);
            this.ael.addAll(Arrays.asList(strArr));
            return this;
        }

        public RoomConfig build() {
            return new RoomConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle) {
            this.aem = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String str) {
            C1785jx.m5364i(str);
            this.aek = str;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            this.aej = realTimeMessageReceivedListener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomStatusUpdateListener) {
            this.aei = roomStatusUpdateListener;
            return this;
        }

        @Deprecated
        public Builder setSocketCommunicationEnabled(boolean z) {
            this.aen = z;
            return this;
        }

        public Builder setVariant(int i) {
            C1785jx.m5361b(i == -1 || i > 0, (Object) "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            this.adW = i;
            return this;
        }
    }

    protected RoomConfig() {
    }

    public static Builder builder(RoomUpdateListener roomUpdateListener) {
        return new Builder(roomUpdateListener);
    }

    public static Bundle createAutoMatchCriteria(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt(Multiplayer.EXTRA_MIN_AUTOMATCH_PLAYERS, i);
        bundle.putInt(Multiplayer.EXTRA_MAX_AUTOMATCH_PLAYERS, i2);
        bundle.putLong(Multiplayer.EXTRA_EXCLUSIVE_BIT_MASK, j);
        return bundle;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String getInvitationId();

    public abstract String[] getInvitedPlayerIds();

    public abstract RealTimeMessageReceivedListener getMessageReceivedListener();

    public abstract RoomStatusUpdateListener getRoomStatusUpdateListener();

    public abstract RoomUpdateListener getRoomUpdateListener();

    public abstract int getVariant();

    @Deprecated
    public abstract boolean isSocketEnabled();
}
