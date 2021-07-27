package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pj */
public class C2100pj implements Parcelable.Creator<C2089pi> {
    /* renamed from: a */
    static void m6174a(C2089pi piVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = piVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, piVar.f4186CK);
        }
        if (set.contains(2)) {
            C0723b.m763a(parcel, 2, piVar.apl, true);
        }
        if (set.contains(3)) {
            C0723b.m759a(parcel, 3, (Parcelable) piVar.apm, i, true);
        }
        if (set.contains(4)) {
            C0723b.m763a(parcel, 4, piVar.apn, true);
        }
        if (set.contains(5)) {
            C0723b.m763a(parcel, 5, piVar.apo, true);
        }
        if (set.contains(6)) {
            C0723b.m775c(parcel, 6, piVar.app);
        }
        if (set.contains(7)) {
            C0723b.m759a(parcel, 7, (Parcelable) piVar.apq, i, true);
        }
        if (set.contains(8)) {
            C0723b.m763a(parcel, 8, piVar.apr, true);
        }
        if (set.contains(9)) {
            C0723b.m763a(parcel, 9, piVar.f4188OS, true);
        }
        if (set.contains(12)) {
            C0723b.m775c(parcel, 12, piVar.f4189ow);
        }
        if (set.contains(14)) {
            C0723b.m763a(parcel, 14, piVar.f4185CE, true);
        }
        if (set.contains(15)) {
            C0723b.m759a(parcel, 15, (Parcelable) piVar.aps, i, true);
        }
        if (set.contains(16)) {
            C0723b.m766a(parcel, 16, piVar.apt);
        }
        if (set.contains(19)) {
            C0723b.m759a(parcel, 19, (Parcelable) piVar.apu, i, true);
        }
        if (set.contains(18)) {
            C0723b.m763a(parcel, 18, piVar.f4187FR, true);
        }
        if (set.contains(21)) {
            C0723b.m775c(parcel, 21, piVar.apw);
        }
        if (set.contains(20)) {
            C0723b.m763a(parcel, 20, piVar.apv, true);
        }
        if (set.contains(23)) {
            C0723b.m776c(parcel, 23, piVar.apy, true);
        }
        if (set.contains(22)) {
            C0723b.m776c(parcel, 22, piVar.apx, true);
        }
        if (set.contains(25)) {
            C0723b.m775c(parcel, 25, piVar.apA);
        }
        if (set.contains(24)) {
            C0723b.m775c(parcel, 24, piVar.apz);
        }
        if (set.contains(27)) {
            C0723b.m763a(parcel, 27, piVar.f4190vf, true);
        }
        if (set.contains(26)) {
            C0723b.m763a(parcel, 26, piVar.apB, true);
        }
        if (set.contains(29)) {
            C0723b.m766a(parcel, 29, piVar.apD);
        }
        if (set.contains(28)) {
            C0723b.m776c(parcel, 28, piVar.apC, true);
        }
        C0723b.m751H(parcel, H);
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v21, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v27, types: [android.os.Parcelable] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00be, code lost:
        r3.add(java.lang.Integer.valueOf(r2));
        r15 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014f, code lost:
        r3.add(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: dz */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C2089pi createFromParcel(android.os.Parcel r32) {
        /*
            r31 = this;
            r0 = r32
            int r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m714G(r32)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 0
            r4 = 0
            r9 = r2
            r13 = r9
            r16 = r13
            r20 = r16
            r23 = r20
            r24 = r23
            r28 = r24
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
            r17 = r15
            r18 = r17
            r19 = r18
            r21 = r19
            r22 = r21
            r25 = r22
            r26 = r25
            r27 = r26
            r4 = r28
        L_0x0034:
            int r2 = r32.dataPosition()
            if (r2 >= r1) goto L_0x0158
            int r2 = com.google.android.gms.common.internal.safeparcel.C0721a.m713F(r32)
            int r29 = com.google.android.gms.common.internal.safeparcel.C0721a.m720aH(r2)
            switch(r29) {
                case 1: goto L_0x0148;
                case 2: goto L_0x0140;
                case 3: goto L_0x0133;
                case 4: goto L_0x012b;
                case 5: goto L_0x0123;
                case 6: goto L_0x011b;
                case 7: goto L_0x010e;
                case 8: goto L_0x0105;
                case 9: goto L_0x00fc;
                case 10: goto L_0x0045;
                case 11: goto L_0x0045;
                case 12: goto L_0x00f3;
                case 13: goto L_0x0045;
                case 14: goto L_0x00ea;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00d3;
                case 17: goto L_0x0045;
                case 18: goto L_0x00c9;
                case 19: goto L_0x00b0;
                case 20: goto L_0x00a6;
                case 21: goto L_0x009c;
                case 22: goto L_0x0091;
                case 23: goto L_0x0086;
                case 24: goto L_0x007c;
                case 25: goto L_0x0072;
                case 26: goto L_0x0068;
                case 27: goto L_0x005e;
                case 28: goto L_0x0053;
                case 29: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            r30 = r15
            com.google.android.gms.common.internal.safeparcel.C0721a.m721b(r0, r2)
            goto L_0x0034
        L_0x004b:
            boolean r28 = com.google.android.gms.common.internal.safeparcel.C0721a.m724c(r0, r2)
            r2 = 29
            goto L_0x014f
        L_0x0053:
            r30 = r15
            com.google.android.gms.internal.ps r15 = com.google.android.gms.internal.C2089pi.C2099h.CREATOR
            java.util.ArrayList r27 = com.google.android.gms.common.internal.safeparcel.C0721a.m723c(r0, r2, r15)
            r2 = 28
            goto L_0x00be
        L_0x005e:
            r30 = r15
            java.lang.String r26 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 27
            goto L_0x014f
        L_0x0068:
            r30 = r15
            java.lang.String r25 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 26
            goto L_0x014f
        L_0x0072:
            r30 = r15
            int r24 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r0, r2)
            r2 = 25
            goto L_0x014f
        L_0x007c:
            r30 = r15
            int r23 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r0, r2)
            r2 = 24
            goto L_0x014f
        L_0x0086:
            r30 = r15
            com.google.android.gms.internal.pr r15 = com.google.android.gms.internal.C2089pi.C2098g.CREATOR
            java.util.ArrayList r22 = com.google.android.gms.common.internal.safeparcel.C0721a.m723c(r0, r2, r15)
            r2 = 23
            goto L_0x00be
        L_0x0091:
            r30 = r15
            com.google.android.gms.internal.pq r15 = com.google.android.gms.internal.C2089pi.C2097f.CREATOR
            java.util.ArrayList r21 = com.google.android.gms.common.internal.safeparcel.C0721a.m723c(r0, r2, r15)
            r2 = 22
            goto L_0x00be
        L_0x009c:
            r30 = r15
            int r20 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r0, r2)
            r2 = 21
            goto L_0x014f
        L_0x00a6:
            r30 = r15
            java.lang.String r19 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 20
            goto L_0x014f
        L_0x00b0:
            r30 = r15
            com.google.android.gms.internal.pp r15 = com.google.android.gms.internal.C2089pi.C2095d.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r0, (int) r2, r15)
            r18 = r2
            com.google.android.gms.internal.pi$d r18 = (com.google.android.gms.internal.C2089pi.C2095d) r18
            r2 = 19
        L_0x00be:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            r15 = r30
            goto L_0x0034
        L_0x00c9:
            r30 = r15
            java.lang.String r17 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 18
            goto L_0x014f
        L_0x00d3:
            r30 = r15
            boolean r16 = com.google.android.gms.common.internal.safeparcel.C0721a.m724c(r0, r2)
            r2 = 16
            goto L_0x014f
        L_0x00dd:
            com.google.android.gms.internal.po r15 = com.google.android.gms.internal.C2089pi.C2094c.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r0, (int) r2, r15)
            r15 = r2
            com.google.android.gms.internal.pi$c r15 = (com.google.android.gms.internal.C2089pi.C2094c) r15
            r2 = 15
            goto L_0x014f
        L_0x00ea:
            r30 = r15
            java.lang.String r14 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 14
            goto L_0x014f
        L_0x00f3:
            r30 = r15
            int r13 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r0, r2)
            r2 = 12
            goto L_0x014f
        L_0x00fc:
            r30 = r15
            java.lang.String r12 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 9
            goto L_0x014f
        L_0x0105:
            r30 = r15
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 8
            goto L_0x014f
        L_0x010e:
            r30 = r15
            com.google.android.gms.internal.pl r10 = com.google.android.gms.internal.C2089pi.C2091b.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r0, (int) r2, r10)
            r10 = r2
            com.google.android.gms.internal.pi$b r10 = (com.google.android.gms.internal.C2089pi.C2091b) r10
            r2 = 7
            goto L_0x014f
        L_0x011b:
            r30 = r15
            int r9 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r0, r2)
            r2 = 6
            goto L_0x014f
        L_0x0123:
            r30 = r15
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 5
            goto L_0x014f
        L_0x012b:
            r30 = r15
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 4
            goto L_0x014f
        L_0x0133:
            r30 = r15
            com.google.android.gms.internal.pk r6 = com.google.android.gms.internal.C2089pi.C2090a.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r0, (int) r2, r6)
            r6 = r2
            com.google.android.gms.internal.pi$a r6 = (com.google.android.gms.internal.C2089pi.C2090a) r6
            r2 = 3
            goto L_0x014f
        L_0x0140:
            r30 = r15
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r0, r2)
            r2 = 2
            goto L_0x014f
        L_0x0148:
            r30 = r15
            int r4 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r0, r2)
            r2 = 1
        L_0x014f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L_0x0034
        L_0x0158:
            r30 = r15
            int r2 = r32.dataPosition()
            if (r2 == r1) goto L_0x0177
            com.google.android.gms.common.internal.safeparcel.a$a r2 = new com.google.android.gms.common.internal.safeparcel.a$a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Overread allowed size end="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x0177:
            com.google.android.gms.internal.pi r0 = new com.google.android.gms.internal.pi
            r2 = r0
            r15 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2100pj.createFromParcel(android.os.Parcel):com.google.android.gms.internal.pi");
    }

    /* renamed from: fx */
    public C2089pi[] newArray(int i) {
        return new C2089pi[i];
    }
}
