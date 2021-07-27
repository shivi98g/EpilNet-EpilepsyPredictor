package com.google.android.gms.internal;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.mz */
public class C1962mz {

    /* renamed from: DZ */
    private final String f4134DZ;

    /* renamed from: Ee */
    private final C2007np<C1993ni> f4135Ee;

    /* renamed from: JK */
    private final String f4136JK;
    private C1964na agz = null;
    private final Context mContext;

    private C1962mz(Context context, String str, String str2, C2007np<C1993ni> npVar) {
        this.mContext = context;
        this.f4134DZ = str;
        this.f4135Ee = npVar;
        this.f4136JK = str2;
    }

    /* renamed from: a */
    public static C1962mz m5786a(Context context, String str, String str2, C2007np<C1993ni> npVar) {
        return new C1962mz(context, str, str2, npVar);
    }
}
