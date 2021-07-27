package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.maps.internal.C2276c;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.internal.x */
public class C2337x {
    private static Context alI;
    private static C2276c alJ;

    /* renamed from: S */
    public static C2276c m6794S(Context context) throws GooglePlayServicesNotAvailableException {
        C1785jx.m5364i(context);
        if (alJ != null) {
            return alJ;
        }
        m6795T(context);
        alJ = m6796U(context);
        try {
            alJ.mo17715a(C0970e.m1613k(getRemoteContext(context).getResources()), (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return alJ;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: T */
    private static void m6795T(Context context) throws GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    /* renamed from: U */
    private static C2276c m6796U(Context context) {
        if (m6799nY()) {
            Log.i(C2337x.class.getSimpleName(), "Making Creator statically");
            return (C2276c) m6798c(m6800nZ());
        }
        Log.i(C2337x.class.getSimpleName(), "Making Creator dynamically");
        return C2276c.C2277a.m6733aS((IBinder) m6797a(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }

    /* renamed from: a */
    private static <T> T m6797a(ClassLoader classLoader, String str) {
        try {
            return m6798c(((ClassLoader) C1785jx.m5364i(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    /* renamed from: c */
    private static <T> T m6798c(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    private static Context getRemoteContext(Context context) {
        if (alI == null) {
            alI = m6799nY() ? context.getApplicationContext() : GooglePlayServicesUtil.getRemoteContext(context);
        }
        return alI;
    }

    /* renamed from: nY */
    public static boolean m6799nY() {
        return false;
    }

    /* renamed from: nZ */
    private static Class<?> m6800nZ() {
        try {
            return Build.VERSION.SDK_INT < 15 ? Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6") : Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
