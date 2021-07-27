package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BleDevicesResult implements Result, SafeParcelable {
    public static final Parcelable.Creator<BleDevicesResult> CREATOR = new C1068a();

    /* renamed from: CK */
    private final int f1602CK;

    /* renamed from: Eb */
    private final Status f1603Eb;

    /* renamed from: Wq */
    private final List<BleDevice> f1604Wq;

    BleDevicesResult(int i, List<BleDevice> list, Status status) {
        this.f1602CK = i;
        this.f1604Wq = Collections.unmodifiableList(list);
        this.f1603Eb = status;
    }

    public BleDevicesResult(List<BleDevice> list, Status status) {
        this.f1602CK = 3;
        this.f1604Wq = Collections.unmodifiableList(list);
        this.f1603Eb = status;
    }

    /* renamed from: C */
    public static BleDevicesResult m1966C(Status status) {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    /* renamed from: b */
    private boolean m1967b(BleDevicesResult bleDevicesResult) {
        return this.f1603Eb.equals(bleDevicesResult.f1603Eb) && C1781jv.equal(this.f1604Wq, bleDevicesResult.f1604Wq);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BleDevicesResult) && m1967b((BleDevicesResult) obj);
        }
        return true;
    }

    public List<BleDevice> getClaimedBleDevices() {
        return this.f1604Wq;
    }

    public List<BleDevice> getClaimedBleDevices(DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (BleDevice next : this.f1604Wq) {
            if (next.getDataTypes().contains(dataType)) {
                arrayList.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Status getStatus() {
        return this.f1603Eb;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1602CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1603Eb, this.f1604Wq);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a(NotificationCompat.CATEGORY_STATUS, this.f1603Eb).mo15935a("bleDevices", this.f1604Wq).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1068a.m1989a(this, parcel, i);
    }
}
