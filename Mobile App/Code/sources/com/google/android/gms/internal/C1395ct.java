package com.google.android.gms.internal;

import com.google.android.gms.internal.C1398cv;
import com.google.android.gms.internal.C1410da;

@C1507ey
/* renamed from: com.google.android.gms.internal.ct */
public final class C1395ct extends C1410da.C1411a {

    /* renamed from: mH */
    private final Object f2829mH = new Object();

    /* renamed from: qD */
    private C1398cv.C1399a f2830qD;

    /* renamed from: qE */
    private C1394cs f2831qE;

    /* renamed from: a */
    public void mo15035a(C1394cs csVar) {
        synchronized (this.f2829mH) {
            this.f2831qE = csVar;
        }
    }

    /* renamed from: a */
    public void mo15036a(C1398cv.C1399a aVar) {
        synchronized (this.f2829mH) {
            this.f2830qD = aVar;
        }
    }

    public void onAdClicked() {
        synchronized (this.f2829mH) {
            if (this.f2831qE != null) {
                this.f2831qE.mo15030ai();
            }
        }
    }

    public void onAdClosed() {
        synchronized (this.f2829mH) {
            if (this.f2831qE != null) {
                this.f2831qE.mo15031aj();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f2829mH) {
            if (this.f2830qD != null) {
                this.f2830qD.mo15045k(i == 3 ? 1 : 2);
                this.f2830qD = null;
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f2829mH) {
            if (this.f2831qE != null) {
                this.f2831qE.mo15032ak();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoaded() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2829mH
            monitor-enter(r0)
            com.google.android.gms.internal.cv$a r1 = r3.f2830qD     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.cv$a r1 = r3.f2830qD     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.mo15045k(r2)     // Catch:{ all -> 0x001d }
            r1 = 0
            r3.f2830qD = r1     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            com.google.android.gms.internal.cs r1 = r3.f2831qE     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.internal.cs r1 = r3.f2831qE     // Catch:{ all -> 0x001d }
            r1.mo15034am()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1395ct.onAdLoaded():void");
    }

    public void onAdOpened() {
        synchronized (this.f2829mH) {
            if (this.f2831qE != null) {
                this.f2831qE.mo15033al();
            }
        }
    }
}
