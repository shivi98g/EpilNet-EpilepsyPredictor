package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

public abstract class DataBuffer<T> implements Releasable, Iterable<T> {

    /* renamed from: JG */
    protected final DataHolder f763JG;

    protected DataBuffer(DataHolder dataHolder) {
        this.f763JG = dataHolder;
        if (this.f763JG != null) {
            this.f763JG.mo11054e(this);
        }
    }

    @Deprecated
    public final void close() {
        release();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: gV */
    public Bundle mo11030gV() {
        return this.f763JG.mo11058gV();
    }

    public abstract T get(int i);

    public int getCount() {
        if (this.f763JG == null) {
            return 0;
        }
        return this.f763JG.getCount();
    }

    @Deprecated
    public boolean isClosed() {
        if (this.f763JG == null) {
            return true;
        }
        return this.f763JG.isClosed();
    }

    public Iterator<T> iterator() {
        return new C0704c(this);
    }

    public void release() {
        if (this.f763JG != null) {
            this.f763JG.close();
        }
    }

    public Iterator<T> singleRefIterator() {
        return new C0709h(this);
    }
}
