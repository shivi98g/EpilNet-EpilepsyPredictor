package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ha */
public class C1627ha implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<C1627ha> CREATOR = new Parcelable.Creator<C1627ha>() {
        @Deprecated
        /* renamed from: I */
        public C1627ha[] newArray(int i) {
            return new C1627ha[i];
        }

        @Deprecated
        /* renamed from: k */
        public C1627ha createFromParcel(Parcel parcel) {
            return new C1627ha(parcel);
        }
    };

    /* renamed from: CE */
    private String f3605CE;

    /* renamed from: CF */
    private String f3606CF;
    private String mValue;

    @Deprecated
    public C1627ha() {
    }

    @Deprecated
    C1627ha(Parcel parcel) {
        readFromParcel(parcel);
    }

    public C1627ha(String str, String str2, String str3) {
        this.f3605CE = str;
        this.f3606CF = str2;
        this.mValue = str3;
    }

    @Deprecated
    private void readFromParcel(Parcel parcel) {
        this.f3605CE = parcel.readString();
        this.f3606CF = parcel.readString();
        this.mValue = parcel.readString();
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f3605CE;
    }

    public String getValue() {
        return this.mValue;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3605CE);
        parcel.writeString(this.f3606CF);
        parcel.writeString(this.mValue);
    }
}
