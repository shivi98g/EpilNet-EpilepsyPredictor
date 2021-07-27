package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.f */
public class C0743f implements Parcelable.Creator<RealtimeDocumentSyncRequest> {
    /* renamed from: a */
    static void m843a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, realtimeDocumentSyncRequest.f874CK);
        C0723b.m774b(parcel, 2, realtimeDocumentSyncRequest.f875OK, false);
        C0723b.m774b(parcel, 3, realtimeDocumentSyncRequest.f876OL, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: U */
    public RealtimeDocumentSyncRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList<String> arrayList = null;
        int i = 0;
        ArrayList<String> arrayList2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m710C(parcel, F);
                    break;
                case 3:
                    arrayList2 = C0721a.m710C(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new RealtimeDocumentSyncRequest(i, arrayList, arrayList2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bc */
    public RealtimeDocumentSyncRequest[] newArray(int i) {
        return new RealtimeDocumentSyncRequest[i];
    }
}
