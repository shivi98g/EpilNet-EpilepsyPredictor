package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.internal.bd */
public interface C1314bd extends IInterface {

    /* renamed from: com.google.android.gms.internal.bd$a */
    public static abstract class C1315a extends Binder implements C1314bd {

        /* renamed from: com.google.android.gms.internal.bd$a$a */
        private static class C1316a implements C1314bd {

            /* renamed from: le */
            private IBinder f2616le;

            C1316a(IBinder iBinder) {
                this.f2616le = iBinder;
            }

            /* renamed from: a */
            public void mo14835a(C1306ay ayVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    if (ayVar != null) {
                        obtain.writeInt(1);
                        ayVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2616le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo14836a(C1311bc bcVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(bcVar != null ? bcVar.asBinder() : null);
                    this.f2616le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo14837a(C1320bf bfVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(bfVar != null ? bfVar.asBinder() : null);
                    this.f2616le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo14838a(C1337br brVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(brVar != null ? brVar.asBinder() : null);
                    this.f2616le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo14839a(C1485en enVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(enVar != null ? enVar.asBinder() : null);
                    this.f2616le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo14840a(C1497er erVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    obtain.writeStrongBinder(erVar != null ? erVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f2616le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo14841a(C1303av avVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    boolean z = true;
                    if (avVar != null) {
                        obtain.writeInt(1);
                        avVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2616le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ab */
            public C0967d mo14842ab() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ac */
            public C1306ay mo14843ac() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C1306ay.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: an */
            public void mo14844an() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2616le;
            }

            public void destroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getMediationAdapterClassName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isReady() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    boolean z = false;
                    this.f2616le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void resume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showInterstitial() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stopLoading() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.f2616le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1315a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
        }

        /* renamed from: f */
        public static C1314bd m3968f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1314bd)) ? new C1316a(iBinder) : (C1314bd) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.gms.internal.av} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.google.android.gms.internal.ay} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: type inference failed for: r0v43 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x0146
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x0130;
                    case 2: goto L_0x0124;
                    case 3: goto L_0x0114;
                    case 4: goto L_0x00f8;
                    case 5: goto L_0x00ec;
                    case 6: goto L_0x00e0;
                    case 7: goto L_0x00cc;
                    case 8: goto L_0x00b8;
                    case 9: goto L_0x00ac;
                    case 10: goto L_0x00a0;
                    case 11: goto L_0x0094;
                    case 12: goto L_0x007a;
                    case 13: goto L_0x0062;
                    case 14: goto L_0x004e;
                    case 15: goto L_0x0036;
                    default: goto L_0x000a;
                }
            L_0x000a:
                switch(r4) {
                    case 18: goto L_0x0026;
                    case 19: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x0012:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.internal.br r0 = com.google.android.gms.internal.C1337br.C1338a.m4052j(r0)
                r3.mo14838a((com.google.android.gms.internal.C1337br) r0)
                r6.writeNoException()
                return r1
            L_0x0026:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                java.lang.String r0 = r3.getMediationAdapterClassName()
                r6.writeNoException()
                r6.writeString(r0)
                return r1
            L_0x0036:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.internal.er r0 = com.google.android.gms.internal.C1497er.C1498a.m4397z(r0)
                java.lang.String r2 = r5.readString()
                r3.mo14840a(r0, r2)
                r6.writeNoException()
                return r1
            L_0x004e:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.internal.en r0 = com.google.android.gms.internal.C1485en.C1486a.m4389v(r0)
                r3.mo14839a((com.google.android.gms.internal.C1485en) r0)
                r6.writeNoException()
                return r1
            L_0x0062:
                java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0073
                com.google.android.gms.internal.az r0 = com.google.android.gms.internal.C1306ay.CREATOR
                com.google.android.gms.internal.ay r0 = r0.createFromParcel(r5)
            L_0x0073:
                r3.mo14835a((com.google.android.gms.internal.C1306ay) r0)
                r6.writeNoException()
                return r1
            L_0x007a:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                com.google.android.gms.internal.ay r0 = r3.mo14843ac()
                r6.writeNoException()
                if (r0 == 0) goto L_0x008f
                r6.writeInt(r1)
                r0.writeToParcel(r6, r1)
                return r1
            L_0x008f:
                r0 = 0
                r6.writeInt(r0)
                return r1
            L_0x0094:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                r3.mo14844an()
                r6.writeNoException()
                return r1
            L_0x00a0:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                r3.stopLoading()
                r6.writeNoException()
                return r1
            L_0x00ac:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                r3.showInterstitial()
                r6.writeNoException()
                return r1
            L_0x00b8:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.internal.bf r0 = com.google.android.gms.internal.C1320bf.C1321a.m3982h(r0)
                r3.mo14837a((com.google.android.gms.internal.C1320bf) r0)
                r6.writeNoException()
                return r1
            L_0x00cc:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                android.os.IBinder r0 = r5.readStrongBinder()
                com.google.android.gms.internal.bc r0 = com.google.android.gms.internal.C1311bc.C1312a.m3957e(r0)
                r3.mo14836a((com.google.android.gms.internal.C1311bc) r0)
                r6.writeNoException()
                return r1
            L_0x00e0:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                r3.resume()
                r6.writeNoException()
                return r1
            L_0x00ec:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                r3.pause()
                r6.writeNoException()
                return r1
            L_0x00f8:
                java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0109
                com.google.android.gms.internal.aw r0 = com.google.android.gms.internal.C1303av.CREATOR
                com.google.android.gms.internal.av r0 = r0.createFromParcel(r5)
            L_0x0109:
                boolean r0 = r3.mo14841a((com.google.android.gms.internal.C1303av) r0)
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x0114:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                boolean r0 = r3.isReady()
                r6.writeNoException()
                r6.writeInt(r0)
                return r1
            L_0x0124:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r0)
                r3.destroy()
                r6.writeNoException()
                return r1
            L_0x0130:
                java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdManager"
                r5.enforceInterface(r2)
                com.google.android.gms.dynamic.d r2 = r3.mo14842ab()
                r6.writeNoException()
                if (r2 == 0) goto L_0x0142
                android.os.IBinder r0 = r2.asBinder()
            L_0x0142:
                r6.writeStrongBinder(r0)
                return r1
            L_0x0146:
                java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdManager"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1314bd.C1315a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo14835a(C1306ay ayVar) throws RemoteException;

    /* renamed from: a */
    void mo14836a(C1311bc bcVar) throws RemoteException;

    /* renamed from: a */
    void mo14837a(C1320bf bfVar) throws RemoteException;

    /* renamed from: a */
    void mo14838a(C1337br brVar) throws RemoteException;

    /* renamed from: a */
    void mo14839a(C1485en enVar) throws RemoteException;

    /* renamed from: a */
    void mo14840a(C1497er erVar, String str) throws RemoteException;

    /* renamed from: a */
    boolean mo14841a(C1303av avVar) throws RemoteException;

    /* renamed from: ab */
    C0967d mo14842ab() throws RemoteException;

    /* renamed from: ac */
    C1306ay mo14843ac() throws RemoteException;

    /* renamed from: an */
    void mo14844an() throws RemoteException;

    void destroy() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;
}
