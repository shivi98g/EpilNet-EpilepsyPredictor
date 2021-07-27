package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.support.p000v4.view.InputDeviceCompat;
import android.support.p000v4.view.PointerIconCompat;

public interface IRoomServiceCallbacks extends IInterface {

    public static abstract class Stub extends Binder implements IRoomServiceCallbacks {

        private static class Proxy implements IRoomServiceCallbacks {

            /* renamed from: le */
            private IBinder f1965le;

            Proxy(IBinder iBinder) {
                this.f1965le = iBinder;
            }

            /* renamed from: a */
            public void mo13819a(ParcelFileDescriptor parcelFileDescriptor, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f1965le.transact(1024, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13820a(ConnectionInfo connectionInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    if (connectionInfo != null) {
                        obtain.writeInt(1);
                        connectionInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1965le.transact(1022, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13821a(String str, byte[] bArr, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    this.f1965le.transact(1002, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo13822a(String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_TEXT, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: aG */
            public void mo13823aG(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeStrongBinder(iBinder);
                    this.f1965le.transact(PointerIconCompat.TYPE_GRABBING, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1965le;
            }

            /* renamed from: b */
            public void mo13824b(String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_VERTICAL_TEXT, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: bS */
            public void mo13825bS(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(PointerIconCompat.TYPE_HELP, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: bT */
            public void mo13826bT(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(PointerIconCompat.TYPE_WAIT, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: bU */
            public void mo13827bU(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(1005, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: bV */
            public void mo13828bV(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(PointerIconCompat.TYPE_CELL, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: bW */
            public void mo13829bW(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(PointerIconCompat.TYPE_CROSSHAIR, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: bX */
            public void mo13830bX(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(PointerIconCompat.TYPE_ZOOM_OUT, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13831c(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f1965le.transact(1001, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13832c(String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_ZOOM_IN, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo13833c(String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_ALIAS, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo13834d(String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_COPY, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: dX */
            public void mo13835dX(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeInt(i);
                    this.f1965le.transact(PointerIconCompat.TYPE_GRAB, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo13836e(String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_NO_DROP, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo13837f(String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_ALL_SCROLL, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo13838g(String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    this.f1965le.transact(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public void mo13839j(String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f1965le.transact(1026, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: lR */
            public void mo13840lR() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    this.f1965le.transact(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: lS */
            public void mo13841lS() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    this.f1965le.transact(1023, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onP2PConnected(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onP2PDisconnected(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    this.f1965le.transact(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public void mo13844x(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f1965le.transact(InputDeviceCompat.SOURCE_GAMEPAD, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.games.internal.IRoomServiceCallbacks");
        }

        /* renamed from: aH */
        public static IRoomServiceCallbacks m3182aH(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRoomServiceCallbacks)) ? new Proxy(iBinder) : (IRoomServiceCallbacks) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: com.google.android.gms.games.internal.ConnectionInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: android.os.ParcelFileDescriptor} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v57 */
        /* JADX WARNING: type inference failed for: r0v58 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x01ac
                r0 = 0
                switch(r5) {
                    case 1001: goto L_0x0197;
                    case 1002: goto L_0x0182;
                    case 1003: goto L_0x0175;
                    case 1004: goto L_0x0168;
                    case 1005: goto L_0x015b;
                    case 1006: goto L_0x014e;
                    case 1007: goto L_0x0141;
                    case 1008: goto L_0x0130;
                    case 1009: goto L_0x011f;
                    case 1010: goto L_0x010e;
                    case 1011: goto L_0x00fd;
                    case 1012: goto L_0x00ec;
                    case 1013: goto L_0x00db;
                    case 1014: goto L_0x00ce;
                    case 1015: goto L_0x00c1;
                    case 1016: goto L_0x00b8;
                    case 1017: goto L_0x00a7;
                    case 1018: goto L_0x0096;
                    case 1019: goto L_0x0089;
                    case 1020: goto L_0x007c;
                    case 1021: goto L_0x006f;
                    case 1022: goto L_0x005a;
                    case 1023: goto L_0x0051;
                    case 1024: goto L_0x0036;
                    case 1025: goto L_0x0025;
                    case 1026: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x000f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0020
                r2 = r1
                goto L_0x0021
            L_0x0020:
                r2 = 0
            L_0x0021:
                r4.mo13839j(r0, r2)
                return r1
            L_0x0025:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                int r2 = r6.readInt()
                r4.mo13844x(r0, r2)
                return r1
            L_0x0036:
                java.lang.String r2 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0049
                android.os.Parcelable$Creator r0 = android.os.ParcelFileDescriptor.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0
            L_0x0049:
                int r2 = r6.readInt()
                r4.mo13819a((android.os.ParcelFileDescriptor) r0, (int) r2)
                return r1
            L_0x0051:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                r4.mo13841lS()
                return r1
            L_0x005a:
                java.lang.String r2 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x006b
                com.google.android.gms.games.internal.ConnectionInfoCreator r0 = com.google.android.gms.games.internal.ConnectionInfo.CREATOR
                com.google.android.gms.games.internal.ConnectionInfo r0 = r0.createFromParcel(r6)
            L_0x006b:
                r4.mo13820a(r0)
                return r1
            L_0x006f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                android.os.IBinder r0 = r6.readStrongBinder()
                r4.mo13823aG(r0)
                return r1
            L_0x007c:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo13835dX(r0)
                return r1
            L_0x0089:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.mo13830bX(r0)
                return r1
            L_0x0096:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                byte[] r2 = r6.createByteArray()
                r4.mo13832c((java.lang.String) r0, (byte[]) r2)
                return r1
            L_0x00a7:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                java.lang.String[] r2 = r6.createStringArray()
                r4.mo13838g(r0, r2)
                return r1
            L_0x00b8:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                r4.mo13840lR()
                return r1
            L_0x00c1:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onP2PDisconnected(r0)
                return r1
            L_0x00ce:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.onP2PConnected(r0)
                return r1
            L_0x00db:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                java.lang.String[] r2 = r6.createStringArray()
                r4.mo13837f(r0, r2)
                return r1
            L_0x00ec:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                java.lang.String[] r2 = r6.createStringArray()
                r4.mo13836e(r0, r2)
                return r1
            L_0x00fd:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                java.lang.String[] r2 = r6.createStringArray()
                r4.mo13834d(r0, r2)
                return r1
            L_0x010e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                java.lang.String[] r2 = r6.createStringArray()
                r4.mo13833c((java.lang.String) r0, (java.lang.String[]) r2)
                return r1
            L_0x011f:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                java.lang.String[] r2 = r6.createStringArray()
                r4.mo13824b(r0, r2)
                return r1
            L_0x0130:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                java.lang.String[] r2 = r6.createStringArray()
                r4.mo13822a((java.lang.String) r0, (java.lang.String[]) r2)
                return r1
            L_0x0141:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.mo13829bW(r0)
                return r1
            L_0x014e:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.mo13828bV(r0)
                return r1
            L_0x015b:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.mo13827bU(r0)
                return r1
            L_0x0168:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.mo13826bT(r0)
                return r1
            L_0x0175:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                r4.mo13825bS(r0)
                return r1
            L_0x0182:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                java.lang.String r0 = r6.readString()
                byte[] r2 = r6.createByteArray()
                int r3 = r6.readInt()
                r4.mo13821a(r0, r2, r3)
                return r1
            L_0x0197:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                int r2 = r6.readInt()
                java.lang.String r3 = r6.readString()
                r4.mo13831c(r0, r2, r3)
                return r1
            L_0x01ac:
                java.lang.String r0 = "com.google.android.gms.games.internal.IRoomServiceCallbacks"
                r7.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.internal.IRoomServiceCallbacks.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo13819a(ParcelFileDescriptor parcelFileDescriptor, int i) throws RemoteException;

    /* renamed from: a */
    void mo13820a(ConnectionInfo connectionInfo) throws RemoteException;

    /* renamed from: a */
    void mo13821a(String str, byte[] bArr, int i) throws RemoteException;

    /* renamed from: a */
    void mo13822a(String str, String[] strArr) throws RemoteException;

    /* renamed from: aG */
    void mo13823aG(IBinder iBinder) throws RemoteException;

    /* renamed from: b */
    void mo13824b(String str, String[] strArr) throws RemoteException;

    /* renamed from: bS */
    void mo13825bS(String str) throws RemoteException;

    /* renamed from: bT */
    void mo13826bT(String str) throws RemoteException;

    /* renamed from: bU */
    void mo13827bU(String str) throws RemoteException;

    /* renamed from: bV */
    void mo13828bV(String str) throws RemoteException;

    /* renamed from: bW */
    void mo13829bW(String str) throws RemoteException;

    /* renamed from: bX */
    void mo13830bX(String str) throws RemoteException;

    /* renamed from: c */
    void mo13831c(int i, int i2, String str) throws RemoteException;

    /* renamed from: c */
    void mo13832c(String str, byte[] bArr) throws RemoteException;

    /* renamed from: c */
    void mo13833c(String str, String[] strArr) throws RemoteException;

    /* renamed from: d */
    void mo13834d(String str, String[] strArr) throws RemoteException;

    /* renamed from: dX */
    void mo13835dX(int i) throws RemoteException;

    /* renamed from: e */
    void mo13836e(String str, String[] strArr) throws RemoteException;

    /* renamed from: f */
    void mo13837f(String str, String[] strArr) throws RemoteException;

    /* renamed from: g */
    void mo13838g(String str, String[] strArr) throws RemoteException;

    /* renamed from: j */
    void mo13839j(String str, boolean z) throws RemoteException;

    /* renamed from: lR */
    void mo13840lR() throws RemoteException;

    /* renamed from: lS */
    void mo13841lS() throws RemoteException;

    void onP2PConnected(String str) throws RemoteException;

    void onP2PDisconnected(String str) throws RemoteException;

    /* renamed from: x */
    void mo13844x(String str, int i) throws RemoteException;
}
