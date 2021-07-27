package com.google.android.gms.games.internal;

import android.net.LocalSocket;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class RealTimeSocketImpl implements RealTimeSocket {

    /* renamed from: LG */
    private ParcelFileDescriptor f1976LG;

    /* renamed from: ZV */
    private final LocalSocket f1977ZV;

    /* renamed from: Zk */
    private final String f1978Zk;

    RealTimeSocketImpl(LocalSocket localSocket, String str) {
        this.f1977ZV = localSocket;
        this.f1978Zk = str;
    }

    public void close() throws IOException {
        this.f1977ZV.close();
    }

    public InputStream getInputStream() throws IOException {
        return this.f1977ZV.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f1977ZV.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor() throws IOException {
        if (this.f1976LG == null && !isClosed()) {
            Parcel obtain = Parcel.obtain();
            obtain.writeFileDescriptor(this.f1977ZV.getFileDescriptor());
            obtain.setDataPosition(0);
            this.f1976LG = obtain.readFileDescriptor();
        }
        return this.f1976LG;
    }

    public boolean isClosed() {
        return !this.f1977ZV.isConnected() && !this.f1977ZV.isBound();
    }
}
