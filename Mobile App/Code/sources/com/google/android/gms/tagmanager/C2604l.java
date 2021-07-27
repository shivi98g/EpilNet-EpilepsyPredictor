package com.google.android.gms.tagmanager;

import android.os.Build;

/* renamed from: com.google.android.gms.tagmanager.l */
class C2604l<K, V> {
    final C2606a<K, V> aqk = new C2606a<K, V>() {
        public int sizeOf(K k, V v) {
            return 1;
        }
    };

    /* renamed from: com.google.android.gms.tagmanager.l$a */
    public interface C2606a<K, V> {
        int sizeOf(K k, V v);
    }

    /* renamed from: a */
    public C2603k<K, V> mo18850a(int i, C2606a<K, V> aVar) {
        if (i > 0) {
            return mo18851pg() < 12 ? new C2580da(i, aVar) : new C2496bb(i, aVar);
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pg */
    public int mo18851pg() {
        return Build.VERSION.SDK_INT;
    }
}
