package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;

public final class QuestRef extends C0705d implements Quest {

    /* renamed from: Ya */
    private final int f2156Ya;
    private final Game adq;

    QuestRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.adq = new GameRef(dataHolder, i);
        this.f2156Ya = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return QuestEntity.m3771a(this, obj);
    }

    public Quest freeze() {
        return new QuestEntity(this);
    }

    public long getAcceptedTimestamp() {
        return getLong("accepted_ts");
    }

    public Uri getBannerImageUri() {
        return mo11081aR("quest_banner_image_uri");
    }

    public String getBannerImageUrl() {
        return getString("quest_banner_image_url");
    }

    public Milestone getCurrentMilestone() {
        return mo14534mQ().get(0);
    }

    public String getDescription() {
        return getString("quest_description");
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        mo11079a("quest_description", charArrayBuffer);
    }

    public long getEndTimestamp() {
        return getLong("quest_end_ts");
    }

    public Game getGame() {
        return this.adq;
    }

    public Uri getIconImageUri() {
        return mo11081aR("quest_icon_image_uri");
    }

    public String getIconImageUrl() {
        return getString("quest_icon_image_url");
    }

    public long getLastUpdatedTimestamp() {
        return getLong("quest_last_updated_ts");
    }

    public String getName() {
        return getString("quest_name");
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        mo11079a("quest_name", charArrayBuffer);
    }

    public String getQuestId() {
        return getString("external_quest_id");
    }

    public long getStartTimestamp() {
        return getLong("quest_start_ts");
    }

    public int getState() {
        return getInteger("quest_state");
    }

    public int getType() {
        return getInteger("quest_type");
    }

    public int hashCode() {
        return QuestEntity.m3770a(this);
    }

    public boolean isEndingSoon() {
        return mo14535mR() <= System.currentTimeMillis() + 1800000;
    }

    /* renamed from: mQ */
    public List<Milestone> mo14534mQ() {
        ArrayList arrayList = new ArrayList(this.f2156Ya);
        for (int i = 0; i < this.f2156Ya; i++) {
            arrayList.add(new MilestoneRef(this.f790JG, this.f791KZ + i));
        }
        return arrayList;
    }

    /* renamed from: mR */
    public long mo14535mR() {
        return getLong("notification_ts");
    }

    public String toString() {
        return QuestEntity.m3772b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((QuestEntity) freeze()).writeToParcel(parcel, i);
    }
}
