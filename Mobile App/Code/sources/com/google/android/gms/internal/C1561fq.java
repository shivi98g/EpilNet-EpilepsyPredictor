package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.internal.C1550fl;
import com.google.android.gms.internal.C1612gv;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@C1507ey
/* renamed from: com.google.android.gms.internal.fq */
public final class C1561fq extends C1550fl.C1551a {

    /* renamed from: ut */
    private static final Object f3371ut = new Object();

    /* renamed from: uu */
    private static C1561fq f3372uu;
    private final Context mContext;

    /* renamed from: uv */
    private final C1572fw f3373uv;

    /* renamed from: uw */
    private final C1388cn f3374uw;

    /* renamed from: ux */
    private final C1330bm f3375ux;

    C1561fq(Context context, C1330bm bmVar, C1388cn cnVar, C1572fw fwVar) {
        this.mContext = context;
        this.f3373uv = fwVar;
        this.f3374uw = cnVar;
        this.f3375ux = bmVar;
    }

    /* renamed from: I */
    private static C1612gv.C1614a m4519I(final String str) {
        return new C1612gv.C1614a() {
            /* renamed from: a */
            public void mo14753a(C1610gu guVar) {
                String format = String.format("javascript:%s(%s);", new Object[]{"AFMA_buildAdURL", str});
                C1607gr.m4708V("About to execute: " + format);
                guVar.loadUrl(format);
            }
        };
    }

    /* renamed from: a */
    private static C1548fj m4520a(Context context, C1330bm bmVar, C1388cn cnVar, C1572fw fwVar, C1545fh fhVar) {
        String string;
        C1607gr.m4705S("Starting ad request from service.");
        cnVar.init();
        C1571fv fvVar = new C1571fv(context);
        if (fvVar.f3432vr == -1) {
            C1607gr.m4705S("Device is offline.");
            return new C1548fj(2);
        }
        final C1566fs fsVar = new C1566fs(fhVar.applicationInfo.packageName);
        if (fhVar.f3308tL.extras != null && (string = fhVar.f3308tL.extras.getString("_ad")) != null) {
            return C1565fr.m4526a(context, fhVar, string);
        }
        Location a = cnVar.mo15025a(250);
        String bu = bmVar.mo14932bu();
        String a2 = C1565fr.m4527a(fhVar, fvVar, a, bmVar.mo14933bv(), bmVar.mo14934bw(), bmVar.mo14935bx());
        if (a2 == null) {
            return new C1548fj(0);
        }
        final C1612gv.C1614a I = m4519I(a2);
        final Context context2 = context;
        final C1545fh fhVar2 = fhVar;
        final C1566fs fsVar2 = fsVar;
        final String str = bu;
        C1606gq.f3553wR.post(new Runnable() {
            public void run() {
                C1610gu a = C1610gu.m4718a(context2, new C1306ay(), false, false, (C1788k) null, fhVar2.f3304lO);
                a.setWillNotDraw(true);
                fsVar2.mo15322b(a);
                C1612gv dD = a.mo15426dD();
                dD.mo15450a("/invalidRequest", fsVar2.f3388uG);
                dD.mo15450a("/loadAdURL", fsVar2.f3389uH);
                dD.mo15450a("/log", C1364cc.f2793pX);
                dD.mo15447a(I);
                C1607gr.m4705S("Loading the JS library.");
                a.loadUrl(str);
            }
        });
        try {
            C1570fu fuVar = fsVar.mo15323cR().get(10, TimeUnit.SECONDS);
            if (fuVar == null) {
                return new C1548fj(0);
            }
            if (fuVar.getErrorCode() != -2) {
                C1548fj fjVar = new C1548fj(fuVar.getErrorCode());
                C1606gq.f3553wR.post(new Runnable() {
                    public void run() {
                        fsVar.mo15324cS();
                    }
                });
                return fjVar;
            }
            String str2 = null;
            if (fuVar.mo15330cV()) {
                str2 = fwVar.mo15335K(fhVar.f3309tM.packageName);
            }
            C1548fj a3 = m4521a(context, fhVar.f3304lO.f3554wS, fuVar.getUrl(), str2, fuVar);
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    fsVar.mo15324cS();
                }
            });
            return a3;
        } catch (Exception e) {
            return new C1548fj(0);
        } finally {
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    fsVar.mo15324cS();
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        com.google.android.gms.internal.C1607gr.m4709W("Received error HTTP response code: " + r7);
        r11 = new com.google.android.gms.internal.C1548fj(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        return r11;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.C1548fj m4521a(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.google.android.gms.internal.C1570fu r15) {
        /*
            com.google.android.gms.internal.ft r0 = new com.google.android.gms.internal.ft     // Catch:{ IOException -> 0x00fc }
            r0.<init>()     // Catch:{ IOException -> 0x00fc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fc }
            r1.<init>()     // Catch:{ IOException -> 0x00fc }
            java.lang.String r2 = "AdRequestServiceImpl: Sending request: "
            r1.append(r2)     // Catch:{ IOException -> 0x00fc }
            r1.append(r13)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00fc }
            com.google.android.gms.internal.C1607gr.m4705S(r1)     // Catch:{ IOException -> 0x00fc }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x00fc }
            r1.<init>(r13)     // Catch:{ IOException -> 0x00fc }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00fc }
            r13 = 0
            r4 = r13
        L_0x0024:
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ IOException -> 0x00fc }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x00fc }
            com.google.android.gms.internal.C1591gi.m4649a((android.content.Context) r11, (java.lang.String) r12, (boolean) r13, (java.net.HttpURLConnection) r5)     // Catch:{ all -> 0x00f7 }
            boolean r6 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x00f7 }
            if (r6 != 0) goto L_0x0038
            java.lang.String r6 = "x-afma-drt-cookie"
            r5.addRequestProperty(r6, r14)     // Catch:{ all -> 0x00f7 }
        L_0x0038:
            r6 = 1
            if (r15 == 0) goto L_0x0063
            java.lang.String r7 = r15.mo15329cU()     // Catch:{ all -> 0x00f7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00f7 }
            if (r7 != 0) goto L_0x0063
            r5.setDoOutput(r6)     // Catch:{ all -> 0x00f7 }
            java.lang.String r7 = r15.mo15329cU()     // Catch:{ all -> 0x00f7 }
            byte[] r7 = r7.getBytes()     // Catch:{ all -> 0x00f7 }
            int r8 = r7.length     // Catch:{ all -> 0x00f7 }
            r5.setFixedLengthStreamingMode(r8)     // Catch:{ all -> 0x00f7 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00f7 }
            java.io.OutputStream r9 = r5.getOutputStream()     // Catch:{ all -> 0x00f7 }
            r8.<init>(r9)     // Catch:{ all -> 0x00f7 }
            r8.write(r7)     // Catch:{ all -> 0x00f7 }
            r8.close()     // Catch:{ all -> 0x00f7 }
        L_0x0063:
            int r7 = r5.getResponseCode()     // Catch:{ all -> 0x00f7 }
            java.util.Map r8 = r5.getHeaderFields()     // Catch:{ all -> 0x00f7 }
            r9 = 200(0xc8, float:2.8E-43)
            r10 = 300(0x12c, float:4.2E-43)
            if (r7 < r9) goto L_0x0092
            if (r7 >= r10) goto L_0x0092
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x00f7 }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ all -> 0x00f7 }
            java.io.InputStream r13 = r5.getInputStream()     // Catch:{ all -> 0x00f7 }
            r12.<init>(r13)     // Catch:{ all -> 0x00f7 }
            java.lang.String r12 = com.google.android.gms.internal.C1591gi.m4643a((java.lang.Readable) r12)     // Catch:{ all -> 0x00f7 }
            m4523a((java.lang.String) r11, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r8, (java.lang.String) r12, (int) r7)     // Catch:{ all -> 0x00f7 }
            r0.mo15325a(r11, r8, r12)     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.internal.fj r11 = r0.mo15327i((long) r2)     // Catch:{ all -> 0x00f7 }
            r5.disconnect()     // Catch:{ IOException -> 0x00fc }
            return r11
        L_0x0092:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f7 }
            r9 = 0
            m4523a((java.lang.String) r1, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r8, (java.lang.String) r9, (int) r7)     // Catch:{ all -> 0x00f7 }
            if (r7 < r10) goto L_0x00da
            r1 = 400(0x190, float:5.6E-43)
            if (r7 >= r1) goto L_0x00da
            java.lang.String r1 = "Location"
            java.lang.String r1 = r5.getHeaderField(r1)     // Catch:{ all -> 0x00f7 }
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00f7 }
            if (r7 == 0) goto L_0x00ba
            java.lang.String r11 = "No location header to follow redirect."
            com.google.android.gms.internal.C1607gr.m4709W(r11)     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.internal.fj r11 = new com.google.android.gms.internal.fj     // Catch:{ all -> 0x00f7 }
            r11.<init>(r13)     // Catch:{ all -> 0x00f7 }
            r5.disconnect()     // Catch:{ IOException -> 0x00fc }
            return r11
        L_0x00ba:
            java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x00f7 }
            r7.<init>(r1)     // Catch:{ all -> 0x00f7 }
            int r4 = r4 + r6
            r1 = 5
            if (r4 <= r1) goto L_0x00d1
            java.lang.String r11 = "Too many redirects."
            com.google.android.gms.internal.C1607gr.m4709W(r11)     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.internal.fj r11 = new com.google.android.gms.internal.fj     // Catch:{ all -> 0x00f7 }
            r11.<init>(r13)     // Catch:{ all -> 0x00f7 }
            r5.disconnect()     // Catch:{ IOException -> 0x00fc }
            return r11
        L_0x00d1:
            r0.mo15326e(r8)     // Catch:{ all -> 0x00f7 }
            r5.disconnect()     // Catch:{ IOException -> 0x00fc }
            r1 = r7
            goto L_0x0024
        L_0x00da:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r11.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r12 = "Received error HTTP response code: "
            r11.append(r12)     // Catch:{ all -> 0x00f7 }
            r11.append(r7)     // Catch:{ all -> 0x00f7 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.internal.C1607gr.m4709W(r11)     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.internal.fj r11 = new com.google.android.gms.internal.fj     // Catch:{ all -> 0x00f7 }
            r11.<init>(r13)     // Catch:{ all -> 0x00f7 }
            r5.disconnect()     // Catch:{ IOException -> 0x00fc }
            return r11
        L_0x00f7:
            r11 = move-exception
            r5.disconnect()     // Catch:{ IOException -> 0x00fc }
            throw r11     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Error while connecting to ad server: "
            r12.append(r13)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.google.android.gms.internal.C1607gr.m4709W(r11)
            com.google.android.gms.internal.fj r11 = new com.google.android.gms.internal.fj
            r12 = 2
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1561fq.m4521a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.fu):com.google.android.gms.internal.fj");
    }

    /* renamed from: a */
    public static C1561fq m4522a(Context context, C1330bm bmVar, C1388cn cnVar, C1572fw fwVar) {
        C1561fq fqVar;
        synchronized (f3371ut) {
            if (f3372uu == null) {
                f3372uu = new C1561fq(context.getApplicationContext(), bmVar, cnVar, fwVar);
            }
            fqVar = f3372uu;
        }
        return fqVar;
    }

    /* renamed from: a */
    private static void m4523a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C1607gr.m4714v(2)) {
            C1607gr.m4708V("Http Response: {\n  URL:\n    " + str + "\n  Headers:");
            if (map != null) {
                for (String next : map.keySet()) {
                    C1607gr.m4708V("    " + next + ":");
                    for (String str3 : map.get(next)) {
                        C1607gr.m4708V("      " + str3);
                    }
                }
            }
            C1607gr.m4708V("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    C1607gr.m4708V(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                C1607gr.m4708V("    null");
            }
            C1607gr.m4708V("  Response Code:\n    " + i + "\n}");
        }
    }

    /* renamed from: b */
    public C1548fj mo15301b(C1545fh fhVar) {
        return m4520a(this.mContext, this.f3375ux, this.f3374uw, this.f3373uv, fhVar);
    }
}
