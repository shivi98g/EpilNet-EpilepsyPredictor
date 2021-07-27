package com.google.android.gms.tagmanager;

import android.util.LruCache;
import com.google.android.gms.tagmanager.C2604l;

/* renamed from: com.google.android.gms.tagmanager.bb */
class C2496bb<K, V> implements C2603k<K, V> {
    private LruCache<K, V> arR;

    C2496bb(int i, final C2604l.C2606a<K, V> aVar) {
        this.arR = new LruCache<K, V>(i) {
            /* access modifiers changed from: protected */
            public int sizeOf(K k, V v) {
                return aVar.sizeOf(k, v);
            }
        };
    }

    /* renamed from: e */
    public void mo18667e(K k, V v) {
        this.arR.put(k, v);
    }

    public V get(K k) {
        return this.arR.get(k);
    }
}
