package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.nd */
public class C1971nd implements SafeParcelable {
    public static final C1972ne CREATOR = new C1972ne();

    /* renamed from: CK */
    private final int f4138CK;
    public final String packageName;
    public final int uid;

    C1971nd(int i, int i2, String str) {
        this.f4138CK = i;
        this.uid = i2;
        this.packageName = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1971nd)) {
            return false;
        }
        C1971nd ndVar = (C1971nd) obj;
        return ndVar.uid == this.uid && C1781jv.equal(ndVar.packageName, this.packageName);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4138CK;
    }

    public int hashCode() {
        return this.uid;
    }

    public String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.uid), this.packageName});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1972ne.m5805a(this, parcel, i);
    }
}
