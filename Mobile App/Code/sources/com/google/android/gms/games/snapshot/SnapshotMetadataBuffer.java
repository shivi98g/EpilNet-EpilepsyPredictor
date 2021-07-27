package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class SnapshotMetadataBuffer extends DataBuffer<SnapshotMetadata> {
    public SnapshotMetadataBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    public SnapshotMetadata get(int i) {
        return new SnapshotMetadataRef(this.f763JG, i);
    }
}
