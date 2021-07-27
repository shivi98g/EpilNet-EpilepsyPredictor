package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.request.C1015a;
import com.google.android.gms.fitness.request.C1045l;

/* renamed from: com.google.android.gms.fitness.request.ad */
public class C1021ad implements SafeParcelable {
    public static final Parcelable.Creator<C1021ad> CREATOR = new C1022ae();

    /* renamed from: CK */
    private final int f1555CK;

    /* renamed from: Wm */
    private final C1045l f1556Wm;

    C1021ad(int i, IBinder iBinder) {
        this.f1555CK = i;
        this.f1556Wm = C1045l.C1046a.m1916aB(iBinder);
    }

    public C1021ad(BleScanCallback bleScanCallback) {
        this.f1555CK = 1;
        this.f1556Wm = C1015a.C1017a.m1852jP().mo12675b(bleScanCallback);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1555CK;
    }

    /* renamed from: km */
    public IBinder mo12693km() {
        return this.f1556Wm.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1022ae.m1864a(this, parcel, i);
    }
}
