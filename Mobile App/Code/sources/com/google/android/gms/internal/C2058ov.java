package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.ov */
public class C2058ov implements SafeParcelable {
    public static final C2059ow CREATOR = new C2059ow();
    public final int ang;
    public final int anh;
    public final String ani;
    public final String anj;
    public final boolean ank;
    public final String anl;
    public final String packageName;
    public final int versionCode;

    public C2058ov(int i, String str, int i2, int i3, String str2, String str3, boolean z, String str4) {
        this.versionCode = i;
        this.packageName = str;
        this.ang = i2;
        this.anh = i3;
        this.ani = str2;
        this.anj = str3;
        this.ank = z;
        this.anl = str4;
    }

    @Deprecated
    public C2058ov(String str, int i, int i2, String str2, String str3, boolean z) {
        this.versionCode = 1;
        this.packageName = (String) C1785jx.m5364i(str);
        this.ang = i;
        this.anh = i2;
        this.anl = null;
        this.ani = str2;
        this.anj = str3;
        this.ank = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2058ov)) {
            return false;
        }
        C2058ov ovVar = (C2058ov) obj;
        return this.packageName.equals(ovVar.packageName) && this.ang == ovVar.ang && this.anh == ovVar.anh && C1781jv.equal(this.anl, ovVar.anl) && C1781jv.equal(this.ani, ovVar.ani) && C1781jv.equal(this.anj, ovVar.anj) && this.ank == ovVar.ank;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.packageName, Integer.valueOf(this.ang), Integer.valueOf(this.anh), this.ani, this.anj, Boolean.valueOf(this.ank));
    }

    public String toString() {
        return "PlayLoggerContext[" + "package=" + this.packageName + ',' + "versionCode=" + this.versionCode + ',' + "logSource=" + this.anh + ',' + "logSourceName=" + this.anl + ',' + "uploadAccount=" + this.ani + ',' + "loggingId=" + this.anj + ',' + "logAndroidId=" + this.ank + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2059ow.m6068a(this, parcel, i);
    }
}
