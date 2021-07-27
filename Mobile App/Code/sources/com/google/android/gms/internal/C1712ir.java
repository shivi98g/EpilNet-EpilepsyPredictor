package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

/* renamed from: com.google.android.gms.internal.ir */
public interface C1712ir extends IInterface {

    /* renamed from: com.google.android.gms.internal.ir$a */
    public static abstract class C1713a extends Binder implements C1712ir {
        public C1713a() {
            attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.gms.cast.ApplicationMetadata} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.internal.ij} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.google.android.gms.internal.io} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* JADX WARNING: type inference failed for: r2v19 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
            /*
                r6 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r7 == r0) goto L_0x0107
                r0 = 0
                r2 = 0
                switch(r7) {
                    case 1: goto L_0x00fa;
                    case 2: goto L_0x00d4;
                    case 3: goto L_0x00c7;
                    case 4: goto L_0x00af;
                    case 5: goto L_0x009e;
                    case 6: goto L_0x008d;
                    case 7: goto L_0x0080;
                    case 8: goto L_0x0073;
                    case 9: goto L_0x0066;
                    case 10: goto L_0x0051;
                    case 11: goto L_0x0040;
                    case 12: goto L_0x0028;
                    case 13: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r0 = super.onTransact(r7, r8, r9, r10)
                return r0
            L_0x0010:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                if (r0 == 0) goto L_0x0024
                android.os.Parcelable$Creator<com.google.android.gms.internal.io> r0 = com.google.android.gms.internal.C1707io.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r8)
                r2 = r0
                com.google.android.gms.internal.io r2 = (com.google.android.gms.internal.C1707io) r2
            L_0x0024:
                r6.mo15673b((com.google.android.gms.internal.C1707io) r2)
                return r1
            L_0x0028:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                if (r0 == 0) goto L_0x003c
                android.os.Parcelable$Creator<com.google.android.gms.internal.ij> r0 = com.google.android.gms.internal.C1694ij.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r8)
                r2 = r0
                com.google.android.gms.internal.ij r2 = (com.google.android.gms.internal.C1694ij) r2
            L_0x003c:
                r6.mo15672b((com.google.android.gms.internal.C1694ij) r2)
                return r1
            L_0x0040:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                java.lang.String r0 = r8.readString()
                long r2 = r8.readLong()
                r6.mo15666a(r0, r2)
                return r1
            L_0x0051:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                java.lang.String r0 = r8.readString()
                long r2 = r8.readLong()
                int r4 = r8.readInt()
                r6.mo15667a((java.lang.String) r0, (long) r2, (int) r4)
                return r1
            L_0x0066:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.onApplicationDisconnected(r0)
                return r1
            L_0x0073:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.mo15670af(r0)
                return r1
            L_0x0080:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.mo15671ag(r0)
                return r1
            L_0x008d:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                java.lang.String r0 = r8.readString()
                byte[] r2 = r8.createByteArray()
                r6.mo15674b(r0, r2)
                return r1
            L_0x009e:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                java.lang.String r0 = r8.readString()
                java.lang.String r2 = r8.readString()
                r6.mo15677j(r0, r2)
                return r1
            L_0x00af:
                java.lang.String r2 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r2)
                java.lang.String r2 = r8.readString()
                double r3 = r8.readDouble()
                int r5 = r8.readInt()
                if (r5 == 0) goto L_0x00c3
                r0 = r1
            L_0x00c3:
                r6.mo15665a((java.lang.String) r2, (double) r3, (boolean) r0)
                return r1
            L_0x00c7:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.mo15669ae(r0)
                return r1
            L_0x00d4:
                java.lang.String r3 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r3)
                int r3 = r8.readInt()
                if (r3 == 0) goto L_0x00e7
                android.os.Parcelable$Creator<com.google.android.gms.cast.ApplicationMetadata> r2 = com.google.android.gms.cast.ApplicationMetadata.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r8)
                com.google.android.gms.cast.ApplicationMetadata r2 = (com.google.android.gms.cast.ApplicationMetadata) r2
            L_0x00e7:
                java.lang.String r3 = r8.readString()
                java.lang.String r4 = r8.readString()
                int r5 = r8.readInt()
                if (r5 == 0) goto L_0x00f6
                r0 = r1
            L_0x00f6:
                r6.mo15664a(r2, r3, r4, r0)
                return r1
            L_0x00fa:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r8.enforceInterface(r0)
                int r0 = r8.readInt()
                r6.mo15668ad(r0)
                return r1
            L_0x0107:
                java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
                r9.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1712ir.C1713a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo15664a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo15665a(String str, double d, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo15666a(String str, long j) throws RemoteException;

    /* renamed from: a */
    void mo15667a(String str, long j, int i) throws RemoteException;

    /* renamed from: ad */
    void mo15668ad(int i) throws RemoteException;

    /* renamed from: ae */
    void mo15669ae(int i) throws RemoteException;

    /* renamed from: af */
    void mo15670af(int i) throws RemoteException;

    /* renamed from: ag */
    void mo15671ag(int i) throws RemoteException;

    /* renamed from: b */
    void mo15672b(C1694ij ijVar) throws RemoteException;

    /* renamed from: b */
    void mo15673b(C1707io ioVar) throws RemoteException;

    /* renamed from: b */
    void mo15674b(String str, byte[] bArr) throws RemoteException;

    /* renamed from: j */
    void mo15677j(String str, String str2) throws RemoteException;

    void onApplicationDisconnected(int i) throws RemoteException;
}
