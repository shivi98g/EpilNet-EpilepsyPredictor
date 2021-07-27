package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionApi;

/* renamed from: com.google.android.gms.internal.nb */
public class C1965nb implements ActivityRecognitionApi {

    /* renamed from: com.google.android.gms.internal.nb$a */
    private static abstract class C1968a extends ActivityRecognition.C2197a<Status> {
        public C1968a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public PendingResult<Status> removeActivityUpdates(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        return googleApiClient.mo10940b(new C1968a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16335a(pendingIntent);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> requestActivityUpdates(GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        final long j2 = j;
        final PendingIntent pendingIntent2 = pendingIntent;
        return googleApiClient.mo10940b(new C1968a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1999nk nkVar) throws RemoteException {
                nkVar.mo16334a(j2, pendingIntent2);
                mo10914b(Status.f663Kw);
            }
        });
    }
}
