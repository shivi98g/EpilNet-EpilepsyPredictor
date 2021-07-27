package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1829la;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.wobs.d */
public final class C2679d implements SafeParcelable {
    public static final Parcelable.Creator<C2679d> CREATOR = new C2680e();

    /* renamed from: CK */
    private final int f4513CK;
    String awJ;
    String awK;
    ArrayList<C2677b> awL;

    C2679d() {
        this.f4513CK = 1;
        this.awL = C1829la.m5517ie();
    }

    C2679d(int i, String str, String str2, ArrayList<C2677b> arrayList) {
        this.f4513CK = i;
        this.awJ = str;
        this.awK = str2;
        this.awL = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4513CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2680e.m7856a(this, parcel, i);
    }
}
