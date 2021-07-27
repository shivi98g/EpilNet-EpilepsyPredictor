package com.google.android.gms.deviceconnection.features;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.deviceconnection.features.a */
public final class C0725a extends C0705d implements DeviceFeature {
    public C0725a(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String getFeatureName() {
        return getString("feature_name");
    }

    public long getLastConnectionTimestampMillis() {
        return getLong("last_connection_timestamp");
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("FeatureName", getFeatureName()).mo15935a("Timestamp", Long.valueOf(getLastConnectionTimestampMillis())).toString();
    }
}
