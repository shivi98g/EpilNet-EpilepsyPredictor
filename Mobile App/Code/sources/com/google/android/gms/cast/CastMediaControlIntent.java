package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.C1706in;
import java.util.Collection;
import java.util.Locale;

public final class CastMediaControlIntent {
    public static final String ACTION_SYNC_STATUS = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
    @Deprecated
    public static final String CATEGORY_CAST = "com.google.android.gms.cast.CATEGORY_CAST";
    public static final String DEFAULT_MEDIA_RECEIVER_APPLICATION_ID = "CC1AD845";
    public static final int ERROR_CODE_REQUEST_FAILED = 1;
    public static final int ERROR_CODE_SESSION_START_FAILED = 2;
    public static final int ERROR_CODE_TEMPORARILY_DISCONNECTED = 3;
    public static final String EXTRA_CAST_APPLICATION_ID = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
    public static final String EXTRA_CAST_LANGUAGE_CODE = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
    public static final String EXTRA_CAST_RELAUNCH_APPLICATION = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
    public static final String EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
    public static final String EXTRA_CUSTOM_DATA = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
    public static final String EXTRA_DEBUG_LOGGING_ENABLED = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
    public static final String EXTRA_ERROR_CODE = "com.google.android.gms.cast.EXTRA_ERROR_CODE";

    private CastMediaControlIntent() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m408a(java.lang.String r3, java.lang.String r4, java.util.Collection<java.lang.String> r5) throws java.lang.IllegalArgumentException {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r3)
            if (r4 == 0) goto L_0x0032
            java.lang.String r3 = r4.toUpperCase()
            java.lang.String r1 = "[A-F0-9]+"
            boolean r1 = r3.matches(r1)
            if (r1 != 0) goto L_0x002a
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Invalid application ID: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x002a:
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r3)
        L_0x0032:
            if (r5 == 0) goto L_0x0081
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x0042
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Must specify at least one namespace"
            r3.<init>(r4)
            throw r3
        L_0x0042:
            java.util.Iterator r3 = r5.iterator()
        L_0x0046:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0064
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
        L_0x0064:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Namespaces must not be null or empty"
            r3.<init>(r4)
            throw r3
        L_0x006c:
            if (r4 != 0) goto L_0x0073
            java.lang.String r3 = "/"
            r0.append(r3)
        L_0x0073:
            java.lang.String r3 = "/"
            r0.append(r3)
            java.lang.String r3 = ","
            java.lang.String r3 = android.text.TextUtils.join(r3, r5)
            r0.append(r3)
        L_0x0081:
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastMediaControlIntent.m408a(java.lang.String, java.lang.String, java.util.Collection):java.lang.String");
    }

    public static String categoryForCast(String str) throws IllegalArgumentException {
        if (str != null) {
            return m408a(CATEGORY_CAST, str, (Collection<String>) null);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String categoryForCast(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else if (collection != null) {
            return m408a(CATEGORY_CAST, str, collection);
        } else {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
    }

    public static String categoryForCast(Collection<String> collection) throws IllegalArgumentException {
        if (collection != null) {
            return m408a(CATEGORY_CAST, (String) null, collection);
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }

    public static String categoryForRemotePlayback() {
        return m408a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", (String) null, (Collection<String>) null);
    }

    public static String categoryForRemotePlayback(String str) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            return m408a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", str, (Collection<String>) null);
        }
        throw new IllegalArgumentException("applicationId cannot be null or empty");
    }

    public static String languageTagForLocale(Locale locale) {
        return C1706in.m5035b(locale);
    }
}
