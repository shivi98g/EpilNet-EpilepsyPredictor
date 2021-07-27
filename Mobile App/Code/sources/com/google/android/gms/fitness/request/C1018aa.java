package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.fitness.request.aa */
public class C1018aa implements SafeParcelable {
    public static final Parcelable.Creator<C1018aa> CREATOR = new C1019ab();

    /* renamed from: CK */
    private final int f1554CK;
    private final PendingIntent mPendingIntent;

    C1018aa(int i, PendingIntent pendingIntent) {
        this.f1554CK = i;
        this.mPendingIntent = pendingIntent;
    }

    public C1018aa(PendingIntent pendingIntent) {
        this.f1554CK = 3;
        this.mPendingIntent = pendingIntent;
    }

    /* renamed from: a */
    private boolean m1855a(C1018aa aaVar) {
        return C1781jv.equal(this.mPendingIntent, aaVar.mPendingIntent);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C1018aa) && m1855a((C1018aa) obj);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1554CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.mPendingIntent);
    }

    /* renamed from: kb */
    public PendingIntent mo12680kb() {
        return this.mPendingIntent;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("pendingIntent", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1019ab.m1857a(this, parcel, i);
    }
}
