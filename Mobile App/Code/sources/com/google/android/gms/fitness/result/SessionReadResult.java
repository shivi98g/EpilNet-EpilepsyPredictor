package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.C1002q;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SessionReadResult implements Result, SafeParcelable {
    public static final Parcelable.Creator<SessionReadResult> CREATOR = new C1073f();

    /* renamed from: CK */
    private final int f1621CK;

    /* renamed from: Eb */
    private final Status f1622Eb;

    /* renamed from: VI */
    private final List<Session> f1623VI;

    /* renamed from: Wv */
    private final List<C1002q> f1624Wv;

    SessionReadResult(int i, List<Session> list, List<C1002q> list2, Status status) {
        this.f1621CK = i;
        this.f1623VI = list;
        this.f1624Wv = Collections.unmodifiableList(list2);
        this.f1622Eb = status;
    }

    public SessionReadResult(List<Session> list, List<C1002q> list2, Status status) {
        this.f1621CK = 3;
        this.f1623VI = list;
        this.f1624Wv = Collections.unmodifiableList(list2);
        this.f1622Eb = status;
    }

    /* renamed from: G */
    public static SessionReadResult m1984G(Status status) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    /* renamed from: b */
    private boolean m1985b(SessionReadResult sessionReadResult) {
        return this.f1622Eb.equals(sessionReadResult.f1622Eb) && C1781jv.equal(this.f1623VI, sessionReadResult.f1623VI) && C1781jv.equal(this.f1624Wv, sessionReadResult.f1624Wv);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SessionReadResult) && m1985b((SessionReadResult) obj);
        }
        return true;
    }

    public List<DataSet> getDataSet(Session session) {
        C1785jx.m5362b(this.f1623VI.contains(session), "Attempting to read data for session %s which was not returned", session);
        ArrayList arrayList = new ArrayList();
        for (C1002q next : this.f1624Wv) {
            if (C1781jv.equal(session, next.getSession())) {
                arrayList.add(next.mo12503jH());
            }
        }
        return arrayList;
    }

    public List<DataSet> getDataSet(Session session, DataType dataType) {
        C1785jx.m5362b(this.f1623VI.contains(session), "Attempting to read data for session %s which was not returned", session);
        ArrayList arrayList = new ArrayList();
        for (C1002q next : this.f1624Wv) {
            if (C1781jv.equal(session, next.getSession()) && dataType.equals(next.mo12503jH().getDataType())) {
                arrayList.add(next.mo12503jH());
            }
        }
        return arrayList;
    }

    public List<Session> getSessions() {
        return this.f1623VI;
    }

    public Status getStatus() {
        return this.f1622Eb;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1621CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1622Eb, this.f1623VI, this.f1624Wv);
    }

    /* renamed from: kv */
    public List<C1002q> mo12928kv() {
        return this.f1624Wv;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a(NotificationCompat.CATEGORY_STATUS, this.f1622Eb).mo15935a("sessions", this.f1623VI).mo15935a("sessionDataSets", this.f1624Wv).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1073f.m2004a(this, parcel, i);
    }
}
