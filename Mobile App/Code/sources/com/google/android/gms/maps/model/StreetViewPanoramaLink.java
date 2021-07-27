package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public class StreetViewPanoramaLink implements SafeParcelable {
    public static final C2396r CREATOR = new C2396r();

    /* renamed from: CK */
    private final int f4344CK;
    public final float bearing;
    public final String panoId;

    StreetViewPanoramaLink(int i, String str, float f) {
        this.f4344CK = i;
        this.panoId = str;
        this.bearing = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4344CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.panoId, Float.valueOf(this.bearing));
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("panoId", this.panoId).mo15935a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2396r.m6923a(this, parcel, i);
    }
}
