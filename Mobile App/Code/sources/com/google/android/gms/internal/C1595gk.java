package com.google.android.gms.internal;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@C1507ey
/* renamed from: com.google.android.gms.internal.gk */
public class C1595gk<T> implements Future<T> {

    /* renamed from: wF */
    private final T f3537wF;

    public C1595gk(T t) {
        this.f3537wF = t;
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public T get() {
        return this.f3537wF;
    }

    public T get(long j, TimeUnit timeUnit) {
        return this.f3537wF;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
