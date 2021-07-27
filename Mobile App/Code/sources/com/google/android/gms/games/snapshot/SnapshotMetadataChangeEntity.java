package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0702a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SnapshotMetadataChangeEntity extends SnapshotMetadataChange implements SafeParcelable {
    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();

    /* renamed from: CK */
    private final int f2166CK;

    /* renamed from: UO */
    private final String f2167UO;
    private final Uri afd;
    private final Long afe;
    private C0702a aff;

    SnapshotMetadataChangeEntity() {
        this(4, (String) null, (Long) null, (C0702a) null, (Uri) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r3.aff == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3.afd == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    SnapshotMetadataChangeEntity(int r4, java.lang.String r5, java.lang.Long r6, com.google.android.gms.common.data.C0702a r7, android.net.Uri r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.f2166CK = r4
            r3.f2167UO = r5
            r3.afe = r6
            r3.aff = r7
            r3.afd = r8
            com.google.android.gms.common.data.a r0 = r3.aff
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001e
            android.net.Uri r0 = r3.afd
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            java.lang.String r0 = "Cannot set both a URI and an image"
            com.google.android.gms.internal.C1785jx.m5355a(r1, r0)
            return
        L_0x001e:
            android.net.Uri r0 = r3.afd
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.data.a r0 = r3.aff
            if (r0 != 0) goto L_0x0018
            goto L_0x0017
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity.<init>(int, java.lang.String, java.lang.Long, com.google.android.gms.common.data.a, android.net.Uri):void");
    }

    SnapshotMetadataChangeEntity(String str, Long l, C0702a aVar, Uri uri) {
        this(4, str, l, aVar, uri);
    }

    public int describeContents() {
        return 0;
    }

    public Bitmap getCoverImage() {
        if (this.aff == null) {
            return null;
        }
        return this.aff.mo11070gT();
    }

    public Uri getCoverImageUri() {
        return this.afd;
    }

    public String getDescription() {
        return this.f2167UO;
    }

    public Long getPlayedTimeMillis() {
        return this.afe;
    }

    public int getVersionCode() {
        return this.f2166CK;
    }

    /* renamed from: mT */
    public C0702a mo14605mT() {
        return this.aff;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnapshotMetadataChangeCreator.m3799a(this, parcel, i);
    }
}
