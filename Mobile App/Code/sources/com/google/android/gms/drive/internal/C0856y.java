package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.internal.C0807p;
import com.google.android.gms.drive.internal.C0822q;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.gms.drive.internal.y */
public class C0856y implements DriveResource {

    /* renamed from: Oj */
    protected final DriveId f1126Oj;

    /* renamed from: com.google.android.gms.drive.internal.y$a */
    private static class C0861a extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DriveApi.MetadataBufferResult> f1133Ea;

        public C0861a(BaseImplementation.C0670b<DriveApi.MetadataBufferResult> bVar) {
            this.f1133Ea = bVar;
        }

        /* renamed from: a */
        public void mo11526a(OnListParentsResponse onListParentsResponse) throws RemoteException {
            this.f1133Ea.mo10914b(new C0807p.C0817f(Status.f663Kw, new MetadataBuffer(onListParentsResponse.mo11431iT(), (String) null), false));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1133Ea.mo10914b(new C0807p.C0817f(status, (MetadataBuffer) null, false));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.y$b */
    private static class C0862b extends C0794c {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<DriveResource.MetadataResult> f1134Ea;

        public C0862b(BaseImplementation.C0670b<DriveResource.MetadataResult> bVar) {
            this.f1134Ea = bVar;
        }

        /* renamed from: a */
        public void mo11528a(OnMetadataResponse onMetadataResponse) throws RemoteException {
            this.f1134Ea.mo10914b(new C0863c(Status.f663Kw, new C0804m(onMetadataResponse.mo11435iU())));
        }

        /* renamed from: n */
        public void mo11532n(Status status) throws RemoteException {
            this.f1134Ea.mo10914b(new C0863c(status, (Metadata) null));
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.y$c */
    private static class C0863c implements DriveResource.MetadataResult {

        /* renamed from: Eb */
        private final Status f1135Eb;

        /* renamed from: Qv */
        private final Metadata f1136Qv;

        public C0863c(Status status, Metadata metadata) {
            this.f1135Eb = status;
            this.f1136Qv = metadata;
        }

        public Metadata getMetadata() {
            return this.f1136Qv;
        }

        public Status getStatus() {
            return this.f1135Eb;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.y$d */
    private abstract class C0864d extends C0822q<DriveResource.MetadataResult> {
        private C0864d(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: u */
        public DriveResource.MetadataResult mo10544c(Status status) {
            return new C0863c(status, (Metadata) null);
        }
    }

    protected C0856y(DriveId driveId) {
        this.f1126Oj = driveId;
    }

    public PendingResult<Status> addChangeListener(GoogleApiClient googleApiClient, ChangeListener changeListener) {
        return ((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).mo11709a(googleApiClient, this.f1126Oj, 1, changeListener);
    }

    public PendingResult<Status> addChangeSubscription(GoogleApiClient googleApiClient) {
        return ((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).mo11708a(googleApiClient, this.f1126Oj, 1);
    }

    public DriveId getDriveId() {
        return this.f1126Oj;
    }

    public PendingResult<DriveResource.MetadataResult> getMetadata(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C0864d(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11498a(new GetMetadataRequest(C0856y.this.f1126Oj), (C0757af) new C0862b(this));
            }
        });
    }

    public PendingResult<DriveApi.MetadataBufferResult> listParents(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C0807p.C0818g(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11499a(new ListParentsRequest(C0856y.this.f1126Oj), (C0757af) new C0861a(this));
            }
        });
    }

    public PendingResult<Status> removeChangeListener(GoogleApiClient googleApiClient, ChangeListener changeListener) {
        return ((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).mo11713b(googleApiClient, this.f1126Oj, 1, changeListener);
    }

    public PendingResult<Status> removeChangeSubscription(GoogleApiClient googleApiClient) {
        return ((C0824r) googleApiClient.mo10937a(Drive.f842DQ)).mo11712b(googleApiClient, this.f1126Oj, 1);
    }

    public PendingResult<Status> setParents(GoogleApiClient googleApiClient, Set<DriveId> set) {
        if (set == null) {
            throw new IllegalArgumentException("ParentIds must be provided.");
        } else if (set.isEmpty()) {
            throw new IllegalArgumentException("ParentIds must contain at least one parent.");
        } else {
            final ArrayList arrayList = new ArrayList(set);
            return googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    rVar.mo11717iG().mo11506a(new SetResourceParentsRequest(C0856y.this.f1126Oj, arrayList), (C0757af) new C0791bg(this));
                }
            });
        }
    }

    public PendingResult<DriveResource.MetadataResult> updateMetadata(GoogleApiClient googleApiClient, final MetadataChangeSet metadataChangeSet) {
        if (metadataChangeSet != null) {
            return googleApiClient.mo10940b(new C0864d(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    metadataChangeSet.mo11287iz().setContext(rVar.getContext());
                    rVar.mo11717iG().mo11508a(new UpdateMetadataRequest(C0856y.this.f1126Oj, metadataChangeSet.mo11287iz()), (C0757af) new C0862b(this));
                }
            });
        }
        throw new IllegalArgumentException("ChangeSet must be provided.");
    }
}
