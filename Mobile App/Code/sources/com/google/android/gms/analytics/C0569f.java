package com.google.android.gms.analytics;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.analytics.f */
interface C0569f {
    /* renamed from: dQ */
    void mo10445dQ();

    /* renamed from: dW */
    void mo10446dW();

    /* renamed from: dX */
    LinkedBlockingQueue<Runnable> mo10447dX();

    /* renamed from: dY */
    void mo10448dY();

    void dispatch();

    Thread getThread();

    /* renamed from: u */
    void mo10451u(Map<String, String> map);
}
