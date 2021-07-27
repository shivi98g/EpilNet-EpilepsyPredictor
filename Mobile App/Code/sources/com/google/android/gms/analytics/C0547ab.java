package com.google.android.gms.analytics;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.analytics.ab */
public class C0547ab {

    /* renamed from: Bu */
    private String f188Bu;

    /* renamed from: Bv */
    private final long f189Bv;

    /* renamed from: Bw */
    private final long f190Bw;

    /* renamed from: Bx */
    private final String f191Bx;

    /* renamed from: By */
    private String f192By;

    /* renamed from: Bz */
    private String f193Bz = "https:";

    public C0547ab(String str, long j, long j2, String str2) {
        this.f188Bu = str;
        this.f189Bv = j;
        this.f190Bw = j2;
        this.f191Bx = str2;
    }

    /* renamed from: aj */
    public void mo10347aj(String str) {
        this.f188Bu = str;
    }

    /* renamed from: ak */
    public void mo10348ak(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.f192By = str;
            if (str.toLowerCase().startsWith("http:")) {
                this.f193Bz = "http:";
            }
        }
    }

    /* renamed from: fa */
    public String mo10349fa() {
        return this.f188Bu;
    }

    /* renamed from: fb */
    public long mo10350fb() {
        return this.f189Bv;
    }

    /* renamed from: fc */
    public long mo10351fc() {
        return this.f190Bw;
    }

    /* renamed from: fd */
    public String mo10352fd() {
        return this.f193Bz;
    }
}
