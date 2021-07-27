package com.android.volley;

import android.os.Process;
import com.android.volley.Cache;
import com.android.volley.Request;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class CacheDispatcher extends Thread {
    private static final boolean DEBUG = VolleyLog.DEBUG;
    private final Cache mCache;
    private final BlockingQueue<Request<?>> mCacheQueue;
    /* access modifiers changed from: private */
    public final ResponseDelivery mDelivery;
    /* access modifiers changed from: private */
    public final BlockingQueue<Request<?>> mNetworkQueue;
    private volatile boolean mQuit = false;
    private final WaitingRequestManager mWaitingRequestManager;

    public CacheDispatcher(BlockingQueue<Request<?>> cacheQueue, BlockingQueue<Request<?>> networkQueue, Cache cache, ResponseDelivery delivery) {
        this.mCacheQueue = cacheQueue;
        this.mNetworkQueue = networkQueue;
        this.mCache = cache;
        this.mDelivery = delivery;
        this.mWaitingRequestManager = new WaitingRequestManager(this);
    }

    public void quit() {
        this.mQuit = true;
        interrupt();
    }

    public void run() {
        if (DEBUG) {
            VolleyLog.m13v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.mCache.initialize();
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException e) {
                if (this.mQuit) {
                    return;
                }
            }
        }
    }

    private void processRequest() throws InterruptedException {
        final Request<?> request = this.mCacheQueue.take();
        request.addMarker("cache-queue-take");
        if (request.isCanceled()) {
            request.finish("cache-discard-canceled");
            return;
        }
        Cache.Entry entry = this.mCache.get(request.getCacheKey());
        if (entry == null) {
            request.addMarker("cache-miss");
            if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                this.mNetworkQueue.put(request);
            }
        } else if (entry.isExpired()) {
            request.addMarker("cache-hit-expired");
            request.setCacheEntry(entry);
            if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                this.mNetworkQueue.put(request);
            }
        } else {
            request.addMarker("cache-hit");
            Response<?> response = request.parseNetworkResponse(new NetworkResponse(entry.data, entry.responseHeaders));
            request.addMarker("cache-hit-parsed");
            if (!entry.refreshNeeded()) {
                this.mDelivery.postResponse(request, response);
                return;
            }
            request.addMarker("cache-hit-refresh-needed");
            request.setCacheEntry(entry);
            response.intermediate = true;
            if (!this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                this.mDelivery.postResponse(request, response, new Runnable() {
                    public void run() {
                        try {
                            CacheDispatcher.this.mNetworkQueue.put(request);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                });
            } else {
                this.mDelivery.postResponse(request, response);
            }
        }
    }

    private static class WaitingRequestManager implements Request.NetworkRequestCompleteListener {
        private final CacheDispatcher mCacheDispatcher;
        private final Map<String, List<Request<?>>> mWaitingRequests = new HashMap();

        WaitingRequestManager(CacheDispatcher cacheDispatcher) {
            this.mCacheDispatcher = cacheDispatcher;
        }

        public void onResponseReceived(Request<?> request, Response<?> response) {
            List<Request<?>> waitingRequests;
            if (response.cacheEntry == null || response.cacheEntry.isExpired()) {
                onNoUsableResponseReceived(request);
                return;
            }
            String cacheKey = request.getCacheKey();
            synchronized (this) {
                waitingRequests = this.mWaitingRequests.remove(cacheKey);
            }
            if (waitingRequests != null) {
                if (VolleyLog.DEBUG) {
                    VolleyLog.m13v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(waitingRequests.size()), cacheKey);
                }
                for (Request<?> waiting : waitingRequests) {
                    this.mCacheDispatcher.mDelivery.postResponse(waiting, response);
                }
            }
        }

        public synchronized void onNoUsableResponseReceived(Request<?> request) {
            String cacheKey = request.getCacheKey();
            List<Request<?>> waitingRequests = this.mWaitingRequests.remove(cacheKey);
            if (waitingRequests != null && !waitingRequests.isEmpty()) {
                if (VolleyLog.DEBUG) {
                    VolleyLog.m13v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(waitingRequests.size()), cacheKey);
                }
                Request<?> nextInLine = waitingRequests.remove(0);
                this.mWaitingRequests.put(cacheKey, waitingRequests);
                nextInLine.setNetworkRequestCompleteListener(this);
                try {
                    this.mCacheDispatcher.mNetworkQueue.put(nextInLine);
                } catch (InterruptedException iex) {
                    VolleyLog.m11e("Couldn't add request to queue. %s", iex.toString());
                    Thread.currentThread().interrupt();
                    this.mCacheDispatcher.quit();
                }
            }
            return;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean maybeAddToWaitingRequests(com.android.volley.Request<?> r7) {
            /*
                r6 = this;
                monitor-enter(r6)
                java.lang.String r0 = r7.getCacheKey()     // Catch:{ all -> 0x0053 }
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r6.mWaitingRequests     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0053 }
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x003b
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r6.mWaitingRequests     // Catch:{ all -> 0x0053 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0053 }
                java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x001f
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0053 }
                r4.<init>()     // Catch:{ all -> 0x0053 }
                r1 = r4
            L_0x001f:
                java.lang.String r4 = "waiting-for-response"
                r7.addMarker(r4)     // Catch:{ all -> 0x0053 }
                r1.add(r7)     // Catch:{ all -> 0x0053 }
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r4 = r6.mWaitingRequests     // Catch:{ all -> 0x0053 }
                r4.put(r0, r1)     // Catch:{ all -> 0x0053 }
                boolean r4 = com.android.volley.VolleyLog.DEBUG     // Catch:{ all -> 0x0053 }
                if (r4 == 0) goto L_0x0039
                java.lang.String r4 = "Request for cacheKey=%s is in flight, putting on hold."
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0053 }
                r5[r2] = r0     // Catch:{ all -> 0x0053 }
                com.android.volley.VolleyLog.m10d(r4, r5)     // Catch:{ all -> 0x0053 }
            L_0x0039:
                monitor-exit(r6)
                return r3
            L_0x003b:
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r6.mWaitingRequests     // Catch:{ all -> 0x0053 }
                r4 = 0
                r1.put(r0, r4)     // Catch:{ all -> 0x0053 }
                r7.setNetworkRequestCompleteListener(r6)     // Catch:{ all -> 0x0053 }
                boolean r1 = com.android.volley.VolleyLog.DEBUG     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0051
                java.lang.String r1 = "new request, sending to network %s"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0053 }
                r3[r2] = r0     // Catch:{ all -> 0x0053 }
                com.android.volley.VolleyLog.m10d(r1, r3)     // Catch:{ all -> 0x0053 }
            L_0x0051:
                monitor-exit(r6)
                return r2
            L_0x0053:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.CacheDispatcher.WaitingRequestManager.maybeAddToWaitingRequests(com.android.volley.Request):boolean");
        }
    }
}
