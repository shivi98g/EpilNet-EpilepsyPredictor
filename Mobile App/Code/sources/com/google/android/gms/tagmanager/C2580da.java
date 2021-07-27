package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.C2604l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.da */
class C2580da<K, V> implements C2603k<K, V> {
    private final Map<K, V> atM = new HashMap();
    private final int atN;
    private final C2604l.C2606a<K, V> atO;
    private int atP;

    C2580da(int i, C2604l.C2606a<K, V> aVar) {
        this.atN = i;
        this.atO = aVar;
    }

    /* renamed from: e */
    public synchronized void mo18667e(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.atP += this.atO.sizeOf(k, v);
        if (this.atP > this.atN) {
            Iterator<Map.Entry<K, V>> it = this.atM.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                this.atP -= this.atO.sizeOf(next.getKey(), next.getValue());
                it.remove();
                if (this.atP <= this.atN) {
                    break;
                }
            }
        }
        this.atM.put(k, v);
    }

    public synchronized V get(K k) {
        return this.atM.get(k);
    }
}
