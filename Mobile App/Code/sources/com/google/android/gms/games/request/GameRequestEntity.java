package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity implements SafeParcelable, GameRequest {
    public static final GameRequestEntityCreator CREATOR = new GameRequestEntityCreator();

    /* renamed from: CK */
    private final int f2157CK;

    /* renamed from: FP */
    private final int f2158FP;

    /* renamed from: Gt */
    private final int f2159Gt;

    /* renamed from: Zt */
    private final String f2160Zt;
    private final GameEntity acs;
    private final long adS;
    private final byte[] aeA;
    private final PlayerEntity aeU;
    private final ArrayList<PlayerEntity> aeV;
    private final long aeW;
    private final Bundle aeX;

    GameRequestEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, byte[] bArr, String str, ArrayList<PlayerEntity> arrayList, int i2, long j, long j2, Bundle bundle, int i3) {
        this.f2157CK = i;
        this.acs = gameEntity;
        this.aeU = playerEntity;
        this.aeA = bArr;
        this.f2160Zt = str;
        this.aeV = arrayList;
        this.f2159Gt = i2;
        this.adS = j;
        this.aeW = j2;
        this.aeX = bundle;
        this.f2158FP = i3;
    }

    public GameRequestEntity(GameRequest gameRequest) {
        this.f2157CK = 2;
        this.acs = new GameEntity(gameRequest.getGame());
        this.aeU = new PlayerEntity(gameRequest.getSender());
        this.f2160Zt = gameRequest.getRequestId();
        this.f2159Gt = gameRequest.getType();
        this.adS = gameRequest.getCreationTimestamp();
        this.aeW = gameRequest.getExpirationTimestamp();
        this.f2158FP = gameRequest.getStatus();
        byte[] data = gameRequest.getData();
        if (data == null) {
            this.aeA = null;
        } else {
            this.aeA = new byte[data.length];
            System.arraycopy(data, 0, this.aeA, 0, data.length);
        }
        List<Player> recipients = gameRequest.getRecipients();
        int size = recipients.size();
        this.aeV = new ArrayList<>(size);
        this.aeX = new Bundle();
        for (int i = 0; i < size; i++) {
            Player player = (Player) recipients.get(i).freeze();
            String playerId = player.getPlayerId();
            this.aeV.add((PlayerEntity) player);
            this.aeX.putInt(playerId, gameRequest.getRecipientStatus(playerId));
        }
    }

    /* renamed from: a */
    static int m3781a(GameRequest gameRequest) {
        return C1781jv.hashCode(gameRequest.getGame(), gameRequest.getRecipients(), gameRequest.getRequestId(), gameRequest.getSender(), m3783b(gameRequest), Integer.valueOf(gameRequest.getType()), Long.valueOf(gameRequest.getCreationTimestamp()), Long.valueOf(gameRequest.getExpirationTimestamp()));
    }

    /* renamed from: a */
    static boolean m3782a(GameRequest gameRequest, Object obj) {
        if (!(obj instanceof GameRequest)) {
            return false;
        }
        if (gameRequest == obj) {
            return true;
        }
        GameRequest gameRequest2 = (GameRequest) obj;
        return C1781jv.equal(gameRequest2.getGame(), gameRequest.getGame()) && C1781jv.equal(gameRequest2.getRecipients(), gameRequest.getRecipients()) && C1781jv.equal(gameRequest2.getRequestId(), gameRequest.getRequestId()) && C1781jv.equal(gameRequest2.getSender(), gameRequest.getSender()) && Arrays.equals(m3783b(gameRequest2), m3783b(gameRequest)) && C1781jv.equal(Integer.valueOf(gameRequest2.getType()), Integer.valueOf(gameRequest.getType())) && C1781jv.equal(Long.valueOf(gameRequest2.getCreationTimestamp()), Long.valueOf(gameRequest.getCreationTimestamp())) && C1781jv.equal(Long.valueOf(gameRequest2.getExpirationTimestamp()), Long.valueOf(gameRequest.getExpirationTimestamp()));
    }

    /* renamed from: b */
    private static int[] m3783b(GameRequest gameRequest) {
        List<Player> recipients = gameRequest.getRecipients();
        int size = recipients.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = gameRequest.getRecipientStatus(recipients.get(i).getPlayerId());
        }
        return iArr;
    }

    /* renamed from: c */
    static String m3784c(GameRequest gameRequest) {
        return C1781jv.m5348h(gameRequest).mo15935a("Game", gameRequest.getGame()).mo15935a("Sender", gameRequest.getSender()).mo15935a("Recipients", gameRequest.getRecipients()).mo15935a("Data", gameRequest.getData()).mo15935a("RequestId", gameRequest.getRequestId()).mo15935a("Type", Integer.valueOf(gameRequest.getType())).mo15935a("CreationTimestamp", Long.valueOf(gameRequest.getCreationTimestamp())).mo15935a("ExpirationTimestamp", Long.valueOf(gameRequest.getExpirationTimestamp())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3782a(this, obj);
    }

    public GameRequest freeze() {
        return this;
    }

    public long getCreationTimestamp() {
        return this.adS;
    }

    public byte[] getData() {
        return this.aeA;
    }

    public long getExpirationTimestamp() {
        return this.aeW;
    }

    public Game getGame() {
        return this.acs;
    }

    public int getRecipientStatus(String str) {
        return this.aeX.getInt(str, 0);
    }

    public List<Player> getRecipients() {
        return new ArrayList(this.aeV);
    }

    public String getRequestId() {
        return this.f2160Zt;
    }

    public Player getSender() {
        return this.aeU;
    }

    public int getStatus() {
        return this.f2158FP;
    }

    public int getType() {
        return this.f2159Gt;
    }

    public int getVersionCode() {
        return this.f2157CK;
    }

    public int hashCode() {
        return m3781a(this);
    }

    public boolean isConsumed(String str) {
        return getRecipientStatus(str) == 1;
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mS */
    public Bundle mo14554mS() {
        return this.aeX;
    }

    public String toString() {
        return m3784c(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        GameRequestEntityCreator.m3786a(this, parcel, i);
    }
}
