package com.google.android.gms.appindexing;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.C1781jv;
import java.util.List;

public final class AndroidAppUri {
    private final Uri mUri;

    private AndroidAppUri(Uri uri) {
        this.mUri = uri;
    }

    /* renamed from: a */
    private static boolean m335a(AndroidAppUri androidAppUri) {
        if (!"android-app".equals(androidAppUri.mUri.getScheme())) {
            throw new IllegalArgumentException("android-app scheme is required.");
        } else if (TextUtils.isEmpty(androidAppUri.getPackageName())) {
            throw new IllegalArgumentException("Package name is empty.");
        } else {
            if (androidAppUri.mUri.equals(newAndroidAppUri(androidAppUri.getPackageName(), androidAppUri.getDeepLinkUri()).toUri())) {
                return true;
            }
            throw new IllegalArgumentException("URI is not canonical.");
        }
    }

    public static AndroidAppUri newAndroidAppUri(Uri uri) {
        AndroidAppUri androidAppUri = new AndroidAppUri(uri);
        if (m335a(androidAppUri)) {
            return androidAppUri;
        }
        throw new IllegalArgumentException("AndroidAppUri validation failed.");
    }

    public static AndroidAppUri newAndroidAppUri(String str, Uri uri) {
        Uri.Builder authority = new Uri.Builder().scheme("android-app").authority(str);
        if (uri != null) {
            authority.appendPath(uri.getScheme());
            if (uri.getAuthority() != null) {
                authority.appendPath(uri.getAuthority());
            }
            for (String appendPath : uri.getPathSegments()) {
                authority.appendPath(appendPath);
            }
            authority.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        }
        return new AndroidAppUri(authority.build());
    }

    public boolean equals(Object obj) {
        if (obj instanceof AndroidAppUri) {
            return this.mUri.equals(((AndroidAppUri) obj).mUri);
        }
        return false;
    }

    public Uri getDeepLinkUri() {
        List<String> pathSegments = this.mUri.getPathSegments();
        if (pathSegments.size() <= 0) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(pathSegments.get(0));
        if (pathSegments.size() > 1) {
            builder.authority(pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath(pathSegments.get(i));
            }
        }
        builder.encodedQuery(this.mUri.getEncodedQuery());
        builder.encodedFragment(this.mUri.getEncodedFragment());
        return builder.build();
    }

    public String getPackageName() {
        return this.mUri.getAuthority();
    }

    public int hashCode() {
        return C1781jv.hashCode(this.mUri);
    }

    public String toString() {
        return this.mUri.toString();
    }

    public Uri toUri() {
        return this.mUri;
    }
}
