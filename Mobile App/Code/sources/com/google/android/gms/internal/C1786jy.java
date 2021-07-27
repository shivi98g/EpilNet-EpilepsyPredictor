package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0972g;
import com.google.android.gms.internal.C1778ju;

/* renamed from: com.google.android.gms.internal.jy */
public final class C1786jy extends C0972g<C1778ju> {

    /* renamed from: Nt */
    private static final C1786jy f3948Nt = new C1786jy();

    private C1786jy() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: b */
    public static View m5365b(Context context, int i, int i2) throws C0972g.C0973a {
        return f3948Nt.m5366c(context, i, i2);
    }

    /* renamed from: c */
    private View m5366c(Context context, int i, int i2) throws C0972g.C0973a {
        try {
            return (View) C0970e.m1612f(((C1778ju) mo12191L(context)).mo15932a(C0970e.m1613k(context), i, i2));
        } catch (Exception e) {
            throw new C0972g.C0973a("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: S */
    public C1778ju mo12192d(IBinder iBinder) {
        return C1778ju.C1779a.m5346R(iBinder);
    }
}
