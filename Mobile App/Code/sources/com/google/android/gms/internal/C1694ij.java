package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.ij */
public class C1694ij implements SafeParcelable {
    public static final Parcelable.Creator<C1694ij> CREATOR = new C1695ik();

    /* renamed from: CK */
    private final int f3752CK;

    /* renamed from: Hd */
    private String f3753Hd;

    public C1694ij() {
        this(1, (String) null);
    }

    C1694ij(int i, String str) {
        this.f3752CK = i;
        this.f3753Hd = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1694ij)) {
            return false;
        }
        return C1706in.m5031a(this.f3753Hd, ((C1694ij) obj).f3753Hd);
    }

    /* renamed from: fT */
    public String mo15633fT() {
        return this.f3753Hd;
    }

    public int getVersionCode() {
        return this.f3752CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f3753Hd);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1695ik.m4961a(this, parcel, i);
    }
}
