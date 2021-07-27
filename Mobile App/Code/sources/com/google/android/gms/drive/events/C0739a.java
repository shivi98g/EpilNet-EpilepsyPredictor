package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.events.a */
public class C0739a implements Parcelable.Creator<ChangeEvent> {
    /* renamed from: a */
    static void m835a(ChangeEvent changeEvent, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, changeEvent.f889CK);
        C0723b.m759a(parcel, 2, (Parcelable) changeEvent.f891Oj, i, false);
        C0723b.m775c(parcel, 3, changeEvent.f890OX);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: X */
    public ChangeEvent createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    driveId = (DriveId) C0721a.m716a(parcel, F, DriveId.CREATOR);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ChangeEvent(i, driveId, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bf */
    public ChangeEvent[] newArray(int i) {
        return new ChangeEvent[i];
    }
}
