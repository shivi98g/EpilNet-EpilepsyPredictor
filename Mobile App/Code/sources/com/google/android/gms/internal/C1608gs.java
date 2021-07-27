package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C1507ey
/* renamed from: com.google.android.gms.internal.gs */
public final class C1608gs implements SafeParcelable {
    public static final C1609gt CREATOR = new C1609gt();
    public final int versionCode;

    /* renamed from: wS */
    public String f3554wS;

    /* renamed from: wT */
    public int f3555wT;

    /* renamed from: wU */
    public int f3556wU;

    /* renamed from: wV */
    public boolean f3557wV;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1608gs(int r9, int r10, boolean r11) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "."
            r0.append(r1)
            if (r11 == 0) goto L_0x001f
            java.lang.String r1 = "0"
            goto L_0x0021
        L_0x001f:
            java.lang.String r1 = "1"
        L_0x0021:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3 = 1
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1608gs.<init>(int, int, boolean):void");
    }

    C1608gs(int i, String str, int i2, int i3, boolean z) {
        this.versionCode = i;
        this.f3554wS = str;
        this.f3555wT = i2;
        this.f3556wU = i3;
        this.f3557wV = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1609gt.m4715a(this, parcel, i);
    }
}
