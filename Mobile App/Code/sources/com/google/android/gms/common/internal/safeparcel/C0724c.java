package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.common.internal.safeparcel.c */
public final class C0724c {
    /* renamed from: a */
    public static <T extends SafeParcelable> T m778a(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m779a(byteArrayExtra, creator);
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> T m779a(byte[] bArr, Parcelable.Creator<T> creator) {
        C1785jx.m5364i(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> void m780a(T t, Intent intent, String str) {
        intent.putExtra(str, m781a(t));
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> byte[] m781a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
