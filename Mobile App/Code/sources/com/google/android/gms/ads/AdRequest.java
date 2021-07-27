package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.C1323bg;
import com.google.android.gms.internal.C1785jx;
import java.util.Date;
import java.util.Set;

public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = C1323bg.DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* renamed from: lg */
    private final C1323bg f72lg;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: lh */
        public final C1323bg.C1324a f73lh = new C1323bg.C1324a();

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f73lh.mo14880b(cls, bundle);
            return this;
        }

        public Builder addKeyword(String str) {
            this.f73lh.mo14884r(str);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f73lh.mo14877a(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f73lh.mo14878a(cls, bundle);
            return this;
        }

        public Builder addTestDevice(String str) {
            this.f73lh.mo14885s(str);
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date) {
            this.f73lh.mo14879a(date);
            return this;
        }

        public Builder setContentUrl(String str) {
            C1785jx.m5359b(str, (Object) "Content URL must be non-null.");
            C1785jx.m5360b(str, (Object) "Content URL must be non-empty.");
            C1785jx.m5362b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f73lh.mo14886t(str);
            return this;
        }

        public Builder setGender(int i) {
            this.f73lh.mo14881h(i);
            return this;
        }

        public Builder setLocation(Location location) {
            this.f73lh.mo14876a(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean z) {
            this.f73lh.mo14883j(z);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.f72lg = new C1323bg(builder.f73lh);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public C1323bg mo9987Y() {
        return this.f72lg;
    }

    public Date getBirthday() {
        return this.f72lg.getBirthday();
    }

    public String getContentUrl() {
        return this.f72lg.getContentUrl();
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f72lg.getCustomEventExtrasBundle(cls);
    }

    public int getGender() {
        return this.f72lg.getGender();
    }

    public Set<String> getKeywords() {
        return this.f72lg.getKeywords();
    }

    public Location getLocation() {
        return this.f72lg.getLocation();
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f72lg.getNetworkExtras(cls);
    }

    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f72lg.getNetworkExtrasBundle(cls);
    }

    public boolean isTestDevice(Context context) {
        return this.f72lg.isTestDevice(context);
    }
}
