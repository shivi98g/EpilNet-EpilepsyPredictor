package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.wearable.c */
public class C2703c implements SafeParcelable {
    public static final Parcelable.Creator<C2703c> CREATOR = new C2704d();

    /* renamed from: CK */
    final int f4531CK;

    /* renamed from: Gt */
    private final int f4532Gt;

    /* renamed from: TW */
    private final String f4533TW;
    private final int axc;
    private final boolean axd;
    private boolean axe;
    private String axf;
    private final String mName;

    C2703c(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3) {
        this.f4531CK = i;
        this.mName = str;
        this.f4533TW = str2;
        this.f4532Gt = i2;
        this.axc = i3;
        this.axd = z;
        this.axe = z2;
        this.axf = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2703c)) {
            return false;
        }
        C2703c cVar = (C2703c) obj;
        return C1781jv.equal(Integer.valueOf(this.f4531CK), Integer.valueOf(cVar.f4531CK)) && C1781jv.equal(this.mName, cVar.mName) && C1781jv.equal(this.f4533TW, cVar.f4533TW) && C1781jv.equal(Integer.valueOf(this.f4532Gt), Integer.valueOf(cVar.f4532Gt)) && C1781jv.equal(Integer.valueOf(this.axc), Integer.valueOf(cVar.axc)) && C1781jv.equal(Boolean.valueOf(this.axd), Boolean.valueOf(cVar.axd));
    }

    public String getAddress() {
        return this.f4533TW;
    }

    public String getName() {
        return this.mName;
    }

    public int getRole() {
        return this.axc;
    }

    public int getType() {
        return this.f4532Gt;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f4531CK), this.mName, this.f4533TW, Integer.valueOf(this.f4532Gt), Integer.valueOf(this.axc), Boolean.valueOf(this.axd));
    }

    public boolean isConnected() {
        return this.axe;
    }

    public boolean isEnabled() {
        return this.axd;
    }

    /* renamed from: rj */
    public String mo19409rj() {
        return this.axf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        sb.append("mName=" + this.mName);
        sb.append(", mAddress=" + this.f4533TW);
        sb.append(", mType=" + this.f4532Gt);
        sb.append(", mRole=" + this.axc);
        sb.append(", mEnabled=" + this.axd);
        sb.append(", mIsConnected=" + this.axe);
        sb.append(", mEnabled=" + this.axf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2704d.m7911a(this, parcel, i);
    }
}
