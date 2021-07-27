package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

/* renamed from: com.google.android.gms.tagmanager.db */
class C2581db implements C2466ab {
    private final String atQ = mo18827a("GoogleTagManager", "4.00", Build.VERSION.RELEASE, m7500c(Locale.getDefault()), Build.MODEL, Build.ID);
    private final HttpClient atR;
    private C2582a atS;
    private final Context atz;

    /* renamed from: com.google.android.gms.tagmanager.db$a */
    public interface C2582a {
        /* renamed from: a */
        void mo18718a(C2480ap apVar);

        /* renamed from: b */
        void mo18719b(C2480ap apVar);

        /* renamed from: c */
        void mo18720c(C2480ap apVar);
    }

    C2581db(HttpClient httpClient, Context context, C2582a aVar) {
        this.atz = context.getApplicationContext();
        this.atR = httpClient;
        this.atS = aVar;
    }

    /* renamed from: a */
    private HttpEntityEnclosingRequest m7498a(URL url) {
        BasicHttpEntityEnclosingRequest basicHttpEntityEnclosingRequest;
        try {
            basicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest("GET", url.toURI().toString());
            try {
                basicHttpEntityEnclosingRequest.addHeader("User-Agent", this.atQ);
                return basicHttpEntityEnclosingRequest;
            } catch (URISyntaxException e) {
                e = e;
                C2504bh.m7246W("Exception sending hit: " + e.getClass().getSimpleName());
                C2504bh.m7246W(e.getMessage());
                return basicHttpEntityEnclosingRequest;
            }
        } catch (URISyntaxException e2) {
            e = e2;
            basicHttpEntityEnclosingRequest = null;
            C2504bh.m7246W("Exception sending hit: " + e.getClass().getSimpleName());
            C2504bh.m7246W(e.getMessage());
            return basicHttpEntityEnclosingRequest;
        }
    }

    /* renamed from: a */
    private void m7499a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        int available;
        StringBuffer stringBuffer = new StringBuffer();
        for (Header obj : httpEntityEnclosingRequest.getAllHeaders()) {
            stringBuffer.append(obj.toString());
            stringBuffer.append("\n");
        }
        stringBuffer.append(httpEntityEnclosingRequest.getRequestLine().toString());
        stringBuffer.append("\n");
        if (httpEntityEnclosingRequest.getEntity() != null) {
            try {
                InputStream content = httpEntityEnclosingRequest.getEntity().getContent();
                if (content != null && (available = content.available()) > 0) {
                    byte[] bArr = new byte[available];
                    content.read(bArr);
                    stringBuffer.append("POST:\n");
                    stringBuffer.append(new String(bArr));
                    stringBuffer.append("\n");
                }
            } catch (IOException e) {
                C2504bh.m7245V("Error Writing hit to log...");
            }
        }
        C2504bh.m7245V(stringBuffer.toString());
    }

    /* renamed from: c */
    static String m7500c(Locale locale) {
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage().toLowerCase());
        if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase());
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo18827a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public URL mo18828d(C2480ap apVar) {
        try {
            return new URL(apVar.mo18653pL());
        } catch (MalformedURLException e) {
            C2504bh.m7243T("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* renamed from: ea */
    public boolean mo18637ea() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.atz.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        C2504bh.m7245V("...no network connectivity");
        return false;
    }

    /* renamed from: k */
    public void mo18638k(List<C2480ap> list) {
        String str;
        int min = Math.min(list.size(), 40);
        boolean z = true;
        for (int i = 0; i < min; i++) {
            C2480ap apVar = list.get(i);
            URL d = mo18828d(apVar);
            if (d == null) {
                str = "No destination: discarding hit.";
            } else {
                HttpEntityEnclosingRequest a = m7498a(d);
                if (a != null) {
                    HttpHost httpHost = new HttpHost(d.getHost(), d.getPort(), d.getProtocol());
                    a.addHeader("Host", httpHost.toHostString());
                    m7499a(a);
                    if (z) {
                        try {
                            C2511bo.m7266aa(this.atz);
                            z = false;
                        } catch (ClientProtocolException e) {
                            str = "ClientProtocolException sending hit; discarding hit...";
                        } catch (IOException e2) {
                            C2504bh.m7246W("Exception sending hit: " + e2.getClass().getSimpleName());
                            C2504bh.m7246W(e2.getMessage());
                            this.atS.mo18720c(apVar);
                        }
                    }
                    HttpResponse execute = this.atR.execute(httpHost, a);
                    int statusCode = execute.getStatusLine().getStatusCode();
                    HttpEntity entity = execute.getEntity();
                    if (entity != null) {
                        entity.consumeContent();
                    }
                    if (statusCode != 200) {
                        C2504bh.m7246W("Bad response: " + execute.getStatusLine().getStatusCode());
                        this.atS.mo18720c(apVar);
                    } else {
                        this.atS.mo18718a(apVar);
                    }
                }
                this.atS.mo18719b(apVar);
            }
            C2504bh.m7246W(str);
            this.atS.mo18719b(apVar);
        }
    }
}
