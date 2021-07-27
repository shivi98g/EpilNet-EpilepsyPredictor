package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.plus.PlusShare;

public final class GameNotificationRef extends C0705d implements GameNotification {
    GameNotificationRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public long getId() {
        return getLong("_id");
    }

    public String getText() {
        return getString("text");
    }

    public String getTitle() {
        return getString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
    }

    public int getType() {
        return getInteger("type");
    }

    /* renamed from: mr */
    public String mo14206mr() {
        return getString("notification_id");
    }

    /* renamed from: ms */
    public String mo14207ms() {
        return getString("ticker");
    }

    /* renamed from: mt */
    public String mo14208mt() {
        return getString("coalesced_text");
    }

    /* renamed from: mu */
    public boolean mo14209mu() {
        return getInteger("acknowledged") > 0;
    }

    /* renamed from: mv */
    public boolean mo14210mv() {
        return getInteger("alert_level") == 0;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("Id", Long.valueOf(getId())).mo15935a("NotificationId", mo14206mr()).mo15935a("Type", Integer.valueOf(getType())).mo15935a("Title", getTitle()).mo15935a("Ticker", mo14207ms()).mo15935a("Text", getText()).mo15935a("CoalescedText", mo14208mt()).mo15935a("isAcknowledged", Boolean.valueOf(mo14209mu())).mo15935a("isSilent", Boolean.valueOf(mo14210mv())).toString();
    }
}
