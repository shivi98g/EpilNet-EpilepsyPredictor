package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.events.b */
public class C0740b implements Parcelable.Creator<CompletionEvent> {
    /* renamed from: a */
    static void m838a(CompletionEvent completionEvent, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, completionEvent.f892CK);
        C0723b.m759a(parcel, 2, (Parcelable) completionEvent.f897Oj, i, false);
        C0723b.m763a(parcel, 3, completionEvent.f893DZ, false);
        C0723b.m759a(parcel, 4, (Parcelable) completionEvent.f895OY, i, false);
        C0723b.m759a(parcel, 5, (Parcelable) completionEvent.f896OZ, i, false);
        C0723b.m759a(parcel, 6, (Parcelable) completionEvent.f898Pa, i, false);
        C0723b.m774b(parcel, 7, completionEvent.f899Pb, false);
        C0723b.m775c(parcel, 8, completionEvent.f894FP);
        C0723b.m757a(parcel, 9, completionEvent.f900Pc, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: Y */
    public CompletionEvent createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        DriveId driveId = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        MetadataBundle metadataBundle = null;
        ArrayList<String> arrayList = null;
        IBinder iBinder = null;
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
                    str = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C0721a.m716a(parcel, F, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) C0721a.m716a(parcel, F, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    metadataBundle = (MetadataBundle) C0721a.m716a(parcel, F, MetadataBundle.CREATOR);
                    break;
                case 7:
                    arrayList = C0721a.m710C(parcel, F);
                    break;
                case 8:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 9:
                    iBinder = C0721a.m737p(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CompletionEvent(i, driveId, str, parcelFileDescriptor, parcelFileDescriptor2, metadataBundle, arrayList, i2, iBinder);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bg */
    public CompletionEvent[] newArray(int i) {
        return new CompletionEvent[i];
    }
}
