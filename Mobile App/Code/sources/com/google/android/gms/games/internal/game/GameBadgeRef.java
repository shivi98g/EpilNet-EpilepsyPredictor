package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;

public final class GameBadgeRef extends C0705d implements GameBadge {
    GameBadgeRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return GameBadgeEntity.m3604a(this, obj);
    }

    public String getDescription() {
        return getString("badge_description");
    }

    public Uri getIconImageUri() {
        return mo11081aR("badge_icon_image_uri");
    }

    public String getTitle() {
        return getString("badge_title");
    }

    public int getType() {
        return getInteger("badge_type");
    }

    public int hashCode() {
        return GameBadgeEntity.m3603a(this);
    }

    /* renamed from: mk */
    public GameBadge freeze() {
        return new GameBadgeEntity(this);
    }

    public String toString() {
        return GameBadgeEntity.m3605b((GameBadge) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameBadgeEntity) freeze()).writeToParcel(parcel, i);
    }
}
