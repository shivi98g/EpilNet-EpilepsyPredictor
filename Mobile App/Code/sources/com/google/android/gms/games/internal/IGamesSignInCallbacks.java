package com.google.android.gms.games.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.FitnessStatusCodes;

public interface IGamesSignInCallbacks extends IInterface {

    public static abstract class Stub extends Binder implements IGamesSignInCallbacks {

        private static class Proxy implements IGamesSignInCallbacks {

            /* renamed from: le */
            private IBinder f1962le;

            Proxy(IBinder iBinder) {
                this.f1962le = iBinder;
            }

            /* renamed from: U */
            public void mo13781U(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1962le.transact(FitnessStatusCodes.INCONSISTENT_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: V */
            public void mo13782V(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1962le.transact(FitnessStatusCodes.DATA_TYPE_NOT_FOUND, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1962le;
            }

            /* renamed from: b */
            public void mo13783b(int i, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                    obtain.writeInt(i);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1962le.transact(FitnessStatusCodes.CONFLICTING_DATA_TYPE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dU */
            public void mo13784dU(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                    obtain.writeInt(i);
                    this.f1962le.transact(FitnessStatusCodes.APP_MISMATCH, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dV */
            public void mo13785dV(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                    obtain.writeInt(i);
                    this.f1962le.transact(FitnessStatusCodes.MISSING_BLE_PERMISSION, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: dW */
            public void mo13786dW(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                    obtain.writeInt(i);
                    this.f1962le.transact(14001, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo13787g(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesSignInCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1962le.transact(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesSignInCallbacks");
        }

        /* renamed from: aF */
        public static IGamesSignInCallbacks m3100aF(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesSignInCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGamesSignInCallbacks)) ? new Proxy(iBinder) : (IGamesSignInCallbacks) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX WARNING: type inference failed for: r0v5 */
        /* JADX WARNING: type inference failed for: r0v6, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: type inference failed for: r0v26 */
        /* JADX WARNING: type inference failed for: r0v27 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 14001(0x36b1, float:1.962E-41)
                r1 = 1
                if (r5 == r0) goto L_0x009f
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0099
                r0 = 0
                switch(r5) {
                    case 5001: goto L_0x007b;
                    case 5002: goto L_0x0063;
                    case 5003: goto L_0x004b;
                    case 5004: goto L_0x003b;
                    case 5005: goto L_0x0023;
                    case 5006: goto L_0x0013;
                    default: goto L_0x000e;
                }
            L_0x000e:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x0013:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo13785dV(r0)
                r7.writeNoException()
                return r1
            L_0x0023:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0034
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0034:
                r4.mo13787g(r0)
                r7.writeNoException()
                return r1
            L_0x003b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo13784dU(r0)
                r7.writeNoException()
                return r1
            L_0x004b:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x005c
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x005c:
                r4.mo13782V(r0)
                r7.writeNoException()
                return r1
            L_0x0063:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0074
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r6)
            L_0x0074:
                r4.mo13781U(r0)
                r7.writeNoException()
                return r1
            L_0x007b:
                java.lang.String r2 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0092
                android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x0092:
                r4.mo13783b(r2, r0)
                r7.writeNoException()
                return r1
            L_0x0099:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r7.writeString(r0)
                return r1
            L_0x009f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IGamesSignInCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo13786dW(r0)
                r7.writeNoException()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.internal.IGamesSignInCallbacks.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: U */
    void mo13781U(DataHolder dataHolder) throws RemoteException;

    /* renamed from: V */
    void mo13782V(DataHolder dataHolder) throws RemoteException;

    /* renamed from: b */
    void mo13783b(int i, Intent intent) throws RemoteException;

    /* renamed from: dU */
    void mo13784dU(int i) throws RemoteException;

    /* renamed from: dV */
    void mo13785dV(int i) throws RemoteException;

    /* renamed from: dW */
    void mo13786dW(int i) throws RemoteException;

    /* renamed from: g */
    void mo13787g(DataHolder dataHolder) throws RemoteException;
}
