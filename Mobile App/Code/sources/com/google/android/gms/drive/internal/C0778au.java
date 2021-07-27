package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.au */
public class C0778au implements Parcelable.Creator<OnLoadRealtimeResponse> {
    /* renamed from: a */
    static void m1029a(OnLoadRealtimeResponse onLoadRealtimeResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onLoadRealtimeResponse.f991CK);
        C0723b.m766a(parcel, 2, onLoadRealtimeResponse.f992wg);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: az */
    public OnLoadRealtimeResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    z = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OnLoadRealtimeResponse(i, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bO */
    public OnLoadRealtimeResponse[] newArray(int i) {
        return new OnLoadRealtimeResponse[i];
    }
}
