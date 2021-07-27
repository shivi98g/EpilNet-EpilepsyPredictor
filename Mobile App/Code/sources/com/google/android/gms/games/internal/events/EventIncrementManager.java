package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

public abstract class EventIncrementManager {
    private final AtomicReference<EventIncrementCache> acq = new AtomicReference<>();

    public void flush() {
        EventIncrementCache eventIncrementCache = this.acq.get();
        if (eventIncrementCache != null) {
            eventIncrementCache.flush();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: lF */
    public abstract EventIncrementCache mo13539lF();

    /* renamed from: o */
    public void mo14121o(String str, int i) {
        EventIncrementCache eventIncrementCache = this.acq.get();
        if (eventIncrementCache == null) {
            eventIncrementCache = mo13539lF();
            if (!this.acq.compareAndSet((Object) null, eventIncrementCache)) {
                eventIncrementCache = this.acq.get();
            }
        }
        eventIncrementCache.mo14118y(str, i);
    }
}
