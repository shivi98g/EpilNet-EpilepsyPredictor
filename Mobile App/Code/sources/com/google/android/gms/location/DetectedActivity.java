package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

public class DetectedActivity implements SafeParcelable {
    public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    public static final Comparator<DetectedActivity> aga = new Comparator<DetectedActivity>() {
        /* renamed from: a */
        public int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
            int compareTo = Integer.valueOf(detectedActivity2.getConfidence()).compareTo(Integer.valueOf(detectedActivity.getConfidence()));
            return compareTo == 0 ? Integer.valueOf(detectedActivity.getType()).compareTo(Integer.valueOf(detectedActivity2.getType())) : compareTo;
        }
    };

    /* renamed from: CK */
    private final int f4279CK;
    int agb;
    int agc;

    public DetectedActivity(int i, int i2) {
        this.f4279CK = 1;
        this.agb = i;
        this.agc = i2;
    }

    public DetectedActivity(int i, int i2, int i3) {
        this.f4279CK = i;
        this.agb = i2;
        this.agc = i3;
    }

    /* renamed from: ev */
    private int m6609ev(int i) {
        if (i > 9) {
            return 4;
        }
        return i;
    }

    public int describeContents() {
        return 0;
    }

    public int getConfidence() {
        return this.agc;
    }

    public int getType() {
        return m6609ev(this.agb);
    }

    public int getVersionCode() {
        return this.f4279CK;
    }

    public String toString() {
        return "DetectedActivity [type=" + getType() + ", confidence=" + this.agc + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        DetectedActivityCreator.m6611a(this, parcel, i);
    }
}
