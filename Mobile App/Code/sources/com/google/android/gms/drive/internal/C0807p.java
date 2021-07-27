package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.internal.C0822q;
import com.google.android.gms.drive.query.Query;
import java.util.List;

/* renamed from: com.google.android.gms.drive.internal.p */
public class C0807p implements DriveApi {

    /* renamed from: com.google.android.gms.drive.internal.p$a */
    static class C0812a implements DriveApi.DriveContentsResult {

        /* renamed from: Eb */
        private final Status f1053Eb;

        /* renamed from: Om */
        private final DriveContents f1054Om;

        public C0812a(Status status, DriveContents driveContents) {
            this.f1053Eb = status;
            this.f1054Om = driveContents;
        }

        public DriveContents getDriveContents() {
            return this.f1054Om;
        }

        public Status getStatus() {
            return this.f1053Eb;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$b */
    static abstract class C0813b extends C0822q<DriveApi.DriveContentsResult> {
        C0813b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: o */
        public DriveApi.DriveContentsResult mo10544c(Status status) {
            return new C0812a(status, (DriveContents) null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$c */
    static class C0814c extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DriveApi.DriveIdResult> f1055Ea;

        public C0814c(BaseImplementation.C0670b<DriveApi.DriveIdResult> bVar) {
            this.f1055Ea = bVar;
        }

        /* renamed from: a */
        public void mo11523a(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.f1055Ea.mo10914b(new C0815d(Status.f663Kw, onDriveIdResponse.getDriveId()));
        }

        /* renamed from: a */
        public void mo11528a(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.f1055Ea.mo10914b(new C0815d(Status.f663Kw, new C0804m(onMetadataResponse.mo11435iU()).getDriveId()));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1055Ea.mo10914b(new C0815d(status, (DriveId) null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$d */
    private static class C0815d implements DriveApi.DriveIdResult {

        /* renamed from: Eb */
        private final Status f1056Eb;

        /* renamed from: Oj */
        private final DriveId f1057Oj;

        public C0815d(Status status, DriveId driveId) {
            this.f1056Eb = status;
            this.f1057Oj = driveId;
        }

        public DriveId getDriveId() {
            return this.f1057Oj;
        }

        public Status getStatus() {
            return this.f1056Eb;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$e */
    static abstract class C0816e extends C0822q<DriveApi.DriveIdResult> {
        C0816e(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: p */
        public DriveApi.DriveIdResult mo10544c(Status status) {
            return new C0815d(status, (DriveId) null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$f */
    static class C0817f implements DriveApi.MetadataBufferResult {

        /* renamed from: Eb */
        private final Status f1058Eb;

        /* renamed from: PI */
        private final MetadataBuffer f1059PI;

        /* renamed from: PJ */
        private final boolean f1060PJ;

        public C0817f(Status status, MetadataBuffer metadataBuffer, boolean z) {
            this.f1058Eb = status;
            this.f1059PI = metadataBuffer;
            this.f1060PJ = z;
        }

        public MetadataBuffer getMetadataBuffer() {
            return this.f1059PI;
        }

        public Status getStatus() {
            return this.f1058Eb;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$g */
    static abstract class C0818g extends C0822q<DriveApi.MetadataBufferResult> {
        C0818g(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: q */
        public DriveApi.MetadataBufferResult mo10544c(Status status) {
            return new C0817f(status, (MetadataBuffer) null, false);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$h */
    private static class C0819h extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DriveApi.DriveContentsResult> f1061Ea;

        public C0819h(BaseImplementation.C0670b<DriveApi.DriveContentsResult> bVar) {
            this.f1061Ea = bVar;
        }

        /* renamed from: a */
        public void mo11520a(OnContentsResponse onContentsResponse) throws RemoteException {
            this.f1061Ea.mo10914b(new C0812a(Status.f663Kw, new C0830s(onContentsResponse.mo11409iL())));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1061Ea.mo10914b(new C0812a(status, (DriveContents) null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$i */
    private static class C0820i extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DriveApi.MetadataBufferResult> f1062Ea;

        public C0820i(BaseImplementation.C0670b<DriveApi.MetadataBufferResult> bVar) {
            this.f1062Ea = bVar;
        }

        /* renamed from: a */
        public void mo11525a(OnListEntriesResponse onListEntriesResponse) throws RemoteException {
            this.f1062Ea.mo10914b(new C0817f(Status.f663Kw, new MetadataBuffer(onListEntriesResponse.mo11428iR(), (String) null), onListEntriesResponse.mo11429iS()));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1062Ea.mo10914b(new C0817f(status, (MetadataBuffer) null, false));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.p$j */
    static class C0821j extends C0822q.C0823a {
        C0821j(GoogleApiClient googleApiClient, Status status) {
            super(googleApiClient);
            mo10914b(status);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(C0824r rVar) {
        }
    }

    /* renamed from: a */
    public PendingResult<DriveApi.DriveContentsResult> mo11697a(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.mo10938a(new C0813b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11492a(new CreateContentsRequest(i), (C0757af) new C0819h(this));
            }
        });
    }

    public PendingResult<Status> cancelPendingActions(GoogleApiClient googleApiClient, List<String> list) {
        return ((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).cancelPendingActions(googleApiClient, list);
    }

    public PendingResult<DriveApi.DriveIdResult> fetchDriveId(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10938a(new C0816e(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11498a(new GetMetadataRequest(DriveId.m794bi(str)), (C0757af) new C0814c(this));
            }
        });
    }

    public DriveFolder getAppFolder(GoogleApiClient googleApiClient) {
        if (!googleApiClient.isConnected()) {
            throw new IllegalStateException("Client must be connected");
        }
        DriveId iI = ((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).mo11719iI();
        if (iI != null) {
            return new C0840v(iI);
        }
        return null;
    }

    public DriveFile getFile(GoogleApiClient googleApiClient, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (googleApiClient.isConnected()) {
            return new C0835t(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getFolder(GoogleApiClient googleApiClient, DriveId driveId) {
        if (driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        } else if (googleApiClient.isConnected()) {
            return new C0840v(driveId);
        } else {
            throw new IllegalStateException("Client must be connected");
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient googleApiClient) {
        if (googleApiClient.isConnected()) {
            return new C0840v(((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).mo11718iH());
        }
        throw new IllegalStateException("Client must be connected");
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder() {
        return new CreateFileActivityBuilder();
    }

    public PendingResult<DriveApi.DriveContentsResult> newDriveContents(GoogleApiClient googleApiClient) {
        return mo11697a(googleApiClient, DriveFile.MODE_WRITE_ONLY);
    }

    public OpenFileActivityBuilder newOpenFileActivityBuilder() {
        return new OpenFileActivityBuilder();
    }

    public PendingResult<DriveApi.MetadataBufferResult> query(GoogleApiClient googleApiClient, final Query query) {
        if (query != null) {
            return googleApiClient.mo10938a(new C0818g(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    rVar.mo11717iG().mo11502a(new QueryRequest(query), (C0757af) new C0820i(this));
                }
            });
        }
        throw new IllegalArgumentException("Query must be provided.");
    }

    public PendingResult<Status> requestSync(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11509a((C0757af) new C0791bg(this));
            }
        });
    }
}
