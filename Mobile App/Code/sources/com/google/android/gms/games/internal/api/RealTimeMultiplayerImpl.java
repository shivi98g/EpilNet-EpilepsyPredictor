package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.C0687d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import java.util.List;

public final class RealTimeMultiplayerImpl implements RealTimeMultiplayer {
    /* renamed from: a */
    private static <L> C0687d<L> m3460a(GoogleApiClient googleApiClient, L l) {
        if (l == null) {
            return null;
        }
        return googleApiClient.mo10945d(l);
    }

    public void create(GoogleApiClient googleApiClient, RoomConfig roomConfig) {
        Games.m2046d(googleApiClient).mo13437a((C0687d<RoomUpdateListener>) googleApiClient.mo10945d(roomConfig.getRoomUpdateListener()), (C0687d<RoomStatusUpdateListener>) m3460a(googleApiClient, roomConfig.getRoomStatusUpdateListener()), (C0687d<RealTimeMessageReceivedListener>) m3460a(googleApiClient, roomConfig.getMessageReceivedListener()), roomConfig);
    }

    public void declineInvitation(GoogleApiClient googleApiClient, String str) {
        Games.m2046d(googleApiClient).mo13537q(str, 0);
    }

    public void dismissInvitation(GoogleApiClient googleApiClient, String str) {
        Games.m2046d(googleApiClient).mo13536p(str, 0);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleApiClient, int i, int i2) {
        return Games.m2046d(googleApiClient).mo13441b(i, i2, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleApiClient, int i, int i2, boolean z) {
        return Games.m2046d(googleApiClient).mo13441b(i, i2, z);
    }

    public RealTimeSocket getSocketForParticipant(GoogleApiClient googleApiClient, String str, String str2) {
        return Games.m2046d(googleApiClient).mo13538s(str, str2);
    }

    public Intent getWaitingRoomIntent(GoogleApiClient googleApiClient, Room room, int i) {
        return Games.m2046d(googleApiClient).mo13399a(room, i);
    }

    public void join(GoogleApiClient googleApiClient, RoomConfig roomConfig) {
        Games.m2046d(googleApiClient).mo13458b((C0687d<RoomUpdateListener>) googleApiClient.mo10945d(roomConfig.getRoomUpdateListener()), (C0687d<RoomStatusUpdateListener>) m3460a(googleApiClient, roomConfig.getRoomStatusUpdateListener()), (C0687d<RealTimeMessageReceivedListener>) m3460a(googleApiClient, roomConfig.getMessageReceivedListener()), roomConfig);
    }

    public void leave(GoogleApiClient googleApiClient, RoomUpdateListener roomUpdateListener, String str) {
        Games.m2046d(googleApiClient).mo13438a((C0687d<RoomUpdateListener>) googleApiClient.mo10945d(roomUpdateListener), str);
    }

    public int sendReliableMessage(GoogleApiClient googleApiClient, RealTimeMultiplayer.ReliableMessageSentCallback reliableMessageSentCallback, byte[] bArr, String str, String str2) {
        return Games.m2046d(googleApiClient).mo13395a((C0687d<RealTimeMultiplayer.ReliableMessageSentCallback>) m3460a(googleApiClient, reliableMessageSentCallback), bArr, str, str2);
    }

    public int sendUnreliableMessage(GoogleApiClient googleApiClient, byte[] bArr, String str, String str2) {
        return Games.m2046d(googleApiClient).mo13396a(bArr, str, new String[]{str2});
    }

    public int sendUnreliableMessage(GoogleApiClient googleApiClient, byte[] bArr, String str, List<String> list) {
        return Games.m2046d(googleApiClient).mo13396a(bArr, str, (String[]) list.toArray(new String[list.size()]));
    }

    public int sendUnreliableMessageToOthers(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        return Games.m2046d(googleApiClient).mo13474d(bArr, str);
    }
}
