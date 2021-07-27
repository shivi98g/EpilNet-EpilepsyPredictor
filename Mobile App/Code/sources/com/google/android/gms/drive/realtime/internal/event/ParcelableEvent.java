package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableEvent implements SafeParcelable {
    public static final Parcelable.Creator<ParcelableEvent> CREATOR = new C0913b();

    /* renamed from: CK */
    final int f1233CK;

    /* renamed from: SJ */
    final String f1234SJ;

    /* renamed from: SM */
    final String f1235SM;

    /* renamed from: SQ */
    final List<String> f1236SQ;

    /* renamed from: SR */
    final boolean f1237SR;

    /* renamed from: SS */
    final String f1238SS;

    /* renamed from: ST */
    final TextInsertedDetails f1239ST;

    /* renamed from: SU */
    final TextDeletedDetails f1240SU;

    /* renamed from: SV */
    final ValuesAddedDetails f1241SV;

    /* renamed from: SW */
    final ValuesRemovedDetails f1242SW;

    /* renamed from: SX */
    final ValuesSetDetails f1243SX;

    /* renamed from: SY */
    final ValueChangedDetails f1244SY;

    /* renamed from: SZ */
    final ReferenceShiftedDetails f1245SZ;

    /* renamed from: Ta */
    final ObjectChangedDetails f1246Ta;

    /* renamed from: vZ */
    final String f1247vZ;

    ParcelableEvent(int i, String str, String str2, List<String> list, boolean z, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails, ObjectChangedDetails objectChangedDetails) {
        this.f1233CK = i;
        this.f1247vZ = str;
        this.f1234SJ = str2;
        this.f1236SQ = list;
        this.f1237SR = z;
        this.f1235SM = str3;
        this.f1238SS = str4;
        this.f1239ST = textInsertedDetails;
        this.f1240SU = textDeletedDetails;
        this.f1241SV = valuesAddedDetails;
        this.f1242SW = valuesRemovedDetails;
        this.f1243SX = valuesSetDetails;
        this.f1244SY = valueChangedDetails;
        this.f1245SZ = referenceShiftedDetails;
        this.f1246Ta = objectChangedDetails;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0913b.m1418a(this, parcel, i);
    }
}
