package com.google.android.gms.internal;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.kj */
public class C1806kj<K, V> {

    /* renamed from: NA */
    private int f3961NA;

    /* renamed from: NB */
    private int f3962NB;

    /* renamed from: NC */
    private int f3963NC;

    /* renamed from: Nw */
    private final LinkedHashMap<K, V> f3964Nw;

    /* renamed from: Nx */
    private int f3965Nx;

    /* renamed from: Ny */
    private int f3966Ny;

    /* renamed from: Nz */
    private int f3967Nz;
    private int size;

    public C1806kj(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3965Nx = i;
        this.f3964Nw = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: c */
    private int m5404c(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* access modifiers changed from: protected */
    public V create(K k) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z, K k, V v, V v2) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = create(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f3967Nz++;
        r1 = r4.f3964Nw.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r4.f3964Nw.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r4.size += m5404c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r1 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        entryRemoved(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        trimToSize(r4.f3965Nx);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(K r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
        L_0x000a:
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f3964Nw     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x001b
            int r1 = r4.f3962NB     // Catch:{ all -> 0x0059 }
            int r1 = r1 + 1
            r4.f3962NB = r1     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            return r0
        L_0x001b:
            int r0 = r4.f3963NC     // Catch:{ all -> 0x0059 }
            int r0 = r0 + 1
            r4.f3963NC = r0     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r4.create(r5)
            if (r0 != 0) goto L_0x002a
            r0 = 0
            return r0
        L_0x002a:
            monitor-enter(r4)
            int r1 = r4.f3967Nz     // Catch:{ all -> 0x0056 }
            int r1 = r1 + 1
            r4.f3967Nz = r1     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashMap<K, V> r1 = r4.f3964Nw     // Catch:{ all -> 0x0056 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x003f
            java.util.LinkedHashMap<K, V> r2 = r4.f3964Nw     // Catch:{ all -> 0x0056 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0056 }
            goto L_0x0048
        L_0x003f:
            int r2 = r4.size     // Catch:{ all -> 0x0056 }
            int r3 = r4.m5404c(r5, r0)     // Catch:{ all -> 0x0056 }
            int r2 = r2 + r3
            r4.size = r2     // Catch:{ all -> 0x0056 }
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0050
            r2 = 0
            r4.entryRemoved(r2, r5, r0, r1)
            return r1
        L_0x0050:
            int r1 = r4.f3965Nx
            r4.trimToSize(r1)
            return r0
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1806kj.get(java.lang.Object):java.lang.Object");
    }

    public final V put(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3966Ny++;
            this.size += m5404c(k, v);
            put = this.f3964Nw.put(k, v);
            if (put != null) {
                this.size -= m5404c(k, put);
            }
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.f3965Nx);
        return put;
    }

    public final synchronized int size() {
        return this.size;
    }

    /* access modifiers changed from: protected */
    public int sizeOf(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        i = this.f3962NB + this.f3963NC;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f3965Nx), Integer.valueOf(this.f3962NB), Integer.valueOf(this.f3963NC), Integer.valueOf(i != 0 ? (100 * this.f3962NB) / i : 0)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.size     // Catch:{ all -> 0x0072 }
            if (r0 < 0) goto L_0x0053
            java.util.LinkedHashMap<K, V> r0 = r4.f3964Nw     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0012
            int r0 = r4.size     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0053
        L_0x0012:
            int r0 = r4.size     // Catch:{ all -> 0x0072 }
            if (r0 <= r5) goto L_0x0051
            java.util.LinkedHashMap<K, V> r0 = r4.f3964Nw     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x001f
            goto L_0x0051
        L_0x001f:
            java.util.LinkedHashMap<K, V> r0 = r4.f3964Nw     // Catch:{ all -> 0x0072 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0072 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0072 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0072 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0072 }
            java.util.LinkedHashMap<K, V> r2 = r4.f3964Nw     // Catch:{ all -> 0x0072 }
            r2.remove(r1)     // Catch:{ all -> 0x0072 }
            int r2 = r4.size     // Catch:{ all -> 0x0072 }
            int r3 = r4.m5404c(r1, r0)     // Catch:{ all -> 0x0072 }
            int r2 = r2 - r3
            r4.size = r2     // Catch:{ all -> 0x0072 }
            int r2 = r4.f3961NA     // Catch:{ all -> 0x0072 }
            r3 = 1
            int r2 = r2 + r3
            r4.f3961NA = r2     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            r2 = 0
            r4.entryRemoved(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0051:
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            return
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r1.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.Class r2 = r4.getClass()     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0072 }
            r1.append(r2)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r2)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0072 }
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1806kj.trimToSize(int):void");
    }
}
