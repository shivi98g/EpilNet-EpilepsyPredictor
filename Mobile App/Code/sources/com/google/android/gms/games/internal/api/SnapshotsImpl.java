package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl implements Snapshots {

    /* renamed from: com.google.android.gms.games.internal.api.SnapshotsImpl$6 */
    class C12216 extends LoadImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2086ZW;

        /* renamed from: ZY */
        final /* synthetic */ String f2087ZY;

        /* renamed from: ZZ */
        final /* synthetic */ String f2088ZZ;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13468c((BaseImplementation.C0670b<Snapshots.LoadSnapshotsResult>) this, this.f2087ZY, this.f2088ZZ, this.f2086ZW);
        }
    }

    private static abstract class CommitImpl extends Games.BaseGamesApiMethodImpl<Snapshots.CommitSnapshotResult> {
        private CommitImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: ao */
        public Snapshots.CommitSnapshotResult mo10544c(final Status status) {
            return new Snapshots.CommitSnapshotResult() {
                public SnapshotMetadata getSnapshotMetadata() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class DeleteImpl extends Games.BaseGamesApiMethodImpl<Snapshots.DeleteSnapshotResult> {
        private DeleteImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: ap */
        public Snapshots.DeleteSnapshotResult mo10544c(final Status status) {
            return new Snapshots.DeleteSnapshotResult() {
                public String getSnapshotId() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadImpl extends Games.BaseGamesApiMethodImpl<Snapshots.LoadSnapshotsResult> {
        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: aq */
        public Snapshots.LoadSnapshotsResult mo10544c(final Status status) {
            return new Snapshots.LoadSnapshotsResult() {
                public SnapshotMetadataBuffer getSnapshots() {
                    return new SnapshotMetadataBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class OpenImpl extends Games.BaseGamesApiMethodImpl<Snapshots.OpenSnapshotResult> {
        private OpenImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: ar */
        public Snapshots.OpenSnapshotResult mo10544c(final Status status) {
            return new Snapshots.OpenSnapshotResult() {
                public String getConflictId() {
                    return null;
                }

                public Snapshot getConflictingSnapshot() {
                    return null;
                }

                public SnapshotContents getResolutionSnapshotContents() {
                    return null;
                }

                public Snapshot getSnapshot() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    public PendingResult<Snapshots.CommitSnapshotResult> commitAndClose(GoogleApiClient googleApiClient, final Snapshot snapshot, final SnapshotMetadataChange snapshotMetadataChange) {
        return googleApiClient.mo10940b(new CommitImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13409a((BaseImplementation.C0670b<Snapshots.CommitSnapshotResult>) this, snapshot, snapshotMetadataChange);
            }
        });
    }

    public PendingResult<Snapshots.DeleteSnapshotResult> delete(GoogleApiClient googleApiClient, final SnapshotMetadata snapshotMetadata) {
        return googleApiClient.mo10940b(new DeleteImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13502i(this, snapshotMetadata.getSnapshotId());
            }
        });
    }

    public void discardAndClose(GoogleApiClient googleApiClient, Snapshot snapshot) {
        Games.m2046d(googleApiClient).mo13439a(snapshot);
    }

    public int getMaxCoverImageSize(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13509lC();
    }

    public int getMaxDataSize(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13508lB();
    }

    public Intent getSelectSnapshotIntent(GoogleApiClient googleApiClient, String str, boolean z, boolean z2, int i) {
        return Games.m2046d(googleApiClient).mo13400a(str, z, z2, i);
    }

    public SnapshotMetadata getSnapshotFromBundle(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(Snapshots.EXTRA_SNAPSHOT_METADATA)) {
            return null;
        }
        return (SnapshotMetadata) bundle.getParcelable(Snapshots.EXTRA_SNAPSHOT_METADATA);
    }

    public PendingResult<Snapshots.LoadSnapshotsResult> load(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.mo10938a(new LoadImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13489e((BaseImplementation.C0670b<Snapshots.LoadSnapshotsResult>) this, z);
            }
        });
    }

    public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient googleApiClient, SnapshotMetadata snapshotMetadata) {
        return open(googleApiClient, snapshotMetadata.getUniqueName(), false);
    }

    public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient googleApiClient, final String str, final boolean z) {
        return googleApiClient.mo10940b(new OpenImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13469c((BaseImplementation.C0670b<Snapshots.OpenSnapshotResult>) this, str, z);
            }
        });
    }

    public PendingResult<Snapshots.OpenSnapshotResult> resolveConflict(GoogleApiClient googleApiClient, String str, Snapshot snapshot) {
        SnapshotMetadata metadata = snapshot.getMetadata();
        return resolveConflict(googleApiClient, str, metadata.getSnapshotId(), new SnapshotMetadataChange.Builder().fromMetadata(metadata).build(), snapshot.getSnapshotContents());
    }

    public PendingResult<Snapshots.OpenSnapshotResult> resolveConflict(GoogleApiClient googleApiClient, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        final String str3 = str;
        final String str4 = str2;
        final SnapshotMetadataChange snapshotMetadataChange2 = snapshotMetadataChange;
        final SnapshotContents snapshotContents2 = snapshotContents;
        return googleApiClient.mo10940b(new OpenImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.mo13422a((BaseImplementation.C0670b<Snapshots.OpenSnapshotResult>) this, str3, str4, snapshotMetadataChange2, snapshotContents2);
            }
        });
    }
}
