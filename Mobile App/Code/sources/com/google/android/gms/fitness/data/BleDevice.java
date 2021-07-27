package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1861ls;
import java.util.Collections;
import java.util.List;

public class BleDevice implements SafeParcelable {
    public static final Parcelable.Creator<BleDevice> CREATOR = new C0984c();

    /* renamed from: CK */
    private final int f1332CK;

    /* renamed from: TW */
    private final String f1333TW;

    /* renamed from: TX */
    private final List<String> f1334TX;

    /* renamed from: TY */
    private final List<DataType> f1335TY;
    private final String mName;

    BleDevice(int i, String str, String str2, List<String> list, List<DataType> list2) {
        this.f1332CK = i;
        this.f1333TW = str;
        this.mName = str2;
        this.f1334TX = Collections.unmodifiableList(list);
        this.f1335TY = Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    private boolean m1632a(BleDevice bleDevice) {
        return this.mName.equals(bleDevice.mName) && this.f1333TW.equals(bleDevice.f1333TW) && C1861ls.m5556a(bleDevice.f1334TX, this.f1334TX) && C1861ls.m5556a(this.f1335TY, bleDevice.f1335TY);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof BleDevice) && m1632a((BleDevice) obj);
        }
        return true;
    }

    public String getAddress() {
        return this.f1333TW;
    }

    public List<DataType> getDataTypes() {
        return this.f1335TY;
    }

    public String getName() {
        return this.mName;
    }

    public List<String> getSupportedProfiles() {
        return this.f1334TX;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1332CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.mName, this.f1333TW, this.f1334TX, this.f1335TY);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("name", this.mName).mo15935a("address", this.f1333TW).mo15935a("dataTypes", this.f1335TY).mo15935a("supportedProfiles", this.f1334TX).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0984c.m1719a(this, parcel, i);
    }
}
