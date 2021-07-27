package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.C2714ae;

/* renamed from: com.google.android.gms.wearable.internal.ar */
public class C2746ar implements SafeParcelable {
    public static final Parcelable.Creator<C2746ar> CREATOR = new C2747as();

    /* renamed from: CK */
    final int f4550CK;
    public final C2714ae axv;

    C2746ar(int i, IBinder iBinder) {
        this.f4550CK = i;
        this.axv = iBinder != null ? C2714ae.C2715a.m7965bY(iBinder) : null;
    }

    public C2746ar(C2714ae aeVar) {
        this.f4550CK = 1;
        this.axv = aeVar;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: rm */
    public IBinder mo19529rm() {
        if (this.axv == null) {
            return null;
        }
        return this.axv.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2747as.m8074a(this, parcel, i);
    }
}
