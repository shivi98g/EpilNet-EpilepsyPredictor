package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@C1507ey
/* renamed from: com.google.android.gms.internal.gh */
public final class C1587gh {

    /* renamed from: ww */
    private static final ThreadFactory f3522ww = new ThreadFactory() {

        /* renamed from: wA */
        private final AtomicInteger f3526wA = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AdWorker #" + this.f3526wA.getAndIncrement());
        }
    };

    /* renamed from: wx */
    private static final ExecutorService f3523wx = Executors.newFixedThreadPool(10, f3522ww);

    /* renamed from: a */
    public static Future<Void> m4636a(final Runnable runnable) {
        return submit(new Callable<Void>() {
            /* renamed from: ds */
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static <T> Future<T> submit(final Callable<T> callable) {
        try {
            return f3523wx.submit(new Callable<T>() {
                public T call() throws Exception {
                    try {
                        Process.setThreadPriority(10);
                        return callable.call();
                    } catch (Exception e) {
                        C1579ga.m4599e(e);
                        return null;
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            C1607gr.m4713d("Thread execution is rejected.", e);
            return new C1595gk(null);
        }
    }
}
