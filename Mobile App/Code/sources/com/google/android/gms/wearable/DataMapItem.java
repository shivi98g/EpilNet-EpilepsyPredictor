package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.internal.C2150ql;
import com.google.android.gms.internal.C2152qm;
import com.google.android.gms.internal.C2165qv;
import java.util.ArrayList;

public class DataMapItem {
    private final DataMap axh;
    private final Uri mUri;

    private DataMapItem(DataItem dataItem) {
        this.mUri = dataItem.getUri();
        this.axh = m7890a((DataItem) dataItem.freeze());
    }

    /* renamed from: a */
    private DataMap m7890a(DataItem dataItem) {
        if (dataItem.getData() == null && dataItem.getAssets().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (dataItem.getData() == null) {
            return new DataMap();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = dataItem.getAssets().size();
                for (int i = 0; i < size; i++) {
                    DataItemAsset dataItemAsset = dataItem.getAssets().get(Integer.toString(i));
                    if (dataItemAsset == null) {
                        throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i + " for " + dataItem);
                    }
                    arrayList.add(Asset.createFromRef(dataItemAsset.getId()));
                }
                return C2150ql.m6323a(new C2150ql.C2151a(C2152qm.m6327n(dataItem.getData()), arrayList));
            } catch (C2165qv e) {
                throw new IllegalStateException("Unable to parse. Not a DataItem.");
            }
        }
    }

    public static DataMapItem fromDataItem(DataItem dataItem) {
        if (dataItem != null) {
            return new DataMapItem(dataItem);
        }
        throw new IllegalStateException("provided dataItem is null");
    }

    public DataMap getDataMap() {
        return this.axh;
    }

    public Uri getUri() {
        return this.mUri;
    }
}
