package com.google.android.gms.internal;

import com.google.android.gms.internal.C2160qq;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.qr */
public class C2161qr<M extends C2160qq<M>, T> {
    protected final Class<T> ayX;
    protected final boolean ayY;
    public final int tag;
    protected final int type;

    private C2161qr(int i, Class<T> cls, int i2, boolean z) {
        this.type = i;
        this.ayX = cls;
        this.tag = i2;
        this.ayY = z;
    }

    /* renamed from: a */
    public static <M extends C2160qq<M>, T extends C2166qw> C2161qr<M, T> m6447a(int i, Class<T> cls, int i2) {
        return new C2161qr<>(i, cls, i2, false);
    }

    /* renamed from: n */
    private T m6448n(List<C2168qy> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C2168qy qyVar = list.get(i);
            if (qyVar.azi.length != 0) {
                mo17078a(qyVar, (List<Object>) arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        T cast = this.ayX.cast(Array.newInstance(this.ayX.getComponentType(), size));
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(cast, i2, arrayList.get(i2));
        }
        return cast;
    }

    /* renamed from: o */
    private T m6449o(List<C2168qy> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.ayX.cast(mo17083x(C2157qo.m6354p(list.get(list.size() - 1).azi)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo17075B(Object obj) {
        return this.ayY ? mo17076C(obj) : mo17077D(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public int mo17076C(Object obj) {
        int length = Array.getLength(obj);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += mo17077D(Array.get(obj, i2));
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo17077D(Object obj) {
        int hl = C2169qz.m6496hl(this.tag);
        switch (this.type) {
            case 10:
                return C2158qp.m6386b(hl, (C2166qw) obj);
            case 11:
                return C2158qp.m6390c(hl, (C2166qw) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.type);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17078a(C2168qy qyVar, List<Object> list) {
        list.add(mo17083x(C2157qo.m6354p(qyVar.azi)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17079a(Object obj, C2158qp qpVar) throws IOException {
        if (this.ayY) {
            mo17081c(obj, qpVar);
        } else {
            mo17080b(obj, qpVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17080b(Object obj, C2158qp qpVar) {
        try {
            qpVar.mo17062hd(this.tag);
            switch (this.type) {
                case 10:
                    int hl = C2169qz.m6496hl(this.tag);
                    qpVar.mo17052b((C2166qw) obj);
                    qpVar.mo17070x(hl, 4);
                    return;
                case 11:
                    qpVar.mo17054c((C2166qw) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17081c(Object obj, C2158qp qpVar) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                mo17080b(obj2, qpVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final T mo17082m(List<C2168qy> list) {
        if (list == null) {
            return null;
        }
        return this.ayY ? m6448n(list) : m6449o(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Object mo17083x(C2157qo qoVar) {
        Class componentType = this.ayY ? this.ayX.getComponentType() : this.ayX;
        try {
            switch (this.type) {
                case 10:
                    C2166qw qwVar = (C2166qw) componentType.newInstance();
                    qoVar.mo17011a(qwVar, C2169qz.m6496hl(this.tag));
                    return qwVar;
                case 11:
                    C2166qw qwVar2 = (C2166qw) componentType.newInstance();
                    qoVar.mo17010a(qwVar2);
                    return qwVar2;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (InstantiationException e) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }
}
