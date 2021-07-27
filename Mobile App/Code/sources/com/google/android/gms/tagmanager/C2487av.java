package com.google.android.gms.tagmanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* renamed from: com.google.android.gms.tagmanager.av */
class C2487av implements C2509bm {
    private HttpClient arD;

    C2487av() {
    }

    /* renamed from: a */
    private InputStream m7207a(HttpClient httpClient, HttpResponse httpResponse) throws IOException {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            C2504bh.m7245V("Success response");
            return httpResponse.getEntity().getContent();
        }
        String str = "Bad response: " + statusCode;
        if (statusCode == 404) {
            throw new FileNotFoundException(str);
        }
        throw new IOException(str);
    }

    /* renamed from: a */
    private void m7208a(HttpClient httpClient) {
        if (httpClient != null && httpClient.getConnectionManager() != null) {
            httpClient.getConnectionManager().shutdown();
        }
    }

    /* renamed from: cF */
    public InputStream mo18663cF(String str) throws IOException {
        this.arD = mo18665pM();
        return m7207a(this.arD, this.arD.execute(new HttpGet(str)));
    }

    public void close() {
        m7208a(this.arD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pM */
    public HttpClient mo18665pM() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
        return new DefaultHttpClient(basicHttpParams);
    }
}
