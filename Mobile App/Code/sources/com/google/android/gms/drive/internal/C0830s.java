package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.C0807p;
import com.google.android.gms.drive.internal.C0822q;
import com.google.android.gms.internal.C1785jx;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.drive.internal.s */
public class C0830s implements DriveContents {
    /* access modifiers changed from: private */

    /* renamed from: PW */
    public final Contents f1087PW;

    /* renamed from: PX */
    private boolean f1088PX = false;

    /* renamed from: PY */
    private boolean f1089PY = false;
    private boolean mClosed = false;

    public C0830s(Contents contents) {
        this.f1087PW = (Contents) C1785jx.m5364i(contents);
    }

    public PendingResult<Status> commit(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet) {
        return commit(googleApiClient, metadataChangeSet, (ExecutionOptions) null);
    }

    public PendingResult<Status> commit(GoogleApiClient googleApiClient, MetadataChangeSet metadataChangeSet, final ExecutionOptions executionOptions) {
        if (executionOptions == null) {
            executionOptions = new ExecutionOptions.Builder().build();
        }
        if (this.f1087PW.getMode() == 268435456) {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        } else if (!ExecutionOptions.m798ba(executionOptions.mo11235ix()) || this.f1087PW.mo11161ip()) {
            ExecutionOptions.m797a(googleApiClient, executionOptions);
            if (mo11197it()) {
                throw new IllegalStateException("DriveContents already closed.");
            } else if (getDriveId() == null) {
                throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
            } else {
                final MetadataChangeSet metadataChangeSet2 = metadataChangeSet != null ? metadataChangeSet : MetadataChangeSet.f867OE;
                mo11196is();
                return googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C0824r rVar) throws RemoteException {
                        metadataChangeSet2.mo11287iz().setContext(rVar.getContext());
                        rVar.mo11717iG().mo11490a(new CloseContentsAndUpdateMetadataRequest(C0830s.this.f1087PW.getDriveId(), metadataChangeSet2.mo11287iz(), C0830s.this.f1087PW, executionOptions), (C0757af) new C0791bg(this));
                    }
                });
            }
        } else {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
    }

    public void discard(GoogleApiClient googleApiClient) {
        if (mo11197it()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        mo11196is();
        ((C08344) googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11491a(new CloseContentsRequest(C0830s.this.f1087PW, false), (C0757af) new C0791bg(this));
            }
        })).setResultCallback(new ResultCallback<Status>() {
            /* renamed from: j */
            public void onResult(Status status) {
                if (!status.isSuccess()) {
                    C0849w.m1209p("DriveContentsImpl", "Error discarding contents");
                } else {
                    C0849w.m1207m("DriveContentsImpl", "Contents discarded");
                }
            }
        });
    }

    public DriveId getDriveId() {
        return this.f1087PW.getDriveId();
    }

    public InputStream getInputStream() {
        if (mo11197it()) {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        } else if (this.f1087PW.getMode() != 268435456) {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        } else if (this.f1088PX) {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else {
            this.f1088PX = true;
            return this.f1087PW.getInputStream();
        }
    }

    public int getMode() {
        return this.f1087PW.getMode();
    }

    public OutputStream getOutputStream() {
        if (mo11197it()) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else if (this.f1087PW.getMode() != 536870912) {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        } else if (this.f1089PY) {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else {
            this.f1089PY = true;
            return this.f1087PW.getOutputStream();
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        if (!mo11197it()) {
            return this.f1087PW.getParcelFileDescriptor();
        }
        throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    }

    /* renamed from: ir */
    public Contents mo11195ir() {
        return this.f1087PW;
    }

    /* renamed from: is */
    public void mo11196is() {
        this.mClosed = true;
    }

    /* renamed from: it */
    public boolean mo11197it() {
        return this.mClosed;
    }

    public PendingResult<DriveApi.DriveContentsResult> reopenForWrite(GoogleApiClient googleApiClient) {
        if (mo11197it()) {
            throw new IllegalStateException("DriveContents already closed.");
        } else if (this.f1087PW.getMode() != 268435456) {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        } else {
            mo11196is();
            return googleApiClient.mo10938a(new C0807p.C0813b(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    rVar.mo11717iG().mo11501a(new OpenContentsRequest(C0830s.this.getDriveId(), DriveFile.MODE_WRITE_ONLY, C0830s.this.f1087PW.getRequestId()), (C0757af) new C0783az(this, (DriveFile.DownloadProgressListener) null));
                }
            });
        }
    }
}
