package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

@C1507ey
/* renamed from: com.google.android.gms.internal.go */
public final class C1604go {
    /* renamed from: a */
    public static void m4694a(Context context, WebSettings webSettings) {
        C1599gm.m4681a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    public static String getDefaultUserAgent(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }
}
