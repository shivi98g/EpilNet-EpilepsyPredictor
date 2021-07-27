package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

public final class Value implements SafeParcelable {
    public static final Parcelable.Creator<Value> CREATOR = new C1006u();

    /* renamed from: CK */
    private final int f1435CK;

    /* renamed from: UE */
    private final int f1436UE;

    /* renamed from: US */
    private boolean f1437US;

    /* renamed from: UT */
    private float f1438UT;

    Value(int i) {
        this(1, i, false, 0.0f);
    }

    Value(int i, int i2, boolean z, float f) {
        this.f1435CK = i;
        this.f1436UE = i2;
        this.f1437US = z;
        this.f1438UT = f;
    }

    /* renamed from: a */
    private boolean m1711a(Value value) {
        if (this.f1436UE != value.f1436UE || this.f1437US != value.f1437US) {
            return false;
        }
        switch (this.f1436UE) {
            case 1:
                return asInt() == value.asInt();
            case 2:
                return asFloat() == value.asFloat();
            default:
                return this.f1438UT == value.f1438UT;
        }
    }

    public String asActivity() {
        try {
            return FitnessActivities.getName(asInt());
        } catch (IllegalArgumentException e) {
            return "unknown";
        }
    }

    public float asFloat() {
        C1785jx.m5355a(this.f1436UE == 2, "Value is not in float format");
        return this.f1438UT;
    }

    public int asInt() {
        boolean z = true;
        if (this.f1436UE != 1) {
            z = false;
        }
        C1785jx.m5355a(z, "Value is not in int format");
        return Float.floatToRawIntBits(this.f1438UT);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Value) && m1711a((Value) obj);
        }
        return true;
    }

    public int getFormat() {
        return this.f1436UE;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1435CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Float.valueOf(this.f1438UT), Integer.valueOf(this.f1436UE), Boolean.valueOf(this.f1437US));
    }

    public boolean isSet() {
        return this.f1437US;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jL */
    public float mo12424jL() {
        return this.f1438UT;
    }

    public void setActivity(String str) {
        setInt(FitnessActivities.m1627bs(str));
    }

    public void setFloat(float f) {
        C1785jx.m5355a(this.f1436UE == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.f1437US = true;
        this.f1438UT = f;
    }

    public void setInt(int i) {
        C1785jx.m5355a(this.f1436UE == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.f1437US = true;
        this.f1438UT = Float.intBitsToFloat(i);
    }

    public String toString() {
        if (!this.f1437US) {
            return "unset";
        }
        switch (this.f1436UE) {
            case 1:
                return Integer.toString(asInt());
            case 2:
                return Float.toString(asFloat());
            default:
                return "unknown";
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1006u.m1772a(this, parcel, i);
    }
}
