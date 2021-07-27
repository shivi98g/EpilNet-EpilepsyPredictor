package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.cast.c */
public class C0663c implements Parcelable.Creator<LaunchOptions> {
    /* renamed from: a */
    static void m468a(LaunchOptions launchOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, launchOptions.getVersionCode());
        C0723b.m766a(parcel, 2, launchOptions.getRelaunchIfRunning());
        C0723b.m763a(parcel, 3, launchOptions.getLanguage(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aa */
    public LaunchOptions[] newArray(int i) {
        return new LaunchOptions[i];
    }

    /* renamed from: w */
    public LaunchOptions createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
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
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new LaunchOptions(i, z, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
