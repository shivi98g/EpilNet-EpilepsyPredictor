package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.internal.C1742je;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;

public final class ZInvitationCluster implements SafeParcelable, Invitation {
    public static final InvitationClusterCreator CREATOR = new InvitationClusterCreator();

    /* renamed from: CK */
    private final int f2110CK;
    private final ArrayList<InvitationEntity> acE;

    ZInvitationCluster(int i, ArrayList<InvitationEntity> arrayList) {
        this.f2110CK = i;
        this.acE = arrayList;
        m3625mp();
    }

    /* renamed from: mp */
    private void m3625mp() {
        C1742je.m5152K(!this.acE.isEmpty());
        Invitation invitation = this.acE.get(0);
        int size = this.acE.size();
        for (int i = 1; i < size; i++) {
            C1742je.m5153a(invitation.getInviter().equals(this.acE.get(i).getInviter()), "All the invitations must be from the same inviter");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ZInvitationCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ZInvitationCluster zInvitationCluster = (ZInvitationCluster) obj;
        if (zInvitationCluster.acE.size() != this.acE.size()) {
            return false;
        }
        int size = this.acE.size();
        for (int i = 0; i < size; i++) {
            if (!this.acE.get(i).equals(zInvitationCluster.acE.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Invitation freeze() {
        return this;
    }

    public int getAvailableAutoMatchSlots() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long getCreationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Game getGame() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public String getInvitationId() {
        return this.acE.get(0).getInvitationId();
    }

    public int getInvitationType() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Participant getInviter() {
        return this.acE.get(0).getInviter();
    }

    public ArrayList<Participant> getParticipants() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getVariant() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getVersionCode() {
        return this.f2110CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.acE.toArray());
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mq */
    public ArrayList<Invitation> mo14199mq() {
        return new ArrayList<>(this.acE);
    }

    public void writeToParcel(Parcel parcel, int i) {
        InvitationClusterCreator.m3622a(this, parcel, i);
    }
}
