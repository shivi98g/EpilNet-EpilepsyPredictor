package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p000v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C2272aa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
    public static final C2391m CREATOR = new C2391m();

    /* renamed from: CK */
    private final int f4341CK;
    private float alU;
    private int alV;
    private int alW;
    private float alX;
    private boolean alY;
    private final List<LatLng> amx;
    private final List<List<LatLng>> amy;
    private boolean amz;

    public PolygonOptions() {
        this.alU = 10.0f;
        this.alV = ViewCompat.MEASURED_STATE_MASK;
        this.alW = 0;
        this.alX = 0.0f;
        this.alY = true;
        this.amz = false;
        this.f4341CK = 1;
        this.amx = new ArrayList();
        this.amy = new ArrayList();
    }

    PolygonOptions(int i, List<LatLng> list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.alU = 10.0f;
        this.alV = ViewCompat.MEASURED_STATE_MASK;
        this.alW = 0;
        this.alX = 0.0f;
        this.alY = true;
        this.amz = false;
        this.f4341CK = i;
        this.amx = list;
        this.amy = list2;
        this.alU = f;
        this.alV = i2;
        this.alW = i3;
        this.alX = f2;
        this.alY = z;
        this.amz = z2;
    }

    public PolygonOptions add(LatLng latLng) {
        this.amx.add(latLng);
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        this.amx.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.amx.add(add);
        }
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.amy.add(arrayList);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolygonOptions fillColor(int i) {
        this.alW = i;
        return this;
    }

    public PolygonOptions geodesic(boolean z) {
        this.amz = z;
        return this;
    }

    public int getFillColor() {
        return this.alW;
    }

    public List<List<LatLng>> getHoles() {
        return this.amy;
    }

    public List<LatLng> getPoints() {
        return this.amx;
    }

    public int getStrokeColor() {
        return this.alV;
    }

    public float getStrokeWidth() {
        return this.alU;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4341CK;
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

    /* access modifiers changed from: package-private */
    /* renamed from: of */
    public List mo18002of() {
        return this.amy;
    }

    public PolygonOptions strokeColor(int i) {
        this.alV = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        this.alU = f;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.alY = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2392n.m6915a(this, parcel, i);
        } else {
            C2391m.m6912a(this, parcel, i);
        }
    }

    public PolygonOptions zIndex(float f) {
        this.alX = f;
        return this;
    }
}
