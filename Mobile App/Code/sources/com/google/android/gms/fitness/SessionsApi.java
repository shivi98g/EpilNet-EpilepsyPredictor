package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0724c;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import com.google.android.gms.internal.C1785jx;

public interface SessionsApi {

    public static class ViewIntentBuilder {

        /* renamed from: TP */
        private String f1329TP;

        /* renamed from: TQ */
        private Session f1330TQ;

        /* renamed from: TR */
        private boolean f1331TR = false;
        private final Context mContext;

        public ViewIntentBuilder(Context context) {
            this.mContext = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
            r0 = new android.content.Intent(r4).setPackage(r3.f1329TP);
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.content.Intent m1629i(android.content.Intent r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.f1329TP
                if (r0 != 0) goto L_0x0005
                return r4
            L_0x0005:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r4)
                java.lang.String r1 = r3.f1329TP
                android.content.Intent r0 = r0.setPackage(r1)
                android.content.Context r1 = r3.mContext
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                r2 = 0
                android.content.pm.ResolveInfo r1 = r1.resolveActivity(r0, r2)
                if (r1 == 0) goto L_0x002c
                android.content.pm.ActivityInfo r4 = r1.activityInfo
                java.lang.String r4 = r4.name
                android.content.ComponentName r1 = new android.content.ComponentName
                java.lang.String r2 = r3.f1329TP
                r1.<init>(r2, r4)
                r0.setComponent(r1)
                return r0
            L_0x002c:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder.m1629i(android.content.Intent):android.content.Intent");
        }

        public Intent build() {
            C1785jx.m5355a(this.f1330TQ != null, "Session must be set");
            Intent intent = new Intent(Fitness.ACTION_VIEW);
            intent.setType(Session.getMimeType(this.f1330TQ.getActivity()));
            C0724c.m780a(this.f1330TQ, intent, Session.EXTRA_SESSION);
            if (!this.f1331TR) {
                this.f1329TP = this.f1330TQ.getAppPackageName();
            }
            return m1629i(intent);
        }

        public ViewIntentBuilder setPreferredApplication(String str) {
            this.f1329TP = str;
            this.f1331TR = true;
            return this;
        }

        public ViewIntentBuilder setSession(Session session) {
            this.f1330TQ = session;
            return this;
        }
    }

    PendingResult<Status> insertSession(GoogleApiClient googleApiClient, SessionInsertRequest sessionInsertRequest);

    PendingResult<SessionReadResult> readSession(GoogleApiClient googleApiClient, SessionReadRequest sessionReadRequest);

    PendingResult<Status> registerForSessions(GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    PendingResult<Status> startSession(GoogleApiClient googleApiClient, Session session);

    PendingResult<SessionStopResult> stopSession(GoogleApiClient googleApiClient, String str);

    PendingResult<Status> unregisterForSessions(GoogleApiClient googleApiClient, PendingIntent pendingIntent);
}
