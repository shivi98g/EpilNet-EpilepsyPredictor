package com.google.android.gms.internal;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.internal.C1767jq;

/* renamed from: com.google.android.gms.internal.jd */
public class C1741jd extends C1767jq.C1768a {

    /* renamed from: CR */
    private Account f3877CR;

    public C1741jd(Account account) {
        this.f3877CR = account;
    }

    /* renamed from: aT */
    public static C1741jd m5150aT(String str) {
        return new C1741jd(TextUtils.isEmpty(str) ? null : new Account(str, GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE));
    }

    /* renamed from: hk */
    public Account mo15785hk() {
        return this.f3877CR;
    }
}
