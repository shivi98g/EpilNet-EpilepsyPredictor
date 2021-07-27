package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.am */
public class C0770am implements Parcelable.Creator<OnDeviceUsagePreferenceResponse> {
    /* renamed from: a */
    static void m1005a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onDeviceUsagePreferenceResponse.f973CK);
        C0723b.m759a(parcel, 2, (Parcelable) onDeviceUsagePreferenceResponse.f974QK, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ar */
    public OnDeviceUsagePreferenceResponse createFromParcel(Parcel parcel) {
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
            return new OnDeviceUsagePreferenceResponse(i, fileUploadPreferencesImpl);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bG */
    public OnDeviceUsagePreferenceResponse[] newArray(int i) {
        return new OnDeviceUsagePreferenceResponse[i];
    }
}
