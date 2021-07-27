package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.CompletionEvent;

/* renamed from: com.google.android.gms.drive.internal.aq */
public class C0774aq implements Parcelable.Creator<OnEventResponse> {
    /* renamed from: a */
    static void m1017a(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onEventResponse.f982CK);
        C0723b.m775c(parcel, 2, onEventResponse.f983Pm);
        C0723b.m759a(parcel, 3, (Parcelable) onEventResponse.f984QO, i, false);
        C0723b.m759a(parcel, 5, (Parcelable) onEventResponse.f985QP, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: av */
    public OnEventResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ChangeEvent changeEvent = null;
        CompletionEvent completionEvent = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 5) {
                switch (aH) {
                    case 1:
                        i = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 3:
                        changeEvent = (ChangeEvent) C0721a.m716a(parcel, F, ChangeEvent.CREATOR);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                completionEvent = (CompletionEvent) C0721a.m716a(parcel, F, CompletionEvent.CREATOR);
            }
        }
        if (parcel.dataPosition() == G) {
            return new OnEventResponse(i, i2, changeEvent, completionEvent);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bK */
    public OnEventResponse[] newArray(int i) {
        return new OnEventResponse[i];
    }
}
