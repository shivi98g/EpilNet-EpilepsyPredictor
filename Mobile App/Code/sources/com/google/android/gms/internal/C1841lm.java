package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;

/* renamed from: com.google.android.gms.internal.lm */
public class C1841lm {
    /* renamed from: d */
    public static Scope[] m5547d(String[] strArr) {
        C1785jx.m5359b(strArr, (Object) "scopeStrings can't be null.");
        Scope[] scopeArr = new Scope[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            scopeArr[i] = new Scope(strArr[i]);
        }
        return scopeArr;
    }
}
