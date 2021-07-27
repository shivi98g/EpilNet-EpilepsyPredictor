package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.maps.internal.C2272aa;

public final class MarkerOptions implements SafeParcelable {
    public static final C2389k CREATOR = new C2389k();

    /* renamed from: CK */
    private final int f4339CK;

    /* renamed from: OH */
    private String f4340OH;
    private boolean alY;
    private LatLng alt;
    private float amg;
    private float amh;
    private String amp;
    private BitmapDescriptor amq;
    private boolean amr;
    private boolean ams;
    private float amt;
    private float amu;
    private float amv;
    private float mAlpha;

    public MarkerOptions() {
        this.amg = 0.5f;
        this.amh = 1.0f;
        this.alY = true;
        this.ams = false;
        this.amt = 0.0f;
        this.amu = 0.5f;
        this.amv = 0.0f;
        this.mAlpha = 1.0f;
        this.f4339CK = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6) {
        this.amg = 0.5f;
        this.amh = 1.0f;
        this.alY = true;
        this.ams = false;
        this.amt = 0.0f;
        this.amu = 0.5f;
        this.amv = 0.0f;
        this.mAlpha = 1.0f;
        this.f4339CK = i;
        this.alt = latLng;
        this.f4340OH = str;
        this.amp = str2;
        this.amq = iBinder == null ? null : new BitmapDescriptor(C0967d.C0968a.m1611ap(iBinder));
        this.amg = f;
        this.amh = f2;
        this.amr = z;
        this.alY = z2;
        this.ams = z3;
        this.amt = f3;
        this.amu = f4;
        this.amv = f5;
        this.mAlpha = f6;
    }

    public MarkerOptions alpha(float f) {
        this.mAlpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.amg = f;
        this.amh = f2;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public MarkerOptions draggable(boolean z) {
        this.amr = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.ams = z;
        return this;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getAnchorU() {
        return this.amg;
    }

    public float getAnchorV() {
        return this.amh;
    }

    public BitmapDescriptor getIcon() {
        return this.amq;
    }

    public float getInfoWindowAnchorU() {
        return this.amu;
    }

    public float getInfoWindowAnchorV() {
        return this.amv;
    }

    public LatLng getPosition() {
        return this.alt;
    }

    public float getRotation() {
        return this.amt;
    }

    public String getSnippet() {
        return this.amp;
    }

    public String getTitle() {
        return this.f4340OH;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4339CK;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.amq = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.amu = f;
        this.amv = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.amr;
    }

    public boolean isFlat() {
        return this.ams;
    }

    public boolean isVisible() {
        return this.alY;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oe */
    public IBinder mo17959oe() {
        if (this.amq == null) {
            return null;
        }
        return this.amq.mo17792nA().asBinder();
    }

    public MarkerOptions position(LatLng latLng) {
        this.alt = latLng;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.amt = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.amp = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.f4340OH = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.alY = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2390l.m6911a(this, parcel, i);
        } else {
            C2389k.m6908a(this, parcel, i);
        }
    }
}
