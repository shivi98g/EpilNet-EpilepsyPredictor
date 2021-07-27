package android.support.p000v4.graphics;

import android.os.ParcelFileDescriptor;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.graphics.TypefaceCompatApi21Impl */
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi21Impl";

    TypefaceCompatApi21Impl() {
    }

    private File getFile(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r9 = r7;
        r7 = r6;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0063, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0064, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0068, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0069, code lost:
        r9 = r5;
        r5 = r4;
        r4 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0063 A[ExcHandler: all (th java.lang.Throwable)] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface createFromFontInfo(android.content.Context r11, android.os.CancellationSignal r12, @android.support.annotation.NonNull android.support.p000v4.provider.FontsContractCompat.FontInfo[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            android.support.v4.provider.FontsContractCompat$FontInfo r0 = r10.findBestInfo(r13, r14)
            android.content.ContentResolver r2 = r11.getContentResolver()
            android.net.Uri r3 = r0.getUri()     // Catch:{ IOException -> 0x007d }
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r3, r4, r12)     // Catch:{ IOException -> 0x007d }
            java.io.File r4 = r10.getFile(r3)     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.canRead()     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            if (r5 != 0) goto L_0x0027
            goto L_0x0031
        L_0x0027:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r4)     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            if (r3 == 0) goto L_0x0030
            r3.close()     // Catch:{ IOException -> 0x007d }
        L_0x0030:
            return r5
        L_0x0031:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            java.io.FileDescriptor r6 = r3.getFileDescriptor()     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            android.graphics.Typeface r6 = super.createFromInputStream(r11, r5)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            if (r5 == 0) goto L_0x0043
            r5.close()     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
        L_0x0043:
            if (r3 == 0) goto L_0x0048
            r3.close()     // Catch:{ IOException -> 0x007d }
        L_0x0048:
            return r6
        L_0x0049:
            r6 = move-exception
            r7 = r1
            goto L_0x0052
        L_0x004c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004e }
        L_0x004e:
            r7 = move-exception
            r9 = r7
            r7 = r6
            r6 = r9
        L_0x0052:
            if (r5 == 0) goto L_0x0062
            if (r7 == 0) goto L_0x005f
            r5.close()     // Catch:{ Throwable -> 0x005a, all -> 0x0063 }
            goto L_0x0062
        L_0x005a:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
            goto L_0x0062
        L_0x005f:
            r5.close()     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
        L_0x0062:
            throw r6     // Catch:{ Throwable -> 0x0066, all -> 0x0063 }
        L_0x0063:
            r4 = move-exception
            r5 = r1
            goto L_0x006c
        L_0x0066:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L_0x006c:
            if (r3 == 0) goto L_0x007c
            if (r5 == 0) goto L_0x0079
            r3.close()     // Catch:{ Throwable -> 0x0074 }
            goto L_0x007c
        L_0x0074:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch:{ IOException -> 0x007d }
            goto L_0x007c
        L_0x0079:
            r3.close()     // Catch:{ IOException -> 0x007d }
        L_0x007c:
            throw r4     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            r3 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.graphics.TypefaceCompatApi21Impl.createFromFontInfo(android.content.Context, android.os.CancellationSignal, android.support.v4.provider.FontsContractCompat$FontInfo[], int):android.graphics.Typeface");
    }
}
