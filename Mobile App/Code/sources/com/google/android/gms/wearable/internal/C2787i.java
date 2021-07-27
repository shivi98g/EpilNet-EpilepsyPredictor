package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

/* renamed from: com.google.android.gms.wearable.internal.i */
public class C2787i implements DataItemAsset {

    /* renamed from: CE */
    private final String f4560CE;

    /* renamed from: KP */
    private final String f4561KP;

    public C2787i(DataItemAsset dataItemAsset) {
        this.f4560CE = dataItemAsset.getId();
        this.f4561KP = dataItemAsset.getDataItemKey();
    }

    public String getDataItemKey() {
        return this.f4561KP;
    }

    public String getId() {
        return this.f4560CE;
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
        sb.append("DataItemAssetEntity[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f4560CE == null) {
            str = ",noid";
        } else {
            sb.append(",");
            str = this.f4560CE;
        }
        sb.append(str);
        sb.append(", key=");
        sb.append(this.f4561KP);
        sb.append("]");
        return sb.toString();
    }
}
