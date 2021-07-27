package com.google.android.gms.common.api;

import com.google.android.gms.internal.C1785jx;
import java.util.concurrent.TimeUnit;

public final class BatchResult implements Result {

    /* renamed from: Eb */
    private final Status f646Eb;

    /* renamed from: JC */
    private final PendingResult<?>[] f647JC;

    BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f646Eb = status;
        this.f647JC = pendingResultArr;
    }

    public Status getStatus() {
        return this.f646Eb;
    }

    public <R extends Result> R take(BatchResultToken<R> batchResultToken) {
        C1785jx.m5361b(batchResultToken.mId < this.f647JC.length, (Object) "The result token does not belong to this batch");
        return this.f647JC[batchResultToken.mId].await(0, TimeUnit.MILLISECONDS);
    }
}
