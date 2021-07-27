package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1826ky;
import com.google.android.gms.internal.C2089pi;

/* renamed from: com.google.android.gms.plus.internal.b */
public interface C2423b extends IInterface {

    /* renamed from: com.google.android.gms.plus.internal.b$a */
    public static abstract class C2424a extends Binder implements C2423b {

        /* renamed from: com.google.android.gms.plus.internal.b$a$a */
        private static class C2425a implements C2423b {

            /* renamed from: le */
            private IBinder f4372le;

            C2425a(IBinder iBinder) {
                this.f4372le = iBinder;
            }

            /* renamed from: a */
            public void mo18416a(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle2 != null) {
                        obtain.writeInt(1);
                        bundle2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4372le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18417a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4372le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18418a(int i, Bundle bundle, C1826ky kyVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (kyVar != null) {
                        obtain.writeInt(1);
                        kyVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4372le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18419a(int i, C2089pi piVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (piVar != null) {
                        obtain.writeInt(1);
                        piVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4372le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18420a(DataHolder dataHolder, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f4372le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo18421a(DataHolder dataHolder, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f4372le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: aA */
            public void mo18422aA(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4372le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4372le;
            }

            /* renamed from: ch */
            public void mo18423ch(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeString(str);
                    this.f4372le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ci */
            public void mo18424ci(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeString(str);
                    this.f4372le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo18425h(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4372le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2424a() {
            attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
        }

        /* renamed from: bK */
        public static C2423b m6994bK(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2423b)) ? new C2425a(iBinder) : (C2423b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.os.ParcelFileDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.gms.internal.ky} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: com.google.android.gms.internal.pi} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r0v37 */
        /* JADX WARNING: type inference failed for: r0v38 */
        /* JADX WARNING: type inference failed for: r0v39 */
        /* JADX WARNING: type inference failed for: r0v40 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x0145
                r0 = 0
                switch(r6) {
                    case 1: goto L_0x0117;
                    case 2: goto L_0x00e9;
                    case 3: goto L_0x00d9;
                    case 4: goto L_0x00bd;
                    case 5: goto L_0x0091;
                    case 6: goto L_0x0071;
                    case 7: goto L_0x0053;
                    case 8: goto L_0x0043;
                    case 9: goto L_0x0027;
                    case 10: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x0020
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r7)
            L_0x0020:
                r5.mo18422aA(r0)
                r8.writeNoException()
                return r1
            L_0x0027:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x003c
                com.google.android.gms.internal.pj r0 = com.google.android.gms.internal.C2089pi.CREATOR
                com.google.android.gms.internal.pi r0 = r0.createFromParcel(r7)
            L_0x003c:
                r5.mo18419a((int) r2, (com.google.android.gms.internal.C2089pi) r0)
                r8.writeNoException()
                return r1
            L_0x0043:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                r5.mo18424ci(r0)
                r8.writeNoException()
                return r1
            L_0x0053:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x006a
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x006a:
                r5.mo18425h(r2, r0)
                r8.writeNoException()
                return r1
            L_0x0071:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x0082
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r7)
            L_0x0082:
                java.lang.String r2 = r7.readString()
                java.lang.String r3 = r7.readString()
                r5.mo18421a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String) r2, (java.lang.String) r3)
                r8.writeNoException()
                return r1
            L_0x0091:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x00a9
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r7)
                android.os.Bundle r3 = (android.os.Bundle) r3
                goto L_0x00aa
            L_0x00a9:
                r3 = r0
            L_0x00aa:
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x00b6
                com.google.android.gms.internal.kz r0 = com.google.android.gms.internal.C1826ky.CREATOR
                com.google.android.gms.internal.ky r0 = r0.createFromParcel(r7)
            L_0x00b6:
                r5.mo18418a((int) r2, (android.os.Bundle) r3, (com.google.android.gms.internal.C1826ky) r0)
                r8.writeNoException()
                return r1
            L_0x00bd:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x00ce
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r7)
            L_0x00ce:
                java.lang.String r2 = r7.readString()
                r5.mo18420a((com.google.android.gms.common.data.DataHolder) r0, (java.lang.String) r2)
                r8.writeNoException()
                return r1
            L_0x00d9:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                r5.mo18423ch(r0)
                r8.writeNoException()
                return r1
            L_0x00e9:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0101
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r7)
                android.os.Bundle r3 = (android.os.Bundle) r3
                goto L_0x0102
            L_0x0101:
                r3 = r0
            L_0x0102:
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x0110
                android.os.Parcelable$Creator r0 = android.os.ParcelFileDescriptor.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0
            L_0x0110:
                r5.mo18417a((int) r2, (android.os.Bundle) r3, (android.os.ParcelFileDescriptor) r0)
                r8.writeNoException()
                return r1
            L_0x0117:
                java.lang.String r2 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x012f
                android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r7)
                android.os.Bundle r3 = (android.os.Bundle) r3
                goto L_0x0130
            L_0x012f:
                r3 = r0
            L_0x0130:
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x013e
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x013e:
                r5.mo18416a((int) r2, (android.os.Bundle) r3, (android.os.Bundle) r0)
                r8.writeNoException()
                return r1
            L_0x0145:
                java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusCallbacks"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.internal.C2423b.C2424a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo18416a(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    /* renamed from: a */
    void mo18417a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    /* renamed from: a */
    void mo18418a(int i, Bundle bundle, C1826ky kyVar) throws RemoteException;

    /* renamed from: a */
    void mo18419a(int i, C2089pi piVar) throws RemoteException;

    /* renamed from: a */
    void mo18420a(DataHolder dataHolder, String str) throws RemoteException;

    /* renamed from: a */
    void mo18421a(DataHolder dataHolder, String str, String str2) throws RemoteException;

    /* renamed from: aA */
    void mo18422aA(Status status) throws RemoteException;

    /* renamed from: ch */
    void mo18423ch(String str) throws RemoteException;

    /* renamed from: ci */
    void mo18424ci(String str) throws RemoteException;

    /* renamed from: h */
    void mo18425h(int i, Bundle bundle) throws RemoteException;
}
