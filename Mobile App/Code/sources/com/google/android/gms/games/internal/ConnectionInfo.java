package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConnectionInfo implements SafeParcelable {
    public static final ConnectionInfoCreator CREATOR = new ConnectionInfoCreator();

    /* renamed from: CK */
    private final int f1778CK;

    /* renamed from: Yi */
    private final String f1779Yi;

    /* renamed from: Yj */
    private final int f1780Yj;

    public ConnectionInfo(int i, String str, int i2) {
        this.f1778CK = i;
        this.f1779Yi = str;
        this.f1780Yj = i2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f1778CK;
    }

    /* renamed from: le */
    public String mo13388le() {
        return this.f1779Yi;
    }

    /* renamed from: lf */
    public int mo13389lf() {
        return this.f1780Yj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ConnectionInfoCreator.m2277a(this, parcel, i);
    }
}
