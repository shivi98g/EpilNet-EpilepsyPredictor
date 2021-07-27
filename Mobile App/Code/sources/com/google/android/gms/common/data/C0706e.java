package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.common.data.e */
public class C0706e<T extends SafeParcelable> extends DataBuffer<T> {

    /* renamed from: Lb */
    private static final String[] f793Lb = {"data"};

    /* renamed from: Lc */
    private final Parcelable.Creator<T> f794Lc;

    public C0706e(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.f794Lc = creator;
    }

    /* renamed from: at */
    public T get(int i) {
        byte[] f = this.f763JG.mo11055f("data", i, this.f763JG.mo11047au(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(f, 0, f.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f794Lc.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
