package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.af */
public class C0551af {

    /* renamed from: BO */
    private final Map<String, Integer> f203BO = new HashMap();

    /* renamed from: BP */
    private final Map<String, String> f204BP = new HashMap();

    /* renamed from: BQ */
    private final boolean f205BQ;

    /* renamed from: BR */
    private final String f206BR;

    public C0551af(String str, boolean z) {
        this.f205BQ = z;
        this.f206BR = str;
    }

    /* renamed from: e */
    public void mo10354e(String str, int i) {
        if (this.f205BQ) {
            Integer num = this.f203BO.get(str);
            if (num == null) {
                num = 0;
            }
            this.f203BO.put(str, Integer.valueOf(num.intValue() + i));
        }
    }

    /* renamed from: fg */
    public String mo10355fg() {
        if (!this.f205BQ) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f206BR);
        for (String next : this.f203BO.keySet()) {
            sb.append("&");
            sb.append(next);
            sb.append("=");
            sb.append(this.f203BO.get(next));
        }
        for (String next2 : this.f204BP.keySet()) {
            sb.append("&");
            sb.append(next2);
            sb.append("=");
            sb.append(this.f204BP.get(next2));
        }
        return sb.toString();
    }

    /* renamed from: g */
    public void mo10356g(String str, String str2) {
        if (this.f205BQ && !TextUtils.isEmpty(str)) {
            this.f204BP.put(str, str2);
        }
    }
}
