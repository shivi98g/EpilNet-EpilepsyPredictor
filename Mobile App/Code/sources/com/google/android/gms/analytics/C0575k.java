package com.google.android.gms.analytics;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.google.android.gms.analytics.k */
class C0575k implements C0583q {

    /* renamed from: xO */
    private static final Object f272xO = new Object();

    /* renamed from: yD */
    private static C0575k f273yD;
    private final Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: yE */
    public String f274yE;
    /* access modifiers changed from: private */

    /* renamed from: yF */
    public boolean f275yF = false;
    /* access modifiers changed from: private */

    /* renamed from: yG */
    public final Object f276yG = new Object();

    protected C0575k(Context context) {
        this.mContext = context;
        m226ep();
    }

    /* renamed from: ae */
    private boolean m223ae(String str) {
        String str2;
        try {
            C0550ae.m105V("Storing clientId.");
            FileOutputStream openFileOutput = this.mContext.openFileOutput("gaClientId", 0);
            openFileOutput.write(str.getBytes());
            openFileOutput.close();
            return true;
        } catch (FileNotFoundException e) {
            str2 = "Error creating clientId file.";
            C0550ae.m103T(str2);
            return false;
        } catch (IOException e2) {
            str2 = "Error writing to clientId file.";
            C0550ae.m103T(str2);
            return false;
        }
    }

    /* renamed from: el */
    public static C0575k m224el() {
        C0575k kVar;
        synchronized (f272xO) {
            kVar = f273yD;
        }
        return kVar;
    }

    /* renamed from: en */
    private String m225en() {
        if (!this.f275yF) {
            synchronized (this.f276yG) {
                if (!this.f275yF) {
                    C0550ae.m105V("Waiting for clientId to load");
                    do {
                        try {
                            this.f276yG.wait();
                        } catch (InterruptedException e) {
                            C0550ae.m103T("Exception while waiting for clientId: " + e);
                        }
                    } while (!this.f275yF);
                }
            }
        }
        C0550ae.m105V("Loaded clientId");
        return this.f274yE;
    }

    /* renamed from: ep */
    private void m226ep() {
        new Thread("client_id_fetcher") {
            public void run() {
                synchronized (C0575k.this.f276yG) {
                    String unused = C0575k.this.f274yE = C0575k.this.mo10473eq();
                    boolean unused2 = C0575k.this.f275yF = true;
                    C0575k.this.f276yG.notifyAll();
                }
            }
        }.start();
    }

    /* renamed from: y */
    public static void m227y(Context context) {
        synchronized (f272xO) {
            if (f273yD == null) {
                f273yD = new C0575k(context);
            }
        }
    }

    /* renamed from: ac */
    public boolean mo10470ac(String str) {
        return "&cid".equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: em */
    public String mo10471em() {
        String str;
        synchronized (this.f276yG) {
            this.f274yE = mo10472eo();
            str = this.f274yE;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: eo */
    public String mo10472eo() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase();
        try {
            return !m223ae(lowerCase) ? "0" : lowerCase;
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: eq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo10473eq() {
        /*
            r6 = this;
            r0 = 0
            android.content.Context r1 = r6.mContext     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            java.lang.String r2 = "gaClientId"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            r2 = 128(0x80, float:1.794E-43)
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            r4 = 0
            int r2 = r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            int r5 = r1.available()     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            if (r5 <= 0) goto L_0x0028
            java.lang.String r2 = "clientId file seems corrupted, deleting it."
            com.google.android.gms.analytics.C0550ae.m103T(r2)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            android.content.Context r1 = r6.mContext     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            java.lang.String r2 = "gaClientId"
        L_0x0024:
            r1.deleteFile(r2)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            goto L_0x005a
        L_0x0028:
            if (r2 > 0) goto L_0x0037
            java.lang.String r2 = "clientId file seems empty, deleting it."
            com.google.android.gms.analytics.C0550ae.m103T(r2)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            android.content.Context r1 = r6.mContext     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            java.lang.String r2 = "gaClientId"
            goto L_0x0024
        L_0x0037:
            java.lang.String r5 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            r5.<init>(r3, r4, r2)     // Catch:{ FileNotFoundException -> 0x0059, IOException -> 0x004b }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046 }
            java.lang.String r0 = "Loaded client id from disk."
            com.google.android.gms.analytics.C0550ae.m105V(r0)     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046 }
        L_0x0044:
            r0 = r5
            goto L_0x005a
        L_0x0046:
            r0 = move-exception
            r0 = r5
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            goto L_0x0044
        L_0x004b:
            r1 = move-exception
        L_0x004c:
            java.lang.String r1 = "Error reading clientId file, deleting it."
            com.google.android.gms.analytics.C0550ae.m103T(r1)
            android.content.Context r1 = r6.mContext
            java.lang.String r2 = "gaClientId"
            r1.deleteFile(r2)
            goto L_0x005a
        L_0x0059:
            r1 = move-exception
        L_0x005a:
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = r6.mo10472eo()
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0575k.mo10473eq():java.lang.String");
    }

    public String getValue(String str) {
        if ("&cid".equals(str)) {
            return m225en();
        }
        return null;
    }
}
