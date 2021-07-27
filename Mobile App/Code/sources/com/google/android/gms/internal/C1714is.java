package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.is */
public class C1714is {

    /* renamed from: HN */
    private static boolean f3806HN = false;

    /* renamed from: HO */
    private boolean f3807HO;

    /* renamed from: HP */
    private boolean f3808HP;

    /* renamed from: HQ */
    private String f3809HQ;
    protected final String mTag;

    public C1714is(String str) {
        this(str, m5081go());
    }

    public C1714is(String str, boolean z) {
        this.mTag = str;
        this.f3807HO = z;
        this.f3808HP = false;
    }

    /* renamed from: go */
    public static boolean m5081go() {
        return f3806HN;
    }

    /* renamed from: a */
    public void mo15714a(String str, Object... objArr) {
        if (mo15722gn()) {
            Log.v(this.mTag, mo15720e(str, objArr));
        }
    }

    /* renamed from: a */
    public void mo15715a(Throwable th, String str, Object... objArr) {
        if (mo15721gm() || f3806HN) {
            Log.d(this.mTag, mo15720e(str, objArr), th);
        }
    }

    /* renamed from: aK */
    public void mo15716aK(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = String.format("[%s] ", new Object[]{str});
        }
        this.f3809HQ = str2;
    }

    /* renamed from: b */
    public void mo15717b(String str, Object... objArr) {
        if (mo15721gm() || f3806HN) {
            Log.d(this.mTag, mo15720e(str, objArr));
        }
    }

    /* renamed from: c */
    public void mo15718c(String str, Object... objArr) {
        Log.i(this.mTag, mo15720e(str, objArr));
    }

    /* renamed from: d */
    public void mo15719d(String str, Object... objArr) {
        Log.w(this.mTag, mo15720e(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo15720e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(str, objArr);
        }
        if (TextUtils.isEmpty(this.f3809HQ)) {
            return str;
        }
        return this.f3809HQ + str;
    }

    /* renamed from: gm */
    public boolean mo15721gm() {
        return this.f3807HO;
    }

    /* renamed from: gn */
    public boolean mo15722gn() {
        return this.f3808HP;
    }
}
