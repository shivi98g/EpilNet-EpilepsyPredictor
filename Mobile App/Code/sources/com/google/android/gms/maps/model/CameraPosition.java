package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0530R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.internal.C2272aa;

public final class CameraPosition implements SafeParcelable {
    public static final C2342a CREATOR = new C2342a();

    /* renamed from: CK */
    private final int f4334CK;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {
        private LatLng alN;
        private float alO;
        private float alP;
        private float alQ;

        public Builder() {
        }

        public Builder(CameraPosition cameraPosition) {
            this.alN = cameraPosition.target;
            this.alO = cameraPosition.zoom;
            this.alP = cameraPosition.tilt;
            this.alQ = cameraPosition.bearing;
        }

        public Builder bearing(float f) {
            this.alQ = f;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.alN, this.alO, this.alP, this.alQ);
        }

        public Builder target(LatLng latLng) {
            this.alN = latLng;
            return this;
        }

        public Builder tilt(float f) {
            this.alP = f;
            return this;
        }

        public Builder zoom(float f) {
            this.alO = f;
            return this;
        }
    }

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        C1785jx.m5359b(latLng, (Object) "null camera target");
        C1785jx.m5361b(0.0f <= f2 && f2 <= 90.0f, (Object) "Tilt needs to be between 0 and 90 inclusive");
        this.f4334CK = i;
        this.target = latLng;
        this.zoom = f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0530R.styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(C0530R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(C0530R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        Builder builder = builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(C0530R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(C0530R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(C0530R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        return builder.build();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4334CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("target", this.target).mo15935a("zoom", Float.valueOf(this.zoom)).mo15935a("tilt", Float.valueOf(this.tilt)).mo15935a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2343b.m6826a(this, parcel, i);
        } else {
            C2342a.m6823a(this, parcel, i);
        }
    }
}
