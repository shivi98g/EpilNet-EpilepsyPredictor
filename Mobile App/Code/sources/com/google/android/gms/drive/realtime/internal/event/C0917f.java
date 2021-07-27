package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.event.f */
public class C0917f implements Parcelable.Creator<TextInsertedDetails> {
    /* renamed from: a */
    static void m1430a(TextInsertedDetails textInsertedDetails, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, textInsertedDetails.f1260CK);
        C0723b.m775c(parcel, 2, textInsertedDetails.mIndex);
        C0723b.m775c(parcel, 3, textInsertedDetails.f1261Ti);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bl */
    public TextInsertedDetails createFromParcel(Parcel parcel) {
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
            return new TextInsertedDetails(i, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cB */
    public TextInsertedDetails[] newArray(int i) {
        return new TextInsertedDetails[i];
    }
}
