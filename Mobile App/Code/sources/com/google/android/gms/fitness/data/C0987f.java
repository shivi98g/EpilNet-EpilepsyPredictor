package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.f */
public class C0987f implements Parcelable.Creator<DataSet> {
    /* renamed from: a */
    static void m1728a(DataSet dataSet, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) dataSet.getDataSource(), i, false);
        C0723b.m775c(parcel, 1000, dataSet.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) dataSet.getDataType(), i, false);
        C0723b.m777d(parcel, 3, dataSet.mo12296jv(), false);
        C0723b.m776c(parcel, 4, dataSet.mo12297jw(), false);
        C0723b.m766a(parcel, 5, dataSet.mo12295jn());
        C0723b.m751H(parcel, H);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: bu */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.fitness.data.DataSet createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C0721a.m714G(r11)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1 = 0
            r2 = 0
            r7 = r1
            r3 = r2
            r4 = r3
            r6 = r4
            r2 = r7
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x005a
            int r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m713F(r11)
            int r8 = com.google.android.gms.common.internal.safeparcel.C0721a.m720aH(r1)
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r8 == r9) goto L_0x0055
            switch(r8) {
                case 1: goto L_0x004b;
                case 2: goto L_0x0041;
                case 3: goto L_0x0035;
                case 4: goto L_0x002e;
                case 5: goto L_0x0029;
                default: goto L_0x0025;
            }
        L_0x0025:
            com.google.android.gms.common.internal.safeparcel.C0721a.m721b(r11, r1)
            goto L_0x0010
        L_0x0029:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.C0721a.m724c(r11, r1)
            goto L_0x0010
        L_0x002e:
            android.os.Parcelable$Creator<com.google.android.gms.fitness.data.DataSource> r6 = com.google.android.gms.fitness.data.DataSource.CREATOR
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m723c(r11, r1, r6)
            goto L_0x0010
        L_0x0035:
            java.lang.Class r8 = r10.getClass()
            java.lang.ClassLoader r8 = r8.getClassLoader()
            com.google.android.gms.common.internal.safeparcel.C0721a.m719a((android.os.Parcel) r11, (int) r1, (java.util.List) r5, (java.lang.ClassLoader) r8)
            goto L_0x0010
        L_0x0041:
            android.os.Parcelable$Creator<com.google.android.gms.fitness.data.DataType> r4 = com.google.android.gms.fitness.data.DataType.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r11, (int) r1, r4)
            r4 = r1
            com.google.android.gms.fitness.data.DataType r4 = (com.google.android.gms.fitness.data.DataType) r4
            goto L_0x0010
        L_0x004b:
            android.os.Parcelable$Creator<com.google.android.gms.fitness.data.DataSource> r3 = com.google.android.gms.fitness.data.DataSource.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r11, (int) r1, r3)
            r3 = r1
            com.google.android.gms.fitness.data.DataSource r3 = (com.google.android.gms.fitness.data.DataSource) r3
            goto L_0x0010
        L_0x0055:
            int r2 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r11, r1)
            goto L_0x0010
        L_0x005a:
            int r1 = r11.dataPosition()
            if (r1 == r0) goto L_0x0077
            com.google.android.gms.common.internal.safeparcel.a$a r1 = new com.google.android.gms.common.internal.safeparcel.a$a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            throw r1
        L_0x0077:
            com.google.android.gms.fitness.data.DataSet r11 = new com.google.android.gms.fitness.data.DataSet
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.data.C0987f.createFromParcel(android.os.Parcel):com.google.android.gms.fitness.data.DataSet");
    }

    /* renamed from: cN */
    public DataSet[] newArray(int i) {
        return new DataSet[i];
    }
}
