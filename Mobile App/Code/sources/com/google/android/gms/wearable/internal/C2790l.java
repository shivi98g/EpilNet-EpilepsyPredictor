package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.l */
public class C2790l implements DataItem {
    private byte[] aeA;
    private Map<String, DataItemAsset> axH;
    private Uri mUri;

    public C2790l(DataItem dataItem) {
        this.mUri = dataItem.getUri();
        this.aeA = dataItem.getData();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : dataItem.getAssets().entrySet()) {
            if (next.getKey() != null) {
                hashMap.put(next.getKey(), ((DataItemAsset) next.getValue()).freeze());
            }
        }
        this.axH = Collections.unmodifiableMap(hashMap);
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

    /* renamed from: rp */
    public DataItem freeze() {
        return this;
    }

    public DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("DataItemEntity[");
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
}
