package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C1507ey
/* renamed from: com.google.android.gms.internal.gj */
public class C1594gj<T> implements Future<T> {

    /* renamed from: mH */
    private final Object f3533mH = new Object();

    /* renamed from: qj */
    private boolean f3534qj = false;

    /* renamed from: wF */
    private T f3535wF = null;

    /* renamed from: wG */
    private boolean f3536wG = false;

    /* renamed from: a */
    public void mo15389a(T t) {
        synchronized (this.f3533mH) {
            if (this.f3536wG) {
                throw new IllegalStateException("Provided CallbackFuture with multiple values.");
            }
            this.f3536wG = true;
            this.f3535wF = t;
            this.f3533mH.notifyAll();
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f3533mH) {
            if (this.f3536wG) {
                return false;
            }
            this.f3534qj = true;
            this.f3536wG = true;
            this.f3533mH.notifyAll();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.f3533mH) {
            if (!this.f3536wG) {
                try {
                    this.f3533mH.wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.f3534qj) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.f3535wF;
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) throws TimeoutException {
        T t;
        synchronized (this.f3533mH) {
            if (!this.f3536wG) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f3533mH.wait(millis);
                    }
                } catch (InterruptedException e) {
                }
            }
            if (!this.f3536wG) {
                throw new TimeoutException("CallbackFuture timed out.");
            } else if (this.f3534qj) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.f3535wF;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f3533mH) {
            z = this.f3534qj;
        }
        return z;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this.f3533mH) {
            z = this.f3536wG;
        }
        return z;
    }
}
