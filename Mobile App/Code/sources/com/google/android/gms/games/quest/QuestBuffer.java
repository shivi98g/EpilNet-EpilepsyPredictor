package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;

public final class QuestBuffer extends C0708g<Quest> {
    public QuestBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "external_quest_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Quest mo11099f(int i, int i2) {
        return new QuestRef(this.f763JG, i, i2);
    }
}
