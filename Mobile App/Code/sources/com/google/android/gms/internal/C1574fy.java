package com.google.android.gms.internal;

import com.google.android.gms.internal.C1343bv;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.fy */
public final class C1574fy {
    public final int errorCode;
    public final int orientation;

    /* renamed from: qA */
    public final long f3441qA;

    /* renamed from: qP */
    public final C1392cq f3442qP;

    /* renamed from: qQ */
    public final C1405cz f3443qQ;

    /* renamed from: qR */
    public final String f3444qR;

    /* renamed from: qS */
    public final C1395ct f3445qS;

    /* renamed from: qw */
    public final List<String> f3446qw;

    /* renamed from: qx */
    public final List<String> f3447qx;

    /* renamed from: se */
    public final C1610gu f3448se;

    /* renamed from: tL */
    public final C1303av f3449tL;

    /* renamed from: tO */
    public final String f3450tO;

    /* renamed from: tV */
    public final long f3451tV;

    /* renamed from: tW */
    public final boolean f3452tW;

    /* renamed from: tX */
    public final long f3453tX;

    /* renamed from: tY */
    public final List<String> f3454tY;

    /* renamed from: ub */
    public final String f3455ub;

    /* renamed from: vD */
    public final JSONObject f3456vD;

    /* renamed from: vE */
    public final C1393cr f3457vE;

    /* renamed from: vF */
    public final C1306ay f3458vF;

    /* renamed from: vG */
    public final long f3459vG;

    /* renamed from: vH */
    public final long f3460vH;

    /* renamed from: vI */
    public final C1343bv.C1344a f3461vI;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.fy$a */
    public static final class C1575a {
        public final int errorCode;

        /* renamed from: lS */
        public final C1306ay f3462lS;

        /* renamed from: vD */
        public final JSONObject f3463vD;

        /* renamed from: vE */
        public final C1393cr f3464vE;

        /* renamed from: vG */
        public final long f3465vG;

        /* renamed from: vH */
        public final long f3466vH;

        /* renamed from: vJ */
        public final C1545fh f3467vJ;

        /* renamed from: vK */
        public final C1548fj f3468vK;

        public C1575a(C1545fh fhVar, C1548fj fjVar, C1393cr crVar, C1306ay ayVar, int i, long j, long j2, JSONObject jSONObject) {
            this.f3467vJ = fhVar;
            this.f3468vK = fjVar;
            this.f3464vE = crVar;
            this.f3462lS = ayVar;
            this.errorCode = i;
            this.f3465vG = j;
            this.f3466vH = j2;
            this.f3463vD = jSONObject;
        }
    }

    public C1574fy(C1303av avVar, C1610gu guVar, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, C1392cq cqVar, C1405cz czVar, String str2, C1393cr crVar, C1395ct ctVar, long j2, C1306ay ayVar, long j3, long j4, long j5, String str3, JSONObject jSONObject, C1343bv.C1344a aVar) {
        this.f3449tL = avVar;
        this.f3448se = guVar;
        List<String> list4 = null;
        this.f3446qw = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i;
        this.f3447qx = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f3454tY = list3 != null ? Collections.unmodifiableList(list3) : list4;
        this.orientation = i2;
        this.f3441qA = j;
        this.f3450tO = str;
        this.f3452tW = z;
        this.f3442qP = cqVar;
        this.f3443qQ = czVar;
        this.f3444qR = str2;
        this.f3457vE = crVar;
        this.f3445qS = ctVar;
        this.f3453tX = j2;
        this.f3458vF = ayVar;
        this.f3451tV = j3;
        this.f3459vG = j4;
        this.f3460vH = j5;
        this.f3455ub = str3;
        this.f3456vD = jSONObject;
        this.f3461vI = aVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1574fy(com.google.android.gms.internal.C1574fy.C1575a r38, com.google.android.gms.internal.C1610gu r39, com.google.android.gms.internal.C1392cq r40, com.google.android.gms.internal.C1405cz r41, java.lang.String r42, com.google.android.gms.internal.C1395ct r43, com.google.android.gms.internal.C1343bv.C1344a r44) {
        /*
            r37 = this;
            r0 = r38
            com.google.android.gms.internal.fh r1 = r0.f3467vJ
            com.google.android.gms.internal.av r3 = r1.f3308tL
            com.google.android.gms.internal.fj r1 = r0.f3468vK
            java.util.List<java.lang.String> r5 = r1.f3331qw
            int r6 = r0.errorCode
            com.google.android.gms.internal.fj r1 = r0.f3468vK
            java.util.List<java.lang.String> r7 = r1.f3332qx
            com.google.android.gms.internal.fj r1 = r0.f3468vK
            java.util.List<java.lang.String> r8 = r1.f3339tY
            com.google.android.gms.internal.fj r1 = r0.f3468vK
            int r9 = r1.orientation
            com.google.android.gms.internal.fj r1 = r0.f3468vK
            long r10 = r1.f3330qA
            com.google.android.gms.internal.fh r1 = r0.f3467vJ
            java.lang.String r12 = r1.f3311tO
            com.google.android.gms.internal.fj r1 = r0.f3468vK
            boolean r13 = r1.f3337tW
            com.google.android.gms.internal.cr r1 = r0.f3464vE
            com.google.android.gms.internal.fj r2 = r0.f3468vK
            long r14 = r2.f3338tX
            com.google.android.gms.internal.ay r4 = r0.f3462lS
            com.google.android.gms.internal.fj r2 = r0.f3468vK
            r31 = r14
            long r14 = r2.f3336tV
            r33 = r14
            long r14 = r0.f3465vG
            r35 = r14
            long r14 = r0.f3466vH
            com.google.android.gms.internal.fj r2 = r0.f3468vK
            java.lang.String r2 = r2.f3342ub
            org.json.JSONObject r0 = r0.f3463vD
            r28 = r2
            r2 = r37
            r21 = r4
            r4 = r39
            r26 = r14
            r19 = r31
            r22 = r33
            r24 = r35
            r14 = r40
            r15 = r41
            r16 = r42
            r17 = r1
            r18 = r43
            r29 = r0
            r30 = r44
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r24, r26, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1574fy.<init>(com.google.android.gms.internal.fy$a, com.google.android.gms.internal.gu, com.google.android.gms.internal.cq, com.google.android.gms.internal.cz, java.lang.String, com.google.android.gms.internal.ct, com.google.android.gms.internal.bv$a):void");
    }
}
