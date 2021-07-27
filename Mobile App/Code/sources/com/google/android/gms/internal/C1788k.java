package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.k */
public class C1788k {

    /* renamed from: kU */
    private String f3949kU = "googleads.g.doubleclick.net";

    /* renamed from: kV */
    private String f3950kV = "/pagead/ads";

    /* renamed from: kW */
    private String f3951kW = "ad.doubleclick.net";

    /* renamed from: kX */
    private String[] f3952kX = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: kY */
    private C1578g f3953kY;

    public C1788k(C1578g gVar) {
        this.f3953kY = gVar;
    }

    /* renamed from: a */
    private Uri m5374a(Uri uri, Context context, String str, boolean z) throws C1828l {
        try {
            boolean a = mo15946a(uri);
            if (a) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new C1828l("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new C1828l("Query parameter already exists: ms");
            }
            String a2 = z ? this.f3953kY.mo15350a(context, str) : this.f3953kY.mo15349a(context);
            return a ? m5376b(uri, "dc_ms", a2) : m5375a(uri, "ms", a2);
        } catch (UnsupportedOperationException e) {
            throw new C1828l("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    private Uri m5375a(Uri uri, String str, String str2) throws UnsupportedOperationException {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    /* renamed from: b */
    private Uri m5376b(Uri uri, String str, String str2) {
        String str3;
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf(";adurl");
        if (indexOf != -1) {
            int i = indexOf + 1;
            str3 = uri2.substring(0, i) + str + "=" + str2 + ";" + uri2.substring(i);
        } else {
            String encodedPath = uri.getEncodedPath();
            int indexOf2 = uri2.indexOf(encodedPath);
            str3 = uri2.substring(0, encodedPath.length() + indexOf2) + ";" + str + "=" + str2 + ";" + uri2.substring(indexOf2 + encodedPath.length());
        }
        return Uri.parse(str3);
    }

    /* renamed from: C */
    public C1578g mo15943C() {
        return this.f3953kY;
    }

    /* renamed from: a */
    public Uri mo15944a(Uri uri, Context context) throws C1828l {
        try {
            return m5374a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new C1828l("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public void mo15945a(MotionEvent motionEvent) {
        this.f3953kY.mo15352a(motionEvent);
    }

    /* renamed from: a */
    public boolean mo15946a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f3951kW);
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo15947b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f3952kX) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
