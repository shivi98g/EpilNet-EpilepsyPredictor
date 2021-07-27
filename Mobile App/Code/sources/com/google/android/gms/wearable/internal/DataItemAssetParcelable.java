package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.wearable.DataItemAsset;

public class DataItemAssetParcelable implements SafeParcelable, DataItemAsset {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new C2788j();

    /* renamed from: CE */
    private final String f4534CE;

    /* renamed from: CK */
    final int f4535CK;

    /* renamed from: KP */
    private final String f4536KP;

    DataItemAssetParcelable(int i, String str, String str2) {
        this.f4535CK = i;
        this.f4534CE = str;
        this.f4536KP = str2;
    }

    public DataItemAssetParcelable(DataItemAsset dataItemAsset) {
        this.f4535CK = 1;
        this.f4534CE = (String) C1785jx.m5364i(dataItemAsset.getId());
        this.f4536KP = (String) C1785jx.m5364i(dataItemAsset.getDataItemKey());
    }

    public int describeContents() {
        return 0;
    }

    public String getDataItemKey() {
        return this.f4536KP;
    }

    public String getId() {
        return this.f4534CE;
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: ro */
    public DataItemAsset freeze() {
        return this;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f4534CE == null) {
            str = ",noid";
        } else {
            sb.append(",");
            str = this.f4534CE;
        }
        sb.append(str);
        sb.append(", key=");
        sb.append(this.f4536KP);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2788j.m8171a(this, parcel, i);
    }
}
