package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.nn */
public class C2005nn implements SafeParcelable, Geofence {
    public static final C2006no CREATOR = new C2006no();

    /* renamed from: CK */
    private final int f4146CK;

    /* renamed from: Zt */
    private final String f4147Zt;
    private final int agd;
    private final short agf;
    private final double agg;
    private final double agh;
    private final float agi;
    private final int agj;
    private final int agk;
    private final long ahl;

    public C2005nn(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        m5954cb(str);
        m5953b(f);
        m5952a(d, d2);
        int eH = m5955eH(i2);
        this.f4146CK = i;
        this.agf = s;
        this.f4147Zt = str;
        this.agg = d;
        this.agh = d2;
        this.agi = f;
        this.ahl = j;
        this.agd = eH;
        this.agj = i3;
        this.agk = i4;
    }

    public C2005nn(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        this(1, str, i, s, d, d2, f, j, i2, i3);
    }

    /* renamed from: a */
    private static void m5952a(double d, double d2) {
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
    }

    /* renamed from: b */
    private static void m5953b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }

    /* renamed from: cb */
    private static void m5954cb(String str) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        }
    }

    /* renamed from: eH */
    private static int m5955eH(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("No supported transition specified: " + i);
    }

    /* renamed from: eI */
    private static String m5956eI(int i) {
        if (i != 1) {
            return null;
        }
        return "CIRCLE";
    }

    /* renamed from: h */
    public static C2005nn m5957h(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        C2005nn cN = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return cN;
    }

    public int describeContents() {
        C2006no noVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2005nn)) {
            return false;
        }
        C2005nn nnVar = (C2005nn) obj;
        return this.agi == nnVar.agi && this.agg == nnVar.agg && this.agh == nnVar.agh && this.agf == nnVar.agf;
    }

    public long getExpirationTime() {
        return this.ahl;
    }

    public double getLatitude() {
        return this.agg;
    }

    public double getLongitude() {
        return this.agh;
    }

    public int getNotificationResponsiveness() {
        return this.agj;
    }

    public String getRequestId() {
        return this.f4147Zt;
    }

    public int getVersionCode() {
        return this.f4146CK;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.agg);
        long doubleToLongBits2 = Double.doubleToLongBits(this.agh);
        return (31 * (((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.agi)) * 31) + this.agf)) + this.agd;
    }

    /* renamed from: nn */
    public short mo16366nn() {
        return this.agf;
    }

    /* renamed from: no */
    public float mo16367no() {
        return this.agi;
    }

    /* renamed from: np */
    public int mo16368np() {
        return this.agd;
    }

    /* renamed from: nq */
    public int mo16369nq() {
        return this.agk;
    }

    public String toString() {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{m5956eI(this.agf), this.f4147Zt, Integer.valueOf(this.agd), Double.valueOf(this.agg), Double.valueOf(this.agh), Float.valueOf(this.agi), Integer.valueOf(this.agj / 1000), Integer.valueOf(this.agk), Long.valueOf(this.ahl)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2006no noVar = CREATOR;
        C2006no.m5962a(this, parcel, i);
    }
}
