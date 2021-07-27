package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.fitness.request.w */
public class C1060w implements SafeParcelable {
    public static final Parcelable.Creator<C1060w> CREATOR = new C1063x();

    /* renamed from: CK */
    private final int f1596CK;

    /* renamed from: TQ */
    private final Session f1597TQ;

    /* renamed from: com.google.android.gms.fitness.request.w$a */
    public static class C1062a {
        /* access modifiers changed from: private */

        /* renamed from: TQ */
        public Session f1598TQ;

        /* renamed from: b */
        public C1062a mo12853b(Session session) {
            C1785jx.m5361b(session.getEndTime(TimeUnit.MILLISECONDS) == 0, (Object) "Cannot start a session which has already ended");
            this.f1598TQ = session;
            return this;
        }

        /* renamed from: kk */
        public C1060w mo12854kk() {
            return new C1060w(this);
        }
    }

    C1060w(int i, Session session) {
        this.f1596CK = i;
        this.f1597TQ = session;
    }

    private C1060w(C1062a aVar) {
        this.f1596CK = 1;
        this.f1597TQ = aVar.f1598TQ;
    }

    /* renamed from: a */
    private boolean m1950a(C1060w wVar) {
        return C1781jv.equal(this.f1597TQ, wVar.f1597TQ);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1060w) && m1950a((C1060w) obj);
        }
        return true;
    }

    public Session getSession() {
        return this.f1597TQ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1596CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1597TQ);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("session", this.f1597TQ).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1063x.m1954a(this, parcel, i);
    }
}
