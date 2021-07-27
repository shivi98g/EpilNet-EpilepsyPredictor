package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

public class ActivityRecognitionResultCreator implements Parcelable.Creator<ActivityRecognitionResult> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m6608a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, activityRecognitionResult.afX, false);
        C0723b.m775c(parcel, 1000, activityRecognitionResult.getVersionCode());
        C0723b.m755a(parcel, 2, activityRecognitionResult.afY);
        C0723b.m755a(parcel, 3, activityRecognitionResult.afZ);
        C0723b.m751H(parcel, H);
    }

    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, DetectedActivity.CREATOR);
                        break;
                    case 2:
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 3:
                        j2 = C0721a.m730i(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new ActivityRecognitionResult(i, arrayList, j, j2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
