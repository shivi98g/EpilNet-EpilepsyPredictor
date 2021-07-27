package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C1507ey
/* renamed from: com.google.android.gms.internal.bj */
public final class C1327bj implements SafeParcelable {
    public static final C1328bk CREATOR = new C1328bk();
    public final int backgroundColor;

    /* renamed from: oQ */
    public final int f2665oQ;

    /* renamed from: oR */
    public final int f2666oR;

    /* renamed from: oS */
    public final int f2667oS;

    /* renamed from: oT */
    public final int f2668oT;

    /* renamed from: oU */
    public final int f2669oU;

    /* renamed from: oV */
    public final int f2670oV;

    /* renamed from: oW */
    public final int f2671oW;

    /* renamed from: oX */
    public final String f2672oX;

    /* renamed from: oY */
    public final int f2673oY;

    /* renamed from: oZ */
    public final String f2674oZ;

    /* renamed from: pa */
    public final int f2675pa;

    /* renamed from: pb */
    public final int f2676pb;

    /* renamed from: pc */
    public final String f2677pc;
    public final int versionCode;

    C1327bj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.versionCode = i;
        this.f2665oQ = i2;
        this.backgroundColor = i3;
        this.f2666oR = i4;
        this.f2667oS = i5;
        this.f2668oT = i6;
        this.f2669oU = i7;
        this.f2670oV = i8;
        this.f2671oW = i9;
        this.f2672oX = str;
        this.f2673oY = i10;
        this.f2674oZ = str2;
        this.f2675pa = i11;
        this.f2676pb = i12;
        this.f2677pc = str3;
    }

    public C1327bj(SearchAdRequest searchAdRequest) {
        this.versionCode = 1;
        this.f2665oQ = searchAdRequest.getAnchorTextColor();
        this.backgroundColor = searchAdRequest.getBackgroundColor();
        this.f2666oR = searchAdRequest.getBackgroundGradientBottom();
        this.f2667oS = searchAdRequest.getBackgroundGradientTop();
        this.f2668oT = searchAdRequest.getBorderColor();
        this.f2669oU = searchAdRequest.getBorderThickness();
        this.f2670oV = searchAdRequest.getBorderType();
        this.f2671oW = searchAdRequest.getCallButtonColor();
        this.f2672oX = searchAdRequest.getCustomChannels();
        this.f2673oY = searchAdRequest.getDescriptionTextColor();
        this.f2674oZ = searchAdRequest.getFontFace();
        this.f2675pa = searchAdRequest.getHeaderTextColor();
        this.f2676pb = searchAdRequest.getHeaderTextSize();
        this.f2677pc = searchAdRequest.getQuery();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1328bk.m4017a(this, parcel, i);
    }
}
