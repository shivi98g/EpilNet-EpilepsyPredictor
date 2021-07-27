package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p000v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C2272aa;

public final class CircleOptions implements SafeParcelable {
    public static final C2344c CREATOR = new C2344c();

    /* renamed from: CK */
    private final int f4335CK;
    private LatLng alS;
    private double alT;
    private float alU;
    private int alV;
    private int alW;
    private float alX;
    private boolean alY;

    public CircleOptions() {
        this.alS = null;
        this.alT = 0.0d;
        this.alU = 10.0f;
        this.alV = ViewCompat.MEASURED_STATE_MASK;
        this.alW = 0;
        this.alX = 0.0f;
        this.alY = true;
        this.f4335CK = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.alS = null;
        this.alT = 0.0d;
        this.alU = 10.0f;
        this.alV = ViewCompat.MEASURED_STATE_MASK;
        this.alW = 0;
        this.alX = 0.0f;
        this.alY = true;
        this.f4335CK = i;
        this.alS = latLng;
        this.alT = d;
        this.alU = f;
        this.alV = i2;
        this.alW = i3;
        this.alX = f2;
        this.alY = z;
    }

    public CircleOptions center(LatLng latLng) {
        this.alS = latLng;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CircleOptions fillColor(int i) {
        this.alW = i;
        return this;
    }

    public LatLng getCenter() {
        return this.alS;
    }

    public int getFillColor() {
        return this.alW;
    }

    public double getRadius() {
        return this.alT;
    }

    public int getStrokeColor() {
        return this.alV;
    }

    public float getStrokeWidth() {
        return this.alU;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4335CK;
    }

    public float getZIndex() {
        return this.alX;
    }

    public boolean isVisible() {
        return this.alY;
    }

    public CircleOptions radius(double d) {
        this.alT = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.alV = i;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        this.alU = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.alY = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2345d.m6830a(this, parcel, i);
        } else {
            C2344c.m6827a(this, parcel, i);
        }
    }

    public CircleOptions zIndex(float f) {
        this.alX = f;
        return this;
    }
}
