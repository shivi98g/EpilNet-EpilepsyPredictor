package com.google.android.gms.internal;

import android.text.TextUtils;

@C1507ey
/* renamed from: com.google.android.gms.internal.bm */
public final class C1330bm {

    /* renamed from: pd */
    private String f2678pd;

    /* renamed from: pe */
    private String f2679pe;

    /* renamed from: pf */
    private String f2680pf;

    /* renamed from: pg */
    private String f2681pg;

    public C1330bm() {
        this.f2678pd = null;
        this.f2679pe = null;
        this.f2680pf = null;
        this.f2681pg = null;
        this.f2678pd = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html";
        this.f2679pe = null;
        this.f2680pf = null;
        this.f2681pg = null;
    }

    public C1330bm(String str, String str2, String str3, String str4) {
        this.f2678pd = null;
        this.f2679pe = null;
        this.f2680pf = null;
        this.f2681pg = null;
        this.f2678pd = TextUtils.isEmpty(str) ? "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html" : str;
        this.f2679pe = str2;
        this.f2680pf = str3;
        this.f2681pg = str4;
    }

    /* renamed from: bu */
    public String mo14932bu() {
        return this.f2678pd;
    }

    /* renamed from: bv */
    public String mo14933bv() {
        return this.f2679pe;
    }

    /* renamed from: bw */
    public String mo14934bw() {
        return this.f2680pf;
    }

    /* renamed from: bx */
    public String mo14935bx() {
        return this.f2681pg;
    }
}
