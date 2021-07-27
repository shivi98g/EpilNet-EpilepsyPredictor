package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;

public class NotFilter extends AbstractFilter {
    public static final Parcelable.Creator<NotFilter> CREATOR = new C0899k();

    /* renamed from: CK */
    final int f1200CK;

    /* renamed from: Sv */
    final FilterHolder f1201Sv;

    NotFilter(int i, FilterHolder filterHolder) {
        this.f1200CK = i;
        this.f1201Sv = filterHolder;
    }

    public NotFilter(Filter filter) {
        this(1, new FilterHolder(filter));
    }

    /* renamed from: a */
    public <T> T mo11821a(C0894f<T> fVar) {
        return fVar.mo11858j(this.f1201Sv.getFilter().mo11821a(fVar));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0899k.m1388a(this, parcel, i);
    }
}
