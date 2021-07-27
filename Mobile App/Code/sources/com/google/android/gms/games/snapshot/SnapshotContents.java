package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import java.io.IOException;

public interface SnapshotContents extends Parcelable {
    void close();

    ParcelFileDescriptor getParcelFileDescriptor();

    /* renamed from: ir */
    Contents mo14569ir();

    boolean isClosed();

    boolean modifyBytes(int i, byte[] bArr, int i2, int i3);

    byte[] readFully() throws IOException;

    boolean writeBytes(byte[] bArr);
}
