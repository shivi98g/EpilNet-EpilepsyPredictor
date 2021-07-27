package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache {
    final Object ack = new Object();
    private Handler acl;
    private boolean acm;
    private HashMap<String, AtomicInteger> acn;
    private int aco;

    public EventIncrementCache(Looper looper, int i) {
        this.acl = new Handler(looper);
        this.acn = new HashMap<>();
        this.aco = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: lX */
    public void m3550lX() {
        synchronized (this.ack) {
            this.acm = false;
            flush();
        }
    }

    public void flush() {
        synchronized (this.ack) {
            for (Map.Entry next : this.acn.entrySet()) {
                mo13551r((String) next.getKey(), ((AtomicInteger) next.getValue()).get());
            }
            this.acn.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo13551r(String str, int i);

    /* renamed from: y */
    public void mo14118y(String str, int i) {
        synchronized (this.ack) {
            if (!this.acm) {
                this.acm = true;
                this.acl.postDelayed(new Runnable() {
                    public void run() {
                        EventIncrementCache.this.m3550lX();
                    }
                }, (long) this.aco);
            }
            AtomicInteger atomicInteger = this.acn.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                this.acn.put(str, atomicInteger);
            }
            atomicInteger.addAndGet(i);
        }
    }
}
