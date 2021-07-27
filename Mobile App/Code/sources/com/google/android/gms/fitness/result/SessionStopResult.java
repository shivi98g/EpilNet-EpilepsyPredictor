package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.C1781jv;
import java.util.Collections;
import java.util.List;

public class SessionStopResult implements Result, SafeParcelable {
    public static final Parcelable.Creator<SessionStopResult> CREATOR = new C1074g();

    /* renamed from: CK */
    private final int f1625CK;

    /* renamed from: Eb */
    private final Status f1626Eb;

    /* renamed from: VI */
    private final List<Session> f1627VI;

    SessionStopResult(int i, Status status, List<Session> list) {
        this.f1625CK = i;
        this.f1626Eb = status;
        this.f1627VI = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List<Session> list) {
        this.f1625CK = 3;
        this.f1626Eb = status;
        this.f1627VI = Collections.unmodifiableList(list);
    }

    /* renamed from: H */
    public static SessionStopResult m1987H(Status status) {
        return new SessionStopResult(status, Collections.emptyList());
    }

    /* renamed from: b */
    private boolean m1988b(SessionStopResult sessionStopResult) {
        return this.f1626Eb.equals(sessionStopResult.f1626Eb) && C1781jv.equal(this.f1627VI, sessionStopResult.f1627VI);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SessionStopResult) && m1988b((SessionStopResult) obj);
        }
        return true;
    }

    public List<Session> getSessions() {
        return this.f1627VI;
    }

    public Status getStatus() {
        return this.f1626Eb;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1625CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1626Eb, this.f1627VI);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a(NotificationCompat.CATEGORY_STATUS, this.f1626Eb).mo15935a("sessions", this.f1627VI).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1074g.m2007a(this, parcel, i);
    }
}
