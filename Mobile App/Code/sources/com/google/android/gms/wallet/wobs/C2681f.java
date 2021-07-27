package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.wobs.f */
public final class C2681f implements SafeParcelable {
    public static final Parcelable.Creator<C2681f> CREATOR = new C2684i();

    /* renamed from: CK */
    private final int f4514CK;
    C2687l avm;
    C2682g awM;
    String label;
    String type;

    C2681f() {
        this.f4514CK = 1;
    }

    C2681f(int i, String str, C2682g gVar, String str2, C2687l lVar) {
        this.f4514CK = i;
        this.label = str;
        this.awM = gVar;
        this.type = str2;
        this.avm = lVar;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4514CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2684i.m7862a(this, parcel, i);
    }
}
