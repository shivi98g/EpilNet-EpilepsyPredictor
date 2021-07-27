package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.internal.C0807p;

/* renamed from: com.google.android.gms.drive.internal.az */
class C0783az extends C0794c {

    /* renamed from: Ea */
    private final BaseImplementation.C0670b<DriveApi.DriveContentsResult> f1037Ea;

    /* renamed from: QU */
    private final DriveFile.DownloadProgressListener f1038QU;

    C0783az(BaseImplementation.C0670b<DriveApi.DriveContentsResult> bVar, DriveFile.DownloadProgressListener downloadProgressListener) {
        this.f1037Ea = bVar;
        this.f1038QU = downloadProgressListener;
    }

    /* renamed from: a */
    public void mo11520a(OnContentsResponse onContentsResponse) throws RemoteException {
        this.f1037Ea.mo10914b(new C0807p.C0812a(onContentsResponse.mo11410iM() ? new Status(-1) : Status.f663Kw, new C0830s(onContentsResponse.mo11409iL())));
    }

    /* renamed from: a */
    public void mo11522a(OnDownloadProgressResponse onDownloadProgressResponse) throws RemoteException {
        if (this.f1038QU != null) {
            this.f1038QU.onProgress(onDownloadProgressResponse.mo11416iO(), onDownloadProgressResponse.mo11417iP());
        }
    }

    /* renamed from: n */
    public void mo11532n(Status status) throws RemoteException {
        this.f1037Ea.mo10914b(new C0807p.C0812a(status, (DriveContents) null));
    }
}
