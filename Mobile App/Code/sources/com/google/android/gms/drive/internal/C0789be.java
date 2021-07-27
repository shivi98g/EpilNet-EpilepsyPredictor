package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.be */
public class C0789be implements Parcelable.Creator<SetFileUploadPreferencesRequest> {
    /* renamed from: a */
    static void m1062a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, setFileUploadPreferencesRequest.f1016CK);
        C0723b.m759a(parcel, 2, (Parcelable) setFileUploadPreferencesRequest.f1017QK, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aI */
    public SetFileUploadPreferencesRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        FileUploadPreferencesImpl fileUploadPreferencesImpl = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    fileUploadPreferencesImpl = (FileUploadPreferencesImpl) C0721a.m716a(parcel, F, FileUploadPreferencesImpl.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new SetFileUploadPreferencesRequest(i, fileUploadPreferencesImpl);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bX */
    public SetFileUploadPreferencesRequest[] newArray(int i) {
        return new SetFileUploadPreferencesRequest[i];
    }
}
