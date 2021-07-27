package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveFile;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.common.data.a */
public class C0702a implements SafeParcelable {
    public static final Parcelable.Creator<C0702a> CREATOR = new C0703b();

    /* renamed from: CK */
    final int f782CK;

    /* renamed from: Gt */
    final int f783Gt;

    /* renamed from: KS */
    ParcelFileDescriptor f784KS;

    /* renamed from: KT */
    private Bitmap f785KT;

    /* renamed from: KU */
    private boolean f786KU;

    /* renamed from: KV */
    private File f787KV;

    C0702a(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f782CK = i;
        this.f784KS = parcelFileDescriptor;
        this.f783Gt = i2;
        this.f785KT = null;
        this.f786KU = false;
    }

    public C0702a(Bitmap bitmap) {
        this.f782CK = 1;
        this.f784KS = null;
        this.f783Gt = 0;
        this.f785KT = bitmap;
        this.f786KU = true;
    }

    /* renamed from: a */
    private void m645a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    /* renamed from: gU */
    private FileOutputStream m646gU() {
        if (this.f787KV == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.f787KV);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.f784KS = ParcelFileDescriptor.open(createTempFile, DriveFile.MODE_READ_ONLY);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    /* renamed from: a */
    public void mo11068a(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f787KV = file;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: gT */
    public Bitmap mo11070gT() {
        if (!this.f786KU) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f784KS));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                m645a((Closeable) dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.f785KT = createBitmap;
                this.f786KU = true;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                m645a((Closeable) dataInputStream);
                throw th;
            }
        }
        return this.f785KT;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f784KS == null) {
            Bitmap bitmap = this.f785KT;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(m646gU());
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m645a((Closeable) dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m645a((Closeable) dataOutputStream);
                throw th;
            }
        }
        C0703b.m649a(this, parcel, i);
    }
}
