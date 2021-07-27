package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.google.android.gms.tagmanager.y */
class C2635y implements C2481aq {
    private static C2635y arl;

    /* renamed from: xO */
    private static final Object f4481xO = new Object();
    private C2534cg aqC;
    private String arm;
    private String arn;
    private C2482ar aro;

    private C2635y(Context context) {
        this(C2483as.m7197Z(context), new C2571cw());
    }

    C2635y(C2482ar arVar, C2534cg cgVar) {
        this.aro = arVar;
        this.aqC = cgVar;
    }

    /* renamed from: X */
    public static C2481aq m7708X(Context context) {
        C2635y yVar;
        synchronized (f4481xO) {
            if (arl == null) {
                arl = new C2635y(context);
            }
            yVar = arl;
        }
        return yVar;
    }

    /* renamed from: cB */
    public boolean mo18654cB(String str) {
        if (!this.aqC.mo18670fe()) {
            C2504bh.m7246W("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        if (!(this.arm == null || this.arn == null)) {
            try {
                str = this.arm + "?" + this.arn + "=" + URLEncoder.encode(str, "UTF-8");
                C2504bh.m7245V("Sending wrapped url hit: " + str);
            } catch (UnsupportedEncodingException e) {
                C2504bh.m7248d("Error wrapping URL for testing.", e);
                return false;
            }
        }
        this.aro.mo18656cE(str);
        return true;
    }
}
