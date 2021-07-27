package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.as */
public class C0776as implements Parcelable.Creator<OnListParentsResponse> {
    /* renamed from: a */
    static void m1023a(OnListParentsResponse onListParentsResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onListParentsResponse.f989CK);
        C0723b.m759a(parcel, 2, (Parcelable) onListParentsResponse.f990QR, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ax */
    public OnListParentsResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    dataHolder = (DataHolder) C0721a.m716a(parcel, F, DataHolder.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OnListParentsResponse(i, dataHolder);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bM */
    public OnListParentsResponse[] newArray(int i) {
        return new OnListParentsResponse[i];
    }
}
