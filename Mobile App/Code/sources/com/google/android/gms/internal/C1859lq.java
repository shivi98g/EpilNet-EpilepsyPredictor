package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.C0881j;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.lq */
public class C1859lq extends C0881j<DriveId> {

    /* renamed from: RV */
    public static final C1859lq f4045RV = new C1859lq();

    private C1859lq() {
        super("driveId", Arrays.asList(new String[]{"sqlId", "resourceId"}), Arrays.asList(new String[]{"dbInstanceId"}), 4100000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public DriveId mo11760c(DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.mo11058gV().getLong("dbInstanceId");
        String c = dataHolder.mo11049c("resourceId", i, i2);
        if (c != null && c.startsWith("generated-android-")) {
            c = null;
        }
        return new DriveId(c, Long.valueOf(dataHolder.mo11044a("sqlId", i, i2)).longValue(), j);
    }
}
