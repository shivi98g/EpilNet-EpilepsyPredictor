package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.C2150ql;
import com.google.android.gms.internal.C2166qw;

public class PutDataMapRequest {
    private final DataMap axh = new DataMap();
    private final PutDataRequest axi;

    private PutDataMapRequest(PutDataRequest putDataRequest, DataMap dataMap) {
        this.axi = putDataRequest;
        if (dataMap != null) {
            this.axh.putAll(dataMap);
        }
    }

    public static PutDataMapRequest create(String str) {
        return new PutDataMapRequest(PutDataRequest.create(str), (DataMap) null);
    }

    public static PutDataMapRequest createFromDataMapItem(DataMapItem dataMapItem) {
        return new PutDataMapRequest(PutDataRequest.m7892k(dataMapItem.getUri()), dataMapItem.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(String str) {
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(str), (DataMap) null);
    }

    public PutDataRequest asPutDataRequest() {
        C2150ql.C2151a a = C2150ql.m6321a(this.axh);
        this.axi.setData(C2166qw.m6480f(a.ayo));
        int size = a.ayp.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = a.ayp.get(i);
            if (num == null) {
                throw new IllegalStateException("asset key cannot be null: " + asset);
            } else if (asset == null) {
                throw new IllegalStateException("asset cannot be null: key=" + num);
            } else {
                if (Log.isLoggable(DataMap.TAG, 3)) {
                    Log.d(DataMap.TAG, "asPutDataRequest: adding asset: " + num + " " + asset);
                }
                this.axi.putAsset(num, asset);
                i++;
            }
        }
        return this.axi;
    }

    public DataMap getDataMap() {
        return this.axh;
    }

    public Uri getUri() {
        return this.axi.getUri();
    }
}
