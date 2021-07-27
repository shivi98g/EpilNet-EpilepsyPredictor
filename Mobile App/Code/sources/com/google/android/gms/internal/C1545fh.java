package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@C1507ey
/* renamed from: com.google.android.gms.internal.fh */
public final class C1545fh implements SafeParcelable {
    public static final C1547fi CREATOR = new C1547fi();
    public final ApplicationInfo applicationInfo;

    /* renamed from: lL */
    public final String f3303lL;

    /* renamed from: lO */
    public final C1608gs f3304lO;

    /* renamed from: lS */
    public final C1306ay f3305lS;

    /* renamed from: mc */
    public final List<String> f3306mc;

    /* renamed from: tK */
    public final Bundle f3307tK;

    /* renamed from: tL */
    public final C1303av f3308tL;

    /* renamed from: tM */
    public final PackageInfo f3309tM;

    /* renamed from: tN */
    public final String f3310tN;

    /* renamed from: tO */
    public final String f3311tO;

    /* renamed from: tP */
    public final String f3312tP;

    /* renamed from: tQ */
    public final Bundle f3313tQ;

    /* renamed from: tR */
    public final int f3314tR;

    /* renamed from: tS */
    public final Bundle f3315tS;

    /* renamed from: tT */
    public final boolean f3316tT;
    public final int versionCode;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.fh$a */
    public static final class C1546a {
        public final ApplicationInfo applicationInfo;

        /* renamed from: lL */
        public final String f3317lL;

        /* renamed from: lO */
        public final C1608gs f3318lO;

        /* renamed from: lS */
        public final C1306ay f3319lS;

        /* renamed from: mc */
        public final List<String> f3320mc;

        /* renamed from: tK */
        public final Bundle f3321tK;

        /* renamed from: tL */
        public final C1303av f3322tL;

        /* renamed from: tM */
        public final PackageInfo f3323tM;

        /* renamed from: tO */
        public final String f3324tO;

        /* renamed from: tP */
        public final String f3325tP;

        /* renamed from: tQ */
        public final Bundle f3326tQ;

        /* renamed from: tR */
        public final int f3327tR;

        /* renamed from: tS */
        public final Bundle f3328tS;

        /* renamed from: tT */
        public final boolean f3329tT;

        public C1546a(Bundle bundle, C1303av avVar, C1306ay ayVar, String str, ApplicationInfo applicationInfo2, PackageInfo packageInfo, String str2, String str3, C1608gs gsVar, Bundle bundle2, List<String> list, Bundle bundle3, boolean z) {
            this.f3321tK = bundle;
            this.f3322tL = avVar;
            this.f3319lS = ayVar;
            this.f3317lL = str;
            this.applicationInfo = applicationInfo2;
            this.f3323tM = packageInfo;
            this.f3324tO = str2;
            this.f3325tP = str3;
            this.f3318lO = gsVar;
            this.f3326tQ = bundle2;
            this.f3329tT = z;
            if (list == null || list.size() <= 0) {
                this.f3327tR = 0;
                this.f3320mc = null;
            } else {
                this.f3327tR = 2;
                this.f3320mc = list;
            }
            this.f3328tS = bundle3;
        }
    }

    C1545fh(int i, Bundle bundle, C1303av avVar, C1306ay ayVar, String str, ApplicationInfo applicationInfo2, PackageInfo packageInfo, String str2, String str3, String str4, C1608gs gsVar, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z) {
        this.versionCode = i;
        this.f3307tK = bundle;
        this.f3308tL = avVar;
        this.f3305lS = ayVar;
        this.f3303lL = str;
        this.applicationInfo = applicationInfo2;
        this.f3309tM = packageInfo;
        this.f3310tN = str2;
        this.f3311tO = str3;
        this.f3312tP = str4;
        this.f3304lO = gsVar;
        this.f3313tQ = bundle2;
        this.f3314tR = i2;
        this.f3306mc = list;
        this.f3315tS = bundle3;
        this.f3316tT = z;
    }

    public C1545fh(Bundle bundle, C1303av avVar, C1306ay ayVar, String str, ApplicationInfo applicationInfo2, PackageInfo packageInfo, String str2, String str3, String str4, C1608gs gsVar, Bundle bundle2, int i, List<String> list, Bundle bundle3, boolean z) {
        this(4, bundle, avVar, ayVar, str, applicationInfo2, packageInfo, str2, str3, str4, gsVar, bundle2, i, list, bundle3, z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1545fh(com.google.android.gms.internal.C1545fh.C1546a r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r17
            android.os.Bundle r1 = r0.f3321tK
            com.google.android.gms.internal.av r2 = r0.f3322tL
            com.google.android.gms.internal.ay r3 = r0.f3319lS
            java.lang.String r4 = r0.f3317lL
            android.content.pm.ApplicationInfo r5 = r0.applicationInfo
            android.content.pm.PackageInfo r6 = r0.f3323tM
            java.lang.String r8 = r0.f3324tO
            java.lang.String r9 = r0.f3325tP
            com.google.android.gms.internal.gs r10 = r0.f3318lO
            android.os.Bundle r11 = r0.f3326tQ
            int r12 = r0.f3327tR
            java.util.List<java.lang.String> r13 = r0.f3320mc
            android.os.Bundle r14 = r0.f3328tS
            boolean r15 = r0.f3329tT
            r0 = r16
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1545fh.<init>(com.google.android.gms.internal.fh$a, java.lang.String):void");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1547fi.m4486a(this, parcel, i);
    }
}
