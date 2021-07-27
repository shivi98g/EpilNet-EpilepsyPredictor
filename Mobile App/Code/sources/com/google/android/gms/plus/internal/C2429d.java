package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C1769jr;
import com.google.android.gms.internal.C1807kk;
import com.google.android.gms.internal.C1826ky;
import java.util.List;

/* renamed from: com.google.android.gms.plus.internal.d */
public interface C2429d extends IInterface {

    /* renamed from: com.google.android.gms.plus.internal.d$a */
    public static abstract class C2430a extends Binder implements C2429d {

        /* renamed from: com.google.android.gms.plus.internal.d$a$a */
        private static class C2431a implements C2429d {

            /* renamed from: le */
            private IBinder f4374le;

            C2431a(IBinder iBinder) {
                this.f4374le = iBinder;
            }

            /* renamed from: a */
            public C1769jr mo18433a(C2423b bVar, int i, int i2, int i3, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    this.f4374le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return C1769jr.C1770a.m5254O(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18434a(C1826ky kyVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    if (kyVar != null) {
                        obtain.writeInt(1);
                        kyVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4374le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18435a(C2423b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4374le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18436a(C2423b bVar, int i, String str, Uri uri, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f4374le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18437a(C2423b bVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4374le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18438a(C2423b bVar, C1826ky kyVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (kyVar != null) {
                        obtain.writeInt(1);
                        kyVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4374le.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18439a(C2423b bVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4374le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18440a(C2423b bVar, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f4374le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18441a(C2423b bVar, List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeStringList(list);
                    this.f4374le.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18442a(String str, C1807kk kkVar, C1807kk kkVar2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeString(str);
                    if (kkVar != null) {
                        obtain.writeInt(1);
                        kkVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (kkVar2 != null) {
                        obtain.writeInt(1);
                        kkVar2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4374le.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4374le;
            }

            /* renamed from: b */
            public void mo18443b(C2423b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4374le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo18444b(C2423b bVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4374le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo18445c(C2423b bVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4374le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void clearDefaultAccount() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f4374le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo18447d(C2423b bVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4374le.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo18448e(C2423b bVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f4374le.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getAccountName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f4374le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ou */
            public String mo18450ou() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f4374le.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ov */
            public boolean mo18451ov() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    boolean z = false;
                    this.f4374le.transact(42, obtain, obtain2, 0);
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

            /* renamed from: ow */
            public String mo18452ow() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.f4374le.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removeMoment(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    obtain.writeString(str);
                    this.f4374le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: bM */
        public static C2429d m7028bM(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2429d)) ? new C2431a(iBinder) : (C2429d) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.gms.internal.ky} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.google.android.gms.internal.ky} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.google.android.gms.internal.kk} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v14, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v25 */
        /* JADX WARNING: type inference failed for: r1v26 */
        /* JADX WARNING: type inference failed for: r1v27 */
        /* JADX WARNING: type inference failed for: r1v28 */
        /* JADX WARNING: type inference failed for: r1v29 */
        /* JADX WARNING: type inference failed for: r1v30 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
            /*
                r10 = this;
                r0 = 14
                r1 = 0
                r2 = 1
                if (r11 == r0) goto L_0x0219
                r0 = 34
                if (r11 == r0) goto L_0x0201
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r11 == r0) goto L_0x01fb
                switch(r11) {
                    case 1: goto L_0x01e3;
                    case 2: goto L_0x01c7;
                    case 3: goto L_0x01af;
                    case 4: goto L_0x0197;
                    case 5: goto L_0x0187;
                    case 6: goto L_0x017b;
                    default: goto L_0x0012;
                }
            L_0x0012:
                switch(r11) {
                    case 8: goto L_0x0167;
                    case 9: goto L_0x0135;
                    default: goto L_0x0015;
                }
            L_0x0015:
                switch(r11) {
                    case 16: goto L_0x0106;
                    case 17: goto L_0x00f6;
                    case 18: goto L_0x00de;
                    case 19: goto L_0x00ca;
                    default: goto L_0x0018;
                }
            L_0x0018:
                switch(r11) {
                    case 40: goto L_0x00b2;
                    case 41: goto L_0x00a2;
                    case 42: goto L_0x0092;
                    case 43: goto L_0x0082;
                    case 44: goto L_0x006a;
                    case 45: goto L_0x004a;
                    case 46: goto L_0x0020;
                    default: goto L_0x001b;
                }
            L_0x001b:
                boolean r0 = super.onTransact(r11, r12, r13, r14)
                return r0
            L_0x0020:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                java.lang.String r0 = r12.readString()
                int r3 = r12.readInt()
                if (r3 == 0) goto L_0x0036
                com.google.android.gms.internal.kl r3 = com.google.android.gms.internal.C1807kk.CREATOR
                com.google.android.gms.internal.kk r3 = r3.createFromParcel(r12)
                goto L_0x0037
            L_0x0036:
                r3 = r1
            L_0x0037:
                int r4 = r12.readInt()
                if (r4 == 0) goto L_0x0043
                com.google.android.gms.internal.kl r1 = com.google.android.gms.internal.C1807kk.CREATOR
                com.google.android.gms.internal.kk r1 = r1.createFromParcel(r12)
            L_0x0043:
                r10.mo18442a((java.lang.String) r0, (com.google.android.gms.internal.C1807kk) r3, (com.google.android.gms.internal.C1807kk) r1)
                r13.writeNoException()
                return r2
            L_0x004a:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                int r3 = r12.readInt()
                if (r3 == 0) goto L_0x0063
                com.google.android.gms.internal.kz r1 = com.google.android.gms.internal.C1826ky.CREATOR
                com.google.android.gms.internal.ky r1 = r1.createFromParcel(r12)
            L_0x0063:
                r10.mo18438a((com.google.android.gms.plus.internal.C2423b) r0, (com.google.android.gms.internal.C1826ky) r1)
                r13.writeNoException()
                return r2
            L_0x006a:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                java.lang.String r1 = r12.readString()
                r10.mo18448e(r0, r1)
                r13.writeNoException()
                return r2
            L_0x0082:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                java.lang.String r0 = r10.mo18452ow()
                r13.writeNoException()
                r13.writeString(r0)
                return r2
            L_0x0092:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                boolean r0 = r10.mo18451ov()
                r13.writeNoException()
                r13.writeInt(r0)
                return r2
            L_0x00a2:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                java.lang.String r0 = r10.mo18450ou()
                r13.writeNoException()
                r13.writeString(r0)
                return r2
            L_0x00b2:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                java.lang.String r1 = r12.readString()
                r10.mo18447d(r0, r1)
                r13.writeNoException()
                return r2
            L_0x00ca:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                r10.mo18443b(r0)
                r13.writeNoException()
                return r2
            L_0x00de:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                java.lang.String r1 = r12.readString()
                r10.mo18445c(r0, r1)
                r13.writeNoException()
                return r2
            L_0x00f6:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                java.lang.String r0 = r12.readString()
                r10.removeMoment(r0)
                r13.writeNoException()
                return r2
            L_0x0106:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r4 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                int r5 = r12.readInt()
                int r6 = r12.readInt()
                int r7 = r12.readInt()
                java.lang.String r8 = r12.readString()
                r3 = r10
                com.google.android.gms.internal.jr r0 = r3.mo18433a(r4, r5, r6, r7, r8)
                r13.writeNoException()
                if (r0 == 0) goto L_0x0131
                android.os.IBinder r1 = r0.asBinder()
            L_0x0131:
                r13.writeStrongBinder(r1)
                return r2
            L_0x0135:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                int r3 = r12.readInt()
                if (r3 == 0) goto L_0x0151
                android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r12)
                android.net.Uri r3 = (android.net.Uri) r3
                goto L_0x0152
            L_0x0151:
                r3 = r1
            L_0x0152:
                int r4 = r12.readInt()
                if (r4 == 0) goto L_0x0160
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r12)
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0160:
                r10.mo18437a((com.google.android.gms.plus.internal.C2423b) r0, (android.net.Uri) r3, (android.os.Bundle) r1)
                r13.writeNoException()
                return r2
            L_0x0167:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                r10.mo18435a((com.google.android.gms.plus.internal.C2423b) r0)
                r13.writeNoException()
                return r2
            L_0x017b:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                r10.clearDefaultAccount()
                r13.writeNoException()
                return r2
            L_0x0187:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                java.lang.String r0 = r10.getAccountName()
                r13.writeNoException()
                r13.writeString(r0)
                return r2
            L_0x0197:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                int r0 = r12.readInt()
                if (r0 == 0) goto L_0x01a8
                com.google.android.gms.internal.kz r0 = com.google.android.gms.internal.C1826ky.CREATOR
                com.google.android.gms.internal.ky r1 = r0.createFromParcel(r12)
            L_0x01a8:
                r10.mo18434a((com.google.android.gms.internal.C1826ky) r1)
                r13.writeNoException()
                return r2
            L_0x01af:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                java.lang.String r1 = r12.readString()
                r10.mo18444b(r0, r1)
                r13.writeNoException()
                return r2
            L_0x01c7:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                java.lang.String r1 = r12.readString()
                java.lang.String r3 = r12.readString()
                r10.mo18440a((com.google.android.gms.plus.internal.C2423b) r0, (java.lang.String) r1, (java.lang.String) r3)
                r13.writeNoException()
                return r2
            L_0x01e3:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                java.lang.String r1 = r12.readString()
                r10.mo18439a((com.google.android.gms.plus.internal.C2423b) r0, (java.lang.String) r1)
                r13.writeNoException()
                return r2
            L_0x01fb:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r13.writeString(r0)
                return r2
            L_0x0201:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r0 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                java.util.ArrayList r1 = r12.createStringArrayList()
                r10.mo18441a((com.google.android.gms.plus.internal.C2423b) r0, (java.util.List<java.lang.String>) r1)
                r13.writeNoException()
                return r2
            L_0x0219:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
                r12.enforceInterface(r0)
                android.os.IBinder r0 = r12.readStrongBinder()
                com.google.android.gms.plus.internal.b r4 = com.google.android.gms.plus.internal.C2423b.C2424a.m6994bK(r0)
                int r5 = r12.readInt()
                java.lang.String r6 = r12.readString()
                int r0 = r12.readInt()
                if (r0 == 0) goto L_0x023d
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r12)
                r1 = r0
                android.net.Uri r1 = (android.net.Uri) r1
            L_0x023d:
                r7 = r1
                java.lang.String r8 = r12.readString()
                java.lang.String r9 = r12.readString()
                r3 = r10
                r3.mo18436a(r4, r5, r6, r7, r8, r9)
                r13.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.internal.C2429d.C2430a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    C1769jr mo18433a(C2423b bVar, int i, int i2, int i3, String str) throws RemoteException;

    /* renamed from: a */
    void mo18434a(C1826ky kyVar) throws RemoteException;

    /* renamed from: a */
    void mo18435a(C2423b bVar) throws RemoteException;

    /* renamed from: a */
    void mo18436a(C2423b bVar, int i, String str, Uri uri, String str2, String str3) throws RemoteException;

    /* renamed from: a */
    void mo18437a(C2423b bVar, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo18438a(C2423b bVar, C1826ky kyVar) throws RemoteException;

    /* renamed from: a */
    void mo18439a(C2423b bVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo18440a(C2423b bVar, String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo18441a(C2423b bVar, List<String> list) throws RemoteException;

    /* renamed from: a */
    void mo18442a(String str, C1807kk kkVar, C1807kk kkVar2) throws RemoteException;

    /* renamed from: b */
    void mo18443b(C2423b bVar) throws RemoteException;

    /* renamed from: b */
    void mo18444b(C2423b bVar, String str) throws RemoteException;

    /* renamed from: c */
    void mo18445c(C2423b bVar, String str) throws RemoteException;

    void clearDefaultAccount() throws RemoteException;

    /* renamed from: d */
    void mo18447d(C2423b bVar, String str) throws RemoteException;

    /* renamed from: e */
    void mo18448e(C2423b bVar, String str) throws RemoteException;

    String getAccountName() throws RemoteException;

    /* renamed from: ou */
    String mo18450ou() throws RemoteException;

    /* renamed from: ov */
    boolean mo18451ov() throws RemoteException;

    /* renamed from: ow */
    String mo18452ow() throws RemoteException;

    void removeMoment(String str) throws RemoteException;
}
