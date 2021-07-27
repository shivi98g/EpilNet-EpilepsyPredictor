package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1815kr;

/* renamed from: com.google.android.gms.internal.km */
public class C1809km implements SafeParcelable {
    public static final C1810kn CREATOR = new C1810kn();

    /* renamed from: CK */
    private final int f3971CK;

    /* renamed from: NF */
    private final C1811ko f3972NF;

    C1809km(int i, C1811ko koVar) {
        this.f3971CK = i;
        this.f3972NF = koVar;
    }

    private C1809km(C1811ko koVar) {
        this.f3971CK = 1;
        this.f3972NF = koVar;
    }

    /* renamed from: a */
    public static C1809km m5408a(C1815kr.C1817b<?, ?> bVar) {
        if (bVar instanceof C1811ko) {
            return new C1809km((C1811ko) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public int describeContents() {
        C1810kn knVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f3971CK;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: hF */
    public C1811ko mo15975hF() {
        return this.f3972NF;
    }

    /* renamed from: hG */
    public C1815kr.C1817b<?, ?> mo15976hG() {
        if (this.f3972NF != null) {
            return this.f3972NF;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1810kn knVar = CREATOR;
        C1810kn.m5411a(this, parcel, i);
    }
}
