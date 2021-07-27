package com.google.android.gms.internal;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.C1670i;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.j */
public class C1733j extends C1670i {
    /* access modifiers changed from: private */

    /* renamed from: kO */
    public static AdvertisingIdClient f3863kO;
    /* access modifiers changed from: private */

    /* renamed from: kP */
    public static CountDownLatch f3864kP = new CountDownLatch(1);
    /* access modifiers changed from: private */

    /* renamed from: kQ */
    public static boolean f3865kQ;

    /* renamed from: com.google.android.gms.internal.j$a */
    class C1735a {

        /* renamed from: kR */
        private String f3866kR;

        /* renamed from: kS */
        private boolean f3867kS;

        public C1735a(String str, boolean z) {
            this.f3866kR = str;
            this.f3867kS = z;
        }

        public String getId() {
            return this.f3866kR;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f3867kS;
        }
    }

    protected C1733j(Context context, C1880m mVar, C1963n nVar) {
        super(context, mVar, nVar);
    }

    /* renamed from: a */
    public static C1733j m5138a(String str, Context context) {
        C1467e eVar = new C1467e();
        m4883a(str, context, eVar);
        synchronized (C1733j.class) {
            if (f3863kO == null) {
                f3863kO = new AdvertisingIdClient(context);
                new AsyncTask<Void, Void, Void>() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public Void doInBackground(Void... voidArr) {
                        try {
                            C1733j.f3863kO.start();
                        } catch (GooglePlayServicesNotAvailableException e) {
                            boolean unused = C1733j.f3865kQ = true;
                        } catch (GooglePlayServicesRepairableException | IOException e2) {
                        }
                        C1733j.f3864kP.countDown();
                        return null;
                        AdvertisingIdClient unused2 = C1733j.f3863kO = null;
                        C1733j.f3864kP.countDown();
                        return null;
                    }
                }.execute(new Void[0]);
            }
        }
        return new C1733j(context, eVar, new C2065p(239));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15493b(Context context) {
        String id;
        super.mo15493b(context);
        try {
            if (f3865kQ) {
                id = m4886d(context);
            } else {
                C1735a z = mo15772z();
                mo15490a(28, z.isLimitAdTrackingEnabled() ? 1 : 0);
                id = z.getId();
                if (id != null) {
                    mo15490a(26, 5);
                } else {
                    return;
                }
            }
            mo15491a(24, id);
        } catch (IOException e) {
        } catch (C1670i.C1671a e2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r0 = r1.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r0 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r0.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$") == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r4 = new byte[16];
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r2 >= r0.length()) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r2 == 8) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        if (r2 == 13) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r2 == 18) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r2 != 23) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        r4[r5] = (byte) ((java.lang.Character.digit(r0.charAt(r2), 16) << 4) + java.lang.Character.digit(r0.charAt(r2 + 1), 16));
        r5 = r5 + 1;
        r2 = r2 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r0 = r9.f3603ky.mo15184a(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        return new com.google.android.gms.internal.C1733j.C1735a(r9, r0, r1.isLimitAdTrackingEnabled());
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C1733j.C1735a mo15772z() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Class<com.google.android.gms.internal.j> r0 = com.google.android.gms.internal.C1733j.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            java.util.concurrent.CountDownLatch r3 = f3864kP     // Catch:{ InterruptedException -> 0x0084 }
            r4 = 2
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0084 }
            boolean r3 = r3.await(r4, r6)     // Catch:{ InterruptedException -> 0x0084 }
            if (r3 != 0) goto L_0x0018
            com.google.android.gms.internal.j$a r3 = new com.google.android.gms.internal.j$a     // Catch:{ InterruptedException -> 0x0084 }
            r3.<init>(r1, r2)     // Catch:{ InterruptedException -> 0x0084 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r3
        L_0x0018:
            com.google.android.gms.ads.identifier.AdvertisingIdClient r3 = f3863kO     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x0023
            com.google.android.gms.internal.j$a r3 = new com.google.android.gms.internal.j$a     // Catch:{ all -> 0x0082 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r3
        L_0x0023:
            com.google.android.gms.ads.identifier.AdvertisingIdClient r1 = f3863kO     // Catch:{ all -> 0x0082 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r1 = r1.getInfo()     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x0078
            java.lang.String r3 = "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"
            boolean r3 = r0.matches(r3)
            if (r3 == 0) goto L_0x0078
            r3 = 16
            byte[] r4 = new byte[r3]
            r5 = r2
        L_0x003d:
            int r6 = r0.length()
            r7 = 1
            if (r2 >= r6) goto L_0x0072
            r6 = 8
            if (r2 == r6) goto L_0x0054
            r6 = 13
            if (r2 == r6) goto L_0x0054
            r6 = 18
            if (r2 == r6) goto L_0x0054
            r6 = 23
            if (r2 != r6) goto L_0x0056
        L_0x0054:
            int r2 = r2 + 1
        L_0x0056:
            char r6 = r0.charAt(r2)
            int r6 = java.lang.Character.digit(r6, r3)
            int r6 = r6 << 4
            int r8 = r2 + 1
            char r8 = r0.charAt(r8)
            int r8 = java.lang.Character.digit(r8, r3)
            int r6 = r6 + r8
            byte r6 = (byte) r6
            r4[r5] = r6
            int r5 = r5 + r7
            int r2 = r2 + 2
            goto L_0x003d
        L_0x0072:
            com.google.android.gms.internal.m r0 = r9.f3603ky
            java.lang.String r0 = r0.mo15184a((byte[]) r4, (boolean) r7)
        L_0x0078:
            com.google.android.gms.internal.j$a r2 = new com.google.android.gms.internal.j$a
            boolean r1 = r1.isLimitAdTrackingEnabled()
            r2.<init>(r0, r1)
            return r2
        L_0x0082:
            r1 = move-exception
            goto L_0x008c
        L_0x0084:
            r3 = move-exception
            com.google.android.gms.internal.j$a r3 = new com.google.android.gms.internal.j$a     // Catch:{ all -> 0x0082 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r3
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1733j.mo15772z():com.google.android.gms.internal.j$a");
    }
}
