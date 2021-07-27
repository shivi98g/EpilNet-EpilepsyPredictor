package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.data.h */
public class C0709h<T> extends C0704c<T> {

    /* renamed from: Lt */
    private T f797Lt;

    public C0709h(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f789KX);
        }
        this.f789KX++;
        if (this.f789KX == 0) {
            this.f797Lt = this.f788KW.get(0);
            if (!(this.f797Lt instanceof C0705d)) {
                throw new IllegalStateException("DataBuffer reference of type " + this.f797Lt.getClass() + " is not movable");
            }
        } else {
            ((C0705d) this.f797Lt).mo11083as(this.f789KX);
        }
        return this.f797Lt;
    }
}
