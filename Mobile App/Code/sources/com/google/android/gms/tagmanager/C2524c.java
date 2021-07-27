package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.c */
class C2524c extends C2474aj {

    /* renamed from: ID */
    private static final String f4429ID = C1259a.ADVERTISING_TRACKING_ENABLED.toString();
    private final C2461a aqc;

    public C2524c(Context context) {
        this(C2461a.m7148W(context));
    }

    C2524c(C2461a aVar) {
        super(f4429ID, new String[0]);
        this.aqc = aVar;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        return C2590di.m7551u(Boolean.valueOf(!this.aqc.isLimitAdTrackingEnabled()));
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return false;
    }
}
