package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator implements SafeParcelable {
    public static final Parcelable.Creator<Operator> CREATOR = new C0900l();

    /* renamed from: SA */
    public static final Operator f1202SA = new Operator(">=");

    /* renamed from: SB */
    public static final Operator f1203SB = new Operator("and");

    /* renamed from: SC */
    public static final Operator f1204SC = new Operator("or");

    /* renamed from: SD */
    public static final Operator f1205SD = new Operator("not");

    /* renamed from: SE */
    public static final Operator f1206SE = new Operator("contains");

    /* renamed from: Sw */
    public static final Operator f1207Sw = new Operator("=");

    /* renamed from: Sx */
    public static final Operator f1208Sx = new Operator("<");

    /* renamed from: Sy */
    public static final Operator f1209Sy = new Operator("<=");

    /* renamed from: Sz */
    public static final Operator f1210Sz = new Operator(">");

    /* renamed from: CK */
    final int f1211CK;
    final String mTag;

    Operator(int i, String str) {
        this.f1211CK = i;
        this.mTag = str;
    }

    private Operator(String str) {
        this(1, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        if (this.mTag == null) {
            if (operator.mTag != null) {
                return false;
            }
        } else if (!this.mTag.equals(operator.mTag)) {
            return false;
        }
        return true;
    }

    public String getTag() {
        return this.mTag;
    }

    public int hashCode() {
        return 31 + (this.mTag == null ? 0 : this.mTag.hashCode());
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0900l.m1391a(this, parcel, i);
    }
}
