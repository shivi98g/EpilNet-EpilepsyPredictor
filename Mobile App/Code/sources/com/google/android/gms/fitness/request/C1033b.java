package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;

/* renamed from: com.google.android.gms.fitness.request.b */
public class C1033b implements SafeParcelable {
    public static final Parcelable.Creator<C1033b> CREATOR = new C1034c();

    /* renamed from: CK */
    private final int f1569CK;

    /* renamed from: VF */
    private final String f1570VF;

    /* renamed from: VG */
    private final BleDevice f1571VG;

    C1033b(int i, String str, BleDevice bleDevice) {
        this.f1569CK = i;
        this.f1570VF = str;
        this.f1571VG = bleDevice;
    }

    public C1033b(BleDevice bleDevice) {
        this(2, bleDevice.getAddress(), bleDevice);
    }

    public C1033b(String str) {
        this(2, str, (BleDevice) null);
    }

    public int describeContents() {
        return 0;
    }

    public String getDeviceAddress() {
        return this.f1570VF;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1569CK;
    }

    /* renamed from: jQ */
    public BleDevice mo12737jQ() {
        return this.f1571VG;
    }

    public String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", new Object[]{this.f1570VF, this.f1571VG});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1034c.m1889a(this, parcel, i);
    }
}
