package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.internal.C2272aa;

public final class GroundOverlayOptions implements SafeParcelable {
    public static final C2346e CREATOR = new C2346e();
    public static final float NO_DIMENSION = -1.0f;

    /* renamed from: CK */
    private final int f4336CK;
    private float alQ;
    private float alX;
    private boolean alY;
    private BitmapDescriptor ama;
    private LatLng amb;
    private float amc;
    private float amd;
    private LatLngBounds ame;
    private float amf;
    private float amg;
    private float amh;

    public GroundOverlayOptions() {
        this.alY = true;
        this.amf = 0.0f;
        this.amg = 0.5f;
        this.amh = 0.5f;
        this.f4336CK = 1;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.alY = true;
        this.amf = 0.0f;
        this.amg = 0.5f;
        this.amh = 0.5f;
        this.f4336CK = i;
        this.ama = new BitmapDescriptor(C0967d.C0968a.m1611ap(iBinder));
        this.amb = latLng;
        this.amc = f;
        this.amd = f2;
        this.ame = latLngBounds;
        this.alQ = f3;
        this.alX = f4;
        this.alY = z;
        this.amf = f5;
        this.amg = f6;
        this.amh = f7;
    }

    /* renamed from: a */
    private GroundOverlayOptions m6808a(LatLng latLng, float f, float f2) {
        this.amb = latLng;
        this.amc = f;
        this.amd = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.amg = f;
        this.amh = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.alQ = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.amg;
    }

    public float getAnchorV() {
        return this.amh;
    }

    public float getBearing() {
        return this.alQ;
    }

    public LatLngBounds getBounds() {
        return this.ame;
    }

    public float getHeight() {
        return this.amd;
    }

    public BitmapDescriptor getImage() {
        return this.ama;
    }

    public LatLng getLocation() {
        return this.amb;
    }

    public float getTransparency() {
        return this.amf;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4336CK;
    }

    public float getWidth() {
        return this.amc;
    }

    public float getZIndex() {
        return this.alX;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        this.ama = bitmapDescriptor;
        return this;
    }

    public boolean isVisible() {
        return this.alY;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: od */
    public IBinder mo17876od() {
        return this.ama.mo17792nA().asBinder();
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        boolean z = false;
        C1785jx.m5355a(this.ame == null, "Position has already been set using positionFromBounds");
        C1785jx.m5361b(latLng != null, (Object) "Location must be specified");
        if (f >= 0.0f) {
            z = true;
        }
        C1785jx.m5361b(z, (Object) "Width must be non-negative");
        return m6808a(latLng, f, -1.0f);
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        boolean z = false;
        C1785jx.m5355a(this.ame == null, "Position has already been set using positionFromBounds");
        C1785jx.m5361b(latLng != null, (Object) "Location must be specified");
        C1785jx.m5361b(f >= 0.0f, (Object) "Width must be non-negative");
        if (f2 >= 0.0f) {
            z = true;
        }
        C1785jx.m5361b(z, (Object) "Height must be non-negative");
        return m6808a(latLng, f, f2);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        boolean z = this.amb == null;
        C1785jx.m5355a(z, "Position has already been set using position: " + this.amb);
        this.ame = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        C1785jx.m5361b(f >= 0.0f && f <= 1.0f, (Object) "Transparency must be in the range [0..1]");
        this.amf = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.alY = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2347f.m6834a(this, parcel, i);
        } else {
            C2346e.m6831a(this, parcel, i);
        }
    }

    public GroundOverlayOptions zIndex(float f) {
        this.alX = f;
        return this;
    }
}
