package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.Contents;

/* renamed from: com.google.android.gms.drive.internal.al */
public class C0769al implements Parcelable.Creator<OnContentsResponse> {
    /* renamed from: a */
    static void m1002a(OnContentsResponse onContentsResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onContentsResponse.f970CK);
        C0723b.m759a(parcel, 2, (Parcelable) onContentsResponse.f971PW, i, false);
        C0723b.m766a(parcel, 3, onContentsResponse.f972QJ);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aq */
    public OnContentsResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Contents contents = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    contents = (Contents) C0721a.m716a(parcel, F, Contents.CREATOR);
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
            return new OnContentsResponse(i, contents, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bF */
    public OnContentsResponse[] newArray(int i) {
        return new OnContentsResponse[i];
    }
}
