package com.google.android.gms.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.me */
class C1893me<T extends Result> implements PendingResult<T> {

    /* renamed from: UU */
    private final T f4059UU;

    C1893me(T t) {
        this.f4059UU = t;
    }

    /* renamed from: a */
    public void mo10909a(PendingResult.C0672a aVar) {
        aVar.mo10933m(this.f4059UU.getStatus());
    }

    public T await() {
        return this.f4059UU;
    }

    public T await(long j, TimeUnit timeUnit) {
        return this.f4059UU;
    }

    public void cancel() {
    }

    public boolean isCanceled() {
        return false;
    }

    public void setResultCallback(ResultCallback<T> resultCallback) {
        resultCallback.onResult(this.f4059UU);
    }

    public void setResultCallback(ResultCallback<T> resultCallback, long j, TimeUnit timeUnit) {
        resultCallback.onResult(this.f4059UU);
    }
}
