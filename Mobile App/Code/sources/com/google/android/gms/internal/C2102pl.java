package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pl */
public class C2102pl implements Parcelable.Creator<C2089pi.C2091b> {
    /* renamed from: a */
    static void m6180a(C2089pi.C2091b bVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = bVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, bVar.f4192CK);
        }
        if (set.contains(2)) {
            C0723b.m759a(parcel, 2, (Parcelable) bVar.apG, i, true);
        }
        if (set.contains(3)) {
            C0723b.m759a(parcel, 3, (Parcelable) bVar.apH, i, true);
        }
        if (set.contains(4)) {
            C0723b.m775c(parcel, 4, bVar.apI);
        }
        C0723b.m751H(parcel, H);
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: dB */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C2089pi.C2091b createFromParcel(android.os.Parcel r9) {
        /*
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C0721a.m714G(r9)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r5 = r4
            r6 = r3
        L_0x000e:
            int r1 = r9.dataPosition()
            if (r1 >= r0) goto L_0x004c
            int r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m713F(r9)
            int r7 = com.google.android.gms.common.internal.safeparcel.C0721a.m720aH(r1)
            switch(r7) {
                case 1: goto L_0x003f;
                case 2: goto L_0x0034;
                case 3: goto L_0x0029;
                case 4: goto L_0x0023;
                default: goto L_0x001f;
            }
        L_0x001f:
            com.google.android.gms.common.internal.safeparcel.C0721a.m721b(r9, r1)
            goto L_0x000e
        L_0x0023:
            int r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r9, r1)
            r1 = 4
            goto L_0x0044
        L_0x0029:
            com.google.android.gms.internal.pn r5 = com.google.android.gms.internal.C2089pi.C2091b.C2093b.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r9, (int) r1, r5)
            r5 = r1
            com.google.android.gms.internal.pi$b$b r5 = (com.google.android.gms.internal.C2089pi.C2091b.C2093b) r5
            r1 = 3
            goto L_0x0044
        L_0x0034:
            com.google.android.gms.internal.pm r4 = com.google.android.gms.internal.C2089pi.C2091b.C2092a.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r9, (int) r1, r4)
            r4 = r1
            com.google.android.gms.internal.pi$b$a r4 = (com.google.android.gms.internal.C2089pi.C2091b.C2092a) r4
            r1 = 2
            goto L_0x0044
        L_0x003f:
            int r3 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r9, r1)
            r1 = 1
        L_0x0044:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x000e
        L_0x004c:
            int r1 = r9.dataPosition()
            if (r1 == r0) goto L_0x0069
            com.google.android.gms.common.internal.safeparcel.a$a r1 = new com.google.android.gms.common.internal.safeparcel.a$a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Overread allowed size end="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r9)
            throw r1
        L_0x0069:
            com.google.android.gms.internal.pi$b r9 = new com.google.android.gms.internal.pi$b
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2102pl.createFromParcel(android.os.Parcel):com.google.android.gms.internal.pi$b");
    }

    /* renamed from: fz */
    public C2089pi.C2091b[] newArray(int i) {
        return new C2089pi.C2091b[i];
    }
}
