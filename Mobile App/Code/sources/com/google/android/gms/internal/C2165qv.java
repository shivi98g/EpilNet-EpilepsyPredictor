package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.qv */
public class C2165qv extends IOException {
    public C2165qv(String str) {
        super(str);
    }

    /* renamed from: rR */
    static C2165qv m6470rR() {
        return new C2165qv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: rS */
    static C2165qv m6471rS() {
        return new C2165qv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: rT */
    static C2165qv m6472rT() {
        return new C2165qv("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: rU */
    static C2165qv m6473rU() {
        return new C2165qv("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: rV */
    static C2165qv m6474rV() {
        return new C2165qv("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: rW */
    static C2165qv m6475rW() {
        return new C2165qv("Protocol message tag had invalid wire type.");
    }

    /* renamed from: rX */
    static C2165qv m6476rX() {
        return new C2165qv("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
