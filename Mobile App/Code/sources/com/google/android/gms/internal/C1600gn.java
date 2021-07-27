package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@C1507ey
/* renamed from: com.google.android.gms.internal.gn */
public class C1600gn {

    /* renamed from: wN */
    public static final C1603a<Void> f3546wN = new C1603a() {
        /* renamed from: c */
        public Void mo15314b(InputStream inputStream) {
            return null;
        }

        /* renamed from: dz */
        public Void mo15316cQ() {
            return null;
        }
    };

    /* renamed from: com.google.android.gms.internal.gn$a */
    public interface C1603a<T> {
        /* renamed from: b */
        T mo15314b(InputStream inputStream);

        /* renamed from: cQ */
        T mo15316cQ();
    }

    /* renamed from: a */
    public <T> Future<T> mo15404a(final String str, final C1603a<T> aVar) {
        return C1587gh.submit(new Callable<T>() {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
                if (r1 != null) goto L_0x0050;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
                if (r1 != null) goto L_0x0050;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0039, all -> 0x0034, all -> 0x005a }] */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x005d  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public T call() {
                /*
                    r4 = this;
                    r0 = 0
                    java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0039, all -> 0x0034 }
                    java.lang.String r2 = r2     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0039, all -> 0x0034 }
                    r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0039, all -> 0x0034 }
                    java.net.URLConnection r1 = r1.openConnection()     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0039, all -> 0x0034 }
                    java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ MalformedURLException -> 0x0045, IOException -> 0x0039, all -> 0x0034 }
                    r1.connect()     // Catch:{ MalformedURLException -> 0x0032, IOException -> 0x0030 }
                    int r0 = r1.getResponseCode()     // Catch:{ MalformedURLException -> 0x0032, IOException -> 0x0030 }
                    r2 = 200(0xc8, float:2.8E-43)
                    if (r0 < r2) goto L_0x002d
                    r2 = 299(0x12b, float:4.19E-43)
                    if (r0 > r2) goto L_0x002d
                    com.google.android.gms.internal.gn$a r0 = r3     // Catch:{ MalformedURLException -> 0x0032, IOException -> 0x0030 }
                    java.io.InputStream r2 = r1.getInputStream()     // Catch:{ MalformedURLException -> 0x0032, IOException -> 0x0030 }
                    java.lang.Object r0 = r0.mo15314b(r2)     // Catch:{ MalformedURLException -> 0x0032, IOException -> 0x0030 }
                    if (r1 == 0) goto L_0x002c
                    r1.disconnect()
                L_0x002c:
                    return r0
                L_0x002d:
                    if (r1 == 0) goto L_0x0053
                    goto L_0x0050
                L_0x0030:
                    r0 = move-exception
                    goto L_0x003d
                L_0x0032:
                    r0 = move-exception
                    goto L_0x0049
                L_0x0034:
                    r1 = move-exception
                    r3 = r1
                    r1 = r0
                    r0 = r3
                    goto L_0x005b
                L_0x0039:
                    r1 = move-exception
                    r3 = r1
                    r1 = r0
                    r0 = r3
                L_0x003d:
                    java.lang.String r2 = "Error making HTTP request."
                    com.google.android.gms.internal.C1607gr.m4713d(r2, r0)     // Catch:{ all -> 0x005a }
                    if (r1 == 0) goto L_0x0053
                    goto L_0x0050
                L_0x0045:
                    r1 = move-exception
                    r3 = r1
                    r1 = r0
                    r0 = r3
                L_0x0049:
                    java.lang.String r2 = "Error making HTTP request."
                    com.google.android.gms.internal.C1607gr.m4713d(r2, r0)     // Catch:{ all -> 0x005a }
                    if (r1 == 0) goto L_0x0053
                L_0x0050:
                    r1.disconnect()
                L_0x0053:
                    com.google.android.gms.internal.gn$a r0 = r3
                    java.lang.Object r0 = r0.mo15316cQ()
                    return r0
                L_0x005a:
                    r0 = move-exception
                L_0x005b:
                    if (r1 == 0) goto L_0x0060
                    r1.disconnect()
                L_0x0060:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1600gn.C16022.call():java.lang.Object");
            }
        });
    }
}
