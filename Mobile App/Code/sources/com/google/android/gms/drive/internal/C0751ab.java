package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.ab */
public class C0751ab implements Parcelable.Creator<FileUploadPreferencesImpl> {
    /* renamed from: a */
    static void m877a(FileUploadPreferencesImpl fileUploadPreferencesImpl, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, fileUploadPreferencesImpl.f956CK);
        C0723b.m775c(parcel, 2, fileUploadPreferencesImpl.f959Qz);
        C0723b.m775c(parcel, 3, fileUploadPreferencesImpl.f957QA);
        C0723b.m766a(parcel, 4, fileUploadPreferencesImpl.f958QB);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: al */
    public FileUploadPreferencesImpl createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    z = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new FileUploadPreferencesImpl(i, i2, i3, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bA */
    public FileUploadPreferencesImpl[] newArray(int i) {
        return new FileUploadPreferencesImpl[i];
    }
}
