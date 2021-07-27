package com.google.android.gms.tagmanager;

import android.util.Log;

/* renamed from: com.google.android.gms.tagmanager.x */
class C2634x implements C2505bi {

    /* renamed from: yM */
    private int f4480yM = 5;

    C2634x() {
    }

    /* renamed from: S */
    public void mo18674S(String str) {
        if (this.f4480yM <= 3) {
            Log.d("GoogleTagManager", str);
        }
    }

    /* renamed from: T */
    public void mo18675T(String str) {
        if (this.f4480yM <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    /* renamed from: U */
    public void mo18676U(String str) {
        if (this.f4480yM <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    /* renamed from: V */
    public void mo18677V(String str) {
        if (this.f4480yM <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }

    /* renamed from: W */
    public void mo18678W(String str) {
        if (this.f4480yM <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    /* renamed from: b */
    public void mo18679b(String str, Throwable th) {
        if (this.f4480yM <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    /* renamed from: d */
    public void mo18680d(String str, Throwable th) {
        if (this.f4480yM <= 5) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    public void setLogLevel(int i) {
        this.f4480yM = i;
    }
}
