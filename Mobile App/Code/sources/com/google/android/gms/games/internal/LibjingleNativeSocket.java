package com.google.android.gms.games.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class LibjingleNativeSocket implements RealTimeSocket {
    private static final String TAG = LibjingleNativeSocket.class.getSimpleName();

    /* renamed from: LG */
    private final ParcelFileDescriptor f1967LG;

    /* renamed from: ZO */
    private final InputStream f1968ZO;

    /* renamed from: ZP */
    private final OutputStream f1969ZP;

    LibjingleNativeSocket(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1967LG = parcelFileDescriptor;
        this.f1968ZO = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f1969ZP = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
    }

    public void close() throws IOException {
        this.f1967LG.close();
    }

    public InputStream getInputStream() throws IOException {
        return this.f1968ZO;
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f1969ZP;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() throws IOException {
        return this.f1967LG;
    }

    public boolean isClosed() {
        try {
            this.f1968ZO.available();
            return false;
        } catch (IOException e) {
            return true;
        }
    }
}
