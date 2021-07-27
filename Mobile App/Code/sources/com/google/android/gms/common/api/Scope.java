package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;

public final class Scope implements SafeParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0690e();

    /* renamed from: CK */
    final int f660CK;

    /* renamed from: Kv */
    private final String f661Kv;

    Scope(int i, String str) {
        C1785jx.m5360b(str, (Object) "scopeUri must not be null or empty");
        this.f660CK = i;
        this.f661Kv = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f661Kv.equals(((Scope) obj).f661Kv);
    }

    /* renamed from: gO */
    public String mo10975gO() {
        return this.f661Kv;
    }

    public int hashCode() {
        return this.f661Kv.hashCode();
    }

    public String toString() {
        return this.f661Kv;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0690e.m597a(this, parcel, i);
    }
}
