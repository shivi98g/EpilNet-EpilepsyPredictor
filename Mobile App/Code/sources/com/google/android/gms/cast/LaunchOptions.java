package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1706in;
import com.google.android.gms.internal.C1781jv;
import java.util.Locale;

public class LaunchOptions implements SafeParcelable {
    public static final Parcelable.Creator<LaunchOptions> CREATOR = new C0663c();

    /* renamed from: CK */
    private final int f502CK;

    /* renamed from: FQ */
    private boolean f503FQ;

    /* renamed from: FR */
    private String f504FR;

    public static final class Builder {

        /* renamed from: FS */
        private LaunchOptions f505FS = new LaunchOptions();

        public LaunchOptions build() {
            return this.f505FS;
        }

        public Builder setLocale(Locale locale) {
            this.f505FS.setLanguage(C1706in.m5035b(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean z) {
            this.f505FS.setRelaunchIfRunning(z);
            return this;
        }
    }

    public LaunchOptions() {
        this(1, false, C1706in.m5035b(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean z, String str) {
        this.f502CK = i;
        this.f503FQ = z;
        this.f504FR = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.f503FQ == launchOptions.f503FQ && C1706in.m5031a(this.f504FR, launchOptions.f504FR);
    }

    public String getLanguage() {
        return this.f504FR;
    }

    public boolean getRelaunchIfRunning() {
        return this.f503FQ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f502CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Boolean.valueOf(this.f503FQ), this.f504FR);
    }

    public void setLanguage(String str) {
        this.f504FR = str;
    }

    public void setRelaunchIfRunning(boolean z) {
        this.f503FQ = z;
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[]{Boolean.valueOf(this.f503FQ), this.f504FR});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0663c.m468a(this, parcel, i);
    }
}
