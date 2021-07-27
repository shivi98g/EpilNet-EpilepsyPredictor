package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1836lh;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity implements SafeParcelable, SnapshotContents {
    public static final SnapshotContentsEntityCreator CREATOR = new SnapshotContentsEntityCreator();
    private static final Object aeY = new Object();

    /* renamed from: CK */
    private final int f2162CK;

    /* renamed from: PW */
    private Contents f2163PW;

    SnapshotContentsEntity(int i, Contents contents) {
        this.f2162CK = i;
        this.f2163PW = contents;
    }

    public SnapshotContentsEntity(Contents contents) {
        this(1, contents);
    }

    /* renamed from: a */
    private boolean m3789a(int i, byte[] bArr, int i2, int i3, boolean z) {
        C1785jx.m5355a(!isClosed(), "Must provide a previously opened SnapshotContents");
        synchronized (aeY) {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f2163PW.getParcelFileDescriptor().getFileDescriptor());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                channel.position((long) i);
                bufferedOutputStream.write(bArr, i2, i3);
                if (z) {
                    channel.truncate((long) bArr.length);
                }
                bufferedOutputStream.flush();
            } catch (IOException e) {
                GamesLog.m2565a("SnapshotContentsEntity", "Failed to write snapshot data", e);
                return false;
            }
        }
        return true;
    }

    public void close() {
        this.f2163PW = null;
    }

    public int describeContents() {
        return 0;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        C1785jx.m5355a(!isClosed(), "Cannot mutate closed contents!");
        return this.f2163PW.getParcelFileDescriptor();
    }

    public int getVersionCode() {
        return this.f2162CK;
    }

    /* renamed from: ir */
    public Contents mo14569ir() {
        return this.f2163PW;
    }

    public boolean isClosed() {
        return this.f2163PW == null;
    }

    public boolean modifyBytes(int i, byte[] bArr, int i2, int i3) {
        return m3789a(i, bArr, i2, bArr.length, false);
    }

    public byte[] readFully() throws IOException {
        byte[] a;
        C1785jx.m5355a(!isClosed(), "Must provide a previously opened Snapshot");
        synchronized (aeY) {
            FileInputStream fileInputStream = new FileInputStream(this.f2163PW.getParcelFileDescriptor().getFileDescriptor());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                fileInputStream.getChannel().position(0);
                a = C1836lh.m5530a(bufferedInputStream, false);
                fileInputStream.getChannel().position(0);
            } catch (IOException e) {
                GamesLog.m2566b("SnapshotContentsEntity", "Failed to read snapshot data", e);
                throw e;
            }
        }
        return a;
    }

    public boolean writeBytes(byte[] bArr) {
        return m3789a(0, bArr, 0, bArr.length, true);
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnapshotContentsEntityCreator.m3791a(this, parcel, i);
    }
}
