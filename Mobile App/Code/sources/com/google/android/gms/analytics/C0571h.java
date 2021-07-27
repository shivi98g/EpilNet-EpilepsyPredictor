package com.google.android.gms.analytics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

/* renamed from: com.google.android.gms.analytics.h */
public class C0571h implements C0584r {
    private final Context mContext;

    /* renamed from: wl */
    private final String f246wl;

    /* renamed from: yf */
    private final HttpClient f247yf;

    /* renamed from: yg */
    private URL f248yg;

    /* renamed from: yh */
    private int f249yh;

    /* renamed from: yi */
    private int f250yi;

    /* renamed from: yj */
    private int f251yj;

    /* renamed from: yk */
    private String f252yk;

    /* renamed from: yl */
    private String f253yl;

    /* renamed from: ym */
    private C0573i f254ym;

    /* renamed from: yn */
    private C0577l f255yn;

    /* renamed from: yo */
    private Set<Integer> f256yo = new HashSet();

    /* renamed from: yp */
    private boolean f257yp = false;

    /* renamed from: yq */
    private long f258yq;

    /* renamed from: yr */
    private long f259yr;

    /* renamed from: ys */
    private C0581o f260ys;

    /* renamed from: yt */
    private volatile boolean f261yt = false;

    /* renamed from: com.google.android.gms.analytics.h$1 */
    static /* synthetic */ class C05721 {

        /* renamed from: yu */
        static final /* synthetic */ int[] f262yu = new int[C0577l.values().length];

        static {
            f263yv = new int[C0573i.values().length];
            try {
                f263yv[C0573i.BATCH_BY_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f263yv[C0573i.BATCH_BY_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f263yv[C0573i.BATCH_BY_SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f263yv[C0573i.BATCH_BY_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f263yv[C0573i.BATCH_BY_BRUTE_FORCE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f262yu[C0577l.GZIP.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f262yu[C0577l.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    C0571h(HttpClient httpClient, Context context, C0581o oVar) {
        this.mContext = context.getApplicationContext();
        this.f260ys = oVar;
        this.f246wl = mo10455a("GoogleAnalytics", "4.0", Build.VERSION.RELEASE, C0561an.m162a(Locale.getDefault()), Build.MODEL, Build.ID);
        this.f247yf = httpClient;
    }

    /* renamed from: a */
    private String m198a(C0547ab abVar, List<String> list, C0573i iVar) {
        if (iVar == C0573i.NONE) {
            return TextUtils.isEmpty((abVar.mo10349fa() == null || abVar.mo10349fa().length() == 0) ? "" : abVar.mo10349fa()) ? "" : C0548ac.m100a(abVar, System.currentTimeMillis());
        }
        String str = "";
        for (String next : list) {
            if (next.length() != 0) {
                if (str.length() != 0) {
                    str = str + "\n";
                }
                str = str + next;
            }
        }
        return str;
    }

    /* renamed from: a */
    private URL m199a(C0547ab abVar) {
        if (this.f248yg != null) {
            return this.f248yg;
        }
        try {
            return new URL("http:".equals(abVar.mo10352fd()) ? "http://www.google-analytics.com/collect" : "https://ssl.google-analytics.com/collect");
        } catch (MalformedURLException e) {
            C0550ae.m103T("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
    }

    /* renamed from: a */
    private void m200a(C0551af afVar, HttpHost httpHost, C0573i iVar, C0577l lVar) {
        HttpHost httpHost2;
        afVar.mo10356g("_bs", iVar.toString());
        afVar.mo10356g("_cs", lVar.toString());
        String fg = afVar.mo10355fg();
        if (!TextUtils.isEmpty(fg)) {
            if (httpHost == null) {
                try {
                    URL url = new URL("https://ssl.google-analytics.com");
                    httpHost2 = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
                } catch (MalformedURLException e) {
                    return;
                }
            } else {
                httpHost2 = httpHost;
            }
            m202a(fg, httpHost2, 1, afVar, C0577l.NONE);
        }
    }

    /* renamed from: a */
    private void m201a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
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
                C0550ae.m106W("Error Writing hit to log...");
            }
        }
        C0550ae.m104U(stringBuffer.toString());
    }

    /* renamed from: a */
    private boolean m202a(String str, HttpHost httpHost, int i, C0551af afVar, C0577l lVar) {
        String str2;
        int i2;
        int i3;
        String str3;
        boolean z = i > 1;
        if (str.getBytes().length > this.f251yj || str.getBytes().length > this.f250yi) {
            str2 = "Request too long (> " + Math.min(this.f250yi, this.f251yj) + " bytes)--not sent";
        } else if (this.f261yt) {
            C0550ae.m104U("Dry run enabled. Hit not actually sent.");
            return true;
        } else {
            HttpEntityEnclosingRequest d = m203d(str, z);
            if (d == null) {
                return true;
            }
            if (d.getRequestLine().getMethod().equals("GET")) {
                int length = str.getBytes().length;
                i2 = str.getBytes().length;
                i3 = length;
            } else {
                try {
                    if (C05721.f262yu[lVar.ordinal()] != 1) {
                        i2 = str.getBytes().length;
                        d.setEntity(new StringEntity(str));
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        gZIPOutputStream.write(str.getBytes());
                        gZIPOutputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        d.setEntity(new ByteArrayEntity(byteArray));
                        d.addHeader("Content-Encoding", "gzip");
                        i2 = byteArray.length + 0;
                    }
                    i3 = str.getBytes().length;
                } catch (UnsupportedEncodingException e) {
                    str3 = "Encoding error, hit will be discarded";
                    C0550ae.m103T(str3);
                    return true;
                } catch (IOException e2) {
                    C0550ae.m103T("Unexpected IOException: " + e2.getMessage());
                    str3 = "Request will be discarded";
                    C0550ae.m103T(str3);
                    return true;
                }
            }
            d.addHeader("Host", httpHost.toHostString());
            if (C0550ae.m107ff()) {
                m201a(d);
            }
            try {
                HttpResponse execute = this.f247yf.execute(httpHost, d);
                afVar.mo10354e("_td", i3);
                afVar.mo10354e("_cd", i2);
                int statusCode = execute.getStatusLine().getStatusCode();
                HttpEntity entity = execute.getEntity();
                if (entity != null) {
                    entity.consumeContent();
                }
                if (statusCode != 200) {
                    if (!z || !this.f256yo.contains(Integer.valueOf(statusCode))) {
                        C0550ae.m106W("Bad response: " + execute.getStatusLine().getStatusCode());
                        return true;
                    }
                    C0550ae.m104U("Falling back to single hit per request mode.");
                    this.f257yp = true;
                    this.f258yq = System.currentTimeMillis();
                    return false;
                }
            } catch (ClientProtocolException e3) {
                str2 = "ClientProtocolException sending hit; discarding hit...";
            } catch (IOException e4) {
                C0550ae.m106W("Exception sending hit: " + e4.getClass().getSimpleName());
                C0550ae.m106W(e4.getMessage());
                return false;
            }
            return true;
        }
        C0550ae.m106W(str2);
        return true;
    }

    /* renamed from: d */
    private HttpEntityEnclosingRequest m203d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            System.out.println("Empty hit, discarding.");
            return null;
        }
        String str2 = this.f252yk + "?" + str;
        BasicHttpEntityEnclosingRequest basicHttpEntityEnclosingRequest = (str2.length() >= this.f249yh || z) ? z ? new BasicHttpEntityEnclosingRequest("POST", this.f253yl) : new BasicHttpEntityEnclosingRequest("POST", this.f252yk) : new BasicHttpEntityEnclosingRequest("GET", str2);
        basicHttpEntityEnclosingRequest.addHeader("User-Agent", this.f246wl);
        return basicHttpEntityEnclosingRequest;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10453a(List<C0547ab> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        if (i > list.size()) {
            i = list.size();
        }
        long j = 0;
        for (int i2 = i - 1; i2 > 0; i2--) {
            long fc = list.get(i2 - 1).mo10351fc();
            long fc2 = list.get(i2).mo10351fc();
            if (!(fc == 0 || fc2 == 0)) {
                long j2 = fc2 - fc;
                if (j2 > j) {
                    i = i2;
                    j = j2;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a0, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b0, code lost:
        if (r9 >= r1.size()) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b2, code lost:
        r1 = r1.subList(r0, r9);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo10454a(java.util.List<com.google.android.gms.analytics.C0547ab> r23, com.google.android.gms.analytics.C0551af r24, boolean r25) {
        /*
            r22 = this;
            r6 = r22
            r7 = r23
            r8 = r24
            com.google.android.gms.analytics.o r0 = r6.f260ys
            int r0 = r0.mo10460eb()
            r6.f249yh = r0
            com.google.android.gms.analytics.o r0 = r6.f260ys
            int r0 = r0.mo10461ec()
            r6.f250yi = r0
            com.google.android.gms.analytics.o r0 = r6.f260ys
            int r0 = r0.mo10462ed()
            r6.f251yj = r0
            com.google.android.gms.analytics.o r0 = r6.f260ys
            int r0 = r0.mo10463ee()
            com.google.android.gms.analytics.o r1 = r6.f260ys
            java.lang.String r1 = r1.mo10465eg()
            r6.f252yk = r1
            com.google.android.gms.analytics.o r1 = r6.f260ys
            java.lang.String r1 = r1.mo10466eh()
            r6.f253yl = r1
            com.google.android.gms.analytics.o r1 = r6.f260ys
            com.google.android.gms.analytics.i r1 = r1.mo10467ei()
            r6.f254ym = r1
            com.google.android.gms.analytics.o r1 = r6.f260ys
            com.google.android.gms.analytics.l r1 = r1.mo10468ej()
            r6.f255yn = r1
            java.util.Set<java.lang.Integer> r1 = r6.f256yo
            r1.clear()
            java.util.Set<java.lang.Integer> r1 = r6.f256yo
            com.google.android.gms.analytics.o r2 = r6.f260ys
            java.util.Set r2 = r2.mo10469ek()
            r1.addAll(r2)
            com.google.android.gms.analytics.o r1 = r6.f260ys
            long r1 = r1.mo10464ef()
            r6.f259yr = r1
            boolean r1 = r6.f257yp
            r9 = 1
            if (r1 != 0) goto L_0x0071
            java.util.Set<java.lang.Integer> r1 = r6.f256yo
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0071
            r6.f257yp = r9
            long r1 = java.lang.System.currentTimeMillis()
            r6.f258yq = r1
        L_0x0071:
            boolean r1 = r6.f257yp
            r2 = 0
            if (r1 == 0) goto L_0x0088
            long r3 = java.lang.System.currentTimeMillis()
            long r10 = r6.f258yq
            long r3 = r3 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            long r12 = r6.f259yr
            long r10 = r10 * r12
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0088
            r6.f257yp = r2
        L_0x0088:
            boolean r1 = r6.f257yp
            if (r1 == 0) goto L_0x0093
            com.google.android.gms.analytics.i r1 = com.google.android.gms.analytics.C0573i.NONE
            com.google.android.gms.analytics.l r3 = com.google.android.gms.analytics.C0577l.NONE
        L_0x0090:
            r10 = r1
            r11 = r3
            goto L_0x0098
        L_0x0093:
            com.google.android.gms.analytics.i r1 = r6.f254ym
            com.google.android.gms.analytics.l r3 = r6.f255yn
            goto L_0x0090
        L_0x0098:
            int r1 = r23.size()
            int r0 = java.lang.Math.min(r1, r0)
            java.lang.String r1 = "_hr"
            int r3 = r23.size()
            r8.mo10354e(r1, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12 = 0
            com.google.android.gms.analytics.i r14 = com.google.android.gms.analytics.C0573i.NONE
            if (r10 == r14) goto L_0x0128
            java.util.Iterator r14 = r23.iterator()
            r15 = r2
        L_0x00c2:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x0124
            java.lang.Object r16 = r14.next()
            r2 = r16
            com.google.android.gms.analytics.ab r2 = (com.google.android.gms.analytics.C0547ab) r2
            java.lang.String r9 = r2.mo10349fa()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x00dd
            java.lang.String r2 = ""
            goto L_0x00e1
        L_0x00dd:
            java.lang.String r2 = com.google.android.gms.analytics.C0548ac.m100a(r2, r3)
        L_0x00e1:
            byte[] r9 = r2.getBytes()
            int r9 = r9.length
            r17 = r2
            int r2 = r6.f250yi
            if (r9 <= r2) goto L_0x00ef
            java.lang.String r2 = ""
            goto L_0x00f1
        L_0x00ef:
            r2 = r17
        L_0x00f1:
            r1.add(r2)
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L_0x010a
            byte[] r2 = r2.getBytes()
            int r2 = r2.length
            if (r15 != 0) goto L_0x0103
            r9 = 0
            goto L_0x0104
        L_0x0103:
            r9 = 1
        L_0x0104:
            int r2 = r2 + r9
            r18 = r3
            long r2 = (long) r2
            long r12 = r12 + r2
            goto L_0x010c
        L_0x010a:
            r18 = r3
        L_0x010c:
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r5.add(r2)
            int r2 = r6.f251yj
            long r2 = (long) r2
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x011c
            int r15 = r15 + 1
        L_0x011c:
            if (r15 != r0) goto L_0x011f
            goto L_0x0124
        L_0x011f:
            r3 = r18
            r2 = 0
            r9 = 1
            goto L_0x00c2
        L_0x0124:
            r9 = r15
            r0 = 1
            r14 = 1
            goto L_0x012b
        L_0x0128:
            r14 = r0
            r0 = r9
            r9 = 0
        L_0x012b:
            if (r9 <= r0) goto L_0x0148
            int r0 = r9 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = r6.f251yj
            r20 = r14
            long r14 = (long) r0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x014a
            int r9 = r9 + -1
            r14 = r20
            r0 = 1
            goto L_0x012b
        L_0x0148:
            r20 = r14
        L_0x014a:
            int r0 = r6.f251yj
            long r2 = (long) r0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b7
            int[] r0 = com.google.android.gms.analytics.C0571h.C05721.f263yv
            int r2 = r10.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L_0x01a2;
                case 2: goto L_0x019c;
                case 3: goto L_0x0197;
                case 4: goto L_0x0170;
                case 5: goto L_0x01a0;
                default: goto L_0x015c;
            }
        L_0x015c:
            java.lang.String r0 = "Unexpected batching strategy encountered; sending a single hit."
            com.google.android.gms.analytics.C0550ae.m106W(r0)
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.clear()
            r1.add(r2)
            r9 = 1
            goto L_0x01ac
        L_0x0170:
            int r0 = r6.f251yj
            int r0 = r0 * 2
            long r2 = (long) r0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a0
            int r0 = r5.size()
            r2 = 1
            int r0 = r0 - r2
            r9 = r0
        L_0x0180:
            if (r9 <= 0) goto L_0x01a0
            java.lang.Object r0 = r5.get(r9)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r14 = 2
            long r14 = r12 / r14
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a0
            int r9 = r9 + -1
            goto L_0x0180
        L_0x0197:
            int r9 = r6.mo10457b(r7, r9)
            goto L_0x01a0
        L_0x019c:
            int r9 = r6.mo10453a(r7, r9)
        L_0x01a0:
            r0 = 0
            goto L_0x01ac
        L_0x01a2:
            int r0 = r1.size()
            int r0 = r0 / 2
            if (r9 <= r0) goto L_0x01a0
            r9 = r0
            goto L_0x01a0
        L_0x01ac:
            int r2 = r1.size()
            if (r9 >= r2) goto L_0x01b8
            java.util.List r1 = r1.subList(r0, r9)
            goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            r9 = r1
            r1 = 0
            r12 = r0
            r13 = r12
            r14 = r13
            r15 = r20
        L_0x01bf:
            if (r12 >= r15) goto L_0x023e
            java.lang.Object r0 = r7.get(r12)
            com.google.android.gms.analytics.ab r0 = (com.google.android.gms.analytics.C0547ab) r0
            java.net.URL r2 = r6.m199a((com.google.android.gms.analytics.C0547ab) r0)
            int r3 = r9.size()
            r4 = 1
            int r16 = java.lang.Math.max(r4, r3)
            if (r2 != 0) goto L_0x01e1
            java.lang.String r0 = "No destination: discarding hit."
            com.google.android.gms.analytics.C0550ae.m106W(r0)
            int r13 = r13 + r16
            int r14 = r14 + r16
            r2 = 1
            goto L_0x0239
        L_0x01e1:
            org.apache.http.HttpHost r5 = new org.apache.http.HttpHost
            java.lang.String r1 = r2.getHost()
            int r3 = r2.getPort()
            java.lang.String r2 = r2.getProtocol()
            r5.<init>(r1, r3, r2)
            java.lang.String r1 = r6.m198a((com.google.android.gms.analytics.C0547ab) r0, (java.util.List<java.lang.String>) r9, (com.google.android.gms.analytics.C0573i) r10)
            r0 = r6
            r2 = r5
            r3 = r16
            r4 = r8
            r7 = r5
            r5 = r11
            boolean r0 = r0.m202a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0217
            java.lang.String r0 = "_de"
            r1 = 1
            r8.mo10354e(r0, r1)
            java.lang.String r0 = "_hd"
            r8.mo10354e(r0, r13)
            java.lang.String r0 = "_hs"
            r8.mo10354e(r0, r14)
            r6.m200a(r8, r7, r10, r11)
            return r14
        L_0x0217:
            java.util.Iterator r0 = r9.iterator()
        L_0x021b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0230
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x021b
            int r13 = r13 + 1
            goto L_0x021b
        L_0x0230:
            java.lang.String r0 = "_rs"
            r2 = 1
            r8.mo10354e(r0, r2)
            int r14 = r14 + r16
            r1 = r7
        L_0x0239:
            int r12 = r12 + 1
            r7 = r23
            goto L_0x01bf
        L_0x023e:
            java.lang.String r0 = "_hd"
            r8.mo10354e(r0, r13)
            java.lang.String r0 = "_hs"
            r8.mo10354e(r0, r14)
            if (r25 == 0) goto L_0x024d
            r6.m200a(r8, r1, r10, r11)
        L_0x024d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0571h.mo10454a(java.util.List, com.google.android.gms.analytics.af, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10455a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    /* renamed from: ad */
    public void mo10456ad(String str) {
        try {
            this.f248yg = new URL(str);
        } catch (MalformedURLException e) {
            this.f248yg = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10457b(List<C0547ab> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        for (int i2 = i - 1; i2 > 0; i2--) {
            String fa = list.get(i2).mo10349fa();
            if (!TextUtils.isEmpty(fa)) {
                if (fa.contains("sc=start")) {
                    return i2;
                }
                if (fa.contains("sc=end")) {
                    return i2 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: ea */
    public boolean mo10458ea() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        C0550ae.m105V("...no network connectivity");
        return false;
    }

    public void setDryRun(boolean z) {
        this.f261yt = z;
    }
}
