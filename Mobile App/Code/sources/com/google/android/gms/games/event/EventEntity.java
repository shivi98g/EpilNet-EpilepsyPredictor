package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;

public final class EventEntity implements SafeParcelable, Event {
    public static final EventEntityCreator CREATOR = new EventEntityCreator();

    /* renamed from: CK */
    private final int f1769CK;

    /* renamed from: UO */
    private final String f1770UO;

    /* renamed from: WD */
    private final Uri f1771WD;

    /* renamed from: WO */
    private final String f1772WO;

    /* renamed from: XE */
    private final PlayerEntity f1773XE;

    /* renamed from: Ye */
    private final String f1774Ye;

    /* renamed from: Yf */
    private final long f1775Yf;

    /* renamed from: Yg */
    private final String f1776Yg;

    /* renamed from: Yh */
    private final boolean f1777Yh;
    private final String mName;

    EventEntity(int i, String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.f1769CK = i;
        this.f1774Ye = str;
        this.mName = str2;
        this.f1770UO = str3;
        this.f1771WD = uri;
        this.f1772WO = str4;
        this.f1773XE = new PlayerEntity(player);
        this.f1775Yf = j;
        this.f1776Yg = str5;
        this.f1777Yh = z;
    }

    public EventEntity(Event event) {
        this.f1769CK = 1;
        this.f1774Ye = event.getEventId();
        this.mName = event.getName();
        this.f1770UO = event.getDescription();
        this.f1771WD = event.getIconImageUri();
        this.f1772WO = event.getIconImageUrl();
        this.f1773XE = (PlayerEntity) event.getPlayer().freeze();
        this.f1775Yf = event.getValue();
        this.f1776Yg = event.getFormattedValue();
        this.f1777Yh = event.isVisible();
    }

    /* renamed from: a */
    static int m2205a(Event event) {
        return C1781jv.hashCode(event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), Long.valueOf(event.getValue()), event.getFormattedValue(), Boolean.valueOf(event.isVisible()));
    }

    /* renamed from: a */
    static boolean m2206a(Event event, Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        Event event2 = (Event) obj;
        return C1781jv.equal(event2.getEventId(), event.getEventId()) && C1781jv.equal(event2.getName(), event.getName()) && C1781jv.equal(event2.getDescription(), event.getDescription()) && C1781jv.equal(event2.getIconImageUri(), event.getIconImageUri()) && C1781jv.equal(event2.getIconImageUrl(), event.getIconImageUrl()) && C1781jv.equal(event2.getPlayer(), event.getPlayer()) && C1781jv.equal(Long.valueOf(event2.getValue()), Long.valueOf(event.getValue())) && C1781jv.equal(event2.getFormattedValue(), event.getFormattedValue()) && C1781jv.equal(Boolean.valueOf(event2.isVisible()), Boolean.valueOf(event.isVisible()));
    }

    /* renamed from: b */
    static String m2207b(Event event) {
        return C1781jv.m5348h(event).mo15935a("Id", event.getEventId()).mo15935a("Name", event.getName()).mo15935a("Description", event.getDescription()).mo15935a("IconImageUri", event.getIconImageUri()).mo15935a("IconImageUrl", event.getIconImageUrl()).mo15935a("Player", event.getPlayer()).mo15935a("Value", Long.valueOf(event.getValue())).mo15935a("FormattedValue", event.getFormattedValue()).mo15935a("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2206a(this, obj);
    }

    public Event freeze() {
        return this;
    }

    public String getDescription() {
        return this.f1770UO;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1770UO, charArrayBuffer);
    }

    public String getEventId() {
        return this.f1774Ye;
    }

    public String getFormattedValue() {
        return this.f1776Yg;
    }

    public void getFormattedValue(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f1776Yg, charArrayBuffer);
    }

    public Uri getIconImageUri() {
        return this.f1771WD;
    }

    public String getIconImageUrl() {
        return this.f1772WO;
    }

    public String getName() {
        return this.mName;
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.mName, charArrayBuffer);
    }

    public Player getPlayer() {
        return this.f1773XE;
    }

    public long getValue() {
        return this.f1775Yf;
    }

    public int getVersionCode() {
        return this.f1769CK;
    }

    public int hashCode() {
        return m2205a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isVisible() {
        return this.f1777Yh;
    }

    public String toString() {
        return m2207b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        EventEntityCreator.m2208a(this, parcel, i);
    }
}
