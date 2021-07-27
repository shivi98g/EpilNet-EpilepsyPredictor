package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class LocationRequest implements SafeParcelable {
    public static final C2209d CREATOR = new C2209d();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;

    /* renamed from: CK */
    private final int f4283CK;

    /* renamed from: Wg */
    boolean f4284Wg;
    long age;
    long agr;
    long ags;
    int agt;
    float agu;
    long agv;
    int mPriority;

    public LocationRequest() {
        this.f4283CK = 1;
        this.mPriority = 102;
        this.agr = 3600000;
        this.ags = 600000;
        this.f4284Wg = false;
        this.age = Long.MAX_VALUE;
        this.agt = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.agu = 0.0f;
        this.agv = 0;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.f4283CK = i;
        this.mPriority = i2;
        this.agr = j;
        this.ags = j2;
        this.f4284Wg = z;
        this.age = j3;
        this.agt = i3;
        this.agu = f;
        this.agv = j4;
    }

    /* renamed from: a */
    private static void m6616a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    /* renamed from: ey */
    private static void m6617ey(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                return;
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    /* renamed from: ez */
    public static String m6618ez(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    /* renamed from: v */
    private static void m6619v(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid interval: " + j);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.mPriority == locationRequest.mPriority && this.agr == locationRequest.agr && this.ags == locationRequest.ags && this.f4284Wg == locationRequest.f4284Wg && this.age == locationRequest.age && this.agt == locationRequest.agt && this.agu == locationRequest.agu;
    }

    public long getExpirationTime() {
        return this.age;
    }

    public long getFastestInterval() {
        return this.ags;
    }

    public long getInterval() {
        return this.agr;
    }

    public int getNumUpdates() {
        return this.agt;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public float getSmallestDisplacement() {
        return this.agu;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4283CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.mPriority), Long.valueOf(this.agr), Long.valueOf(this.ags), Boolean.valueOf(this.f4284Wg), Long.valueOf(this.age), Integer.valueOf(this.agt), Float.valueOf(this.agu));
    }

    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.age = Long.MAX_VALUE;
        } else {
            this.age = elapsedRealtime + j;
        }
        if (this.age < 0) {
            this.age = 0;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long j) {
        this.age = j;
        if (this.age < 0) {
            this.age = 0;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j) {
        m6619v(j);
        this.f4284Wg = true;
        this.ags = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        m6619v(j);
        this.agr = j;
        if (!this.f4284Wg) {
            this.ags = (long) (((double) this.agr) / 6.0d);
        }
        return this;
    }

    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + i);
        }
        this.agt = i;
        return this;
    }

    public LocationRequest setPriority(int i) {
        m6617ey(i);
        this.mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        m6616a(f);
        this.agu = f;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        sb.append(m6618ez(this.mPriority));
        if (this.mPriority != 105) {
            sb.append(" requested=");
            sb.append(this.agr + "ms");
        }
        sb.append(" fastest=");
        sb.append(this.ags + "ms");
        if (this.age != Long.MAX_VALUE) {
            long elapsedRealtime = this.age - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime + "ms");
        }
        if (this.agt != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.agt);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2209d.m6633a(this, parcel, i);
    }
}
