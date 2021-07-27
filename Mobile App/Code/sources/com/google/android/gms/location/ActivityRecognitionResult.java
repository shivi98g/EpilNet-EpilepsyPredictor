package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import java.util.Collections;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    public static final String EXTRA_ACTIVITY_RESULT = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";

    /* renamed from: CK */
    private final int f4278CK;
    List<DetectedActivity> afX;
    long afY;
    long afZ;

    public ActivityRecognitionResult(int i, List<DetectedActivity> list, long j, long j2) {
        this.f4278CK = 1;
        this.afX = list;
        this.afY = j;
        this.afZ = j2;
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this((List<DetectedActivity>) Collections.singletonList(detectedActivity), j, j2);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        boolean z = false;
        C1785jx.m5361b(list != null && list.size() > 0, (Object) "Must have at least 1 detected activity");
        if (j > 0 && j2 > 0) {
            z = true;
        }
        C1785jx.m5361b(z, (Object) "Must set times");
        this.f4278CK = 1;
        this.afX = list;
        this.afY = j;
        this.afZ = j2;
    }

    public static ActivityRecognitionResult extractResult(Intent intent) {
        if (!hasResult(intent)) {
            return null;
        }
        Object obj = intent.getExtras().get(EXTRA_ACTIVITY_RESULT);
        if (obj instanceof byte[]) {
            Parcel obtain = Parcel.obtain();
            byte[] bArr = (byte[]) obj;
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return CREATOR.createFromParcel(obtain);
        } else if (obj instanceof ActivityRecognitionResult) {
            return (ActivityRecognitionResult) obj;
        } else {
            return null;
        }
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra(EXTRA_ACTIVITY_RESULT);
    }

    public int describeContents() {
        return 0;
    }

    public int getActivityConfidence(int i) {
        for (DetectedActivity next : this.afX) {
            if (next.getType() == i) {
                return next.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.afZ;
    }

    public DetectedActivity getMostProbableActivity() {
        return this.afX.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.afX;
    }

    public long getTime() {
        return this.afY;
    }

    public int getVersionCode() {
        return this.f4278CK;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.afX + ", timeMillis=" + this.afY + ", elapsedRealtimeMillis=" + this.afZ + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        ActivityRecognitionResultCreator.m6608a(this, parcel, i);
    }
}
