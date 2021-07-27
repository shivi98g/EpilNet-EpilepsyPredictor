package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.C1323bg;

public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR = C1323bg.DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;

    /* renamed from: lg */
    private final C1323bg f105lg;

    /* renamed from: xA */
    private final int f106xA;

    /* renamed from: xB */
    private final int f107xB;

    /* renamed from: xC */
    private final int f108xC;

    /* renamed from: xD */
    private final int f109xD;

    /* renamed from: xE */
    private final int f110xE;

    /* renamed from: xF */
    private final int f111xF;

    /* renamed from: xG */
    private final int f112xG;

    /* renamed from: xH */
    private final int f113xH;

    /* renamed from: xI */
    private final String f114xI;

    /* renamed from: xJ */
    private final int f115xJ;

    /* renamed from: xK */
    private final String f116xK;

    /* renamed from: xL */
    private final int f117xL;

    /* renamed from: xM */
    private final int f118xM;

    /* renamed from: xN */
    private final String f119xN;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: lh */
        public final C1323bg.C1324a f120lh = new C1323bg.C1324a();
        /* access modifiers changed from: private */

        /* renamed from: xA */
        public int f121xA;
        /* access modifiers changed from: private */

        /* renamed from: xB */
        public int f122xB;
        /* access modifiers changed from: private */

        /* renamed from: xC */
        public int f123xC;
        /* access modifiers changed from: private */

        /* renamed from: xD */
        public int f124xD;
        /* access modifiers changed from: private */

        /* renamed from: xE */
        public int f125xE;
        /* access modifiers changed from: private */

        /* renamed from: xF */
        public int f126xF;
        /* access modifiers changed from: private */

        /* renamed from: xG */
        public int f127xG = 0;
        /* access modifiers changed from: private */

        /* renamed from: xH */
        public int f128xH;
        /* access modifiers changed from: private */

        /* renamed from: xI */
        public String f129xI;
        /* access modifiers changed from: private */

        /* renamed from: xJ */
        public int f130xJ;
        /* access modifiers changed from: private */

        /* renamed from: xK */
        public String f131xK;
        /* access modifiers changed from: private */

        /* renamed from: xL */
        public int f132xL;
        /* access modifiers changed from: private */

        /* renamed from: xM */
        public int f133xM;
        /* access modifiers changed from: private */

        /* renamed from: xN */
        public String f134xN;

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f120lh.mo14880b(cls, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f120lh.mo14877a(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f120lh.mo14878a(cls, bundle);
            return this;
        }

        public Builder addTestDevice(String str) {
            this.f120lh.mo14885s(str);
            return this;
        }

        public SearchAdRequest build() {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i) {
            this.f121xA = i;
            return this;
        }

        public Builder setBackgroundColor(int i) {
            this.f122xB = i;
            this.f123xC = Color.argb(0, 0, 0, 0);
            this.f124xD = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i, int i2) {
            this.f122xB = Color.argb(0, 0, 0, 0);
            this.f123xC = i2;
            this.f124xD = i;
            return this;
        }

        public Builder setBorderColor(int i) {
            this.f125xE = i;
            return this;
        }

        public Builder setBorderThickness(int i) {
            this.f126xF = i;
            return this;
        }

        public Builder setBorderType(int i) {
            this.f127xG = i;
            return this;
        }

        public Builder setCallButtonColor(int i) {
            this.f128xH = i;
            return this;
        }

        public Builder setCustomChannels(String str) {
            this.f129xI = str;
            return this;
        }

        public Builder setDescriptionTextColor(int i) {
            this.f130xJ = i;
            return this;
        }

        public Builder setFontFace(String str) {
            this.f131xK = str;
            return this;
        }

        public Builder setHeaderTextColor(int i) {
            this.f132xL = i;
            return this;
        }

        public Builder setHeaderTextSize(int i) {
            this.f133xM = i;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f120lh.mo14876a(location);
            return this;
        }

        public Builder setQuery(String str) {
            this.f134xN = str;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean z) {
            this.f120lh.mo14883j(z);
            return this;
        }
    }

    private SearchAdRequest(Builder builder) {
        this.f106xA = builder.f121xA;
        this.f107xB = builder.f122xB;
        this.f108xC = builder.f123xC;
        this.f109xD = builder.f124xD;
        this.f110xE = builder.f125xE;
        this.f111xF = builder.f126xF;
        this.f112xG = builder.f127xG;
        this.f113xH = builder.f128xH;
        this.f114xI = builder.f129xI;
        this.f115xJ = builder.f130xJ;
        this.f116xK = builder.f131xK;
        this.f117xL = builder.f132xL;
        this.f118xM = builder.f133xM;
        this.f119xN = builder.f134xN;
        this.f105lg = new C1323bg(builder.f120lh, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public C1323bg mo10157Y() {
        return this.f105lg;
    }

    public int getAnchorTextColor() {
        return this.f106xA;
    }

    public int getBackgroundColor() {
        return this.f107xB;
    }

    public int getBackgroundGradientBottom() {
        return this.f108xC;
    }

    public int getBackgroundGradientTop() {
        return this.f109xD;
    }

    public int getBorderColor() {
        return this.f110xE;
    }

    public int getBorderThickness() {
        return this.f111xF;
    }

    public int getBorderType() {
        return this.f112xG;
    }

    public int getCallButtonColor() {
        return this.f113xH;
    }

    public String getCustomChannels() {
        return this.f114xI;
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f105lg.getCustomEventExtrasBundle(cls);
    }

    public int getDescriptionTextColor() {
        return this.f115xJ;
    }

    public String getFontFace() {
        return this.f116xK;
    }

    public int getHeaderTextColor() {
        return this.f117xL;
    }

    public int getHeaderTextSize() {
        return this.f118xM;
    }

    public Location getLocation() {
        return this.f105lg.getLocation();
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f105lg.getNetworkExtras(cls);
    }

    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f105lg.getNetworkExtrasBundle(cls);
    }

    public String getQuery() {
        return this.f119xN;
    }

    public boolean isTestDevice(Context context) {
        return this.f105lg.isTestDevice(context);
    }
}
