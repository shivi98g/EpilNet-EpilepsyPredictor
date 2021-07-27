package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SearchableField;

/* renamed from: com.google.android.gms.drive.internal.v */
public class C0840v extends C0856y implements DriveFolder {

    /* renamed from: com.google.android.gms.drive.internal.v$a */
    private static class C0843a extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DriveFolder.DriveFileResult> f1110Ea;

        public C0843a(BaseImplementation.C0670b<DriveFolder.DriveFileResult> bVar) {
            this.f1110Ea = bVar;
        }

        /* renamed from: a */
        public void mo11523a(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.f1110Ea.mo10914b(new C0845c(Status.f663Kw, new C0835t(onDriveIdResponse.getDriveId())));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1110Ea.mo10914b(new C0845c(status, (DriveFile) null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.v$b */
    private static class C0844b extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DriveFolder.DriveFolderResult> f1111Ea;

        public C0844b(BaseImplementation.C0670b<DriveFolder.DriveFolderResult> bVar) {
            this.f1111Ea = bVar;
        }

        /* renamed from: a */
        public void mo11523a(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
            this.f1111Ea.mo10914b(new C0847e(Status.f663Kw, new C0840v(onDriveIdResponse.getDriveId())));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1111Ea.mo10914b(new C0847e(status, (DriveFolder) null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.v$c */
    private static class C0845c implements DriveFolder.DriveFileResult {

        /* renamed from: Eb */
        private final Status f1112Eb;

        /* renamed from: Qn */
        private final DriveFile f1113Qn;

        public C0845c(Status status, DriveFile driveFile) {
            this.f1112Eb = status;
            this.f1113Qn = driveFile;
        }

        public DriveFile getDriveFile() {
            return this.f1113Qn;
        }

        public Status getStatus() {
            return this.f1112Eb;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.v$d */
    static abstract class C0846d extends C0822q<DriveFolder.DriveFileResult> {
        C0846d(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: r */
        public DriveFolder.DriveFileResult mo10544c(Status status) {
            return new C0845c(status, (DriveFile) null);
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.v$e */
    private static class C0847e implements DriveFolder.DriveFolderResult {

        /* renamed from: Eb */
        private final Status f1114Eb;

        /* renamed from: Qo */
        private final DriveFolder f1115Qo;

        public C0847e(Status status, DriveFolder driveFolder) {
            this.f1114Eb = status;
            this.f1115Qo = driveFolder;
        }

        public DriveFolder getDriveFolder() {
            return this.f1115Qo;
        }

        public Status getStatus() {
            return this.f1114Eb;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.v$f */
    static abstract class C0848f extends C0822q<DriveFolder.DriveFolderResult> {
        C0848f(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: s */
        public DriveFolder.DriveFolderResult mo10544c(Status status) {
            return new C0847e(status, (DriveFolder) null);
        }
    }

    public C0840v(DriveId driveId) {
        super(driveId);
    }

    /* renamed from: a */
    private PendingResult<DriveFolder.DriveFileResult> m1191a(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, int i, int i2, ExecutionOptions executionOptions) {
        ExecutionOptions.m797a(googleApiClient, executionOptions);
        final MetadataChangeSet metadataChangeSet2 = metadataChangeSet;
        final int i3 = i;
        final int i4 = i2;
        final ExecutionOptions executionOptions2 = executionOptions;
        return googleApiClient.mo10940b(new C0846d(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                metadataChangeSet2.mo11287iz().setContext(rVar.getContext());
                rVar.mo11717iG().mo11493a(new CreateFileRequest(C0840v.this.getDriveId(), metadataChangeSet2.mo11287iz(), i3, i4, executionOptions2), (C0757af) new C0843a(this));
            }
        });
    }

    /* renamed from: a */
    private PendingResult<DriveFolder.DriveFileResult> m1192a(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, DriveContents driveContents, ExecutionOptions executionOptions) {
        int i;
        if (driveContents == null) {
            i = 1;
        } else if (!(driveContents instanceof C0830s)) {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        } else if (driveContents.getDriveId() != null) {
            throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        } else if (driveContents.mo11197it()) {
            throw new IllegalArgumentException("DriveContents are already closed.");
        } else {
            i = driveContents.mo11195ir().getRequestId();
            driveContents.mo11196is();
        }
        int i2 = i;
        if (metadataChangeSet == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        } else if (!DriveFolder.MIME_TYPE.equals(metadataChangeSet.getMimeType())) {
            return m1191a(googleApiClient, metadataChangeSet, i2, 0, executionOptions);
        } else {
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        }
    }

    public PendingResult<DriveFolder.DriveFileResult> createFile(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, DriveContents driveContents) {
        return createFile(googleApiClient, metadataChangeSet, driveContents, (ExecutionOptions) null);
    }

    public PendingResult<DriveFolder.DriveFileResult> createFile(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, DriveContents driveContents, ExecutionOptions executionOptions) {
        if (executionOptions == null) {
            executionOptions = new ExecutionOptions.Builder().build();
        }
        if (executionOptions.mo11235ix() == 0) {
            return m1192a(googleApiClient, metadataChangeSet, driveContents, executionOptions);
        }
        throw new IllegalStateException("May not set a conflict strategy for calls to createFile.");
    }

    public PendingResult<DriveFolder.DriveFolderResult> createFolder(GoogleApiClient googleApiClient, final MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        } else if (metadataChangeSet.getMimeType() == null || metadataChangeSet.getMimeType().equals(DriveFolder.MIME_TYPE)) {
            return googleApiClient.mo10940b(new C0848f(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    metadataChangeSet.mo11287iz().setContext(rVar.getContext());
                    rVar.mo11717iG().mo11494a(new CreateFolderRequest(C0840v.this.getDriveId(), metadataChangeSet.mo11287iz()), (C0757af) new C0844b(this));
                }
            });
        } else {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
    }

    public PendingResult<DriveApi.MetadataBufferResult> listChildren(GoogleApiClient googleApiClient) {
        return queryChildren(googleApiClient, (Query) null);
    }

    public PendingResult<DriveApi.MetadataBufferResult> queryChildren(GoogleApiClient googleApiClient, Query query) {
        Query.Builder addFilter = new Query.Builder().addFilter(Filters.m1325in(SearchableField.PARENTS, getDriveId()));
        if (query != null) {
            if (query.getFilter() != null) {
                addFilter.addFilter(query.getFilter());
            }
            addFilter.setPageToken(query.getPageToken());
            addFilter.setSortOrder(query.getSortOrder());
        }
        return new C0807p().query(googleApiClient, addFilter.build());
    }
}
