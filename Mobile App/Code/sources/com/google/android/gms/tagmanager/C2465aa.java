package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.aa */
class C2465aa extends C2474aj {

    /* renamed from: ID */
    private static final String f4398ID = C1259a.DEVICE_NAME.toString();

    public C2465aa() {
        super(f4398ID, new String[0]);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            str2 = str + " " + str2;
        }
        return C2590di.m7551u(str2);
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
