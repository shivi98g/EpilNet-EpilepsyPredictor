package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.drive.i */
public abstract class C0746i implements Parcelable {

    /* renamed from: OW */
    private volatile transient boolean f912OW = false;

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo11369I(Parcel parcel, int i);

    /* renamed from: iB */
    public final boolean mo11370iB() {
        return this.f912OW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1785jx.m5353K(!mo11370iB());
        this.f912OW = true;
        mo11369I(parcel, i);
    }
}
