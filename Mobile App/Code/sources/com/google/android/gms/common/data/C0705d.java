package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.common.data.d */
public abstract class C0705d {

    /* renamed from: JG */
    protected final DataHolder f790JG;

    /* renamed from: KZ */
    protected int f791KZ;

    /* renamed from: La */
    private int f792La;

    public C0705d(DataHolder dataHolder, int i) {
        this.f790JG = (DataHolder) C1785jx.m5364i(dataHolder);
        mo11083as(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11079a(String str, CharArrayBuffer charArrayBuffer) {
        this.f790JG.mo11045a(str, this.f791KZ, this.f792La, charArrayBuffer);
    }

    /* renamed from: aQ */
    public boolean mo11080aQ(String str) {
        return this.f790JG.mo11046aQ(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aR */
    public Uri mo11081aR(String str) {
        return this.f790JG.mo11057g(str, this.f791KZ, this.f792La);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aS */
    public boolean mo11082aS(String str) {
        return this.f790JG.mo11065h(str, this.f791KZ, this.f792La);
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public void mo11083as(int i) {
        C1785jx.m5353K(i >= 0 && i < this.f790JG.getCount());
        this.f791KZ = i;
        this.f792La = this.f790JG.mo11047au(this.f791KZ);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0705d)) {
            return false;
        }
        C0705d dVar = (C0705d) obj;
        return C1781jv.equal(Integer.valueOf(dVar.f791KZ), Integer.valueOf(this.f791KZ)) && C1781jv.equal(Integer.valueOf(dVar.f792La), Integer.valueOf(this.f792La)) && dVar.f790JG == this.f790JG;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gW */
    public int mo11084gW() {
        return this.f791KZ;
    }

    /* access modifiers changed from: protected */
    public boolean getBoolean(String str) {
        return this.f790JG.mo11051d(str, this.f791KZ, this.f792La);
    }

    /* access modifiers changed from: protected */
    public byte[] getByteArray(String str) {
        return this.f790JG.mo11055f(str, this.f791KZ, this.f792La);
    }

    /* access modifiers changed from: protected */
    public float getFloat(String str) {
        return this.f790JG.mo11053e(str, this.f791KZ, this.f792La);
    }

    /* access modifiers changed from: protected */
    public int getInteger(String str) {
        return this.f790JG.mo11048b(str, this.f791KZ, this.f792La);
    }

    /* access modifiers changed from: protected */
    public long getLong(String str) {
        return this.f790JG.mo11044a(str, this.f791KZ, this.f792La);
    }

    /* access modifiers changed from: protected */
    public String getString(String str) {
        return this.f790JG.mo11049c(str, this.f791KZ, this.f792La);
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f791KZ), Integer.valueOf(this.f792La), this.f790JG);
    }

    public boolean isDataValid() {
        return !this.f790JG.isClosed();
    }
}
