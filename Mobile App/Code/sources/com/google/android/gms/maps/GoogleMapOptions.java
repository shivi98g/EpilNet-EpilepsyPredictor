package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0530R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C2271a;
import com.google.android.gms.maps.internal.C2272aa;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
    public static final C2248a CREATOR = new C2248a();

    /* renamed from: CK */
    private final int f4289CK;
    private Boolean akF;
    private Boolean akG;
    private int akH;
    private CameraPosition akI;
    private Boolean akJ;
    private Boolean akK;
    private Boolean akL;
    private Boolean akM;
    private Boolean akN;
    private Boolean akO;
    private Boolean akP;
    private Boolean akQ;

    public GoogleMapOptions() {
        this.akH = -1;
        this.f4289CK = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10) {
        this.akH = -1;
        this.f4289CK = i;
        this.akF = C2271a.m6721a(b);
        this.akG = C2271a.m6721a(b2);
        this.akH = i2;
        this.akI = cameraPosition;
        this.akJ = C2271a.m6721a(b3);
        this.akK = C2271a.m6721a(b4);
        this.akL = C2271a.m6721a(b5);
        this.akM = C2271a.m6721a(b6);
        this.akN = C2271a.m6721a(b7);
        this.akO = C2271a.m6721a(b8);
        this.akP = C2271a.m6721a(b9);
        this.akQ = C2271a.m6721a(b10);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0530R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(C0530R.styleable.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(C0530R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(C0530R.styleable.MapAttrs_uiMapToolbar, true));
        }
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.akI = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.akK = Boolean.valueOf(z);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CameraPosition getCamera() {
        return this.akI;
    }

    public Boolean getCompassEnabled() {
        return this.akK;
    }

    public Boolean getLiteMode() {
        return this.akP;
    }

    public Boolean getMapToolbarEnabled() {
        return this.akQ;
    }

    public int getMapType() {
        return this.akH;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.akO;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.akL;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.akN;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.akG;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4289CK;
    }

    public Boolean getZOrderOnTop() {
        return this.akF;
    }

    public Boolean getZoomControlsEnabled() {
        return this.akJ;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.akM;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.akP = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.akQ = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.akH = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nD */
    public byte mo17356nD() {
        return C2271a.m6722c(this.akF);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nE */
    public byte mo17357nE() {
        return C2271a.m6722c(this.akG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nF */
    public byte mo17358nF() {
        return C2271a.m6722c(this.akJ);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nG */
    public byte mo17359nG() {
        return C2271a.m6722c(this.akK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nH */
    public byte mo17360nH() {
        return C2271a.m6722c(this.akL);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nI */
    public byte mo17361nI() {
        return C2271a.m6722c(this.akM);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nJ */
    public byte mo17362nJ() {
        return C2271a.m6722c(this.akN);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nK */
    public byte mo17363nK() {
        return C2271a.m6722c(this.akO);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nL */
    public byte mo17364nL() {
        return C2271a.m6722c(this.akP);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nM */
    public byte mo17365nM() {
        return C2271a.m6722c(this.akQ);
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.akO = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.akL = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.akN = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.akG = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C2272aa.m6723ob()) {
            C2249b.m6707a(this, parcel, i);
        } else {
            C2248a.m6704a(this, parcel, i);
        }
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.akF = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.akJ = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.akM = Boolean.valueOf(z);
        return this;
    }
}
