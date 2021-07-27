package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.wobs.g */
public final class C2682g implements SafeParcelable {
    public static final Parcelable.Creator<C2682g> CREATOR = new C2683h();

    /* renamed from: CK */
    private final int f4515CK;
    int awN;
    String awO;
    double awP;
    String awQ;
    long awR;
    int awS;

    C2682g() {
        this.f4515CK = 1;
        this.awS = -1;
        this.awN = -1;
        this.awP = -1.0d;
    }

    C2682g(int i, int i2, String str, double d, String str2, long j, int i3) {
        this.f4515CK = i;
        this.awN = i2;
        this.awO = str;
        this.awP = d;
        this.awQ = str2;
        this.awR = j;
        this.awS = i3;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4515CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2683h.m7859a(this, parcel, i);
    }
}
