package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.nw */
public class C2014nw implements SafeParcelable {
    public static final C2015nx CREATOR = new C2015nx();

    /* renamed from: CK */
    final int f4151CK;
    private final String ahx;
    private final String ahy;
    private final String mTag;

    C2014nw(int i, String str, String str2, String str3) {
        this.f4151CK = i;
        this.ahx = str;
        this.mTag = str2;
        this.ahy = str3;
    }

    public int describeContents() {
        C2015nx nxVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2014nw)) {
            return false;
        }
        C2014nw nwVar = (C2014nw) obj;
        return C1781jv.equal(this.ahx, nwVar.ahx) && C1781jv.equal(this.mTag, nwVar.mTag) && C1781jv.equal(this.ahy, nwVar.ahy);
    }

    public String getSource() {
        return this.ahy;
    }

    public String getTag() {
        return this.mTag;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.ahx, this.mTag, this.ahy);
    }

    /* renamed from: nw */
    public String mo16414nw() {
        return this.ahx;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("mPlaceId", this.ahx).mo15935a("mTag", this.mTag).mo15935a("mSource", this.ahy).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2015nx nxVar = CREATOR;
        C2015nx.m5984a(this, parcel, i);
    }
}
