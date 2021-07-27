package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.maps.internal.y */
public class C2338y implements SafeParcelable {
    public static final C2339z CREATOR = new C2339z();
    private final Point alK;
    private final int versionCode;

    public C2338y(int i, Point point) {
        this.versionCode = i;
        this.alK = point;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2338y)) {
            return false;
        }
        return this.alK.equals(((C2338y) obj).alK);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return this.alK.hashCode();
    }

    /* renamed from: oa */
    public Point mo17785oa() {
        return this.alK;
    }

    public String toString() {
        return this.alK.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2339z.m6802a(this, parcel, i);
    }
}
