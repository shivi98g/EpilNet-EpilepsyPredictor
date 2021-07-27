package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.Contents;

/* renamed from: com.google.android.gms.drive.internal.g */
public class C0798g implements Parcelable.Creator<CloseContentsRequest> {
    /* renamed from: a */
    static void m1097a(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, closeContentsRequest.f930CK);
        C0723b.m759a(parcel, 2, (Parcelable) closeContentsRequest.f931Pr, i, false);
        C0723b.m760a(parcel, 3, closeContentsRequest.f932Pt, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ae */
    public CloseContentsRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Contents contents = null;
        int i = 0;
        Boolean bool = null;
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
                    bool = C0721a.m725d(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CloseContentsRequest(i, contents, bool);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bo */
    public CloseContentsRequest[] newArray(int i) {
        return new CloseContentsRequest[i];
    }
}
