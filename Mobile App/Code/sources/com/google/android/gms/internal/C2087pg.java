package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pg */
public class C2087pg implements Parcelable.Creator<C2086pf> {
    /* renamed from: a */
    static void m6126a(C2086pf pfVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = pfVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, pfVar.f4183CK);
        }
        if (set.contains(2)) {
            C0723b.m763a(parcel, 2, pfVar.f4182CE, true);
        }
        if (set.contains(4)) {
            C0723b.m759a(parcel, 4, (Parcelable) pfVar.api, i, true);
        }
        if (set.contains(5)) {
            C0723b.m763a(parcel, 5, pfVar.apa, true);
        }
        if (set.contains(6)) {
            C0723b.m759a(parcel, 6, (Parcelable) pfVar.apj, i, true);
        }
        if (set.contains(7)) {
            C0723b.m763a(parcel, 7, pfVar.f4184vc, true);
        }
        C0723b.m751H(parcel, H);
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: dy */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C2086pf createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.C0721a.m714G(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0010:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x005a
            int r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m713F(r11)
            int r9 = com.google.android.gms.common.internal.safeparcel.C0721a.m720aH(r1)
            switch(r9) {
                case 1: goto L_0x004d;
                case 2: goto L_0x0047;
                case 3: goto L_0x0021;
                case 4: goto L_0x003c;
                case 5: goto L_0x0036;
                case 6: goto L_0x002b;
                case 7: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            com.google.android.gms.common.internal.safeparcel.C0721a.m721b(r11, r1)
            goto L_0x0010
        L_0x0025:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r11, r1)
            r1 = 7
            goto L_0x0052
        L_0x002b:
            com.google.android.gms.internal.pe r7 = com.google.android.gms.internal.C2084pd.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r11, (int) r1, r7)
            r7 = r1
            com.google.android.gms.internal.pd r7 = (com.google.android.gms.internal.C2084pd) r7
            r1 = 6
            goto L_0x0052
        L_0x0036:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r11, r1)
            r1 = 5
            goto L_0x0052
        L_0x003c:
            com.google.android.gms.internal.pe r5 = com.google.android.gms.internal.C2084pd.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.C0721a.m716a((android.os.Parcel) r11, (int) r1, r5)
            r5 = r1
            com.google.android.gms.internal.pd r5 = (com.google.android.gms.internal.C2084pd) r5
            r1 = 4
            goto L_0x0052
        L_0x0047:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r11, r1)
            r1 = 2
            goto L_0x0052
        L_0x004d:
            int r3 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r11, r1)
            r1 = 1
        L_0x0052:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
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
            com.google.android.gms.internal.pf r11 = new com.google.android.gms.internal.pf
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2087pg.createFromParcel(android.os.Parcel):com.google.android.gms.internal.pf");
    }

    /* renamed from: fw */
    public C2086pf[] newArray(int i) {
        return new C2086pf[i];
    }
}
