package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.ar */
public class C0775ar implements Parcelable.Creator<OnListEntriesResponse> {
    /* renamed from: a */
    static void m1020a(OnListEntriesResponse onListEntriesResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onListEntriesResponse.f986CK);
        C0723b.m759a(parcel, 2, (Parcelable) onListEntriesResponse.f988QQ, i, false);
        C0723b.m766a(parcel, 3, onListEntriesResponse.f987PJ);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aw */
    public OnListEntriesResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DataHolder dataHolder = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    dataHolder = (DataHolder) C0721a.m716a(parcel, F, DataHolder.CREATOR);
                    break;
                case 3:
                    z = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OnListEntriesResponse(i, dataHolder, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bL */
    public OnListEntriesResponse[] newArray(int i) {
        return new OnListEntriesResponse[i];
    }
}
