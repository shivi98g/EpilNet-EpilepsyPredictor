package com.google.android.gms.internal;

import com.google.android.gms.plus.PlusShare;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.fu */
class C1570fu {

    /* renamed from: tq */
    private int f3408tq;

    /* renamed from: uX */
    private final List<String> f3409uX;

    /* renamed from: uY */
    private final List<String> f3410uY;

    /* renamed from: uZ */
    private final String f3411uZ;

    /* renamed from: va */
    private final String f3412va;

    /* renamed from: vb */
    private final String f3413vb;

    /* renamed from: vc */
    private final String f3414vc;

    /* renamed from: vd */
    private final boolean f3415vd;

    /* renamed from: ve */
    private final int f3416ve;

    /* renamed from: vf */
    private String f3417vf;

    public C1570fu(int i, Map<String, String> map) {
        this.f3417vf = map.get(PlusShare.KEY_CALL_TO_ACTION_URL);
        this.f3412va = map.get("base_uri");
        this.f3413vb = map.get("post_parameters");
        this.f3415vd = parseBoolean(map.get("drt_include"));
        this.f3411uZ = map.get("activation_overlay_url");
        this.f3410uY = m4563J(map.get("check_packages"));
        this.f3416ve = parseInt(map.get("request_id"));
        this.f3414vc = map.get("type");
        this.f3409uX = m4563J(map.get("errors"));
        this.f3408tq = i;
    }

    /* renamed from: J */
    private List<String> m4563J(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    private static boolean parseBoolean(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    private int parseInt(String str) {
        if (str == null) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    /* renamed from: cT */
    public List<String> mo15328cT() {
        return this.f3409uX;
    }

    /* renamed from: cU */
    public String mo15329cU() {
        return this.f3413vb;
    }

    /* renamed from: cV */
    public boolean mo15330cV() {
        return this.f3415vd;
    }

    public int getErrorCode() {
        return this.f3408tq;
    }

    public String getType() {
        return this.f3414vc;
    }

    public String getUrl() {
        return this.f3417vf;
    }

    public void setUrl(String str) {
        this.f3417vf = str;
    }
}
