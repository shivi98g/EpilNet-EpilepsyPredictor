package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;

public final class Field implements SafeParcelable {
    public static final Parcelable.Creator<Field> CREATOR = new C0991j();
    public static final Field FIELD_ACCURACY = m1684bv("accuracy");
    public static final Field FIELD_ACTIVITY = m1683bu("activity");
    public static final Field FIELD_ALTITUDE = m1684bv("altitude");
    public static final Field FIELD_AVERAGE = m1684bv("average");
    public static final Field FIELD_BPM = m1684bv("bpm");
    public static final Field FIELD_CALORIES = m1684bv("calories");
    public static final Field FIELD_CONFIDENCE = m1684bv("confidence");
    public static final Field FIELD_DISTANCE = m1684bv("distance");
    public static final Field FIELD_DURATION = m1683bu("duration");
    public static final Field FIELD_HEIGHT = m1684bv("height");
    public static final Field FIELD_HIGH_LATITUDE = m1684bv("high_latitude");
    public static final Field FIELD_HIGH_LONGITUDE = m1684bv("high_longitude");
    public static final Field FIELD_LATITUDE = m1684bv("latitude");
    public static final Field FIELD_LONGITUDE = m1684bv("longitude");
    public static final Field FIELD_LOW_LATITUDE = m1684bv("low_latitude");
    public static final Field FIELD_LOW_LONGITUDE = m1684bv("low_longitude");
    public static final Field FIELD_MAX = m1684bv("max");
    public static final Field FIELD_MIN = m1684bv("min");
    public static final Field FIELD_NUM_SEGMENTS = m1683bu("num_segments");
    public static final Field FIELD_REVOLUTIONS = m1683bu("revolutions");
    public static final Field FIELD_RPM = m1684bv("rpm");
    public static final Field FIELD_SPEED = m1684bv("speed");
    public static final Field FIELD_STEPS = m1683bu("steps");
    public static final Field FIELD_WATTS = m1684bv("watts");
    public static final Field FIELD_WEIGHT = m1684bv("weight");
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;

    /* renamed from: UA */
    public static final Field f1386UA = m1683bu("edge_type");

    /* renamed from: UB */
    public static final Field f1387UB = m1684bv("x");

    /* renamed from: UC */
    public static final Field f1388UC = m1684bv("y");

    /* renamed from: UD */
    public static final Field f1389UD = m1684bv("z");

    /* renamed from: CK */
    private final int f1390CK;

    /* renamed from: UE */
    private final int f1391UE;
    private final String mName;

    Field(int i, String str, int i2) {
        this.f1390CK = i;
        this.mName = (String) C1785jx.m5364i(str);
        this.f1391UE = i2;
    }

    public Field(String str, int i) {
        this(1, str, i);
    }

    /* renamed from: a */
    private boolean m1682a(Field field) {
        return this.mName.equals(field.mName) && this.f1391UE == field.f1391UE;
    }

    /* renamed from: bu */
    private static Field m1683bu(String str) {
        return new Field(str, 1);
    }

    /* renamed from: bv */
    private static Field m1684bv(String str) {
        return new Field(str, 2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Field) && m1682a((Field) obj);
        }
        return true;
    }

    public int getFormat() {
        return this.f1391UE;
    }

    public String getName() {
        return this.mName;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1390CK;
    }

    public int hashCode() {
        return this.mName.hashCode();
    }

    public String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mName;
        objArr[1] = this.f1391UE == 1 ? "i" : "f";
        return String.format("%s(%s)", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0991j.m1740a(this, parcel, i);
    }
}
