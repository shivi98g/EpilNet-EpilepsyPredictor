package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.lh */
public final class C1836lh {
    /* renamed from: a */
    public static long m5527a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return m5528a(inputStream, outputStream, z, 1024);
    }

    /* renamed from: a */
    public static long m5528a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m5531b(inputStream);
                    m5531b(outputStream);
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static void m5529a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m5530a(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m5527a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public static void m5531b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: d */
    public static byte[] m5532d(InputStream inputStream) throws IOException {
        return m5530a(inputStream, true);
    }
}
