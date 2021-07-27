package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

@C1507ey
/* renamed from: com.google.android.gms.internal.gz */
public class C1625gz extends WebViewClient {

    /* renamed from: mo */
    private final C1610gu f3597mo;

    /* renamed from: xr */
    private final String f3598xr;

    /* renamed from: xs */
    private boolean f3599xs = false;

    /* renamed from: xt */
    private final C1529fb f3600xt;

    public C1625gz(C1529fb fbVar, C1610gu guVar, String str) {
        this.f3598xr = m4766Z(str);
        this.f3597mo = guVar;
        this.f3600xt = fbVar;
    }

    /* renamed from: Z */
    private String m4766Z(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.endsWith("/")) {
                return str.substring(0, str.length() - 1);
            }
        } catch (IndexOutOfBoundsException e) {
            C1607gr.m4706T(e.getMessage());
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public boolean mo15485Y(String str) {
        String Z = m4766Z(str);
        if (TextUtils.isEmpty(Z)) {
            return false;
        }
        try {
            URI uri = new URI(Z);
            if ("passback".equals(uri.getScheme())) {
                C1607gr.m4705S("Passback received");
                this.f3600xt.mo15269cG();
                return true;
            }
            if (!TextUtils.isEmpty(this.f3598xr)) {
                URI uri2 = new URI(this.f3598xr);
                String host = uri2.getHost();
                String host2 = uri.getHost();
                String path = uri2.getPath();
                String path2 = uri.getPath();
                if (C1781jv.equal(host, host2) && C1781jv.equal(path, path2)) {
                    C1607gr.m4705S("Passback received");
                    this.f3600xt.mo15269cG();
                    return true;
                }
            }
            return false;
        } catch (URISyntaxException e) {
            C1607gr.m4706T(e.getMessage());
        }
    }

    public void onLoadResource(WebView webView, String str) {
        C1607gr.m4705S("JavascriptAdWebViewClient::onLoadResource: " + str);
        if (!mo15485Y(str)) {
            this.f3597mo.mo15426dD().onLoadResource(this.f3597mo, str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        C1607gr.m4705S("JavascriptAdWebViewClient::onPageFinished: " + str);
        if (!this.f3599xs) {
            this.f3600xt.mo15268cF();
            this.f3599xs = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C1607gr.m4705S("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + str);
        if (!mo15485Y(str)) {
            return this.f3597mo.mo15426dD().shouldOverrideUrlLoading(this.f3597mo, str);
        }
        C1607gr.m4705S("shouldOverrideUrlLoading: received passback url");
        return true;
    }
}
