package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PutDataRequest implements SafeParcelable {
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new C2705e();
    public static final String WEAR_URI_SCHEME = "wear";
    private static final Random axj = new SecureRandom();

    /* renamed from: CK */
    final int f4525CK;
    private byte[] aeA;
    private final Bundle axk;
    private final Uri mUri;

    private PutDataRequest(int i, Uri uri) {
        this(i, uri, new Bundle(), (byte[]) null);
    }

    PutDataRequest(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.f4525CK = i;
        this.mUri = uri;
        this.axk = bundle;
        this.axk.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.aeA = bArr;
    }

    public static PutDataRequest create(String str) {
        return m7892k(m7891di(str));
    }

    public static PutDataRequest createFromDataItem(DataItem dataItem) {
        PutDataRequest k = m7892k(dataItem.getUri());
        for (Map.Entry next : dataItem.getAssets().entrySet()) {
            if (((DataItemAsset) next.getValue()).getId() == null) {
                throw new IllegalStateException("Cannot create an asset for a put request without a digest: " + ((String) next.getKey()));
            }
            k.putAsset((String) next.getKey(), Asset.createFromRef(((DataItemAsset) next.getValue()).getId()));
        }
        k.setData(dataItem.getData());
        return k;
    }

    public static PutDataRequest createWithAutoAppendedId(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("/")) {
            sb.append("/");
        }
        sb.append("PN");
        sb.append(axj.nextLong());
        return new PutDataRequest(1, m7891di(sb.toString()));
    }

    /* renamed from: di */
    private static Uri m7891di(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return new Uri.Builder().scheme(WEAR_URI_SCHEME).path(str).build();
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    /* renamed from: k */
    public static PutDataRequest m7892k(Uri uri) {
        return new PutDataRequest(1, uri);
    }

    public int describeContents() {
        return 0;
    }

    public Asset getAsset(String str) {
        return (Asset) this.axk.getParcelable(str);
    }

    public Map<String, Asset> getAssets() {
        HashMap hashMap = new HashMap();
        for (String str : this.axk.keySet()) {
            hashMap.put(str, (Asset) this.axk.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public byte[] getData() {
        return this.aeA;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean hasAsset(String str) {
        return this.axk.containsKey(str);
    }

    public PutDataRequest putAsset(String str, Asset asset) {
        C1785jx.m5364i(str);
        C1785jx.m5364i(asset);
        this.axk.putParcelable(str, asset);
        return this;
    }

    public PutDataRequest removeAsset(String str) {
        this.axk.remove(str);
        return this;
    }

    /* renamed from: rk */
    public Bundle mo19378rk() {
        return this.axk;
    }

    public PutDataRequest setData(byte[] bArr) {
        this.aeA = bArr;
        return this;
    }

    public String toString() {
        return toString(Log.isLoggable(DataMap.TAG, 3));
    }

    public String toString(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("dataSz=");
        sb2.append(this.aeA == null ? "null" : Integer.valueOf(this.aeA.length));
        sb.append(sb2.toString());
        sb.append(", numAssets=" + this.axk.size());
        sb.append(", uri=" + this.mUri);
        if (!z) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String str2 : this.axk.keySet()) {
                sb.append("\n    " + str2 + ": " + this.axk.getParcelable(str2));
            }
            str = "\n  ]";
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2705e.m7914a(this, parcel, i);
    }
}
