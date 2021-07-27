package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.result.b */
public class C1069b implements Parcelable.Creator<DataReadResult> {
    /* renamed from: a */
    static void m1992a(DataReadResult dataReadResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m777d(parcel, 1, dataReadResult.mo12894kt(), false);
        C0723b.m775c(parcel, 1000, dataReadResult.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) dataReadResult.getStatus(), i, false);
        C0723b.m777d(parcel, 3, dataReadResult.mo12893ks(), false);
        C0723b.m775c(parcel, 5, dataReadResult.mo12892kr());
        C0723b.m776c(parcel, 6, dataReadResult.mo12891jw(), false);
        C0723b.m776c(parcel, 7, dataReadResult.mo12895ku(), false);
        C0723b.m751H(parcel, H);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.fitness.result.DataReadResult createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C0721a.m714G(r12)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1 = 0
            r2 = 0
            r6 = r1
            r4 = r2
            r7 = r4
            r8 = r7
            r2 = r6
        L_0x0015:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x006b
            int r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m713F(r12)
            int r9 = com.google.android.gms.common.internal.safeparcel.C0721a.m720aH(r1)
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r9 == r10) goto L_0x0066
            switch(r9) {
                case 1: goto L_0x005a;
                case 2: goto L_0x0050;
                case 3: goto L_0x0044;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r9) {
                case 5: goto L_0x003f;
                case 6: goto L_0x0038;
                case 7: goto L_0x0031;
                default: goto L_0x002d;
            }
        L_0x002d:
            com.google.android.gms.common.internal.safeparcel.C0721a.m721b(r12, r1)
            goto L_0x0015
        L_0x0031:
            android.os.Parcelable$Creator<com.google.android.gms.fitness.data.DataType> r8 = com.google.android.gms.fitness.data.DataType.CREATOR
            java.util.ArrayList r8 = com.google.android.gms.common.internal.safeparcel.C0721a.m723c(r12, r1, r8)
            goto L_0x0015
        L_0x0038:
            android.os.Parcelable$Creator<com.google.android.gms.fitness.data.DataSource> r7 = com.google.android.gms.fitness.data.DataSource.CREATOR
            java.util.ArrayList r7 = com.google.android.gms.common.internal.safeparcel.C0721a.m723c(r12, r1, r7)
            goto L_0x0015
        L_0x003f:
            int r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r12, r1)
            goto L_0x0015
        L_0x0044:
            java.lang.Class r9 = r11.getClass()
            java.lang.ClassLoader r9 = r9.getClassLoader()
            com.google.android.gms.common.internal.safeparcel.C0721a.m719a((android.os.Parcel) r12, (int) r1, (java.util.List) r5, (java.lang.ClassLoader) r9)
            goto L_0x0015
        L_0x0050:
            com.google.android.gms.common.api.StatusCreator r4 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r12, (int) r1, r4)
            r4 = r1
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            goto L_0x0015
        L_0x005a:
            java.lang.Class r9 = r11.getClass()
            java.lang.ClassLoader r9 = r9.getClassLoader()
            com.google.android.gms.common.internal.safeparcel.C0721a.m719a((android.os.Parcel) r12, (int) r1, (java.util.List) r3, (java.lang.ClassLoader) r9)
            goto L_0x0015
        L_0x0066:
            int r2 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r12, r1)
            goto L_0x0015
        L_0x006b:
            int r1 = r12.dataPosition()
            if (r1 == r0) goto L_0x0088
            com.google.android.gms.common.internal.safeparcel.a$a r1 = new com.google.android.gms.common.internal.safeparcel.a$a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r12)
            throw r1
        L_0x0088:
            com.google.android.gms.fitness.result.DataReadResult r12 = new com.google.android.gms.fitness.result.DataReadResult
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.result.C1069b.createFromParcel(android.os.Parcel):com.google.android.gms.fitness.result.DataReadResult");
    }

    /* renamed from: dz */
    public DataReadResult[] newArray(int i) {
        return new DataReadResult[i];
    }
}
