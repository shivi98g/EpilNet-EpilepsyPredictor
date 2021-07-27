package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;

@C1507ey
/* renamed from: com.google.android.gms.internal.ea */
public final class C1468ea implements SafeParcelable {
    public static final C1466dz CREATOR = new C1466dz();

    /* renamed from: md */
    public final C1480ek f2991md;

    /* renamed from: sA */
    public final Context f2992sA;

    /* renamed from: sB */
    public final C1479ej f2993sB;

    /* renamed from: sz */
    public final C1482em f2994sz;
    public final int versionCode;

    C1468ea(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.versionCode = i;
        this.f2991md = (C1480ek) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder));
        this.f2994sz = (C1482em) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder2));
        this.f2992sA = (Context) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder3));
        this.f2993sB = (C1479ej) C0970e.m1612f(C0967d.C0968a.m1611ap(iBinder4));
    }

    public C1468ea(Context context, C1480ek ekVar, C1482em emVar, C1479ej ejVar) {
        this.versionCode = 2;
        this.f2992sA = context;
        this.f2991md = ekVar;
        this.f2994sz = emVar;
        this.f2993sB = ejVar;
    }

    /* renamed from: a */
    public static void m4345a(Intent intent, C1468ea eaVar) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", eaVar);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    /* renamed from: c */
    public static C1468ea m4346c(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(C1468ea.class.getClassLoader());
            return (C1468ea) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ct */
    public IBinder mo15186ct() {
        return C0970e.m1613k(this.f2993sB).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cu */
    public IBinder mo15187cu() {
        return C0970e.m1613k(this.f2991md).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cv */
    public IBinder mo15188cv() {
        return C0970e.m1613k(this.f2994sz).asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cw */
    public IBinder mo15189cw() {
        return C0970e.m1613k(this.f2992sA).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1466dz.m4340a(this, parcel, i);
    }
}
