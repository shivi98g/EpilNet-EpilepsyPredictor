package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.wobs.p */
public final class C2691p implements SafeParcelable {
    public static final Parcelable.Creator<C2691p> CREATOR = new C2692q();

    /* renamed from: CK */
    private final int f4520CK;
    String awT;
    C2687l awX;
    C2689n awY;
    C2689n awZ;

    /* renamed from: tU */
    String f4521tU;

    C2691p() {
        this.f4520CK = 1;
    }

    C2691p(int i, String str, String str2, C2687l lVar, C2689n nVar, C2689n nVar2) {
        this.f4520CK = i;
        this.awT = str;
        this.f4521tU = str2;
        this.awX = lVar;
        this.awY = nVar;
        this.awZ = nVar2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4520CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2692q.m7874a(this, parcel, i);
    }
}
