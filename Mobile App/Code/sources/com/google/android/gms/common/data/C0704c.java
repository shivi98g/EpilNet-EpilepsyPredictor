package com.google.android.gms.common.data;

import com.google.android.gms.internal.C1785jx;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.data.c */
public class C0704c<T> implements Iterator<T> {

    /* renamed from: KW */
    protected final DataBuffer<T> f788KW;

    /* renamed from: KX */
    protected int f789KX = -1;

    public C0704c(DataBuffer<T> dataBuffer) {
        this.f788KW = (DataBuffer) C1785jx.m5364i(dataBuffer);
    }

    public boolean hasNext() {
        return this.f789KX < this.f788KW.getCount() - 1;
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f789KX);
        }
        DataBuffer<T> dataBuffer = this.f788KW;
        int i = this.f789KX + 1;
        this.f789KX = i;
        return dataBuffer.get(i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
