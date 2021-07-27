package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.oc */
public class C2022oc implements SafeParcelable {
    public static final Parcelable.Creator<C2022oc> CREATOR = new C2023od();

    /* renamed from: CK */
    final int f4158CK;

    /* renamed from: TW */
    private final String f4159TW;
    private final LatLng ajX;
    private final List<C2020oa> ajY;
    private final String ajZ;
    private final String aka;
    private final String mName;

    C2022oc(int i, String str, LatLng latLng, String str2, List<C2020oa> list, String str3, String str4) {
        this.f4158CK = i;
        this.mName = str;
        this.ajX = latLng;
        this.f4159TW = str2;
        this.ajY = new ArrayList(list);
        this.ajZ = str3;
        this.aka = str4;
    }

    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.f4159TW;
    }

    public String getName() {
        return this.mName;
    }

    public String getPhoneNumber() {
        return this.ajZ;
    }

    /* renamed from: nx */
    public LatLng mo16448nx() {
        return this.ajX;
    }

    /* renamed from: ny */
    public List<C2020oa> mo16449ny() {
        return this.ajY;
    }

    /* renamed from: nz */
    public String mo16450nz() {
        return this.aka;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2023od.m6001a(this, parcel, i);
    }
}
