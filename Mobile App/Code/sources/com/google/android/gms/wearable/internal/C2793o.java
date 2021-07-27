package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.o */
public final class C2793o extends C0705d implements DataItem {

    /* renamed from: Ya */
    private final int f4563Ya;

    public C2793o(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f4563Ya = i2;
    }

    public Map<String, DataItemAsset> getAssets() {
        HashMap hashMap = new HashMap(this.f4563Ya);
        for (int i = 0; i < this.f4563Ya; i++) {
            C2789k kVar = new C2789k(this.f790JG, this.f791KZ + i);
            if (kVar.getDataItemKey() != null) {
                hashMap.put(kVar.getDataItemKey(), kVar);
            }
        }
        return hashMap;
    }

    public byte[] getData() {
        return getByteArray("data");
    }

    public Uri getUri() {
        return Uri.parse(getString("path"));
    }

    /* renamed from: rp */
    public DataItem freeze() {
        return new C2790l(this);
    }

    public DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
