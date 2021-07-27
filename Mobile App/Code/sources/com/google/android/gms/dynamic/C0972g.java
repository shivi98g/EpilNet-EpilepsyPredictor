package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.dynamic.g */
public abstract class C0972g<T> {

    /* renamed from: TI */
    private final String f1317TI;

    /* renamed from: TJ */
    private T f1318TJ;

    /* renamed from: com.google.android.gms.dynamic.g$a */
    public static class C0973a extends Exception {
        public C0973a(String str) {
            super(str);
        }

        public C0973a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C0972g(String str) {
        this.f1317TI = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final T mo12191L(Context context) throws C0973a {
        if (this.f1318TJ == null) {
            C1785jx.m5364i(context);
            Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            if (remoteContext == null) {
                throw new C0973a("Could not get remote context.");
            }
            try {
                this.f1318TJ = mo12192d((IBinder) remoteContext.getClassLoader().loadClass(this.f1317TI).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0973a("Could not load creator class.", e);
            } catch (InstantiationException e2) {
                throw new C0973a("Could not instantiate creator.", e2);
            } catch (IllegalAccessException e3) {
                throw new C0973a("Could not access creator.", e3);
            }
        }
        return this.f1318TJ;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo12192d(IBinder iBinder);
}
