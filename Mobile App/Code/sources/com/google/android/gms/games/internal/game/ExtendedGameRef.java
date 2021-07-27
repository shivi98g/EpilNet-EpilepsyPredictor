package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
import java.util.ArrayList;

public class ExtendedGameRef extends C0705d implements ExtendedGame {

    /* renamed from: Ya */
    private final int f2104Ya;
    private final SnapshotMetadataRef acD;
    private final GameRef acr;

    ExtendedGameRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.acr = new GameRef(dataHolder, i);
        this.f2104Ya = i2;
        this.acD = (!mo11080aQ("external_snapshot_id") || mo11082aS("external_snapshot_id")) ? null : new SnapshotMetadataRef(dataHolder, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return ExtendedGameEntity.m3570a(this, obj);
    }

    public Game getGame() {
        return this.acr;
    }

    public int hashCode() {
        return ExtendedGameEntity.m3569a(this);
    }

    /* renamed from: lY */
    public ArrayList<GameBadge> mo14125lY() {
        if (this.f790JG.mo11049c("badge_title", this.f791KZ, this.f790JG.mo11047au(this.f791KZ)) == null) {
            return new ArrayList<>(0);
        }
        ArrayList<GameBadge> arrayList = new ArrayList<>(this.f2104Ya);
        for (int i = 0; i < this.f2104Ya; i++) {
            arrayList.add(new GameBadgeRef(this.f790JG, this.f791KZ + i));
        }
        return arrayList;
    }

    /* renamed from: lZ */
    public int mo14126lZ() {
        return getInteger("availability");
    }

    /* renamed from: ma */
    public boolean mo14127ma() {
        return getBoolean("owned");
    }

    /* renamed from: mb */
    public int mo14128mb() {
        return getInteger("achievement_unlocked_count");
    }

    /* renamed from: mc */
    public long mo14129mc() {
        return getLong("last_played_server_time");
    }

    /* renamed from: md */
    public long mo14130md() {
        return getLong("price_micros");
    }

    /* renamed from: me */
    public String mo14131me() {
        return getString("formatted_price");
    }

    /* renamed from: mf */
    public long mo14132mf() {
        return getLong("full_price_micros");
    }

    /* renamed from: mg */
    public String mo14133mg() {
        return getString("formatted_full_price");
    }

    /* renamed from: mh */
    public SnapshotMetadata mo14134mh() {
        return this.acD;
    }

    /* renamed from: mj */
    public ExtendedGame freeze() {
        return new ExtendedGameEntity(this);
    }

    public String toString() {
        return ExtendedGameEntity.m3571b((ExtendedGame) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ExtendedGameEntity) freeze()).writeToParcel(parcel, i);
    }
}
