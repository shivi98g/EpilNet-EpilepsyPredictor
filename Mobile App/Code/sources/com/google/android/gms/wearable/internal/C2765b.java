package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.C2714ae;

/* renamed from: com.google.android.gms.wearable.internal.b */
public class C2765b implements SafeParcelable {
    public static final Parcelable.Creator<C2765b> CREATOR = new C2769c();

    /* renamed from: CK */
    final int f4552CK;
    public final C2714ae axv;
    public final IntentFilter[] axw;

    C2765b(int i, IBinder iBinder, IntentFilter[] intentFilterArr) {
        this.f4552CK = i;
        this.axv = iBinder != null ? C2714ae.C2715a.m7965bY(iBinder) : null;
        this.axw = intentFilterArr;
    }

    public C2765b(C2768bb bbVar) {
        this.f4552CK = 1;
        this.axv = bbVar;
        this.axw = bbVar.mo19571rs();
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: rm */
    public IBinder mo19549rm() {
        if (this.axv == null) {
            return null;
        }
        return this.axv.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2769c.m8127a(this, parcel, i);
    }
}
