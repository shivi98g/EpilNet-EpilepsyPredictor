package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableEventList implements SafeParcelable {
    public static final Parcelable.Creator<ParcelableEventList> CREATOR = new C0914c();

    /* renamed from: CK */
    final int f1248CK;

    /* renamed from: Tb */
    final DataHolder f1249Tb;

    /* renamed from: Tc */
    final boolean f1250Tc;

    /* renamed from: Td */
    final List<String> f1251Td;

    /* renamed from: mp */
    final List<ParcelableEvent> f1252mp;

    ParcelableEventList(int i, List<ParcelableEvent> list, DataHolder dataHolder, boolean z, List<String> list2) {
        this.f1248CK = i;
        this.f1252mp = list;
        this.f1249Tb = dataHolder;
        this.f1250Tc = z;
        this.f1251Td = list2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0914c.m1421a(this, parcel, i);
    }
}
