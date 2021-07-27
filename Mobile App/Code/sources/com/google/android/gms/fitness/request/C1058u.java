package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.fitness.request.u */
public class C1058u implements SafeParcelable {
    public static final Parcelable.Creator<C1058u> CREATOR = new C1059v();

    /* renamed from: CK */
    private final int f1595CK;
    private final PendingIntent mPendingIntent;

    C1058u(int i, PendingIntent pendingIntent) {
        this.f1595CK = i;
        this.mPendingIntent = pendingIntent;
    }

    public C1058u(PendingIntent pendingIntent) {
        this.f1595CK = 3;
        this.mPendingIntent = pendingIntent;
    }

    /* renamed from: a */
    private boolean m1945a(C1058u uVar) {
        return C1781jv.equal(this.mPendingIntent, uVar.mPendingIntent);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C1058u) && m1945a((C1058u) obj);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1595CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.mPendingIntent);
    }

    /* renamed from: kb */
    public PendingIntent mo12839kb() {
        return this.mPendingIntent;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("pendingIntent", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1059v.m1947a(this, parcel, i);
    }
}
