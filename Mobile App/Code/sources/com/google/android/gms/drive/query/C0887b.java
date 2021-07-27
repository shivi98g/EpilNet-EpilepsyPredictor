package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.drive.query.b */
public class C0887b implements Parcelable.Creator<SortOrder> {
    /* renamed from: a */
    static void m1332a(SortOrder sortOrder, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1000, sortOrder.f1165CK);
        C0723b.m776c(parcel, 1, sortOrder.f1166Sf, false);
        C0723b.m766a(parcel, 2, sortOrder.f1167Sg);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aR */
    public SortOrder createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, FieldWithSortOrder.CREATOR);
                        break;
                    case 2:
                        z = C0721a.m724c(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new SortOrder(i, (List<FieldWithSortOrder>) arrayList, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cg */
    public SortOrder[] newArray(int i) {
        return new SortOrder[i];
    }
}
