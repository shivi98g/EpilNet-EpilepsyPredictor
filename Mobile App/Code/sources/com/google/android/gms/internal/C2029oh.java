package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.oh */
public class C2029oh implements SafeParcelable {
    public static final C2030oi CREATOR = new C2030oi();
    public static final C2029oh akf = new C2029oh(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, Locale.ENGLISH, (String) null);
    public final String akg;
    public final String akh;
    public final String aki;
    public final String akj;
    public final int versionCode;

    public C2029oh(int i, String str, String str2, String str3, String str4) {
        this.versionCode = i;
        this.akg = str;
        this.akh = str2;
        this.aki = str3;
        this.akj = str4;
    }

    public C2029oh(String str, Locale locale, String str2) {
        this(1, str, locale.toString(), str2, (String) null);
    }

    public int describeContents() {
        C2030oi oiVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2029oh)) {
            return false;
        }
        C2029oh ohVar = (C2029oh) obj;
        return this.akh.equals(ohVar.akh) && this.akg.equals(ohVar.akg) && C1781jv.equal(this.aki, ohVar.aki) && C1781jv.equal(this.akj, ohVar.akj);
    }

    public int hashCode() {
        return C1781jv.hashCode(this.akg, this.akh, this.aki);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("clientPackageName", this.akg).mo15935a("locale", this.akh).mo15935a("accountName", this.aki).mo15935a("gCoreClientName", this.akj).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2030oi oiVar = CREATOR;
        C2030oi.m6015a(this, parcel, i);
    }
}
