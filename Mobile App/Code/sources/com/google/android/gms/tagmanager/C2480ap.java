package com.google.android.gms.tagmanager;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.tagmanager.ap */
class C2480ap {

    /* renamed from: Bv */
    private final long f4407Bv;

    /* renamed from: Bw */
    private final long f4408Bw;

    /* renamed from: By */
    private String f4409By;
    private final long arw;

    C2480ap(long j, long j2, long j3) {
        this.f4407Bv = j;
        this.f4408Bw = j2;
        this.arw = j3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ak */
    public void mo18650ak(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.f4409By = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fb */
    public long mo18651fb() {
        return this.f4407Bv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pK */
    public long mo18652pK() {
        return this.arw;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pL */
    public String mo18653pL() {
        return this.f4409By;
    }
}
