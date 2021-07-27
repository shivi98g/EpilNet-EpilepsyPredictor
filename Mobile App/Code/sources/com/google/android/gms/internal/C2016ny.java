package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ny */
public final class C2016ny implements SafeParcelable {
    public static final C2017nz CREATOR = new C2017nz();
    public static final long ahz = TimeUnit.HOURS.toMillis(1);

    /* renamed from: CK */
    final int f4152CK;
    private final long agr;
    private final C2012nu ahA;
    private final int mPriority;

    public C2016ny(int i, C2012nu nuVar, long j, int i2) {
        this.f4152CK = i;
        this.ahA = nuVar;
        this.agr = j;
        this.mPriority = i2;
    }

    public int describeContents() {
        C2017nz nzVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2016ny)) {
            return false;
        }
        C2016ny nyVar = (C2016ny) obj;
        return C1781jv.equal(this.ahA, nyVar.ahA) && this.agr == nyVar.agr && this.mPriority == nyVar.mPriority;
    }

    public long getInterval() {
        return this.agr;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.ahA, Long.valueOf(this.agr), Integer.valueOf(this.mPriority));
    }

    /* renamed from: nt */
    public C2012nu mo16426nt() {
        return this.ahA;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("filter", this.ahA).mo15935a("interval", Long.valueOf(this.agr)).mo15935a("priority", Integer.valueOf(this.mPriority)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2017nz nzVar = CREATOR;
        C2017nz.m5988a(this, parcel, i);
    }
}
