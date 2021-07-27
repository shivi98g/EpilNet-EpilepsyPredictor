package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C0665a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1693ii;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C2170r;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public final class GoogleAuthUtil {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;

    /* renamed from: Ek */
    private static final ComponentName f452Ek = new ComponentName(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, "com.google.android.gms.auth.GetToken");

    /* renamed from: El */
    private static final ComponentName f453El = new ComponentName(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, "com.google.android.gms.recovery.RecoveryService");

    /* renamed from: Em */
    private static final Intent f454Em = new Intent().setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE).setComponent(f452Ek);

    /* renamed from: En */
    private static final Intent f455En = new Intent().setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE).setComponent(f453El);
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    @Deprecated
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    private GoogleAuthUtil() {
    }

    /* renamed from: C */
    private static void m372C(Context context) throws GoogleAuthException {
        try {
            GooglePlayServicesUtil.m474C(context);
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.getConnectionStatusCode(), e.getMessage(), e.getIntent());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    /* renamed from: a */
    private static String m373a(Context context, String str, String str2, Bundle bundle) throws IOException, GoogleAuthException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            return getToken(context, str, str2, bundle);
        } catch (GooglePlayServicesAvailabilityException e) {
            GooglePlayServicesUtil.showErrorNotification(e.getConnectionStatusCode(), context);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        } catch (UserRecoverableAuthException e2) {
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }

    /* renamed from: ax */
    private static boolean m374ax(String str) {
        return "NetworkError".equals(str) || "ServiceUnavailable".equals(str) || "Timeout".equals(str);
    }

    /* renamed from: ay */
    private static boolean m375ay(String str) {
        return "BadAuthentication".equals(str) || "CaptchaRequired".equals(str) || "DeviceManagementRequiredOrSyncDisabled".equals(str) || "NeedPermission".equals(str) || "NeedsBrowser".equals(str) || "UserCancel".equals(str) || "AppDownloadRequired".equals(str) || C1693ii.DM_SYNC_DISABLED.mo15630fO().equals(str) || C1693ii.DM_ADMIN_BLOCKED.mo15630fO().equals(str) || C1693ii.DM_ADMIN_PENDING_APPROVAL.mo15630fO().equals(str) || C1693ii.DM_STALE_SYNC_REQUIRED.mo15630fO().equals(str) || C1693ii.DM_DEACTIVATED.mo15630fO().equals(str) || C1693ii.DM_REQUIRED.mo15630fO().equals(str);
    }

    public static void clearToken(Context context, String str) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        Context applicationContext = context.getApplicationContext();
        C1785jx.m5358aV("Calling this from your main thread can lead to deadlock");
        m372C(applicationContext);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(KEY_ANDROID_PACKAGE_NAME)) {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, str2);
        }
        C0665a aVar = new C0665a();
        if (applicationContext.bindService(f454Em, aVar, 1)) {
            try {
                Bundle a = C2170r.C2171a.m6501a(aVar.mo10900gs()).mo17104a(str, bundle);
                String string = a.getString(C1693ii.f3748Fk);
                if (!a.getBoolean("booleanResult")) {
                    throw new GoogleAuthException(string);
                }
                applicationContext.unbindService(aVar);
            } catch (RemoteException e) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", e);
                throw new IOException("remote exception");
            } catch (InterruptedException e2) {
                throw new GoogleAuthException("Interrupted");
            } catch (Throwable th) {
                applicationContext.unbindService(aVar);
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service with the given context.");
        }
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) throws GoogleAuthException, IOException {
        C1785jx.m5360b(str, (Object) "accountName must be provided");
        C1785jx.m5358aV("Calling this from your main thread can lead to deadlock");
        Context applicationContext = context.getApplicationContext();
        m372C(applicationContext);
        C0665a aVar = new C0665a();
        if (applicationContext.bindService(f454Em, aVar, 1)) {
            try {
                List<AccountChangeEvent> events = C2170r.C2171a.m6501a(aVar.mo10900gs()).mo17106a(new AccountChangeEventsRequest().setAccountName(str).setEventIndex(i)).getEvents();
                applicationContext.unbindService(aVar);
                return events;
            } catch (RemoteException e) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", e);
                throw new IOException("remote exception");
            } catch (InterruptedException e2) {
                throw new GoogleAuthException("Interrupted");
            } catch (Throwable th) {
                applicationContext.unbindService(aVar);
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service with the given context.");
        }
    }

    public static String getAccountId(Context context, String str) throws GoogleAuthException, IOException {
        C1785jx.m5360b(str, (Object) "accountName must be provided");
        C1785jx.m5358aV("Calling this from your main thread can lead to deadlock");
        m372C(context.getApplicationContext());
        return getToken(context, str, "^^_account_id_^^", new Bundle());
    }

    public static String getAppCert(Context context, String str) {
        return "spatula";
    }

    public static String getToken(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, str, str2, new Bundle());
    }

    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        Context applicationContext = context.getApplicationContext();
        C1785jx.m5358aV("Calling this from your main thread can lead to deadlock");
        m372C(applicationContext);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str3 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str3);
        if (!bundle2.containsKey(KEY_ANDROID_PACKAGE_NAME)) {
            bundle2.putString(KEY_ANDROID_PACKAGE_NAME, str3);
        }
        C0665a aVar = new C0665a();
        if (applicationContext.bindService(f454Em, aVar, 1)) {
            try {
                Bundle a = C2170r.C2171a.m6501a(aVar.mo10900gs()).mo17105a(str, str2, bundle2);
                if (a == null) {
                    Log.w("GoogleAuthUtil", "Binder call returned null.");
                    throw new GoogleAuthException("ServiceUnavailable");
                }
                String string = a.getString("authtoken");
                if (!TextUtils.isEmpty(string)) {
                    applicationContext.unbindService(aVar);
                    return string;
                }
                String string2 = a.getString("Error");
                Intent intent = (Intent) a.getParcelable("userRecoveryIntent");
                if (m375ay(string2)) {
                    throw new UserRecoverableAuthException(string2, intent);
                } else if (m374ax(string2)) {
                    throw new IOException(string2);
                } else {
                    throw new GoogleAuthException(string2);
                }
            } catch (RemoteException e) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", e);
                throw new IOException("remote exception");
            } catch (InterruptedException e2) {
                throw new GoogleAuthException("Interrupted");
            } catch (Throwable th) {
                applicationContext.unbindService(aVar);
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service with the given context.");
        }
    }

    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return m373a(context, str, str2, bundle);
    }

    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, Intent intent) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        m376h(intent);
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        bundle2.putParcelable("callback_intent", intent);
        bundle2.putBoolean("handle_notification", true);
        return m373a(context, str, str2, bundle2);
    }

    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, String str3, Bundle bundle2) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Authority cannot be empty or null.");
        }
        Bundle bundle3 = bundle == null ? new Bundle() : bundle;
        Bundle bundle4 = bundle2 == null ? new Bundle() : bundle2;
        ContentResolver.validateSyncExtrasBundle(bundle4);
        bundle3.putString("authority", str3);
        bundle3.putBundle("sync_extras", bundle4);
        bundle3.putBoolean("handle_notification", true);
        return m373a(context, str, str2, bundle3);
    }

    /* renamed from: h */
    private static void m376h(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken(GOOGLE_ACCOUNT_TYPE, str);
    }
}
