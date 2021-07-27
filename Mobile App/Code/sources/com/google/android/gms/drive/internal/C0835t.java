package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0687d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.C0807p;

/* renamed from: com.google.android.gms.drive.internal.t */
public class C0835t extends C0856y implements DriveFile {

    /* renamed from: com.google.android.gms.drive.internal.t$a */
    private static class C0837a implements DriveFile.DownloadProgressListener {

        /* renamed from: Qe */
        private final C0687d<DriveFile.DownloadProgressListener> f1099Qe;

        public C0837a(C0687d<DriveFile.DownloadProgressListener> dVar) {
            this.f1099Qe = dVar;
        }

        public void onProgress(long j, long j2) {
            final long j3 = j;
            final long j4 = j2;
            this.f1099Qe.mo11009a(new C0687d.C0689b<DriveFile.DownloadProgressListener>() {
                /* renamed from: a */
                public void mo10998c(DriveFile.DownloadProgressListener downloadProgressListener) {
                    downloadProgressListener.onProgress(j3, j4);
                }

                /* renamed from: gG */
                public void mo10999gG() {
                }
            });
        }
    }

    public C0835t(DriveId driveId) {
        super(driveId);
    }

    /* renamed from: a */
    private static DriveFile.DownloadProgressListener m1185a(GoogleApiClient googleApiClient, DriveFile.DownloadProgressListener downloadProgressListener) {
        if (downloadProgressListener == null) {
            return null;
        }
        return new C0837a(googleApiClient.mo10945d(downloadProgressListener));
    }

    public PendingResult<DriveApi.DriveContentsResult> open(GoogleApiClient googleApiClient, final int i, DriveFile.DownloadProgressListener downloadProgressListener) {
        if (i == 268435456 || i == 536870912 || i == 805306368) {
            final DriveFile.DownloadProgressListener a = m1185a(googleApiClient, downloadProgressListener);
            return googleApiClient.mo10938a(new C0807p.C0813b(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    rVar.mo11717iG().mo11501a(new OpenContentsRequest(C0835t.this.getDriveId(), i, 0), (C0757af) new C0783az(this, a));
                }
            });
        }
        throw new IllegalArgumentException("Invalid mode provided.");
    }
}
