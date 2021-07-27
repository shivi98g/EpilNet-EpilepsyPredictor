package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.internal.C1627ha;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.analytics.x */
class C0599x extends Thread implements C0569f {

    /* renamed from: zM */
    private static C0599x f336zM;
    private volatile boolean mClosed = false;
    /* access modifiers changed from: private */
    public final Context mContext;

    /* renamed from: zJ */
    private final LinkedBlockingQueue<Runnable> f337zJ = new LinkedBlockingQueue<>();

    /* renamed from: zK */
    private volatile boolean f338zK = false;
    /* access modifiers changed from: private */

    /* renamed from: zL */
    public volatile String f339zL;
    /* access modifiers changed from: private */

    /* renamed from: zN */
    public volatile C0557ak f340zN;

    /* renamed from: zO */
    private final Lock f341zO;
    /* access modifiers changed from: private */

    /* renamed from: zP */
    public final List<C1627ha> f342zP = new ArrayList();

    /* renamed from: com.google.android.gms.analytics.x$a */
    private class C0601a implements Runnable {
        private C0601a() {
        }

        public void run() {
            C0599x.this.f340zN.mo10379dQ();
        }
    }

    /* renamed from: com.google.android.gms.analytics.x$b */
    private class C0602b implements Runnable {
        private C0602b() {
        }

        public void run() {
            C0599x.this.f340zN.dispatch();
        }
    }

    /* renamed from: com.google.android.gms.analytics.x$c */
    private class C0603c implements Runnable {
        private C0603c() {
        }

        public void run() {
            C0599x.this.f340zN.mo10380dW();
        }
    }

    /* renamed from: com.google.android.gms.analytics.x$d */
    private class C0604d implements Runnable {

        /* renamed from: zR */
        private final Map<String, String> f347zR;

        C0604d(Map<String, String> map) {
            this.f347zR = new HashMap(map);
            String str = map.get("&ht");
            if (str != null) {
                try {
                    Long.valueOf(str);
                } catch (NumberFormatException e) {
                    str = null;
                }
            }
            if (str == null) {
                this.f347zR.put("&ht", Long.toString(System.currentTimeMillis()));
            }
        }

        /* renamed from: v */
        private String m320v(Map<String, String> map) {
            return (!map.containsKey("useSecure") || C0561an.m168f(map.get("useSecure"), true)) ? "https:" : "http:";
        }

        /* renamed from: w */
        private void m321w(Map<String, String> map) {
            C0583q w = C0545a.m81w(C0599x.this.mContext);
            C0561an.m163a(map, "&adid", w);
            C0561an.m163a(map, "&ate", w);
        }

        /* renamed from: x */
        private void m322x(Map<String, String> map) {
            C0570g dZ = C0570g.m195dZ();
            C0561an.m163a(map, "&an", (C0583q) dZ);
            C0561an.m163a(map, "&av", (C0583q) dZ);
            C0561an.m163a(map, "&aid", (C0583q) dZ);
            C0561an.m163a(map, "&aiid", (C0583q) dZ);
            map.put("&v", "1");
        }

        /* renamed from: y */
        private boolean m323y(Map<String, String> map) {
            if (map.get("&sf") == null) {
                return false;
            }
            double a = C0561an.m161a(map.get("&sf"), 100.0d);
            if (a >= 100.0d || ((double) (C0599x.m309ah(map.get("&cid")) % 10000)) < a * 100.0d) {
                return false;
            }
            C0550ae.m105V(String.format("%s hit sampled out", new Object[]{map.get("&t") == null ? "unknown" : map.get("&t")}));
            return true;
        }

        public void run() {
            m321w(this.f347zR);
            if (TextUtils.isEmpty(this.f347zR.get("&cid"))) {
                this.f347zR.put("&cid", C0575k.m224el().getValue("&cid"));
            }
            if (!GoogleAnalytics.getInstance(C0599x.this.mContext).getAppOptOut() && !m323y(this.f347zR)) {
                if (!TextUtils.isEmpty(C0599x.this.f339zL)) {
                    C0605y.m324eK().mo10498D(true);
                    this.f347zR.putAll(new HitBuilders.HitBuilder().setCampaignParamsFromUrl(C0599x.this.f339zL).build());
                    C0605y.m324eK().mo10498D(false);
                    String unused = C0599x.this.f339zL = null;
                }
                m322x(this.f347zR);
                C0599x.this.f340zN.mo10378b(C0548ac.m101z(this.f347zR), Long.valueOf(this.f347zR.get("&ht")).longValue(), m320v(this.f347zR), C0599x.this.f342zP);
            }
        }
    }

    private C0599x(Context context) {
        super("GAThread");
        this.mContext = context != null ? context.getApplicationContext() : context;
        this.f342zP.add(new C1627ha("appendVersion", "&_v".substring(1), "ma4.0.4"));
        this.f341zO = new ReentrantLock();
        start();
    }

    /* renamed from: A */
    static C0599x m305A(Context context) {
        if (f336zM == null) {
            f336zM = new C0599x(context);
        }
        return f336zM;
    }

    /* renamed from: B */
    static String m306B(Context context) {
        try {
            FileInputStream openFileInput = context.openFileInput("gaInstallData");
            byte[] bArr = new byte[8192];
            int read = openFileInput.read(bArr, 0, 8192);
            if (openFileInput.available() > 0) {
                C0550ae.m103T("Too much campaign data, ignoring it.");
                openFileInput.close();
                context.deleteFile("gaInstallData");
                return null;
            }
            openFileInput.close();
            context.deleteFile("gaInstallData");
            if (read <= 0) {
                C0550ae.m106W("Campaign file is empty.");
                return null;
            }
            String str = new String(bArr, 0, read);
            C0550ae.m104U("Campaign found: " + str);
            return str;
        } catch (FileNotFoundException e) {
            C0550ae.m104U("No campaign data found.");
            return null;
        } catch (IOException e2) {
            C0550ae.m103T("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
    }

    /* renamed from: ah */
    static int m309ah(String str) {
        int i = 1;
        if (!TextUtils.isEmpty(str)) {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i = ((i << 6) & 65535) + charAt + (charAt << 14);
                int i2 = 266338304 & i;
                if (i2 != 0) {
                    i = (i2 >> 21) ^ i;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    private void m311b(Runnable runnable) {
        this.f337zJ.add(runnable);
    }

    /* renamed from: g */
    private String m314g(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: dQ */
    public void mo10445dQ() {
        m311b((Runnable) new C0601a());
    }

    /* renamed from: dW */
    public void mo10446dW() {
        m311b((Runnable) new C0603c());
    }

    /* renamed from: dX */
    public LinkedBlockingQueue<Runnable> mo10447dX() {
        return this.f337zJ;
    }

    /* renamed from: dY */
    public void mo10448dY() {
        init();
        ArrayList<Runnable> arrayList = new ArrayList<>();
        this.f337zJ.drainTo(arrayList);
        this.f341zO.lock();
        try {
            this.f338zK = true;
            for (Runnable run : arrayList) {
                run.run();
            }
        } catch (Throwable th) {
            this.f341zO.unlock();
            throw th;
        }
        this.f341zO.unlock();
    }

    public void dispatch() {
        m311b((Runnable) new C0602b());
    }

    public Thread getThread() {
        return this;
    }

    /* access modifiers changed from: protected */
    public synchronized void init() {
        if (this.f340zN == null) {
            this.f340zN = new C0591w(this.mContext, this);
            this.f340zN.mo10382eB();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[SYNTHETIC, Splitter:B:13:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x000b }
            goto L_0x0011
        L_0x000b:
            r0 = move-exception
            java.lang.String r0 = "sleep interrupted in GAThread initialize"
            com.google.android.gms.analytics.C0550ae.m106W(r0)
        L_0x0011:
            r0 = 1
            r4.init()     // Catch:{ Throwable -> 0x0023 }
            android.content.Context r1 = r4.mContext     // Catch:{ Throwable -> 0x0023 }
            java.lang.String r1 = m306B(r1)     // Catch:{ Throwable -> 0x0023 }
            r4.f339zL = r1     // Catch:{ Throwable -> 0x0023 }
            java.lang.String r1 = "Initialized GA Thread"
            com.google.android.gms.analytics.C0550ae.m105V(r1)     // Catch:{ Throwable -> 0x0023 }
            goto L_0x0043
        L_0x0023:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error initializing the GAThread: "
            r2.append(r3)
            java.lang.String r1 = r4.m314g(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.analytics.C0550ae.m103T(r1)
            java.lang.String r1 = "Google Analytics will not start up."
        L_0x003e:
            com.google.android.gms.analytics.C0550ae.m103T(r1)
            r4.f338zK = r0
        L_0x0043:
            boolean r1 = r4.mClosed
            if (r1 != 0) goto L_0x008e
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r1 = r4.f337zJ     // Catch:{ InterruptedException -> 0x006a }
            java.lang.Object r1 = r1.take()     // Catch:{ InterruptedException -> 0x006a }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ InterruptedException -> 0x006a }
            java.util.concurrent.locks.Lock r2 = r4.f341zO     // Catch:{ InterruptedException -> 0x006a }
            r2.lock()     // Catch:{ InterruptedException -> 0x006a }
            boolean r2 = r4.f338zK     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x005b
            r1.run()     // Catch:{ all -> 0x0061 }
        L_0x005b:
            java.util.concurrent.locks.Lock r1 = r4.f341zO     // Catch:{ InterruptedException -> 0x006a }
            r1.unlock()     // Catch:{ InterruptedException -> 0x006a }
            goto L_0x0043
        L_0x0061:
            r1 = move-exception
            java.util.concurrent.locks.Lock r2 = r4.f341zO     // Catch:{ InterruptedException -> 0x006a }
            r2.unlock()     // Catch:{ InterruptedException -> 0x006a }
            throw r1     // Catch:{ InterruptedException -> 0x006a }
        L_0x0068:
            r1 = move-exception
            goto L_0x0073
        L_0x006a:
            r1 = move-exception
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0068 }
            com.google.android.gms.analytics.C0550ae.m104U(r1)     // Catch:{ Throwable -> 0x0068 }
            goto L_0x0043
        L_0x0073:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error on GAThread: "
            r2.append(r3)
            java.lang.String r1 = r4.m314g(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.analytics.C0550ae.m103T(r1)
            java.lang.String r1 = "Google Analytics is shutting down."
            goto L_0x003e
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0599x.run():void");
    }

    /* renamed from: u */
    public void mo10451u(Map<String, String> map) {
        m311b((Runnable) new C0604d(map));
    }
}
