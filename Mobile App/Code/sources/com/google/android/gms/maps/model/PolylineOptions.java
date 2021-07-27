package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p000v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C2272aa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final C2393o CREATOR = new C2393o();

    /* renamed from: CK */
    private final int f4342CK;
    private float alX;
    private boolean alY;
    private float amc;
    private final List<LatLng> amx;
    private boolean amz;
    private int mColor;

    public PolylineOptions() {
        this.amc = 10.0f;
        this.mColor = ViewCompat.MEASURED_STATE_MASK;
        this.alX = 0.0f;
        this.alY = true;
        this.amz = false;
        this.f4342CK = 1;
        this.amx = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2) {
        this.amc = 10.0f;
        this.mColor = ViewCompat.MEASURED_STATE_MASK;
        this.alX = 0.0f;
        this.alY = true;
        this.amz = false;
        this.f4342CK = i;
        this.amx = list;
        this.amc = f;
        this.mColor = i2;
        this.alX = f2;
        this.alY = z;
        this.amz = z2;
    }

    public PolylineOptions add(LatLng latLng) {
        this.amx.add(latLng);
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        this.amx.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.amx.add(add);
        }
        return this;
    }

    public PolylineOptions color(int i) {
        this.mColor = i;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolylineOptions geodesic(boolean z) {
        this.amz = z;
        return this;
    }

    public int getColor() {
        return this.mColor;
    }

    public List<LatLng> getPoints() {
        return this.amx;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4342CK;
    }

    public float getWidth() {
        return this.amc;
    }

    public float getZIndex() {
        return this.alX;
    }

    public boolean isGeodesic() {
        return this.amz;
    }

    public boolean isVisible() {
        return this.alY;
    }

    public PolylineOptions visible(boolean z) {
        this.alY = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.amc = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2394p.m6919a(this, parcel, i);
        } else {
            C2393o.m6916a(this, parcel, i);
        }
    }

    public PolylineOptions zIndex(float f) {
        this.alX = f;
        return this;
    }
}
