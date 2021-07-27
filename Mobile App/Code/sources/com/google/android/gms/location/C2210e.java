package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.location.e */
public class C2210e implements SafeParcelable {
    public static final C2211f CREATOR = new C2211f();

    /* renamed from: CK */
    private final int f4288CK;
    int agw;
    int agx;
    long agy;

    public C2210e(int i, int i2, int i3, long j) {
        this.f4288CK = i;
        this.agw = i2;
        this.agx = i3;
        this.agy = j;
    }

    /* renamed from: eB */
    private String m6636eB(int i) {
        if (i == 0) {
            return "STATUS_SUCCESSFUL";
        }
        switch (i) {
            case 2:
                return "STATUS_TIMED_OUT_ON_SCAN";
            case 3:
                return "STATUS_NO_INFO_IN_DATABASE";
            case 4:
                return "STATUS_INVALID_SCAN";
            case 5:
                return "STATUS_UNABLE_TO_QUERY_DATABASE";
            case 6:
                return "STATUS_SCANS_DISABLED_IN_SETTINGS";
            case 7:
                return "STATUS_LOCATION_DISABLED_IN_SETTINGS";
            case 8:
                return "STATUS_IN_PROGRESS";
            default:
                return "STATUS_UNKNOWN";
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2210e)) {
            return false;
        }
        C2210e eVar = (C2210e) obj;
        return this.agw == eVar.agw && this.agx == eVar.agx && this.agy == eVar.agy;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4288CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.agw), Integer.valueOf(this.agx), Long.valueOf(this.agy));
    }

    public String toString() {
        return "LocationStatus[cell status: " + m6636eB(this.agw) + ", wifi status: " + m6636eB(this.agx) + ", elapsed realtime ns: " + this.agy + ']';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2211f.m6637a(this, parcel, i);
    }
}
