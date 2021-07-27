package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class SnapshotEntity implements SafeParcelable, Snapshot {
    public static final SnapshotEntityCreator CREATOR = new SnapshotEntityCreator();

    /* renamed from: CK */
    private final int f2164CK;
    private final SnapshotMetadataEntity aeZ;
    private final SnapshotContentsEntity afa;

    SnapshotEntity(int i, SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this.f2164CK = i;
        this.aeZ = new SnapshotMetadataEntity(snapshotMetadata);
        this.afa = snapshotContentsEntity;
    }

    public SnapshotEntity(SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this(2, snapshotMetadata, snapshotContentsEntity);
    }

    /* renamed from: a */
    static boolean m3794a(Snapshot snapshot, Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (snapshot == obj) {
            return true;
        }
        Snapshot snapshot2 = (Snapshot) obj;
        return C1781jv.equal(snapshot2.getMetadata(), snapshot.getMetadata()) && C1781jv.equal(snapshot2.getSnapshotContents(), snapshot.getSnapshotContents());
    }

    /* renamed from: b */
    static int m3795b(Snapshot snapshot) {
        return C1781jv.hashCode(snapshot.getMetadata(), snapshot.getSnapshotContents());
    }

    /* renamed from: c */
    static String m3796c(Snapshot snapshot) {
        return C1781jv.m5348h(snapshot).mo15935a("Metadata", snapshot.getMetadata()).mo15935a("HasContents", Boolean.valueOf(snapshot.getSnapshotContents() != null)).toString();
    }

    private boolean isClosed() {
        return this.afa.isClosed();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3794a(this, obj);
    }

    public Snapshot freeze() {
        return this;
    }

    public SnapshotMetadata getMetadata() {
        return this.aeZ;
    }

    public SnapshotContents getSnapshotContents() {
        if (isClosed()) {
            return null;
        }
        return this.afa;
    }

    public int getVersionCode() {
        return this.f2164CK;
    }

    public int hashCode() {
        return m3795b(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m3796c(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnapshotEntityCreator.m3797a(this, parcel, i);
    }
}
