package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C2271a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions implements SafeParcelable {
    public static final C2250c CREATOR = new C2250c();

    /* renamed from: CK */
    private final int f4296CK;
    private Boolean akG;
    private Boolean akM;
    private StreetViewPanoramaCamera alr;
    private String als;
    private LatLng alt;
    private Integer alu;
    private Boolean alv;
    private Boolean alw;
    private Boolean alx;

    public StreetViewPanoramaOptions() {
        this.alv = true;
        this.akM = true;
        this.alw = true;
        this.alx = true;
        this.f4296CK = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.alv = true;
        this.akM = true;
        this.alw = true;
        this.alx = true;
        this.f4296CK = i;
        this.alr = streetViewPanoramaCamera;
        this.alt = latLng;
        this.alu = num;
        this.als = str;
        this.alv = C2271a.m6721a(b);
        this.akM = C2271a.m6721a(b2);
        this.alw = C2271a.m6721a(b3);
        this.alx = C2271a.m6721a(b4);
        this.akG = C2271a.m6721a(b5);
    }

    public int describeContents() {
        return 0;
    }

    public Boolean getPanningGesturesEnabled() {
        return this.alw;
    }

    public String getPanoramaId() {
        return this.als;
    }

    public LatLng getPosition() {
        return this.alt;
    }

    public Integer getRadius() {
        return this.alu;
    }

    public Boolean getStreetNamesEnabled() {
        return this.alx;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.alr;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.akG;
    }

    public Boolean getUserNavigationEnabled() {
        return this.alv;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4296CK;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.akM;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nE */
    public byte mo17469nE() {
        return C2271a.m6722c(this.akG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nI */
    public byte mo17470nI() {
        return C2271a.m6722c(this.akM);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nS */
    public byte mo17471nS() {
        return C2271a.m6722c(this.alv);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nT */
    public byte mo17472nT() {
        return C2271a.m6722c(this.alw);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nU */
    public byte mo17473nU() {
        return C2271a.m6722c(this.alx);
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.alw = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.alr = streetViewPanoramaCamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String str) {
        this.als = str;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng) {
        this.alt = latLng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.alt = latLng;
        this.alu = num;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.alx = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.akG = Boolean.valueOf(z);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.alv = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2250c.m6708a(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.akM = Boolean.valueOf(z);
        return this;
    }
}
