package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.h */
class C2598h extends C2474aj {

    /* renamed from: ID */
    private static final String f4463ID = C1259a.APP_VERSION.toString();
    private final Context mContext;

    public C2598h(Context context) {
        super(f4463ID, new String[0]);
        this.mContext = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        try {
            return C2590di.m7551u(Integer.valueOf(this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            C2504bh.m7243T("Package name " + this.mContext.getPackageName() + " not found. " + e.getMessage());
            return C2590di.m7548rb();
        }
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
