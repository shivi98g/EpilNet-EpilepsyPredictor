package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.jj */
public class C1748jj implements SafeParcelable {
    public static final Parcelable.Creator<C1748jj> CREATOR = new C1749jk();

    /* renamed from: MD */
    final int f3893MD;

    /* renamed from: ME */
    int f3894ME;

    /* renamed from: MF */
    String f3895MF;

    /* renamed from: MG */
    IBinder f3896MG;

    /* renamed from: MH */
    Scope[] f3897MH;

    /* renamed from: MI */
    Bundle f3898MI;
    final int version;

    public C1748jj(int i) {
        this.version = 1;
        this.f3894ME = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.f3893MD = i;
    }

    C1748jj(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle) {
        this.version = i;
        this.f3893MD = i2;
        this.f3894ME = i3;
        this.f3895MF = str;
        this.f3896MG = iBinder;
        this.f3897MH = scopeArr;
        this.f3898MI = bundle;
    }

    /* renamed from: a */
    public C1748jj mo15803a(C1767jq jqVar) {
        if (jqVar != null) {
            this.f3896MG = jqVar.asBinder();
        }
        return this;
    }

    /* renamed from: a */
    public C1748jj mo15804a(Scope[] scopeArr) {
        this.f3897MH = scopeArr;
        return this;
    }

    /* renamed from: aX */
    public C1748jj mo15805aX(String str) {
        this.f3895MF = str;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C1748jj mo15807e(Bundle bundle) {
        this.f3898MI = bundle;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1749jk.m5177a(this, parcel, i);
    }
}
