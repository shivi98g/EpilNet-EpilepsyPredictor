package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0972g;
import com.google.android.gms.plus.PlusOneDummyView;
import com.google.android.gms.plus.internal.C2426c;

/* renamed from: com.google.android.gms.plus.internal.g */
public final class C2442g extends C0972g<C2426c> {
    private static final C2442g anP = new C2442g();

    private C2442g() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m7080a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) C0970e.m1612f(((C2426c) anP.mo12191L(context)).mo18429a(C0970e.m1613k(context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new PlusOneDummyView(context, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bO */
    public C2426c mo12192d(IBinder iBinder) {
        return C2426c.C2427a.m7007bL(iBinder);
    }
}
