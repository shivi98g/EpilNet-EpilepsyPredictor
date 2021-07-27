package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BasicNetwork implements Network {
    protected static final boolean DEBUG = VolleyLog.DEBUG;
    private static final int DEFAULT_POOL_SIZE = 4096;
    private static final int SLOW_REQUEST_THRESHOLD_MS = 3000;
    private final BaseHttpStack mBaseHttpStack;
    @Deprecated
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    @Deprecated
    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(4096));
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack, ByteArrayPool pool) {
        this.mHttpStack = httpStack;
        this.mBaseHttpStack = new AdaptedHttpStack(httpStack);
        this.mPool = pool;
    }

    public BasicNetwork(BaseHttpStack httpStack) {
        this(httpStack, new ByteArrayPool(4096));
    }

    public BasicNetwork(BaseHttpStack httpStack, ByteArrayPool pool) {
        this.mBaseHttpStack = httpStack;
        this.mHttpStack = httpStack;
        this.mPool = pool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        throw new java.io.IOException();
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0182 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.NetworkResponse performRequest(com.android.volley.Request<?> r30) throws com.android.volley.VolleyError {
        /*
            r29 = this;
            r7 = r29
            r8 = r30
            long r1 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            r9 = r1
            r1 = 0
            r2 = 0
            java.util.List r3 = java.util.Collections.emptyList()
            r11 = 0
            com.android.volley.Cache$Entry r4 = r30.getCacheEntry()     // Catch:{ SocketTimeoutException -> 0x01a6, MalformedURLException -> 0x0188, IOException -> 0x00fc }
            java.util.Map r4 = r7.getCacheHeaders(r4)     // Catch:{ SocketTimeoutException -> 0x01a6, MalformedURLException -> 0x0188, IOException -> 0x00fc }
            r12 = r4
            com.android.volley.toolbox.BaseHttpStack r4 = r7.mBaseHttpStack     // Catch:{ SocketTimeoutException -> 0x01a6, MalformedURLException -> 0x0188, IOException -> 0x00fc }
            com.android.volley.toolbox.HttpResponse r4 = r4.executeRequest(r8, r12)     // Catch:{ SocketTimeoutException -> 0x01a6, MalformedURLException -> 0x0188, IOException -> 0x00fc }
            r13 = r4
            int r1 = r13.getStatusCode()     // Catch:{ SocketTimeoutException -> 0x00f9, MalformedURLException -> 0x00f6, IOException -> 0x00f4 }
            r15 = r1
            java.util.List r1 = r13.getHeaders()     // Catch:{ SocketTimeoutException -> 0x00f9, MalformedURLException -> 0x00f6, IOException -> 0x00f4 }
            r14 = r1
            r1 = 304(0x130, float:4.26E-43)
            if (r15 != r1) goto L_0x0074
            com.android.volley.Cache$Entry r1 = r30.getCacheEntry()     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            if (r1 != 0) goto L_0x004b
            com.android.volley.NetworkResponse r3 = new com.android.volley.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            r17 = 304(0x130, float:4.26E-43)
            r18 = 0
            r19 = 1
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            long r20 = r4 - r9
            r16 = r3
            r22 = r14
            r16.<init>((int) r17, (byte[]) r18, (boolean) r19, (long) r20, (java.util.List<com.android.volley.Header>) r22)     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            return r3
        L_0x004b:
            java.util.List r28 = combineHeaders(r14, r1)     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            com.android.volley.NetworkResponse r3 = new com.android.volley.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            r23 = 304(0x130, float:4.26E-43)
            byte[] r4 = r1.data     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            r25 = 1
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            long r26 = r5 - r9
            r22 = r3
            r24 = r4
            r22.<init>((int) r23, (byte[]) r24, (boolean) r25, (long) r26, (java.util.List<com.android.volley.Header>) r28)     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            return r3
        L_0x0065:
            r0 = move-exception
            r1 = r0
            r3 = r14
            goto L_0x00ff
        L_0x006a:
            r0 = move-exception
            r1 = r0
            r3 = r14
            goto L_0x018b
        L_0x006f:
            r0 = move-exception
            r1 = r0
            r3 = r14
            goto L_0x01a9
        L_0x0074:
            java.io.InputStream r1 = r13.getContent()     // Catch:{ SocketTimeoutException -> 0x00ef, MalformedURLException -> 0x00ea, IOException -> 0x00e6 }
            r6 = r1
            if (r6 == 0) goto L_0x0085
            int r1 = r13.getContentLength()     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            byte[] r1 = r7.inputStreamToBytes(r6, r1)     // Catch:{ SocketTimeoutException -> 0x006f, MalformedURLException -> 0x006a, IOException -> 0x0065 }
            goto L_0x0087
        L_0x0085:
            byte[] r1 = new byte[r11]     // Catch:{ SocketTimeoutException -> 0x00ef, MalformedURLException -> 0x00ea, IOException -> 0x00e6 }
        L_0x0087:
            r21 = r1
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x00e0, MalformedURLException -> 0x00da, IOException -> 0x00d4 }
            long r22 = r1 - r9
            r1 = r7
            r2 = r22
            r4 = r8
            r5 = r21
            r24 = r6
            r6 = r15
            r1.logSlowRequests(r2, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x00e0, MalformedURLException -> 0x00da, IOException -> 0x00d4 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r15 < r1) goto L_0x00bb
            r1 = 299(0x12b, float:4.19E-43)
            if (r15 <= r1) goto L_0x00a6
            r3 = r14
            r2 = r15
            goto L_0x00bd
        L_0x00a6:
            com.android.volley.NetworkResponse r1 = new com.android.volley.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x00e0, MalformedURLException -> 0x00da, IOException -> 0x00d4 }
            r17 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x00e0, MalformedURLException -> 0x00da, IOException -> 0x00d4 }
            long r18 = r2 - r9
            r3 = r14
            r14 = r1
            r2 = r15
            r16 = r21
            r20 = r3
            r14.<init>((int) r15, (byte[]) r16, (boolean) r17, (long) r18, (java.util.List<com.android.volley.Header>) r20)     // Catch:{ SocketTimeoutException -> 0x00ce, MalformedURLException -> 0x00c8, IOException -> 0x00c3 }
            return r1
        L_0x00bb:
            r3 = r14
            r2 = r15
        L_0x00bd:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x00ce, MalformedURLException -> 0x00c8, IOException -> 0x00c3 }
            r1.<init>()     // Catch:{ SocketTimeoutException -> 0x00ce, MalformedURLException -> 0x00c8, IOException -> 0x00c3 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x00ce, MalformedURLException -> 0x00c8, IOException -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            r1 = r0
            r2 = r21
            goto L_0x00ff
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            r2 = r21
            goto L_0x018b
        L_0x00ce:
            r0 = move-exception
            r1 = r0
            r2 = r21
            goto L_0x01a9
        L_0x00d4:
            r0 = move-exception
            r3 = r14
            r1 = r0
            r2 = r21
            goto L_0x00e9
        L_0x00da:
            r0 = move-exception
            r3 = r14
            r1 = r0
            r2 = r21
            goto L_0x00ed
        L_0x00e0:
            r0 = move-exception
            r3 = r14
            r1 = r0
            r2 = r21
            goto L_0x00f2
        L_0x00e6:
            r0 = move-exception
            r3 = r14
            r1 = r0
        L_0x00e9:
            goto L_0x00ff
        L_0x00ea:
            r0 = move-exception
            r3 = r14
            r1 = r0
        L_0x00ed:
            goto L_0x018b
        L_0x00ef:
            r0 = move-exception
            r3 = r14
            r1 = r0
        L_0x00f2:
            goto L_0x01a9
        L_0x00f4:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f6:
            r0 = move-exception
            goto L_0x018a
        L_0x00f9:
            r0 = move-exception
            goto L_0x01a8
        L_0x00fc:
            r0 = move-exception
            r13 = r1
        L_0x00fe:
            r1 = r0
        L_0x00ff:
            if (r13 == 0) goto L_0x0182
            int r4 = r13.getStatusCode()
            java.lang.String r5 = "Unexpected response code %d for %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r6[r11] = r12
            r11 = 1
            java.lang.String r12 = r30.getUrl()
            r6[r11] = r12
            com.android.volley.VolleyLog.m11e(r5, r6)
            if (r2 == 0) goto L_0x0177
            com.android.volley.NetworkResponse r5 = new com.android.volley.NetworkResponse
            r17 = 0
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r18 = r11 - r9
            r14 = r5
            r15 = r4
            r16 = r2
            r20 = r3
            r14.<init>((int) r15, (byte[]) r16, (boolean) r17, (long) r18, (java.util.List<com.android.volley.Header>) r20)
            r6 = 401(0x191, float:5.62E-43)
            if (r4 == r6) goto L_0x016c
            r6 = 403(0x193, float:5.65E-43)
            if (r4 != r6) goto L_0x0139
            goto L_0x016c
        L_0x0139:
            r6 = 400(0x190, float:5.6E-43)
            if (r4 < r6) goto L_0x0147
            r6 = 499(0x1f3, float:6.99E-43)
            if (r4 > r6) goto L_0x0147
            com.android.volley.ClientError r6 = new com.android.volley.ClientError
            r6.<init>(r5)
            throw r6
        L_0x0147:
            r6 = 500(0x1f4, float:7.0E-43)
            if (r4 < r6) goto L_0x0166
            r6 = 599(0x257, float:8.4E-43)
            if (r4 > r6) goto L_0x0166
            boolean r6 = r30.shouldRetryServerErrors()
            if (r6 == 0) goto L_0x0160
            java.lang.String r6 = "server"
            com.android.volley.ServerError r11 = new com.android.volley.ServerError
            r11.<init>(r5)
            attemptRetryOnException(r6, r8, r11)
            goto L_0x01b4
        L_0x0160:
            com.android.volley.ServerError r6 = new com.android.volley.ServerError
            r6.<init>(r5)
            throw r6
        L_0x0166:
            com.android.volley.ServerError r6 = new com.android.volley.ServerError
            r6.<init>(r5)
            throw r6
        L_0x016c:
            java.lang.String r6 = "auth"
            com.android.volley.AuthFailureError r11 = new com.android.volley.AuthFailureError
            r11.<init>((com.android.volley.NetworkResponse) r5)
            attemptRetryOnException(r6, r8, r11)
            goto L_0x01b4
        L_0x0177:
            java.lang.String r5 = "network"
            com.android.volley.NetworkError r6 = new com.android.volley.NetworkError
            r6.<init>()
            attemptRetryOnException(r5, r8, r6)
            goto L_0x01b4
        L_0x0182:
            com.android.volley.NoConnectionError r4 = new com.android.volley.NoConnectionError
            r4.<init>(r1)
            throw r4
        L_0x0188:
            r0 = move-exception
            r13 = r1
        L_0x018a:
            r1 = r0
        L_0x018b:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bad URL "
            r5.append(r6)
            java.lang.String r6 = r30.getUrl()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5, r1)
            throw r4
        L_0x01a6:
            r0 = move-exception
            r13 = r1
        L_0x01a8:
            r1 = r0
        L_0x01a9:
            java.lang.String r4 = "socket"
            com.android.volley.TimeoutError r5 = new com.android.volley.TimeoutError
            r5.<init>()
            attemptRetryOnException(r4, r8, r5)
        L_0x01b4:
            r1 = r9
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.BasicNetwork.performRequest(com.android.volley.Request):com.android.volley.NetworkResponse");
    }

    private void logSlowRequests(long requestLifetime, Request<?> request, byte[] responseContents, int statusCode) {
        if (DEBUG || requestLifetime > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(requestLifetime);
            objArr[2] = responseContents != null ? Integer.valueOf(responseContents.length) : "null";
            objArr[3] = Integer.valueOf(statusCode);
            objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
            VolleyLog.m10d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    private static void attemptRetryOnException(String logPrefix, Request<?> request, VolleyError exception) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int oldTimeout = request.getTimeoutMs();
        try {
            retryPolicy.retry(exception);
            request.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{logPrefix, Integer.valueOf(oldTimeout)}));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{logPrefix, Integer.valueOf(oldTimeout)}));
            throw e;
        }
    }

    private Map<String, String> getCacheHeaders(Cache.Entry entry) {
        if (entry == null) {
            return Collections.emptyMap();
        }
        Map<String, String> headers = new HashMap<>();
        if (entry.etag != null) {
            headers.put("If-None-Match", entry.etag);
        }
        if (entry.lastModified > 0) {
            headers.put("If-Modified-Since", HttpHeaderParser.formatEpochAsRfc1123(entry.lastModified));
        }
        return headers;
    }

    /* access modifiers changed from: protected */
    public void logError(String what, String url, long start) {
        VolleyLog.m13v("HTTP ERROR(%s) %d ms to fetch %s", what, Long.valueOf(SystemClock.elapsedRealtime() - start), url);
    }

    private byte[] inputStreamToBytes(InputStream in, int contentLength) throws IOException, ServerError {
        PoolingByteArrayOutputStream bytes = new PoolingByteArrayOutputStream(this.mPool, contentLength);
        if (in == null) {
            try {
                throw new ServerError();
            } catch (Throwable th) {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        VolleyLog.m13v("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.mPool.returnBuf((byte[]) null);
                bytes.close();
                throw th;
            }
        } else {
            byte[] buffer = this.mPool.getBuf(1024);
            while (true) {
                int read = in.read(buffer);
                int count = read;
                if (read == -1) {
                    break;
                }
                bytes.write(buffer, 0, count);
            }
            byte[] byteArray = bytes.toByteArray();
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e2) {
                    VolleyLog.m13v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.mPool.returnBuf(buffer);
            bytes.close();
            return byteArray;
        }
    }

    @Deprecated
    protected static Map<String, String> convertHeaders(Header[] headers) {
        Map<String, String> result = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headers.length; i++) {
            result.put(headers[i].getName(), headers[i].getValue());
        }
        return result;
    }

    private static List<Header> combineHeaders(List<Header> responseHeaders, Cache.Entry entry) {
        Set<String> headerNamesFromNetworkResponse = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        if (!responseHeaders.isEmpty()) {
            for (Header header : responseHeaders) {
                headerNamesFromNetworkResponse.add(header.getName());
            }
        }
        List<Header> combinedHeaders = new ArrayList<>(responseHeaders);
        if (entry.allResponseHeaders != null) {
            if (!entry.allResponseHeaders.isEmpty()) {
                for (Header header2 : entry.allResponseHeaders) {
                    if (!headerNamesFromNetworkResponse.contains(header2.getName())) {
                        combinedHeaders.add(header2);
                    }
                }
            }
        } else if (!entry.responseHeaders.isEmpty()) {
            for (Map.Entry<String, String> header3 : entry.responseHeaders.entrySet()) {
                if (!headerNamesFromNetworkResponse.contains(header3.getKey())) {
                    combinedHeaders.add(new Header(header3.getKey(), header3.getValue()));
                }
            }
        }
        return combinedHeaders;
    }
}
