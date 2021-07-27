package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.oq */
public interface C2049oq extends IInterface {

    /* renamed from: com.google.android.gms.internal.oq$a */
    public static abstract class C2050a extends Binder implements C2049oq {

        /* renamed from: com.google.android.gms.internal.oq$a$a */
        private static class C2051a implements C2049oq {

            /* renamed from: le */
            private IBinder f4168le;

            C2051a(IBinder iBinder) {
                this.f4168le = iBinder;
            }

            /* renamed from: a */
            public void mo16503a(String str, C2058ov ovVar, C2052or orVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
                    obtain.writeString(str);
                    if (ovVar != null) {
                        obtain.writeInt(1);
                        ovVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (orVar != null) {
                        obtain.writeInt(1);
                        orVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4168le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16504a(String str, C2058ov ovVar, List<C2052or> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
                    obtain.writeString(str);
                    if (ovVar != null) {
                        obtain.writeInt(1);
                        ovVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f4168le.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo16505a(String str, C2058ov ovVar, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
                    obtain.writeString(str);
                    if (ovVar != null) {
                        obtain.writeInt(1);
                        ovVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeByteArray(bArr);
                    this.f4168le.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4168le;
            }
        }

        /* renamed from: bI */
        public static C2049oq m6055bI(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2049oq)) ? new C2051a(iBinder) : (C2049oq) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.internal.or} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ov} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.ov} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v13 */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: type inference failed for: r0v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x0072
                r0 = 0
                switch(r6) {
                    case 2: goto L_0x004b;
                    case 3: goto L_0x002c;
                    case 4: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.playlog.internal.IPlayLogService"
                r7.enforceInterface(r2)
                java.lang.String r2 = r7.readString()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0024
                com.google.android.gms.internal.ow r0 = com.google.android.gms.internal.C2058ov.CREATOR
                com.google.android.gms.internal.ov r0 = r0.createFromParcel(r7)
            L_0x0024:
                byte[] r3 = r7.createByteArray()
                r5.mo16505a((java.lang.String) r2, (com.google.android.gms.internal.C2058ov) r0, (byte[]) r3)
                return r1
            L_0x002c:
                java.lang.String r2 = "com.google.android.gms.playlog.internal.IPlayLogService"
                r7.enforceInterface(r2)
                java.lang.String r2 = r7.readString()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0041
                com.google.android.gms.internal.ow r0 = com.google.android.gms.internal.C2058ov.CREATOR
                com.google.android.gms.internal.ov r0 = r0.createFromParcel(r7)
            L_0x0041:
                com.google.android.gms.internal.ot r3 = com.google.android.gms.internal.C2052or.CREATOR
                java.util.ArrayList r3 = r7.createTypedArrayList(r3)
                r5.mo16504a((java.lang.String) r2, (com.google.android.gms.internal.C2058ov) r0, (java.util.List<com.google.android.gms.internal.C2052or>) r3)
                return r1
            L_0x004b:
                java.lang.String r2 = "com.google.android.gms.playlog.internal.IPlayLogService"
                r7.enforceInterface(r2)
                java.lang.String r2 = r7.readString()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0061
                com.google.android.gms.internal.ow r3 = com.google.android.gms.internal.C2058ov.CREATOR
                com.google.android.gms.internal.ov r3 = r3.createFromParcel(r7)
                goto L_0x0062
            L_0x0061:
                r3 = r0
            L_0x0062:
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x006e
                com.google.android.gms.internal.ot r0 = com.google.android.gms.internal.C2052or.CREATOR
                com.google.android.gms.internal.or r0 = r0.createFromParcel(r7)
            L_0x006e:
                r5.mo16503a((java.lang.String) r2, (com.google.android.gms.internal.C2058ov) r3, (com.google.android.gms.internal.C2052or) r0)
                return r1
            L_0x0072:
                java.lang.String r0 = "com.google.android.gms.playlog.internal.IPlayLogService"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2049oq.C2050a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo16503a(String str, C2058ov ovVar, C2052or orVar) throws RemoteException;

    /* renamed from: a */
    void mo16504a(String str, C2058ov ovVar, List<C2052or> list) throws RemoteException;

    /* renamed from: a */
    void mo16505a(String str, C2058ov ovVar, byte[] bArr) throws RemoteException;
}
