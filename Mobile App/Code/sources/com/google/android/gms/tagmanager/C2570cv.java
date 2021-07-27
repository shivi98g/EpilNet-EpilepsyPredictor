package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.cv */
class C2570cv extends C2474aj {

    /* renamed from: ID */
    private static final String f4446ID = C1259a.SDK_VERSION.toString();

    public C2570cv() {
        super(f4446ID, new String[0]);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        return C2590di.m7551u(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
