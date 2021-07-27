package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.google.android.gms.tagmanager.ce */
class C2531ce {
    private static C2531ce asm;
    private volatile String aqm;
    private volatile C2532a asn;
    private volatile String aso;
    private volatile String asp;

    /* renamed from: com.google.android.gms.tagmanager.ce$a */
    enum C2532a {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    C2531ce() {
        clear();
    }

    /* renamed from: cK */
    private String m7331cK(String str) {
        return str.split("&")[0].split("=")[1];
    }

    /* renamed from: j */
    private String m7332j(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    /* renamed from: qa */
    static C2531ce m7333qa() {
        C2531ce ceVar;
        synchronized (C2531ce.class) {
            if (asm == null) {
                asm = new C2531ce();
            }
            ceVar = asm;
        }
        return ceVar;
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.asn = C2532a.NONE;
        this.aso = null;
        this.aqm = null;
        this.asp = null;
    }

    /* access modifiers changed from: package-private */
    public String getContainerId() {
        return this.aqm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean mo18727i(Uri uri) {
        try {
            String decode = URLDecoder.decode(uri.toString(), "UTF-8");
            if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                C2504bh.m7245V("Container preview url: " + decode);
                this.asn = decode.matches(".*?&gtm_debug=x$") ? C2532a.CONTAINER_DEBUG : C2532a.CONTAINER;
                this.asp = m7332j(uri);
                if (this.asn == C2532a.CONTAINER || this.asn == C2532a.CONTAINER_DEBUG) {
                    this.aso = "/r?" + this.asp;
                }
                this.aqm = m7331cK(this.asp);
                return true;
            } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                C2504bh.m7246W("Invalid preview uri: " + decode);
                return false;
            } else if (!m7331cK(uri.getQuery()).equals(this.aqm)) {
                return false;
            } else {
                C2504bh.m7245V("Exit preview mode for container: " + this.aqm);
                this.asn = C2532a.NONE;
                this.aso = null;
                return true;
            }
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qb */
    public C2532a mo18728qb() {
        return this.asn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qc */
    public String mo18729qc() {
        return this.aso;
    }
}
