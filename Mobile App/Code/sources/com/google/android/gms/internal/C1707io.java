package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.io */
public class C1707io implements SafeParcelable {
    public static final Parcelable.Creator<C1707io> CREATOR = new C1708ip();

    /* renamed from: CK */
    private final int f3799CK;

    /* renamed from: Gp */
    private double f3800Gp;

    /* renamed from: Gq */
    private boolean f3801Gq;

    /* renamed from: HD */
    private ApplicationMetadata f3802HD;

    /* renamed from: Hr */
    private int f3803Hr;

    /* renamed from: Hs */
    private int f3804Hs;

    public C1707io() {
        this(3, Double.NaN, false, -1, (ApplicationMetadata) null, -1);
    }

    C1707io(int i, double d, boolean z, int i2, ApplicationMetadata applicationMetadata, int i3) {
        this.f3799CK = i;
        this.f3800Gp = d;
        this.f3801Gq = z;
        this.f3803Hr = i2;
        this.f3802HD = applicationMetadata;
        this.f3804Hs = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1707io)) {
            return false;
        }
        C1707io ioVar = (C1707io) obj;
        return this.f3800Gp == ioVar.f3800Gp && this.f3801Gq == ioVar.f3801Gq && this.f3803Hr == ioVar.f3803Hr && C1706in.m5031a(this.f3802HD, ioVar.f3802HD) && this.f3804Hs == ioVar.f3804Hs;
    }

    /* renamed from: fZ */
    public double mo15685fZ() {
        return this.f3800Gp;
    }

    public ApplicationMetadata getApplicationMetadata() {
        return this.f3802HD;
    }

    public int getVersionCode() {
        return this.f3799CK;
    }

    /* renamed from: gi */
    public boolean mo15688gi() {
        return this.f3801Gq;
    }

    /* renamed from: gj */
    public int mo15689gj() {
        return this.f3803Hr;
    }

    /* renamed from: gk */
    public int mo15690gk() {
        return this.f3804Hs;
    }

    public int hashCode() {
        return C1781jv.hashCode(Double.valueOf(this.f3800Gp), Boolean.valueOf(this.f3801Gq), Integer.valueOf(this.f3803Hr), this.f3802HD, Integer.valueOf(this.f3804Hs));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1708ip.m5041a(this, parcel, i);
    }
}
