package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.C0881j;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.lo */
public class C1852lo extends C0881j<AppVisibleCustomProperties> {
    public C1852lo(int i) {
        super("customProperties", Collections.singleton("customProperties"), Arrays.asList(new String[]{"customPropertiesExtra"}), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AppVisibleCustomProperties mo11760c(DataHolder dataHolder, int i, int i2) {
        return (AppVisibleCustomProperties) dataHolder.mo11058gV().getSparseParcelableArray("customPropertiesExtra").get(i, AppVisibleCustomProperties.f1145Rd);
    }
}
