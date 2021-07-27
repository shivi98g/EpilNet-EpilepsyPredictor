package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

/* renamed from: com.google.android.gms.wearable.internal.ai */
public class C2731ai implements SafeParcelable, MessageEvent {
    public static final Parcelable.Creator<C2731ai> CREATOR = new C2732aj();

    /* renamed from: CK */
    final int f4543CK;
    private final byte[] aeA;
    private final String ahy;
    private final String axW;

    /* renamed from: ve */
    private final int f4544ve;

    C2731ai(int i, int i2, String str, byte[] bArr, String str2) {
        this.f4543CK = i;
        this.f4544ve = i2;
        this.axW = str;
        this.aeA = bArr;
        this.ahy = str2;
    }

    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.aeA;
    }

    public String getPath() {
        return this.axW;
    }

    public int getRequestId() {
        return this.f4544ve;
    }

    public String getSourceNodeId() {
        return this.ahy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageEventParcelable[");
        sb.append(this.f4544ve);
        sb.append(",");
        sb.append(this.axW);
        sb.append(", size=");
        sb.append(this.aeA == null ? "null" : Integer.valueOf(this.aeA.length));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2732aj.m8045a(this, parcel, i);
    }
}
