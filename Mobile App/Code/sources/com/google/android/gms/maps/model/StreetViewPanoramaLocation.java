package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public class StreetViewPanoramaLocation implements SafeParcelable {
    public static final C2397s CREATOR = new C2397s();

    /* renamed from: CK */
    private final int f4345CK;
    public final StreetViewPanoramaLink[] links;
    public final String panoId;
    public final LatLng position;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f4345CK = i;
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this(1, streetViewPanoramaLinkArr, latLng, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4345CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.position, this.panoId);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("panoId", this.panoId).mo15935a("position", this.position.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2397s.m6926a(this, parcel, i);
    }
}
