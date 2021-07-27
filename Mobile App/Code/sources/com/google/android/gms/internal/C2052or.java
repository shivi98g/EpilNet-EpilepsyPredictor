package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.or */
public class C2052or implements SafeParcelable {
    public static final C2056ot CREATOR = new C2056ot();
    public final long amW;
    public final byte[] amX;
    public final Bundle amY;
    public final String tag;
    public final int versionCode;

    C2052or(int i, long j, String str, byte[] bArr, Bundle bundle) {
        this.versionCode = i;
        this.amW = j;
        this.tag = str;
        this.amX = bArr;
        this.amY = bundle;
    }

    public C2052or(long j, String str, byte[] bArr, String... strArr) {
        this.versionCode = 1;
        this.amW = j;
        this.tag = str;
        this.amX = bArr;
        this.amY = m6059g(strArr);
    }

    /* renamed from: g */
    private static Bundle m6059g(String... strArr) {
        if (strArr == null) {
            return null;
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("extras must have an even number of elements");
        }
        int length = strArr.length / 2;
        if (length == 0) {
            return null;
        }
        Bundle bundle = new Bundle(length);
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bundle.putString(strArr[i2], strArr[i2 + 1]);
        }
        return bundle;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tag=");
        sb.append(this.tag);
        sb.append(",");
        sb.append("eventTime=");
        sb.append(this.amW);
        sb.append(",");
        if (this.amY != null && !this.amY.isEmpty()) {
            sb.append("keyValues=");
            for (String str : this.amY.keySet()) {
                sb.append("(");
                sb.append(str);
                sb.append(",");
                sb.append(this.amY.getString(str));
                sb.append(")");
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2056ot.m6063a(this, parcel, i);
    }
}
