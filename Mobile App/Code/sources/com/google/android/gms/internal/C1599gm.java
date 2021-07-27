package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;

@C1507ey
/* renamed from: com.google.android.gms.internal.gm */
public final class C1599gm {
    /* renamed from: a */
    public static void m4681a(Context context, WebSettings webSettings) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            webSettings.setAppCachePath(cacheDir.getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
    }

    /* renamed from: a */
    public static void m4682a(Window window) {
        window.setFlags(16777216, 16777216);
    }

    /* renamed from: a */
    public static void m4683a(WebView webView) {
        webView.onPause();
    }

    /* renamed from: b */
    public static void m4684b(WebView webView) {
        webView.onResume();
    }

    /* renamed from: i */
    public static void m4685i(View view) {
        view.setLayerType(1, (Paint) null);
    }

    /* renamed from: j */
    public static void m4686j(View view) {
        view.setLayerType(0, (Paint) null);
    }
}
