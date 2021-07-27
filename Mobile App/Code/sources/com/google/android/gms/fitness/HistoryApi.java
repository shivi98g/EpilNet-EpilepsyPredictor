package com.google.android.gms.fitness;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0724c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;
import com.google.android.gms.internal.C1785jx;
import java.util.concurrent.TimeUnit;

public interface HistoryApi {

    public static class ViewIntentBuilder {

        /* renamed from: LW */
        private long f1324LW;

        /* renamed from: TM */
        private final DataType f1325TM;

        /* renamed from: TN */
        private DataSource f1326TN;

        /* renamed from: TO */
        private long f1327TO;

        /* renamed from: TP */
        private String f1328TP;
        private final Context mContext;

        public ViewIntentBuilder(Context context, DataType dataType) {
            this.mContext = context;
            this.f1325TM = dataType;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
            r0 = new android.content.Intent(r4).setPackage(r3.f1328TP);
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.content.Intent m1628i(android.content.Intent r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.f1328TP
                if (r0 != 0) goto L_0x0005
                return r4
            L_0x0005:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r4)
                java.lang.String r1 = r3.f1328TP
                android.content.Intent r0 = r0.setPackage(r1)
                android.content.Context r1 = r3.mContext
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                r2 = 0
                android.content.pm.ResolveInfo r1 = r1.resolveActivity(r0, r2)
                if (r1 == 0) goto L_0x002c
                android.content.pm.ActivityInfo r4 = r1.activityInfo
                java.lang.String r4 = r4.name
                android.content.ComponentName r1 = new android.content.ComponentName
                java.lang.String r2 = r3.f1328TP
                r1.<init>(r2, r4)
                r0.setComponent(r1)
                return r0
            L_0x002c:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder.m1628i(android.content.Intent):android.content.Intent");
        }

        public Intent build() {
            boolean z = false;
            C1785jx.m5355a(this.f1324LW > 0, "Start time must be set");
            if (this.f1327TO > this.f1324LW) {
                z = true;
            }
            C1785jx.m5355a(z, "End time must be set and after start time");
            Intent intent = new Intent(Fitness.ACTION_VIEW);
            intent.setType(DataType.getMimeType(this.f1326TN.getDataType()));
            intent.putExtra(Fitness.EXTRA_START_TIME, this.f1324LW);
            intent.putExtra(Fitness.EXTRA_END_TIME, this.f1327TO);
            C0724c.m780a(this.f1326TN, intent, DataSource.EXTRA_DATA_SOURCE);
            return m1628i(intent);
        }

        public ViewIntentBuilder setDataSource(DataSource dataSource) {
            C1785jx.m5362b(dataSource.getDataType().equals(this.f1325TM), "Data source %s is not for the data type %s", dataSource, this.f1325TM);
            this.f1326TN = dataSource;
            return this;
        }

        public ViewIntentBuilder setPreferredApplication(String str) {
            this.f1328TP = str;
            return this;
        }

        public ViewIntentBuilder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            this.f1324LW = timeUnit.toMillis(j);
            this.f1327TO = timeUnit.toMillis(j2);
            return this;
        }
    }

    PendingResult<Status> deleteData(GoogleApiClient googleApiClient, DataDeleteRequest dataDeleteRequest);

    PendingResult<Status> insertData(GoogleApiClient googleApiClient, DataSet dataSet);

    PendingResult<DataReadResult> readData(GoogleApiClient googleApiClient, DataReadRequest dataReadRequest);
}
