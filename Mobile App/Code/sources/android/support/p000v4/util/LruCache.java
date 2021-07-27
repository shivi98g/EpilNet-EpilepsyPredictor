package android.support.p000v4.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: android.support.v4.util.LruCache */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int maxSize2) {
        if (maxSize2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = maxSize2;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    public void resize(int maxSize2) {
        if (maxSize2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = maxSize2;
        }
        trimToSize(maxSize2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r2 = create(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r2 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5.createCount++;
        r1 = r5.map.put(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r1 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r5.map.put(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r5.size += safeSizeOf(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r1 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        entryRemoved(false, r6, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        trimToSize(r5.maxSize);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return r2;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(@android.support.annotation.NonNull K r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x000a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
        L_0x000a:
            monitor-enter(r5)
            r0 = 0
            java.util.LinkedHashMap<K, V> r1 = r5.map     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x001c
            int r0 = r5.hitCount     // Catch:{ all -> 0x0060 }
            int r0 = r0 + 1
            r5.hitCount = r0     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)     // Catch:{ all -> 0x0060 }
            return r1
        L_0x001c:
            int r2 = r5.missCount     // Catch:{ all -> 0x0060 }
            int r2 = r2 + 1
            r5.missCount = r2     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)     // Catch:{ all -> 0x0060 }
            java.lang.Object r2 = r5.create(r6)
            if (r2 != 0) goto L_0x002a
            return r0
        L_0x002a:
            monitor-enter(r5)
            int r0 = r5.createCount     // Catch:{ all -> 0x0057 }
            int r0 = r0 + 1
            r5.createCount = r0     // Catch:{ all -> 0x0057 }
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch:{ all -> 0x0057 }
            java.lang.Object r0 = r0.put(r6, r2)     // Catch:{ all -> 0x0057 }
            r1 = r0
            if (r1 == 0) goto L_0x0040
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch:{ all -> 0x0057 }
            r0.put(r6, r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0049
        L_0x0040:
            int r0 = r5.size     // Catch:{ all -> 0x0057 }
            int r3 = r5.safeSizeOf(r6, r2)     // Catch:{ all -> 0x0057 }
            int r0 = r0 + r3
            r5.size = r0     // Catch:{ all -> 0x0057 }
        L_0x0049:
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0051
            r0 = 0
            r5.entryRemoved(r0, r6, r2, r1)
            return r1
        L_0x0051:
            int r0 = r5.maxSize
            r5.trimToSize(r0)
            return r2
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            throw r0
        L_0x005a:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x005e:
            monitor-exit(r5)     // Catch:{ all -> 0x0060 }
            throw r0
        L_0x0060:
            r0 = move-exception
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.util.LruCache.get(java.lang.Object):java.lang.Object");
    }

    @Nullable
    public final V put(@NonNull K key, @NonNull V value) {
        V previous;
        if (key == null || value == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(key, value);
            previous = this.map.put(key, value);
            if (previous != null) {
                this.size -= safeSizeOf(key, previous);
            }
        }
        if (previous != null) {
            entryRemoved(false, key, previous, value);
        }
        trimToSize(this.maxSize);
        return previous;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0003:
            monitor-enter(r6)
            int r3 = r6.size     // Catch:{ all -> 0x0076 }
            if (r3 < 0) goto L_0x0057
            java.util.LinkedHashMap<K, V> r3 = r6.map     // Catch:{ all -> 0x0076 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0015
            int r3 = r6.size     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0015
            goto L_0x0057
        L_0x0015:
            int r3 = r6.size     // Catch:{ all -> 0x0076 }
            if (r3 <= r7) goto L_0x0055
            java.util.LinkedHashMap<K, V> r3 = r6.map     // Catch:{ all -> 0x0076 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0022
            goto L_0x0055
        L_0x0022:
            java.util.LinkedHashMap<K, V> r3 = r6.map     // Catch:{ all -> 0x0076 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x0076 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0076 }
            java.lang.Object r3 = r3.next()     // Catch:{ all -> 0x0076 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0076 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0076 }
            r1 = r4
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0076 }
            r2 = r4
            java.util.LinkedHashMap<K, V> r4 = r6.map     // Catch:{ all -> 0x0076 }
            r4.remove(r1)     // Catch:{ all -> 0x0076 }
            int r4 = r6.size     // Catch:{ all -> 0x0076 }
            int r5 = r6.safeSizeOf(r1, r2)     // Catch:{ all -> 0x0076 }
            int r4 = r4 - r5
            r6.size = r4     // Catch:{ all -> 0x0076 }
            int r4 = r6.evictionCount     // Catch:{ all -> 0x0076 }
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch:{ all -> 0x0076 }
            monitor-exit(r6)     // Catch:{ all -> 0x0076 }
            r6.entryRemoved(r5, r1, r2, r0)
            goto L_0x0003
        L_0x0055:
            monitor-exit(r6)     // Catch:{ all -> 0x0076 }
            return
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.Class r4 = r6.getClass()     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0076 }
            r3.append(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = ".sizeOf() is reporting inconsistent results!"
            r3.append(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0076 }
            r0.<init>(r3)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0076 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.util.LruCache.trimToSize(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        entryRemoved(false, r6, r1, (V) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return r1;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V remove(@android.support.annotation.NonNull K r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x000a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
        L_0x000a:
            monitor-enter(r5)
            r0 = 0
            java.util.LinkedHashMap<K, V> r1 = r5.map     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r1.remove(r6)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x001d
            int r2 = r5.size     // Catch:{ all -> 0x002b }
            int r3 = r5.safeSizeOf(r6, r1)     // Catch:{ all -> 0x002b }
            int r2 = r2 - r3
            r5.size = r2     // Catch:{ all -> 0x002b }
        L_0x001d:
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0024
            r2 = 0
            r5.entryRemoved(r2, r6, r1, r0)
        L_0x0024:
            return r1
        L_0x0025:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0029:
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002b:
            r0 = move-exception
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.util.LruCache.remove(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean evicted, @NonNull K k, @NonNull V v, @Nullable V v2) {
    }

    /* access modifiers changed from: protected */
    @Nullable
    public V create(@NonNull K k) {
        return null;
    }

    private int safeSizeOf(K key, V value) {
        int result = sizeOf(key, value);
        if (result >= 0) {
            return result;
        }
        throw new IllegalStateException("Negative size: " + key + "=" + value);
    }

    /* access modifiers changed from: protected */
    public int sizeOf(@NonNull K k, @NonNull V v) {
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int size() {
        return this.size;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int accesses;
        accesses = this.hitCount + this.missCount;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(accesses != 0 ? (100 * this.hitCount) / accesses : 0)});
    }
}
