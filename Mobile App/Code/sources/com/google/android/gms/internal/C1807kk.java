package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.kk */
public class C1807kk implements SafeParcelable {
    public static final C1808kl CREATOR = new C1808kl();

    /* renamed from: CK */
    final int f3968CK;

    /* renamed from: ND */
    public final String f3969ND;

    /* renamed from: NE */
    public final int f3970NE;

    public C1807kk(int i, String str, int i2) {
        this.f3968CK = i;
        this.f3969ND = str;
        this.f3970NE = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1808kl.m5405a(this, parcel, i);
    }
}
