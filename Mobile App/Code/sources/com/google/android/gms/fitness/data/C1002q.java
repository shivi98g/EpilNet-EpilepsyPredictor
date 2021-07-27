package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.fitness.data.q */
public class C1002q implements SafeParcelable {
    public static final Parcelable.Creator<C1002q> CREATOR = new C1003r();

    /* renamed from: CK */
    final int f1448CK;

    /* renamed from: TQ */
    private final Session f1449TQ;

    /* renamed from: UP */
    private final DataSet f1450UP;

    C1002q(int i, Session session, DataSet dataSet) {
        this.f1448CK = i;
        this.f1449TQ = session;
        this.f1450UP = dataSet;
    }

    /* renamed from: a */
    private boolean m1763a(C1002q qVar) {
        return C1781jv.equal(this.f1449TQ, qVar.f1449TQ) && C1781jv.equal(this.f1450UP, qVar.f1450UP);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1002q) && m1763a((C1002q) obj);
        }
        return true;
    }

    public Session getSession() {
        return this.f1449TQ;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1449TQ, this.f1450UP);
    }

    /* renamed from: jH */
    public DataSet mo12503jH() {
        return this.f1450UP;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("session", this.f1449TQ).mo15935a("dataSet", this.f1450UP).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1003r.m1765a(this, parcel, i);
    }
}
