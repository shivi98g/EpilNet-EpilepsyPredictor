package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import com.google.android.gms.internal.C1742je;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;

public final class GameRequestCluster implements SafeParcelable, GameRequest {
    public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();

    /* renamed from: CK */
    private final int f2113CK;
    private final ArrayList<GameRequestEntity> adk;

    GameRequestCluster(int i, ArrayList<GameRequestEntity> arrayList) {
        this.f2113CK = i;
        this.adk = arrayList;
        m3659mp();
    }

    /* renamed from: mp */
    private void m3659mp() {
        C1742je.m5152K(!this.adk.isEmpty());
        GameRequest gameRequest = this.adk.get(0);
        int size = this.adk.size();
        for (int i = 1; i < size; i++) {
            GameRequest gameRequest2 = this.adk.get(i);
            C1742je.m5153a(gameRequest.getType() == gameRequest2.getType(), "All the requests must be of the same type");
            C1742je.m5153a(gameRequest.getSender().equals(gameRequest2.getSender()), "All the requests must be from the same sender");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GameRequestCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GameRequestCluster gameRequestCluster = (GameRequestCluster) obj;
        if (gameRequestCluster.adk.size() != this.adk.size()) {
            return false;
        }
        int size = this.adk.size();
        for (int i = 0; i < size; i++) {
            if (!this.adk.get(i).equals(gameRequestCluster.adk.get(i))) {
                return false;
            }
        }
        return true;
    }

    public GameRequest freeze() {
        return this;
    }

    public long getCreationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public byte[] getData() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long getExpirationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Game getGame() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getRecipientStatus(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public String getRequestId() {
        return this.adk.get(0).getRequestId();
    }

    public Player getSender() {
        return this.adk.get(0).getSender();
    }

    public int getStatus() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getType() {
        return this.adk.get(0).getType();
    }

    public int getVersionCode() {
        return this.f2113CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.adk.toArray());
    }

    public boolean isConsumed(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mD */
    public ArrayList<GameRequest> mo14248mD() {
        return new ArrayList<>(this.adk);
    }

    /* renamed from: mE */
    public ArrayList<Player> getRecipients() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public void writeToParcel(Parcel parcel, int i) {
        GameRequestClusterCreator.m3662a(this, parcel, i);
    }
}
