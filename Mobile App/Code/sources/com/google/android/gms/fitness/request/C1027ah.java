package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.fitness.request.ah */
public class C1027ah implements SafeParcelable {
    public static final Parcelable.Creator<C1027ah> CREATOR = new C1028ai();

    /* renamed from: CK */
    private final int f1562CK;

    /* renamed from: VF */
    private final String f1563VF;

    C1027ah(int i, String str) {
        this.f1562CK = i;
        this.f1563VF = str;
    }

    public C1027ah(String str) {
        this(3, str);
    }

    public int describeContents() {
        return 0;
    }

    public String getDeviceAddress() {
        return this.f1563VF;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1562CK;
    }

    public String toString() {
        return String.format("UnclaimBleDeviceRequest{%s}", new Object[]{this.f1563VF});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1028ai.m1876a(this, parcel, i);
    }
}
