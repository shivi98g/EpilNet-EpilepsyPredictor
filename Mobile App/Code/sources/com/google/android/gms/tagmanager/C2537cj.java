package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.cj */
class C2537cj extends C2474aj {

    /* renamed from: ID */
    private static final String f4442ID = C1259a.RESOLUTION.toString();
    private final Context mContext;

    public C2537cj(Context context) {
        super(f4442ID, new String[0]);
        this.mContext = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        return C2590di.m7551u(i + "x" + i2);
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
