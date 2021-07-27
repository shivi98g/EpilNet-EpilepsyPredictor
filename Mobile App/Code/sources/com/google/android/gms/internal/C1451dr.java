package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;

@C1507ey
/* renamed from: com.google.android.gms.internal.dr */
public final class C1451dr implements SafeParcelable {
    public static final C1450dq CREATOR = new C1450dq();

    /* renamed from: lO */
    public final C1608gs f2960lO;
    public final int orientation;

    /* renamed from: rH */
    public final String f2961rH;

    /* renamed from: sb */
    public final C1444do f2962sb;

    /* renamed from: sc */
    public final C2181t f2963sc;

    /* renamed from: sd */
    public final C1452ds f2964sd;

    /* renamed from: se */
    public final C1610gu f2965se;

    /* renamed from: sf */
    public final C1363cb f2966sf;

    /* renamed from: sg */
    public final String f2967sg;

    /* renamed from: sh */
    public final boolean f2968sh;

    /* renamed from: si */
    public final String f2969si;

    /* renamed from: sj */
    public final C1457dv f2970sj;

    /* renamed from: sk */
    public final int f2971sk;

    /* renamed from: sl */
    public final C1375ce f2972sl;

    /* renamed from: sm */
    public final String f2973sm;

    /* renamed from: sn */
    public final C2194y f2974sn;
    public final int versionCode;

    C1451dr(int i, C1444do doVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, C1608gs gsVar, IBinder iBinder6, String str4, C2194y yVar) {
        this.versionCode = i;
        this.f2962sb = doVar;
        this.f2963sc = (C2181t) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder));
        this.f2964sd = (C1452ds) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder2));
        this.f2965se = (C1610gu) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder3));
        this.f2966sf = (C1363cb) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder4));
        this.f2967sg = str;
        this.f2968sh = z;
        this.f2969si = str2;
        this.f2970sj = (C1457dv) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder5));
        this.orientation = i2;
        this.f2971sk = i3;
        this.f2961rH = str3;
        this.f2960lO = gsVar;
        this.f2972sl = (C1375ce) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder6));
        this.f2973sm = str4;
        this.f2974sn = yVar;
    }

    public C1451dr(C1444do doVar, C2181t tVar, C1452ds dsVar, C1457dv dvVar, C1608gs gsVar) {
        this.versionCode = 4;
        this.f2962sb = doVar;
        this.f2963sc = tVar;
        this.f2964sd = dsVar;
        this.f2965se = null;
        this.f2966sf = null;
        this.f2967sg = null;
        this.f2968sh = false;
        this.f2969si = null;
        this.f2970sj = dvVar;
        this.orientation = -1;
        this.f2971sk = 4;
        this.f2961rH = null;
        this.f2960lO = gsVar;
        this.f2972sl = null;
        this.f2973sm = null;
        this.f2974sn = null;
    }

    public C1451dr(C2181t tVar, C1452ds dsVar, C1363cb cbVar, C1457dv dvVar, C1610gu guVar, boolean z, int i, String str, C1608gs gsVar, C1375ce ceVar) {
        this.versionCode = 4;
        this.f2962sb = null;
        this.f2963sc = tVar;
        this.f2964sd = dsVar;
        this.f2965se = guVar;
        this.f2966sf = cbVar;
        this.f2967sg = null;
        this.f2968sh = z;
        this.f2969si = null;
        this.f2970sj = dvVar;
        this.orientation = i;
        this.f2971sk = 3;
        this.f2961rH = str;
        this.f2960lO = gsVar;
        this.f2972sl = ceVar;
        this.f2973sm = null;
        this.f2974sn = null;
    }

    public C1451dr(C2181t tVar, C1452ds dsVar, C1363cb cbVar, C1457dv dvVar, C1610gu guVar, boolean z, int i, String str, String str2, C1608gs gsVar, C1375ce ceVar) {
        this.versionCode = 4;
        this.f2962sb = null;
        this.f2963sc = tVar;
        this.f2964sd = dsVar;
        this.f2965se = guVar;
        this.f2966sf = cbVar;
        this.f2967sg = str2;
        this.f2968sh = z;
        this.f2969si = str;
        this.f2970sj = dvVar;
        this.orientation = i;
        this.f2971sk = 3;
        this.f2961rH = null;
        this.f2960lO = gsVar;
        this.f2972sl = ceVar;
        this.f2973sm = null;
        this.f2974sn = null;
    }

    public C1451dr(C2181t tVar, C1452ds dsVar, C1457dv dvVar, C1610gu guVar, int i, C1608gs gsVar, String str, C2194y yVar) {
        this.versionCode = 4;
        this.f2962sb = null;
        this.f2963sc = tVar;
        this.f2964sd = dsVar;
        this.f2965se = guVar;
        this.f2966sf = null;
        this.f2967sg = null;
        this.f2968sh = false;
        this.f2969si = null;
        this.f2970sj = dvVar;
        this.orientation = i;
        this.f2971sk = 1;
        this.f2961rH = null;
        this.f2960lO = gsVar;
        this.f2972sl = null;
        this.f2973sm = str;
        this.f2974sn = yVar;
    }

    public C1451dr(C2181t tVar, C1452ds dsVar, C1457dv dvVar, C1610gu guVar, boolean z, int i, C1608gs gsVar) {
        this.versionCode = 4;
        this.f2962sb = null;
        this.f2963sc = tVar;
        this.f2964sd = dsVar;
        this.f2965se = guVar;
        this.f2966sf = null;
        this.f2967sg = null;
        this.f2968sh = z;
        this.f2969si = null;
        this.f2970sj = dvVar;
        this.orientation = i;
        this.f2971sk = 2;
        this.f2961rH = null;
        this.f2960lO = gsVar;
        this.f2972sl = null;
        this.f2973sm = null;
        this.f2974sn = null;
    }

    /* renamed from: a */
    public static void m4306a(Intent intent, C1451dr drVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", drVar);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    /* renamed from: b */
    public static C1451dr m4307b(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(C1451dr.class.getClassLoader());
            return (C1451dr) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ck */
    public IBinder mo15145ck() {
        return C0970e.m1613k(this.f2963sc).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cl */
    public IBinder mo15146cl() {
        return C0970e.m1613k(this.f2964sd).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cm */
    public IBinder mo15147cm() {
        return C0970e.m1613k(this.f2965se).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cn */
    public IBinder mo15148cn() {
        return C0970e.m1613k(this.f2966sf).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: co */
    public IBinder mo15149co() {
        return C0970e.m1613k(this.f2972sl).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cp */
    public IBinder mo15150cp() {
        return C0970e.m1613k(this.f2970sj).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1450dq.m4303a(this, parcel, i);
    }
}
