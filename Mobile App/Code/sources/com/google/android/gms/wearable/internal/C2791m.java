package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.m */
public class C2791m implements SafeParcelable, DataItem {
    public static final Parcelable.Creator<C2791m> CREATOR = new C2792n();

    /* renamed from: CK */
    final int f4562CK;
    private byte[] aeA;
    private final Map<String, DataItemAsset> axH;
    private final Uri mUri;

    C2791m(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.f4562CK = i;
        this.mUri = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.axH = hashMap;
        this.aeA = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public Map<String, DataItemAsset> getAssets() {
        return this.axH;
    }

    public byte[] getData() {
        return this.aeA;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: m */
    public C2791m setData(byte[] bArr) {
        this.aeA = bArr;
        return this;
    }

    /* renamed from: rk */
    public Bundle mo19608rk() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry next : this.axH.entrySet()) {
            bundle.putParcelable((String) next.getKey(), new DataItemAssetParcelable((DataItemAsset) next.getValue()));
        }
        return bundle;
    }

    /* renamed from: rq */
    public C2791m freeze() {
        return this;
    }

    public String toString() {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(",dataSz=");
        sb2.append(this.aeA == null ? "null" : Integer.valueOf(this.aeA.length));
        sb.append(sb2.toString());
        sb.append(", numAssets=" + this.axH.size());
        sb.append(", uri=" + this.mUri);
        if (!z) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String next : this.axH.keySet()) {
                sb.append("\n    " + next + ": " + this.axH.get(next));
            }
            str = "\n  ]";
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2792n.m8179a(this, parcel, i);
    }
}
