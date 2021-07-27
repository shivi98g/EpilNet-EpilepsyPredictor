package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.internal.C2272aa;

public final class LatLngBounds implements SafeParcelable {
    public static final C2348g CREATOR = new C2348g();

    /* renamed from: CK */
    private final int f4338CK;
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {
        private double amk = Double.POSITIVE_INFINITY;
        private double aml = Double.NEGATIVE_INFINITY;
        private double amm = Double.NaN;
        private double amn = Double.NaN;

        /* renamed from: d */
        private boolean m6816d(double d) {
            return this.amm <= this.amn ? this.amm <= d && d <= this.amn : this.amm <= d || d <= this.amn;
        }

        public LatLngBounds build() {
            C1785jx.m5355a(!Double.isNaN(this.amm), "no included points");
            return new LatLngBounds(new LatLng(this.amk, this.amm), new LatLng(this.aml, this.amn));
        }

        public Builder include(LatLng latLng) {
            this.amk = Math.min(this.amk, latLng.latitude);
            this.aml = Math.max(this.aml, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.amm)) {
                this.amm = d;
            } else {
                if (!m6816d(d)) {
                    if (LatLngBounds.m6810b(this.amm, d) < LatLngBounds.m6811c(this.amn, d)) {
                        this.amm = d;
                    }
                }
                return this;
            }
            this.amn = d;
            return this;
        }
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        C1785jx.m5359b(latLng, (Object) "null southwest");
        C1785jx.m5359b(latLng2, (Object) "null northeast");
        C1785jx.m5362b(latLng2.latitude >= latLng.latitude, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.latitude), Double.valueOf(latLng2.latitude));
        this.f4338CK = i;
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static double m6810b(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static double m6811c(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    /* renamed from: c */
    private boolean m6812c(double d) {
        return this.southwest.latitude <= d && d <= this.northeast.latitude;
    }

    /* renamed from: d */
    private boolean m6814d(double d) {
        return this.southwest.longitude <= this.northeast.longitude ? this.southwest.longitude <= d && d <= this.northeast.longitude : this.southwest.longitude <= d || d <= this.northeast.longitude;
    }

    public boolean contains(LatLng latLng) {
        return m6812c(latLng.latitude) && m6814d(latLng.longitude);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public LatLng getCenter() {
        double d = (this.southwest.latitude + this.northeast.latitude) / 2.0d;
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        if (d3 > d2) {
            d2 += 360.0d;
        }
        return new LatLng(d, (d2 + d3) / 2.0d);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4338CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.southwest, this.northeast);
    }

    public LatLngBounds including(LatLng latLng) {
        double min = Math.min(this.southwest.latitude, latLng.latitude);
        double max = Math.max(this.northeast.latitude, latLng.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (!m6814d(d3)) {
            if (m6810b(d2, d3) < m6811c(d, d3)) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(min, d2), new LatLng(max, d));
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("southwest", this.southwest).mo15935a("northeast", this.northeast).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2349h.m6838a(this, parcel, i);
        } else {
            C2348g.m6835a(this, parcel, i);
        }
    }
}
