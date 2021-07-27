package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.common.data.f */
public class C0707f implements Parcelable.Creator<DataHolder> {
    /* renamed from: a */
    static void m659a(DataHolder dataHolder, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m770a(parcel, 1, dataHolder.mo11060gY(), false);
        C0723b.m775c(parcel, 1000, dataHolder.getVersionCode());
        C0723b.m769a(parcel, 2, (T[]) dataHolder.mo11061gZ(), i, false);
        C0723b.m775c(parcel, 3, dataHolder.getStatusCode());
        C0723b.m756a(parcel, 4, dataHolder.mo11058gV(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: B */
    public DataHolder createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        strArr = C0721a.m708A(parcel, F);
                        break;
                    case 2:
                        cursorWindowArr = (CursorWindow[]) C0721a.m722b(parcel, F, CursorWindow.CREATOR);
                        break;
                    case 3:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 4:
                        bundle = C0721a.m738q(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() != G) {
            throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
        }
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo11059gX();
        return dataHolder;
    }

    /* renamed from: aw */
    public DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
