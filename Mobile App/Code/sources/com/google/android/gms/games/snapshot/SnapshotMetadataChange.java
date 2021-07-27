package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.C0702a;

public abstract class SnapshotMetadataChange {
    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();

    public static final class Builder {

        /* renamed from: UO */
        private String f2165UO;
        private Long afb;
        private C0702a afc;
        private Uri afd;

        public SnapshotMetadataChange build() {
            return new SnapshotMetadataChangeEntity(this.f2165UO, this.afb, this.afc, this.afd);
        }

        public Builder fromMetadata(SnapshotMetadata snapshotMetadata) {
            this.f2165UO = snapshotMetadata.getDescription();
            this.afb = Long.valueOf(snapshotMetadata.getPlayedTime());
            if (this.afb.longValue() == -1) {
                this.afb = null;
            }
            this.afd = snapshotMetadata.getCoverImageUri();
            if (this.afd != null) {
                this.afc = null;
            }
            return this;
        }

        public Builder setCoverImage(Bitmap bitmap) {
            this.afc = new C0702a(bitmap);
            this.afd = null;
            return this;
        }

        public Builder setDescription(String str) {
            this.f2165UO = str;
            return this;
        }

        public Builder setPlayedTimeMillis(long j) {
            this.afb = Long.valueOf(j);
            return this;
        }
    }

    protected SnapshotMetadataChange() {
    }

    public abstract Bitmap getCoverImage();

    public abstract String getDescription();

    public abstract Long getPlayedTimeMillis();

    /* renamed from: mT */
    public abstract C0702a mo14605mT();
}
