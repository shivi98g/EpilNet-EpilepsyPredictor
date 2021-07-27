package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.result.e */
public class C1072e implements Parcelable.Creator<ListSubscriptionsResult> {
    /* renamed from: a */
    static void m2001a(ListSubscriptionsResult listSubscriptionsResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, listSubscriptionsResult.getSubscriptions(), false);
        C0723b.m775c(parcel, 1000, listSubscriptionsResult.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) listSubscriptionsResult.getStatus(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ch */
    public ListSubscriptionsResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList<Subscription> arrayList = null;
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, Subscription.CREATOR);
                        break;
                    case 2:
                        status = (Status) C0721a.m716a(parcel, F, Status.CREATOR);
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
            return new ListSubscriptionsResult(i, arrayList, status);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dC */
    public ListSubscriptionsResult[] newArray(int i) {
        return new ListSubscriptionsResult[i];
    }
}
