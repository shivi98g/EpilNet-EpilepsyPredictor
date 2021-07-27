package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C2703c;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: com.google.android.gms.wearable.internal.af */
public interface C2717af extends IInterface {

    /* renamed from: com.google.android.gms.wearable.internal.af$a */
    public static abstract class C2718a extends Binder implements C2717af {

        /* renamed from: com.google.android.gms.wearable.internal.af$a$a */
        private static class C2719a implements C2717af {

            /* renamed from: le */
            private IBinder f4539le;

            C2719a(IBinder iBinder) {
                this.f4539le = iBinder;
            }

            /* renamed from: a */
            public void mo19452a(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19453a(C2711ad adVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19454a(C2711ad adVar, Asset asset) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (asset != null) {
                        obtain.writeInt(1);
                        asset.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19455a(C2711ad adVar, PutDataRequest putDataRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (putDataRequest != null) {
                        obtain.writeInt(1);
                        putDataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19456a(C2711ad adVar, C2703c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (cVar != null) {
                        obtain.writeInt(1);
                        cVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19457a(C2711ad adVar, C2746ar arVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (arVar != null) {
                        obtain.writeInt(1);
                        arVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19458a(C2711ad adVar, C2765b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19459a(C2711ad adVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4539le.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19460a(C2711ad adVar, String str, String str2, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeByteArray(bArr);
                    this.f4539le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4539le;
            }

            /* renamed from: b */
            public void mo19461b(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo19462b(C2711ad adVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo19463b(C2711ad adVar, C2703c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (cVar != null) {
                        obtain.writeInt(1);
                        cVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo19464b(C2711ad adVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4539le.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo19465c(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo19466c(C2711ad adVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4539le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo19467c(C2711ad adVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4539le.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo19468d(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo19469e(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo19470f(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo19471g(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo19472h(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public void mo19473i(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo19474j(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public void mo19475k(C2711ad adVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(adVar != null ? adVar.asBinder() : null);
                    this.f4539le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bZ */
        public static C2717af m7994bZ(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2717af)) ? new C2719a(iBinder) : (C2717af) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.wearable.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.gms.wearable.PutDataRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: com.google.android.gms.wearable.Asset} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: com.google.android.gms.wearable.internal.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: com.google.android.gms.wearable.internal.ar} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: com.google.android.gms.wearable.c} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v85 */
        /* JADX WARNING: type inference failed for: r0v86 */
        /* JADX WARNING: type inference failed for: r0v87 */
        /* JADX WARNING: type inference failed for: r0v88 */
        /* JADX WARNING: type inference failed for: r0v89 */
        /* JADX WARNING: type inference failed for: r0v90 */
        /* JADX WARNING: type inference failed for: r0v91 */
        /* JADX WARNING: type inference failed for: r0v92 */
        /* JADX WARNING: type inference failed for: r0v93 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x0288
                r0 = 0
                switch(r6) {
                    case 2: goto L_0x0266;
                    case 3: goto L_0x0252;
                    case 4: goto L_0x023e;
                    case 5: goto L_0x022a;
                    case 6: goto L_0x0208;
                    case 7: goto L_0x01e6;
                    case 8: goto L_0x01d2;
                    case 9: goto L_0x01b0;
                    default: goto L_0x000a;
                }
            L_0x000a:
                switch(r6) {
                    case 11: goto L_0x018e;
                    case 12: goto L_0x016e;
                    case 13: goto L_0x014c;
                    case 14: goto L_0x0138;
                    case 15: goto L_0x0124;
                    case 16: goto L_0x0102;
                    case 17: goto L_0x00e0;
                    case 18: goto L_0x00cc;
                    case 19: goto L_0x00b8;
                    case 20: goto L_0x0096;
                    case 21: goto L_0x007e;
                    case 22: goto L_0x006a;
                    case 23: goto L_0x0052;
                    case 24: goto L_0x003a;
                    case 25: goto L_0x0026;
                    case 26: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x0012:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19472h(r0)
                r8.writeNoException()
                return r1
            L_0x0026:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19471g(r0)
                r8.writeNoException()
                return r1
            L_0x003a:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                java.lang.String r2 = r7.readString()
                r5.mo19467c((com.google.android.gms.wearable.internal.C2711ad) r0, (java.lang.String) r2)
                r8.writeNoException()
                return r1
            L_0x0052:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                java.lang.String r2 = r7.readString()
                r5.mo19464b((com.google.android.gms.wearable.internal.C2711ad) r0, (java.lang.String) r2)
                r8.writeNoException()
                return r1
            L_0x006a:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19452a(r0)
                r8.writeNoException()
                return r1
            L_0x007e:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                java.lang.String r2 = r7.readString()
                r5.mo19459a((com.google.android.gms.wearable.internal.C2711ad) r0, (java.lang.String) r2)
                r8.writeNoException()
                return r1
            L_0x0096:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x00b1
                android.os.Parcelable$Creator<com.google.android.gms.wearable.c> r0 = com.google.android.gms.wearable.C2703c.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                com.google.android.gms.wearable.c r0 = (com.google.android.gms.wearable.C2703c) r0
            L_0x00b1:
                r5.mo19456a((com.google.android.gms.wearable.internal.C2711ad) r2, (com.google.android.gms.wearable.C2703c) r0)
                r8.writeNoException()
                return r1
            L_0x00b8:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19470f(r0)
                r8.writeNoException()
                return r1
            L_0x00cc:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19469e(r0)
                r8.writeNoException()
                return r1
            L_0x00e0:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x00fb
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.ar> r0 = com.google.android.gms.wearable.internal.C2746ar.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                com.google.android.gms.wearable.internal.ar r0 = (com.google.android.gms.wearable.internal.C2746ar) r0
            L_0x00fb:
                r5.mo19457a((com.google.android.gms.wearable.internal.C2711ad) r2, (com.google.android.gms.wearable.internal.C2746ar) r0)
                r8.writeNoException()
                return r1
            L_0x0102:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x011d
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.b> r0 = com.google.android.gms.wearable.internal.C2765b.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                com.google.android.gms.wearable.internal.b r0 = (com.google.android.gms.wearable.internal.C2765b) r0
            L_0x011d:
                r5.mo19458a((com.google.android.gms.wearable.internal.C2711ad) r2, (com.google.android.gms.wearable.internal.C2765b) r0)
                r8.writeNoException()
                return r1
            L_0x0124:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19468d(r0)
                r8.writeNoException()
                return r1
            L_0x0138:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19465c(r0)
                r8.writeNoException()
                return r1
            L_0x014c:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0167
                android.os.Parcelable$Creator<com.google.android.gms.wearable.Asset> r0 = com.google.android.gms.wearable.Asset.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                com.google.android.gms.wearable.Asset r0 = (com.google.android.gms.wearable.Asset) r0
            L_0x0167:
                r5.mo19454a((com.google.android.gms.wearable.internal.C2711ad) r2, (com.google.android.gms.wearable.Asset) r0)
                r8.writeNoException()
                return r1
            L_0x016e:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                java.lang.String r2 = r7.readString()
                java.lang.String r3 = r7.readString()
                byte[] r4 = r7.createByteArray()
                r5.mo19460a(r0, r2, r3, r4)
                r8.writeNoException()
                return r1
            L_0x018e:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x01a9
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x01a9:
                r5.mo19466c((com.google.android.gms.wearable.internal.C2711ad) r2, (android.net.Uri) r0)
                r8.writeNoException()
                return r1
            L_0x01b0:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x01cb
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x01cb:
                r5.mo19462b((com.google.android.gms.wearable.internal.C2711ad) r2, (android.net.Uri) r0)
                r8.writeNoException()
                return r1
            L_0x01d2:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19461b(r0)
                r8.writeNoException()
                return r1
            L_0x01e6:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0201
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x0201:
                r5.mo19453a((com.google.android.gms.wearable.internal.C2711ad) r2, (android.net.Uri) r0)
                r8.writeNoException()
                return r1
            L_0x0208:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0223
                android.os.Parcelable$Creator<com.google.android.gms.wearable.PutDataRequest> r0 = com.google.android.gms.wearable.PutDataRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                com.google.android.gms.wearable.PutDataRequest r0 = (com.google.android.gms.wearable.PutDataRequest) r0
            L_0x0223:
                r5.mo19455a((com.google.android.gms.wearable.internal.C2711ad) r2, (com.google.android.gms.wearable.PutDataRequest) r0)
                r8.writeNoException()
                return r1
            L_0x022a:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19475k(r0)
                r8.writeNoException()
                return r1
            L_0x023e:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19474j(r0)
                r8.writeNoException()
                return r1
            L_0x0252:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r0 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r0)
                r5.mo19473i(r0)
                r8.writeNoException()
                return r1
            L_0x0266:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableService"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                com.google.android.gms.wearable.internal.ad r2 = com.google.android.gms.wearable.internal.C2711ad.C2712a.m7948bX(r2)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0281
                android.os.Parcelable$Creator<com.google.android.gms.wearable.c> r0 = com.google.android.gms.wearable.C2703c.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                com.google.android.gms.wearable.c r0 = (com.google.android.gms.wearable.C2703c) r0
            L_0x0281:
                r5.mo19463b((com.google.android.gms.wearable.internal.C2711ad) r2, (com.google.android.gms.wearable.C2703c) r0)
                r8.writeNoException()
                return r1
            L_0x0288:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C2717af.C2718a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo19452a(C2711ad adVar) throws RemoteException;

    /* renamed from: a */
    void mo19453a(C2711ad adVar, Uri uri) throws RemoteException;

    /* renamed from: a */
    void mo19454a(C2711ad adVar, Asset asset) throws RemoteException;

    /* renamed from: a */
    void mo19455a(C2711ad adVar, PutDataRequest putDataRequest) throws RemoteException;

    /* renamed from: a */
    void mo19456a(C2711ad adVar, C2703c cVar) throws RemoteException;

    /* renamed from: a */
    void mo19457a(C2711ad adVar, C2746ar arVar) throws RemoteException;

    /* renamed from: a */
    void mo19458a(C2711ad adVar, C2765b bVar) throws RemoteException;

    /* renamed from: a */
    void mo19459a(C2711ad adVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo19460a(C2711ad adVar, String str, String str2, byte[] bArr) throws RemoteException;

    /* renamed from: b */
    void mo19461b(C2711ad adVar) throws RemoteException;

    /* renamed from: b */
    void mo19462b(C2711ad adVar, Uri uri) throws RemoteException;

    /* renamed from: b */
    void mo19463b(C2711ad adVar, C2703c cVar) throws RemoteException;

    /* renamed from: b */
    void mo19464b(C2711ad adVar, String str) throws RemoteException;

    /* renamed from: c */
    void mo19465c(C2711ad adVar) throws RemoteException;

    /* renamed from: c */
    void mo19466c(C2711ad adVar, Uri uri) throws RemoteException;

    /* renamed from: c */
    void mo19467c(C2711ad adVar, String str) throws RemoteException;

    /* renamed from: d */
    void mo19468d(C2711ad adVar) throws RemoteException;

    /* renamed from: e */
    void mo19469e(C2711ad adVar) throws RemoteException;

    /* renamed from: f */
    void mo19470f(C2711ad adVar) throws RemoteException;

    /* renamed from: g */
    void mo19471g(C2711ad adVar) throws RemoteException;

    /* renamed from: h */
    void mo19472h(C2711ad adVar) throws RemoteException;

    /* renamed from: i */
    void mo19473i(C2711ad adVar) throws RemoteException;

    /* renamed from: j */
    void mo19474j(C2711ad adVar) throws RemoteException;

    /* renamed from: k */
    void mo19475k(C2711ad adVar) throws RemoteException;
}
