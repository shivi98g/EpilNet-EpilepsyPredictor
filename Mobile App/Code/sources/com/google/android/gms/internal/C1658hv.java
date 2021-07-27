package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1643hl;

/* renamed from: com.google.android.gms.internal.hv */
public interface C1658hv extends IInterface {

    /* renamed from: com.google.android.gms.internal.hv$a */
    public static abstract class C1659a extends Binder implements C1658hv {

        /* renamed from: com.google.android.gms.internal.hv$a$a */
        private static class C1660a implements C1658hv {

            /* renamed from: le */
            private IBinder f3664le;

            C1660a(IBinder iBinder) {
                this.f3664le = iBinder;
            }

            /* renamed from: a */
            public void mo15578a(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3664le.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15579a(Status status, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3664le.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15580a(Status status, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    this.f3664le.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo15581a(C1643hl.C1645b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3664le.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3664le;
            }
        }

        public C1659a() {
            attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        }

        /* renamed from: F */
        public static C1658hv m4851F(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1658hv)) ? new C1660a(iBinder) : (C1658hv) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.ParcelFileDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.gms.internal.hl$b} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: type inference failed for: r0v18 */
        /* JADX WARNING: type inference failed for: r0v19 */
        /* JADX WARNING: type inference failed for: r0v20 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x007c
                r0 = 0
                switch(r5) {
                    case 1: goto L_0x0067;
                    case 2: goto L_0x0042;
                    case 3: goto L_0x0024;
                    case 4: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0020
                com.google.android.gms.internal.hn r0 = com.google.android.gms.internal.C1643hl.C1645b.CREATOR
                com.google.android.gms.internal.hl$b r0 = r0.createFromParcel(r6)
            L_0x0020:
                r4.mo15581a((com.google.android.gms.internal.C1643hl.C1645b) r0)
                return r1
            L_0x0024:
                java.lang.String r2 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0035
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r6)
            L_0x0035:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x003d
                r2 = r1
                goto L_0x003e
            L_0x003d:
                r2 = 0
            L_0x003e:
                r4.mo15580a((com.google.android.gms.common.api.Status) r0, (boolean) r2)
                return r1
            L_0x0042:
                java.lang.String r2 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0054
                com.google.android.gms.common.api.StatusCreator r2 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r2 = r2.createFromParcel((android.os.Parcel) r6)
                goto L_0x0055
            L_0x0054:
                r2 = r0
            L_0x0055:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0063
                android.os.Parcelable$Creator r0 = android.os.ParcelFileDescriptor.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0
            L_0x0063:
                r4.mo15579a((com.google.android.gms.common.api.Status) r2, (android.os.ParcelFileDescriptor) r0)
                return r1
            L_0x0067:
                java.lang.String r2 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0078
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r6)
            L_0x0078:
                r4.mo15578a((com.google.android.gms.common.api.Status) r0)
                return r1
            L_0x007c:
                java.lang.String r0 = "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
                r7.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1658hv.C1659a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo15578a(Status status) throws RemoteException;

    /* renamed from: a */
    void mo15579a(Status status, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    /* renamed from: a */
    void mo15580a(Status status, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo15581a(C1643hl.C1645b bVar) throws RemoteException;
}
