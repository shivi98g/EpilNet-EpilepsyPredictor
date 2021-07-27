package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0967d;

/* renamed from: com.google.android.gms.internal.cz */
public interface C1405cz extends IInterface {

    /* renamed from: com.google.android.gms.internal.cz$a */
    public static abstract class C1406a extends Binder implements C1405cz {

        /* renamed from: com.google.android.gms.internal.cz$a$a */
        private static class C1407a implements C1405cz {

            /* renamed from: le */
            private IBinder f2851le;

            C1407a(IBinder iBinder) {
                this.f2851le = iBinder;
            }

            /* renamed from: a */
            public void mo15053a(C0967d dVar, C1303av avVar, String str, C1410da daVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (avVar != null) {
                        obtain.writeInt(1);
                        avVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (daVar != null) {
                        iBinder = daVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2851le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15054a(C0967d dVar, C1303av avVar, String str, String str2, C1410da daVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (avVar != null) {
                        obtain.writeInt(1);
                        avVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (daVar != null) {
                        iBinder = daVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2851le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15055a(C0967d dVar, C1306ay ayVar, C1303av avVar, String str, C1410da daVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (ayVar != null) {
                        obtain.writeInt(1);
                        ayVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (avVar != null) {
                        obtain.writeInt(1);
                        avVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (daVar != null) {
                        iBinder = daVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2851le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15056a(C0967d dVar, C1306ay ayVar, C1303av avVar, String str, String str2, C1410da daVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (ayVar != null) {
                        obtain.writeInt(1);
                        ayVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (avVar != null) {
                        obtain.writeInt(1);
                        avVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (daVar != null) {
                        iBinder = daVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2851le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2851le;
            }

            public void destroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f2851le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0967d getView() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f2851le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C0967d.C0968a.m1611ap(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f2851le.transact(8, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f2851le.transact(9, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.f2851le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1406a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }

        /* renamed from: o */
        public static C1405cz m4222o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1405cz)) ? new C1407a(iBinder) : (C1405cz) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.av} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v3 */
        /* JADX WARNING: type inference failed for: r0v7, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: type inference failed for: r0v18 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: type inference failed for: r0v26 */
        /* JADX WARNING: type inference failed for: r0v27 */
        /* JADX WARNING: type inference failed for: r0v28 */
        /* JADX WARNING: type inference failed for: r0v29 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
            /*
                r10 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r11 == r0) goto L_0x0131
                r0 = 0
                switch(r11) {
                    case 1: goto L_0x00f4;
                    case 2: goto L_0x00de;
                    case 3: goto L_0x00b2;
                    case 4: goto L_0x00a6;
                    case 5: goto L_0x009a;
                    case 6: goto L_0x0059;
                    case 7: goto L_0x0027;
                    case 8: goto L_0x001b;
                    case 9: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r11, r12, r13, r14)
                return r0
            L_0x000f:
                java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r0)
                r10.resume()
                r13.writeNoException()
                return r1
            L_0x001b:
                java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r0)
                r10.pause()
                r13.writeNoException()
                return r1
            L_0x0027:
                java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r2)
                android.os.IBinder r2 = r12.readStrongBinder()
                com.google.android.gms.dynamic.d r4 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                int r2 = r12.readInt()
                if (r2 == 0) goto L_0x0040
                com.google.android.gms.internal.aw r0 = com.google.android.gms.internal.C1303av.CREATOR
                com.google.android.gms.internal.av r0 = r0.createFromParcel(r12)
            L_0x0040:
                r5 = r0
                java.lang.String r6 = r12.readString()
                java.lang.String r7 = r12.readString()
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.internal.da r8 = com.google.android.gms.internal.C1410da.C1411a.m4233p(r0)
                r3 = r10
                r3.mo15054a((com.google.android.gms.dynamic.C0967d) r4, (com.google.android.gms.internal.C1303av) r5, (java.lang.String) r6, (java.lang.String) r7, (com.google.android.gms.internal.C1410da) r8)
                r13.writeNoException()
                return r1
            L_0x0059:
                java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r2)
                android.os.IBinder r2 = r12.readStrongBinder()
                com.google.android.gms.dynamic.d r4 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                int r2 = r12.readInt()
                if (r2 == 0) goto L_0x0074
                com.google.android.gms.internal.az r2 = com.google.android.gms.internal.C1306ay.CREATOR
                com.google.android.gms.internal.ay r2 = r2.createFromParcel(r12)
                r5 = r2
                goto L_0x0075
            L_0x0074:
                r5 = r0
            L_0x0075:
                int r2 = r12.readInt()
                if (r2 == 0) goto L_0x0081
                com.google.android.gms.internal.aw r0 = com.google.android.gms.internal.C1303av.CREATOR
                com.google.android.gms.internal.av r0 = r0.createFromParcel(r12)
            L_0x0081:
                r6 = r0
                java.lang.String r7 = r12.readString()
                java.lang.String r8 = r12.readString()
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.internal.da r9 = com.google.android.gms.internal.C1410da.C1411a.m4233p(r0)
                r3 = r10
                r3.mo15056a(r4, r5, r6, r7, r8, r9)
                r13.writeNoException()
                return r1
            L_0x009a:
                java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r0)
                r10.destroy()
                r13.writeNoException()
                return r1
            L_0x00a6:
                java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r0)
                r10.showInterstitial()
                r13.writeNoException()
                return r1
            L_0x00b2:
                java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r2)
                android.os.IBinder r2 = r12.readStrongBinder()
                com.google.android.gms.dynamic.d r2 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                int r3 = r12.readInt()
                if (r3 == 0) goto L_0x00cb
                com.google.android.gms.internal.aw r0 = com.google.android.gms.internal.C1303av.CREATOR
                com.google.android.gms.internal.av r0 = r0.createFromParcel(r12)
            L_0x00cb:
                java.lang.String r3 = r12.readString()
                android.os.IBinder r4 = r12.readStrongBinder()
                com.google.android.gms.internal.da r4 = com.google.android.gms.internal.C1410da.C1411a.m4233p(r4)
                r10.mo15053a(r2, r0, r3, r4)
                r13.writeNoException()
                return r1
            L_0x00de:
                java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r2)
                com.google.android.gms.dynamic.d r2 = r10.getView()
                r13.writeNoException()
                if (r2 == 0) goto L_0x00f0
                android.os.IBinder r0 = r2.asBinder()
            L_0x00f0:
                r13.writeStrongBinder(r0)
                return r1
            L_0x00f4:
                java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r12.enforceInterface(r2)
                android.os.IBinder r2 = r12.readStrongBinder()
                com.google.android.gms.dynamic.d r4 = com.google.android.gms.dynamic.C0967d.C0968a.m1611ap(r2)
                int r2 = r12.readInt()
                if (r2 == 0) goto L_0x010f
                com.google.android.gms.internal.az r2 = com.google.android.gms.internal.C1306ay.CREATOR
                com.google.android.gms.internal.ay r2 = r2.createFromParcel(r12)
                r5 = r2
                goto L_0x0110
            L_0x010f:
                r5 = r0
            L_0x0110:
                int r2 = r12.readInt()
                if (r2 == 0) goto L_0x011c
                com.google.android.gms.internal.aw r0 = com.google.android.gms.internal.C1303av.CREATOR
                com.google.android.gms.internal.av r0 = r0.createFromParcel(r12)
            L_0x011c:
                r6 = r0
                java.lang.String r7 = r12.readString()
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.internal.da r8 = com.google.android.gms.internal.C1410da.C1411a.m4233p(r0)
                r3 = r10
                r3.mo15055a((com.google.android.gms.dynamic.C0967d) r4, (com.google.android.gms.internal.C1306ay) r5, (com.google.android.gms.internal.C1303av) r6, (java.lang.String) r7, (com.google.android.gms.internal.C1410da) r8)
                r13.writeNoException()
                return r1
            L_0x0131:
                java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
                r13.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1405cz.C1406a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo15053a(C0967d dVar, C1303av avVar, String str, C1410da daVar) throws RemoteException;

    /* renamed from: a */
    void mo15054a(C0967d dVar, C1303av avVar, String str, String str2, C1410da daVar) throws RemoteException;

    /* renamed from: a */
    void mo15055a(C0967d dVar, C1306ay ayVar, C1303av avVar, String str, C1410da daVar) throws RemoteException;

    /* renamed from: a */
    void mo15056a(C0967d dVar, C1306ay ayVar, C1303av avVar, String str, String str2, C1410da daVar) throws RemoteException;

    void destroy() throws RemoteException;

    C0967d getView() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void showInterstitial() throws RemoteException;
}
