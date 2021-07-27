package com.google.android.gms.tagmanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.tagmanager.aw */
class C2488aw implements C2509bm {
    private HttpURLConnection arE;

    C2488aw() {
    }

    /* renamed from: a */
    private InputStream m7211a(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return httpURLConnection.getInputStream();
        }
        String str = "Bad response: " + responseCode;
        if (responseCode == 404) {
            throw new FileNotFoundException(str);
        }
        throw new IOException(str);
    }

    /* renamed from: b */
    private void m7212b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: cF */
    public InputStream mo18663cF(String str) throws IOException {
        this.arE = mo18666cG(str);
        return m7211a(this.arE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cG */
    public HttpURLConnection mo18666cG(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        return httpURLConnection;
    }

    public void close() {
        m7212b(this.arE);
    }
}
