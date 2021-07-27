package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1785jx;
import java.lang.reflect.Method;

public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static Method apU = null;

    /* renamed from: ut */
    private static final Object f4390ut = new Object();

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    /* renamed from: V */
    private static void m7095V(Context context) throws ClassNotFoundException, NoSuchMethodException {
        apU = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
    }

    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        C1785jx.m5359b(context, (Object) "Context must not be null");
        GooglePlayServicesUtil.m474C(context);
        Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
        if (remoteContext == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new GooglePlayServicesNotAvailableException(8);
        }
        synchronized (f4390ut) {
            try {
                if (apU == null) {
                    m7095V(remoteContext);
                }
                apU.invoke((Object) null, new Object[]{remoteContext});
            } catch (Exception e) {
                Log.e("ProviderInstaller", "Failed to install provider: " + e.getMessage());
                throw new GooglePlayServicesNotAvailableException(8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void installIfNeededAsync(final Context context, final ProviderInstallListener providerInstallListener) {
        C1785jx.m5359b(context, (Object) "Context must not be null");
        C1785jx.m5359b(providerInstallListener, (Object) "Listener must not be null");
        C1785jx.m5357aU("Must be called on the UI thread");
        new AsyncTask<Void, Void, Integer>() {
            /* access modifiers changed from: protected */
            /* renamed from: c */
            public Integer doInBackground(Void... voidArr) {
                int connectionStatusCode;
                try {
                    ProviderInstaller.installIfNeeded(context);
                    connectionStatusCode = 0;
                } catch (GooglePlayServicesRepairableException e) {
                    connectionStatusCode = e.getConnectionStatusCode();
                } catch (GooglePlayServicesNotAvailableException e2) {
                    connectionStatusCode = e2.errorCode;
                }
                return Integer.valueOf(connectionStatusCode);
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public void onPostExecute(Integer num) {
                if (num.intValue() == 0) {
                    providerInstallListener.onProviderInstalled();
                    return;
                }
                providerInstallListener.onProviderInstallFailed(num.intValue(), GooglePlayServicesUtil.m484aj(num.intValue()));
            }
        }.execute(new Void[0]);
    }
}
