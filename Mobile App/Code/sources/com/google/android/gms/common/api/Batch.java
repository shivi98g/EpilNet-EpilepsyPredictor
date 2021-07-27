package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.PendingResult;
import java.util.ArrayList;
import java.util.List;

public final class Batch extends BaseImplementation.AbstractPendingResult<BatchResult> {
    /* access modifiers changed from: private */

    /* renamed from: JA */
    public boolean f638JA;
    /* access modifiers changed from: private */

    /* renamed from: JB */
    public boolean f639JB;
    /* access modifiers changed from: private */

    /* renamed from: JC */
    public final PendingResult<?>[] f640JC;
    /* access modifiers changed from: private */

    /* renamed from: Jz */
    public int f641Jz;
    /* access modifiers changed from: private */

    /* renamed from: mH */
    public final Object f642mH;

    public static final class Builder {

        /* renamed from: JE */
        private List<PendingResult<?>> f644JE = new ArrayList();

        /* renamed from: JF */
        private Looper f645JF;

        public Builder(GoogleApiClient googleApiClient) {
            this.f645JF = googleApiClient.getLooper();
        }

        public <R extends Result> BatchResultToken<R> add(PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.f644JE.size());
            this.f644JE.add(pendingResult);
            return batchResultToken;
        }

        public Batch build() {
            return new Batch(this.f644JE, this.f645JF);
        }
    }

    private Batch(List<PendingResult<?>> list, Looper looper) {
        super(new BaseImplementation.CallbackHandler(looper));
        this.f642mH = new Object();
        this.f641Jz = list.size();
        this.f640JC = new PendingResult[this.f641Jz];
        for (int i = 0; i < list.size(); i++) {
            PendingResult<?> pendingResult = list.get(i);
            this.f640JC[i] = pendingResult;
            pendingResult.mo10909a(new PendingResult.C0672a() {
                /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
                    return;
                 */
                /* renamed from: m */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo10933m(com.google.android.gms.common.api.Status r5) {
                    /*
                        r4 = this;
                        com.google.android.gms.common.api.Batch r0 = com.google.android.gms.common.api.Batch.this
                        java.lang.Object r0 = r0.f642mH
                        monitor-enter(r0)
                        com.google.android.gms.common.api.Batch r1 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        boolean r1 = r1.isCanceled()     // Catch:{ all -> 0x0068 }
                        if (r1 == 0) goto L_0x0011
                        monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                        return
                    L_0x0011:
                        boolean r1 = r5.isCanceled()     // Catch:{ all -> 0x0068 }
                        r2 = 1
                        if (r1 == 0) goto L_0x001e
                        com.google.android.gms.common.api.Batch r5 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        boolean unused = r5.f639JB = r2     // Catch:{ all -> 0x0068 }
                        goto L_0x0029
                    L_0x001e:
                        boolean r5 = r5.isSuccess()     // Catch:{ all -> 0x0068 }
                        if (r5 != 0) goto L_0x0029
                        com.google.android.gms.common.api.Batch r5 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        boolean unused = r5.f638JA = r2     // Catch:{ all -> 0x0068 }
                    L_0x0029:
                        com.google.android.gms.common.api.Batch r5 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        com.google.android.gms.common.api.Batch.m527b(r5)     // Catch:{ all -> 0x0068 }
                        com.google.android.gms.common.api.Batch r5 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        int r5 = r5.f641Jz     // Catch:{ all -> 0x0068 }
                        if (r5 != 0) goto L_0x0066
                        com.google.android.gms.common.api.Batch r5 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        boolean r5 = r5.f639JB     // Catch:{ all -> 0x0068 }
                        if (r5 == 0) goto L_0x0044
                        com.google.android.gms.common.api.Batch r5 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        com.google.android.gms.common.api.Batch.super.cancel()     // Catch:{ all -> 0x0068 }
                        goto L_0x0066
                    L_0x0044:
                        com.google.android.gms.common.api.Batch r5 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        boolean r5 = r5.f638JA     // Catch:{ all -> 0x0068 }
                        if (r5 == 0) goto L_0x0054
                        com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0068 }
                        r1 = 13
                        r5.<init>(r1)     // Catch:{ all -> 0x0068 }
                        goto L_0x0056
                    L_0x0054:
                        com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.f663Kw     // Catch:{ all -> 0x0068 }
                    L_0x0056:
                        com.google.android.gms.common.api.Batch r1 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        com.google.android.gms.common.api.BatchResult r2 = new com.google.android.gms.common.api.BatchResult     // Catch:{ all -> 0x0068 }
                        com.google.android.gms.common.api.Batch r3 = com.google.android.gms.common.api.Batch.this     // Catch:{ all -> 0x0068 }
                        com.google.android.gms.common.api.PendingResult[] r3 = r3.f640JC     // Catch:{ all -> 0x0068 }
                        r2.<init>(r5, r3)     // Catch:{ all -> 0x0068 }
                        r1.mo10914b(r2)     // Catch:{ all -> 0x0068 }
                    L_0x0066:
                        monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                        return
                    L_0x0068:
                        r5 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0068 }
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Batch.C06711.mo10933m(com.google.android.gms.common.api.Status):void");
                }
            });
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m527b(Batch batch) {
        int i = batch.f641Jz;
        batch.f641Jz = i - 1;
        return i;
    }

    public void cancel() {
        super.cancel();
        for (PendingResult<?> cancel : this.f640JC) {
            cancel.cancel();
        }
    }

    /* renamed from: createFailedResult */
    public BatchResult mo10544c(Status status) {
        return new BatchResult(status, this.f640JC);
    }
}
