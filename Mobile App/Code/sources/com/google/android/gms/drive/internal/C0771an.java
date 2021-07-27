package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.an */
public class C0771an implements Parcelable.Creator<OnDownloadProgressResponse> {
    /* renamed from: a */
    static void m1008a(OnDownloadProgressResponse onDownloadProgressResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onDownloadProgressResponse.f975CK);
        C0723b.m755a(parcel, 2, onDownloadProgressResponse.f976QL);
        C0723b.m755a(parcel, 3, onDownloadProgressResponse.f977QM);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: as */
    public OnDownloadProgressResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
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
        }
        if (parcel.dataPosition() == G) {
            return new OnDownloadProgressResponse(i, j, j2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bH */
    public OnDownloadProgressResponse[] newArray(int i) {
        return new OnDownloadProgressResponse[i];
    }
}
