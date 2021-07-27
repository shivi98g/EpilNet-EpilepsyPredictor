package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.event.a */
public class C0912a implements Parcelable.Creator<ObjectChangedDetails> {
    /* renamed from: a */
    static void m1415a(ObjectChangedDetails objectChangedDetails, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, objectChangedDetails.f1230CK);
        C0723b.m775c(parcel, 2, objectChangedDetails.f1231SO);
        C0723b.m775c(parcel, 3, objectChangedDetails.f1232SP);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bg */
    public ObjectChangedDetails createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ObjectChangedDetails(i, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cw */
    public ObjectChangedDetails[] newArray(int i) {
        return new ObjectChangedDetails[i];
    }
}
