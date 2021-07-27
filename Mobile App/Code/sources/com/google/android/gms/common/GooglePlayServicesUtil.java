package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.C0530R;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.C1765jo;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1831lc;
import com.google.android.gms.internal.C1840ll;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public final class GooglePlayServicesUtil {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 6587000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    /* renamed from: Jg */
    public static boolean f613Jg = false;

    /* renamed from: Jh */
    public static boolean f614Jh = false;

    /* renamed from: Ji */
    private static int f615Ji = -1;

    /* renamed from: Jj */
    private static final Object f616Jj = new Object();

    /* renamed from: com.google.android.gms.common.GooglePlayServicesUtil$a */
    private static class C0664a extends Handler {

        /* renamed from: mO */
        private final Context f617mO;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0664a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f617mO = context.getApplicationContext();
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                Log.w("GooglePlayServicesUtil", "Don't know how to handle this message: " + message.what);
                return;
            }
            int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.f617mO);
            if (GooglePlayServicesUtil.isUserRecoverableError(isGooglePlayServicesAvailable)) {
                GooglePlayServicesUtil.m479a(isGooglePlayServicesAvailable, this.f617mO);
            }
        }
    }

    private GooglePlayServicesUtil() {
    }

    /* renamed from: C */
    public static void m474C(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            Intent aj = m484aj(isGooglePlayServicesAvailable);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + isGooglePlayServicesAvailable);
            if (aj == null) {
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
            }
            throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", aj);
        }
    }

    /* renamed from: D */
    private static void m475D(Context context) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("GooglePlayServicesUtil", "This should never happen.", e);
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.version");
            if (i != 6587000) {
                throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found " + i + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
            }
            return;
        }
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }

    /* renamed from: E */
    private static void m476E(Context context) {
        C0664a aVar = new C0664a(context);
        aVar.sendMessageDelayed(aVar.obtainMessage(1), 120000);
    }

    /* renamed from: F */
    private static String m477F(Context context) {
        ApplicationInfo applicationInfo;
        String str = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            applicationInfo = null;
        }
        return applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : packageName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.app.Dialog m478a(int r6, android.app.Activity r7, android.support.p000v4.app.Fragment r8, int r9, android.content.DialogInterface.OnCancelListener r10) {
        /*
            boolean r0 = com.google.android.gms.internal.C1831lc.m5520K(r7)
            r1 = 42
            if (r0 == 0) goto L_0x000c
            r0 = 2
            if (r6 != r0) goto L_0x000c
            r6 = r1
        L_0x000c:
            boolean r0 = com.google.android.gms.internal.C1840ll.m5541ij()
            r2 = 0
            if (r0 == 0) goto L_0x003c
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r3 = r7.getTheme()
            r4 = 16843529(0x1010309, float:2.3695736E-38)
            r5 = 1
            r3.resolveAttribute(r4, r0, r5)
            android.content.res.Resources r3 = r7.getResources()
            int r0 = r0.resourceId
            java.lang.String r0 = r3.getResourceEntryName(r0)
            java.lang.String r3 = "Theme.Dialog.Alert"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003c
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r3 = 5
            r0.<init>(r7, r3)
            goto L_0x003d
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 != 0) goto L_0x0044
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r7)
        L_0x0044:
            java.lang.String r3 = m486b((android.content.Context) r7, (int) r6)
            r0.setMessage(r3)
            if (r10 == 0) goto L_0x0050
            r0.setOnCancelListener(r10)
        L_0x0050:
            android.content.Intent r10 = m484aj(r6)
            if (r8 != 0) goto L_0x005c
            com.google.android.gms.internal.jh r8 = new com.google.android.gms.internal.jh
            r8.<init>((android.app.Activity) r7, (android.content.Intent) r10, (int) r9)
            goto L_0x0062
        L_0x005c:
            com.google.android.gms.internal.jh r3 = new com.google.android.gms.internal.jh
            r3.<init>((android.support.p000v4.app.Fragment) r8, (android.content.Intent) r10, (int) r9)
            r8 = r3
        L_0x0062:
            java.lang.String r7 = m491c(r7, r6)
            if (r7 == 0) goto L_0x006b
            r0.setPositiveButton(r7, r8)
        L_0x006b:
            if (r6 == r1) goto L_0x010c
            switch(r6) {
                case 0: goto L_0x010b;
                case 1: goto L_0x0100;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00e5;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00b5;
                case 9: goto L_0x00a3;
                case 10: goto L_0x0097;
                case 11: goto L_0x008b;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.String r7 = "GooglePlayServicesUtil"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unexpected error code "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.e(r7, r6)
            android.app.AlertDialog r6 = r0.create()
            return r6
        L_0x008b:
            java.lang.String r6 = "GooglePlayServicesUtil"
            java.lang.String r7 = "The application is not licensed to the user."
            android.util.Log.e(r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
        L_0x0097:
            java.lang.String r6 = "GooglePlayServicesUtil"
            java.lang.String r7 = "Developer error occurred. Please see logs for detailed information"
            android.util.Log.e(r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
        L_0x00a3:
            java.lang.String r6 = "GooglePlayServicesUtil"
            java.lang.String r7 = "Google Play services is invalid. Cannot recover."
            android.util.Log.e(r6, r7)
            int r6 = com.google.android.gms.C0530R.string.common_google_play_services_unsupported_title
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog r6 = r6.create()
            return r6
        L_0x00b5:
            java.lang.String r6 = "GooglePlayServicesUtil"
            java.lang.String r7 = "Internal error occurred. Please see logs for detailed information"
            android.util.Log.e(r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
        L_0x00c1:
            java.lang.String r6 = "GooglePlayServicesUtil"
            java.lang.String r7 = "Network error occurred. Please retry request later."
            android.util.Log.e(r6, r7)
            int r6 = com.google.android.gms.C0530R.string.common_google_play_services_network_error_title
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog r6 = r6.create()
            return r6
        L_0x00d3:
            java.lang.String r6 = "GooglePlayServicesUtil"
            java.lang.String r7 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r6, r7)
            int r6 = com.google.android.gms.C0530R.string.common_google_play_services_invalid_account_title
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog r6 = r6.create()
            return r6
        L_0x00e5:
            android.app.AlertDialog r6 = r0.create()
            return r6
        L_0x00ea:
            int r6 = com.google.android.gms.C0530R.string.common_google_play_services_enable_title
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog r6 = r6.create()
            return r6
        L_0x00f5:
            int r6 = com.google.android.gms.C0530R.string.common_google_play_services_update_title
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog r6 = r6.create()
            return r6
        L_0x0100:
            int r6 = com.google.android.gms.C0530R.string.common_google_play_services_install_title
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog r6 = r6.create()
            return r6
        L_0x010b:
            return r2
        L_0x010c:
            int r6 = com.google.android.gms.C0530R.string.common_android_wear_update_title
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog r6 = r6.create()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.m478a(int, android.app.Activity, android.support.v4.app.Fragment, int, android.content.DialogInterface$OnCancelListener):android.app.Dialog");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m479a(int i, Context context) {
        Notification notification;
        Resources resources = context.getResources();
        String d = m493d(context, i);
        String string = resources.getString(C0530R.string.common_google_play_services_error_notification_requested_by_msg, new Object[]{m477F(context)});
        PendingIntent errorPendingIntent = getErrorPendingIntent(i, context, 0);
        if (C1831lc.m5520K(context)) {
            C1785jx.m5353K(C1840ll.m5542ik());
            notification = new Notification.Builder(context).setSmallIcon(C0530R.C0531drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(d + " " + string)).addAction(C0530R.C0531drawable.common_full_open_on_phone, resources.getString(C0530R.string.common_open_on_phone), errorPendingIntent).build();
        } else {
            Notification notification2 = new Notification(17301642, resources.getString(C0530R.string.common_google_play_services_notification_ticker), System.currentTimeMillis());
            notification2.flags |= 16;
            notification2.setLatestEventInfo(context, d, string, errorPendingIntent);
            notification = notification2;
        }
        ((NotificationManager) context.getSystemService("notification")).notify(m485ak(i), notification);
    }

    /* renamed from: a */
    public static boolean m480a(PackageManager packageManager, PackageInfo packageInfo) {
        boolean z = false;
        if (packageInfo == null) {
            return false;
        }
        if (m492c(packageManager)) {
            return m482a(packageInfo, true) != null;
        }
        if (m482a(packageInfo, false) != null) {
            z = true;
        }
        if (!z && m482a(packageInfo, true) != null) {
            Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m481a(Resources resources) {
        if (resources == null) {
            return false;
        }
        return (C1840ll.m5538ig() && ((resources.getConfiguration().screenLayout & 15) > 3)) || m490b(resources);
    }

    /* renamed from: a */
    private static byte[] m482a(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        byte[] byteArray = packageInfo.signatures[0].toByteArray();
        if ((z ? C0697b.m619gu() : C0697b.m620gv()).contains(byteArray)) {
            return byteArray;
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m483a(PackageInfo packageInfo, byte[]... bArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        byte[] byteArray = packageInfo.signatures[0].toByteArray();
        for (byte[] bArr2 : bArr) {
            if (Arrays.equals(bArr2, byteArray)) {
                return bArr2;
            }
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
        }
        return null;
    }

    /* renamed from: aj */
    public static Intent m484aj(int i) {
        if (i == 42) {
            return C1765jo.m5243hE();
        }
        switch (i) {
            case 1:
            case 2:
                return C1765jo.m5242ba(GOOGLE_PLAY_SERVICES_PACKAGE);
            case 3:
                return C1765jo.m5240aY(GOOGLE_PLAY_SERVICES_PACKAGE);
            default:
                return null;
        }
    }

    /* renamed from: ak */
    private static int m485ak(int i) {
        return (i == 1 || i == 3) ? 10436 : 39789;
    }

    /* renamed from: b */
    public static String m486b(Context context, int i) {
        int i2;
        Resources resources = context.getResources();
        if (i == 5) {
            i2 = C0530R.string.common_google_play_services_invalid_account_text;
        } else if (i == 7) {
            i2 = C0530R.string.common_google_play_services_network_error_text;
        } else if (i == 9) {
            i2 = C0530R.string.common_google_play_services_unsupported_text;
        } else if (i != 42) {
            switch (i) {
                case 1:
                    if (!m481a(context.getResources())) {
                        i2 = C0530R.string.common_google_play_services_install_text_phone;
                        break;
                    } else {
                        i2 = C0530R.string.common_google_play_services_install_text_tablet;
                        break;
                    }
                case 2:
                    i2 = C0530R.string.common_google_play_services_update_text;
                    break;
                case 3:
                    i2 = C0530R.string.common_google_play_services_enable_text;
                    break;
                default:
                    i2 = C0530R.string.common_google_play_services_unknown_issue;
                    break;
            }
        } else {
            i2 = C0530R.string.common_android_wear_update_text;
        }
        return resources.getString(i2);
    }

    /* renamed from: b */
    public static boolean m488b(PackageManager packageManager) {
        synchronized (f616Jj) {
            if (f615Ji == -1) {
                try {
                    if (m483a(packageManager.getPackageInfo(GOOGLE_PLAY_SERVICES_PACKAGE, 64), C0697b.f759Jc[1]) != null) {
                        f615Ji = 1;
                    } else {
                        f615Ji = 0;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    f615Ji = 0;
                }
            }
        }
        return f615Ji != 0;
    }

    /* renamed from: b */
    public static boolean m489b(PackageManager packageManager, String str) {
        try {
            return m480a(packageManager, packageManager.getPackageInfo(str, 64));
        } catch (PackageManager.NameNotFoundException e) {
            if (!Log.isLoggable("GooglePlayServicesUtil", 3)) {
                return false;
            }
            Log.d("GooglePlayServicesUtil", "Package manager can't find package " + str + ", defaulting to false");
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m490b(Resources resources) {
        Configuration configuration = resources.getConfiguration();
        return C1840ll.m5540ii() && (configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600;
    }

    /* renamed from: c */
    public static String m491c(Context context, int i) {
        int i2;
        Resources resources = context.getResources();
        if (i != 42) {
            switch (i) {
                case 1:
                    i2 = C0530R.string.common_google_play_services_install_button;
                    break;
                case 2:
                    break;
                case 3:
                    i2 = C0530R.string.common_google_play_services_enable_button;
                    break;
                default:
                    i2 = 17039370;
                    break;
            }
        }
        i2 = C0530R.string.common_google_play_services_update_button;
        return resources.getString(i2);
    }

    /* renamed from: c */
    public static boolean m492c(PackageManager packageManager) {
        return m488b(packageManager) || !m495gw();
    }

    /* renamed from: d */
    public static String m493d(Context context, int i) {
        int i2;
        Resources resources = context.getResources();
        if (i == 5) {
            i2 = C0530R.string.common_google_play_services_invalid_account_text;
        } else if (i == 7) {
            i2 = C0530R.string.common_google_play_services_network_error_text;
        } else if (i == 9) {
            i2 = C0530R.string.common_google_play_services_unsupported_text;
        } else if (i != 42) {
            switch (i) {
                case 1:
                    i2 = C0530R.string.f70x8f024ee1;
                    break;
                case 2:
                    i2 = C0530R.string.common_google_play_services_notification_needs_update_title;
                    break;
                case 3:
                    i2 = C0530R.string.common_google_play_services_needs_enabling_title;
                    break;
                default:
                    i2 = C0530R.string.common_google_play_services_unknown_issue;
                    break;
            }
        } else {
            i2 = C0530R.string.common_android_wear_notification_needs_update_text;
        }
        return resources.getString(i2);
    }

    /* renamed from: e */
    public static boolean m494e(Context context, int i) {
        if (i != 1) {
            return false;
        }
        try {
            return context.getPackageManager().getApplicationInfo(GOOGLE_PLAY_SERVICES_PACKAGE, 8192).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m478a(i, activity, (Fragment) null, i2, onCancelListener);
    }

    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        Intent aj = m484aj(i);
        if (aj == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, aj, DriveFile.MODE_READ_ONLY);
    }

    public static String getErrorString(int i) {
        switch (i) {
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                return "UNKNOWN_ERROR_CODE";
        }
    }

    public static String getOpenSourceSoftwareLicenseInfo(Context context) {
        InputStream openInputStream;
        try {
            openInputStream = context.getContentResolver().openInputStream(new Uri.Builder().scheme("android.resource").authority(GOOGLE_PLAY_SERVICES_PACKAGE).appendPath("raw").appendPath("oss_notice").build());
            String next = new Scanner(openInputStream).useDelimiter("\\A").next();
            if (openInputStream != null) {
                openInputStream.close();
            }
            return next;
        } catch (NoSuchElementException e) {
            if (openInputStream != null) {
                openInputStream.close();
            }
            return null;
        } catch (Exception e2) {
            return null;
        } catch (Throwable th) {
            if (openInputStream != null) {
                openInputStream.close();
            }
            throw th;
        }
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext(GOOGLE_PLAY_SERVICES_PACKAGE, 3);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication(GOOGLE_PLAY_SERVICES_PACKAGE);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: gw */
    public static boolean m495gw() {
        return f613Jg ? f614Jh : "user".equals(Build.TYPE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (m483a(r2, com.google.android.gms.common.C0697b.f754Ix) == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (m483a(r2, r3) == null) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int isGooglePlayServicesAvailable(android.content.Context r11) {
        /*
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            boolean r1 = com.google.android.gms.internal.C1743jf.f3878Mv
            if (r1 != 0) goto L_0x001a
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ Throwable -> 0x0012 }
            int r2 = com.google.android.gms.C0530R.string.common_google_play_services_unknown_issue     // Catch:{ Throwable -> 0x0012 }
            r1.getString(r2)     // Catch:{ Throwable -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            r1 = move-exception
            java.lang.String r1 = "GooglePlayServicesUtil"
            java.lang.String r2 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r1, r2)
        L_0x001a:
            boolean r1 = com.google.android.gms.internal.C1743jf.f3878Mv
            if (r1 != 0) goto L_0x0021
            m475D(r11)
        L_0x0021:
            r1 = 1
            java.lang.String r2 = "com.google.android.gms"
            r3 = 64
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0117 }
            int r4 = r2.versionCode
            boolean r4 = com.google.android.gms.internal.C1831lc.m5523aU(r4)
            r5 = 2
            r6 = 3
            r7 = 0
            r8 = 9
            if (r4 == 0) goto L_0x009f
            boolean r4 = m495gw()
            r4 = r4 ^ r1
            byte[][] r9 = new byte[r6][]
            byte[][] r10 = com.google.android.gms.common.C0697b.f754Ix
            r10 = r10[r4]
            r9[r7] = r10
            byte[][] r10 = com.google.android.gms.common.C0697b.f732IE
            r10 = r10[r4]
            r9[r1] = r10
            byte[][] r10 = com.google.android.gms.common.C0697b.f731IC
            r4 = r10[r4]
            r9[r5] = r4
            byte[] r4 = m483a((android.content.pm.PackageInfo) r2, (byte[][]) r9)
            if (r4 != 0) goto L_0x005e
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play Services signature invalid on Glass."
        L_0x005a:
            android.util.Log.w(r0, r1)
            return r8
        L_0x005e:
            java.lang.String r4 = r11.getPackageName()
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x008a }
            boolean r9 = m480a((android.content.pm.PackageManager) r0, (android.content.pm.PackageInfo) r3)     // Catch:{ NameNotFoundException -> 0x008a }
            if (r9 != 0) goto L_0x00d0
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x008a }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r2 = "Calling package "
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r2 = r3.packageName     // Catch:{ NameNotFoundException -> 0x008a }
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r2 = " signature invalid on Glass."
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x008a }
            android.util.Log.w(r0, r1)     // Catch:{ NameNotFoundException -> 0x008a }
            return r8
        L_0x008a:
            r0 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not get info for calling package: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x005a
        L_0x009f:
            boolean r4 = com.google.android.gms.internal.C1831lc.m5520K(r11)
            if (r4 == 0) goto L_0x00b2
            byte[][] r3 = com.google.android.gms.common.C0697b.f754Ix
            byte[] r3 = m483a((android.content.pm.PackageInfo) r2, (byte[][]) r3)
            if (r3 != 0) goto L_0x00d0
        L_0x00ad:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play services signature invalid."
            goto L_0x005a
        L_0x00b2:
            java.lang.String r4 = "com.android.vending"
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x0110 }
            byte[][] r4 = com.google.android.gms.common.C0697b.f754Ix
            byte[] r3 = m483a((android.content.pm.PackageInfo) r3, (byte[][]) r4)
            if (r3 != 0) goto L_0x00c5
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play Store signature invalid."
            goto L_0x005a
        L_0x00c5:
            byte[][] r4 = new byte[r1][]
            r4[r7] = r3
            byte[] r3 = m483a((android.content.pm.PackageInfo) r2, (byte[][]) r4)
            if (r3 != 0) goto L_0x00d0
            goto L_0x00ad
        L_0x00d0:
            r3 = 6587000(0x648278, float:9.230353E-39)
            int r3 = com.google.android.gms.internal.C1831lc.m5521aS(r3)
            int r4 = r2.versionCode
            int r4 = com.google.android.gms.internal.C1831lc.m5521aS(r4)
            if (r4 >= r3) goto L_0x00f8
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Google Play services out of date.  Requires 6587000 but found "
            r1.append(r3)
            int r2 = r2.versionCode
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            return r5
        L_0x00f8:
            java.lang.String r2 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r7)     // Catch:{ NameNotFoundException -> 0x0104 }
            boolean r0 = r0.enabled
            if (r0 != 0) goto L_0x0103
            return r6
        L_0x0103:
            return r7
        L_0x0104:
            r0 = move-exception
            java.lang.String r2 = "GooglePlayServicesUtil"
            java.lang.String r3 = "Google Play services missing when getting application info."
            android.util.Log.wtf(r2, r3)
            r0.printStackTrace()
            return r1
        L_0x0110:
            r0 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play Store is missing."
            goto L_0x005a
        L_0x0117:
            r0 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r2 = "Google Play services is missing."
            android.util.Log.w(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(android.content.Context):int");
    }

    public static boolean isGoogleSignedUid(PackageManager packageManager, int i) {
        if (packageManager == null) {
            throw new SecurityException("Unknown error: invalid Package Manager");
        }
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid.length != 0 && m489b(packageManager, packagesForUid[0])) {
            return true;
        }
        throw new SecurityException("Uid is not Google Signed");
    }

    public static boolean isUserRecoverableError(int i) {
        if (i == 9) {
            return true;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, (Fragment) null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = m478a(i, activity, fragment, i2, onCancelListener);
        boolean z = false;
        if (a == null) {
            return false;
        }
        try {
            z = activity instanceof FragmentActivity;
        } catch (NoClassDefFoundError e) {
        }
        if (z) {
            SupportErrorDialogFragment.newInstance(a, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), GMS_ERROR_DIALOG);
            return true;
        } else if (C1840ll.m5538ig()) {
            ErrorDialogFragment.newInstance(a, onCancelListener).show(activity.getFragmentManager(), GMS_ERROR_DIALOG);
            return true;
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public static void showErrorNotification(int i, Context context) {
        if (C1831lc.m5520K(context) && i == 2) {
            i = 42;
        }
        if (m494e(context, i)) {
            m476E(context);
        } else {
            m479a(i, context);
        }
    }
}
