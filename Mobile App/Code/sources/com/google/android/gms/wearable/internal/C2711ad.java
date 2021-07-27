package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.wearable.internal.ad */
public interface C2711ad extends IInterface {

    /* renamed from: com.google.android.gms.wearable.internal.ad$a */
    public static abstract class C2712a extends Binder implements C2711ad {

        /* renamed from: com.google.android.gms.wearable.internal.ad$a$a */
        private static class C2713a implements C2711ad {

            /* renamed from: le */
            private IBinder f4537le;

            C2713a(IBinder iBinder) {
                this.f4537le = iBinder;
            }

            /* renamed from: a */
            public void mo19424a(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19425a(C2709ab abVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (abVar != null) {
                        obtain.writeInt(1);
                        abVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19426a(C2744ap apVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (apVar != null) {
                        obtain.writeInt(1);
                        apVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19427a(C2748at atVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (atVar != null) {
                        obtain.writeInt(1);
                        atVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19428a(C2751aw awVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (awVar != null) {
                        obtain.writeInt(1);
                        awVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19429a(C2794p pVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (pVar != null) {
                        obtain.writeInt(1);
                        pVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19430a(C2796r rVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (rVar != null) {
                        obtain.writeInt(1);
                        rVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19431a(C2798t tVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (tVar != null) {
                        obtain.writeInt(1);
                        tVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19432a(C2800v vVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (vVar != null) {
                        obtain.writeInt(1);
                        vVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19433a(C2802x xVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (xVar != null) {
                        obtain.writeInt(1);
                        xVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo19434a(C2804z zVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (zVar != null) {
                        obtain.writeInt(1);
                        zVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ab */
            public void mo19435ab(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4537le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4537le;
            }
        }

        public C2712a() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        /* renamed from: bX */
        public static C2711ad m7948bX(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2711ad)) ? new C2713a(iBinder) : (C2711ad) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.wearable.internal.r} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.wearable.internal.ap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.wearable.internal.x} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.gms.wearable.internal.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.google.android.gms.wearable.internal.at} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.google.android.gms.wearable.internal.z} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: com.google.android.gms.wearable.internal.ab} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: com.google.android.gms.wearable.internal.v} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: com.google.android.gms.wearable.internal.aw} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: com.google.android.gms.wearable.internal.t} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v50 */
        /* JADX WARNING: type inference failed for: r0v51 */
        /* JADX WARNING: type inference failed for: r0v52 */
        /* JADX WARNING: type inference failed for: r0v53 */
        /* JADX WARNING: type inference failed for: r0v54 */
        /* JADX WARNING: type inference failed for: r0v55 */
        /* JADX WARNING: type inference failed for: r0v56 */
        /* JADX WARNING: type inference failed for: r0v57 */
        /* JADX WARNING: type inference failed for: r0v58 */
        /* JADX WARNING: type inference failed for: r0v59 */
        /* JADX WARNING: type inference failed for: r0v60 */
        /* JADX WARNING: type inference failed for: r0v61 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x0143
                r0 = 0
                switch(r4) {
                    case 2: goto L_0x0129;
                    case 3: goto L_0x010f;
                    case 4: goto L_0x00f5;
                    case 5: goto L_0x00dd;
                    case 6: goto L_0x00c3;
                    case 7: goto L_0x00a9;
                    case 8: goto L_0x008f;
                    case 9: goto L_0x0075;
                    case 10: goto L_0x005b;
                    case 11: goto L_0x0043;
                    case 12: goto L_0x0029;
                    case 13: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0022
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.t> r0 = com.google.android.gms.wearable.internal.C2798t.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.t r0 = (com.google.android.gms.wearable.internal.C2798t) r0
            L_0x0022:
                r3.mo19431a((com.google.android.gms.wearable.internal.C2798t) r0)
                r6.writeNoException()
                return r1
            L_0x0029:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x003c
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.aw> r0 = com.google.android.gms.wearable.internal.C2751aw.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.aw r0 = (com.google.android.gms.wearable.internal.C2751aw) r0
            L_0x003c:
                r3.mo19428a((com.google.android.gms.wearable.internal.C2751aw) r0)
                r6.writeNoException()
                return r1
            L_0x0043:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0054
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r5)
            L_0x0054:
                r3.mo19424a((com.google.android.gms.common.api.Status) r0)
                r6.writeNoException()
                return r1
            L_0x005b:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x006e
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.v> r0 = com.google.android.gms.wearable.internal.C2800v.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.v r0 = (com.google.android.gms.wearable.internal.C2800v) r0
            L_0x006e:
                r3.mo19432a((com.google.android.gms.wearable.internal.C2800v) r0)
                r6.writeNoException()
                return r1
            L_0x0075:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0088
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.ab> r0 = com.google.android.gms.wearable.internal.C2709ab.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.ab r0 = (com.google.android.gms.wearable.internal.C2709ab) r0
            L_0x0088:
                r3.mo19425a((com.google.android.gms.wearable.internal.C2709ab) r0)
                r6.writeNoException()
                return r1
            L_0x008f:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00a2
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.z> r0 = com.google.android.gms.wearable.internal.C2804z.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.z r0 = (com.google.android.gms.wearable.internal.C2804z) r0
            L_0x00a2:
                r3.mo19434a((com.google.android.gms.wearable.internal.C2804z) r0)
                r6.writeNoException()
                return r1
            L_0x00a9:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00bc
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.at> r0 = com.google.android.gms.wearable.internal.C2748at.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.at r0 = (com.google.android.gms.wearable.internal.C2748at) r0
            L_0x00bc:
                r3.mo19427a((com.google.android.gms.wearable.internal.C2748at) r0)
                r6.writeNoException()
                return r1
            L_0x00c3:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00d6
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.p> r0 = com.google.android.gms.wearable.internal.C2794p.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.p r0 = (com.google.android.gms.wearable.internal.C2794p) r0
            L_0x00d6:
                r3.mo19429a((com.google.android.gms.wearable.internal.C2794p) r0)
                r6.writeNoException()
                return r1
            L_0x00dd:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00ee
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r5)
            L_0x00ee:
                r3.mo19435ab(r0)
                r6.writeNoException()
                return r1
            L_0x00f5:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0108
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.x> r0 = com.google.android.gms.wearable.internal.C2802x.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.x r0 = (com.google.android.gms.wearable.internal.C2802x) r0
            L_0x0108:
                r3.mo19433a((com.google.android.gms.wearable.internal.C2802x) r0)
                r6.writeNoException()
                return r1
            L_0x010f:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0122
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.ap> r0 = com.google.android.gms.wearable.internal.C2744ap.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.ap r0 = (com.google.android.gms.wearable.internal.C2744ap) r0
            L_0x0122:
                r3.mo19426a((com.google.android.gms.wearable.internal.C2744ap) r0)
                r6.writeNoException()
                return r1
            L_0x0129:
                java.lang.String r2 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x013c
                android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.r> r0 = com.google.android.gms.wearable.internal.C2796r.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.wearable.internal.r r0 = (com.google.android.gms.wearable.internal.C2796r) r0
            L_0x013c:
                r3.mo19430a((com.google.android.gms.wearable.internal.C2796r) r0)
                r6.writeNoException()
                return r1
            L_0x0143:
                java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableCallbacks"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C2711ad.C2712a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo19424a(Status status) throws RemoteException;

    /* renamed from: a */
    void mo19425a(C2709ab abVar) throws RemoteException;

    /* renamed from: a */
    void mo19426a(C2744ap apVar) throws RemoteException;

    /* renamed from: a */
    void mo19427a(C2748at atVar) throws RemoteException;

    /* renamed from: a */
    void mo19428a(C2751aw awVar) throws RemoteException;

    /* renamed from: a */
    void mo19429a(C2794p pVar) throws RemoteException;

    /* renamed from: a */
    void mo19430a(C2796r rVar) throws RemoteException;

    /* renamed from: a */
    void mo19431a(C2798t tVar) throws RemoteException;

    /* renamed from: a */
    void mo19432a(C2800v vVar) throws RemoteException;

    /* renamed from: a */
    void mo19433a(C2802x xVar) throws RemoteException;

    /* renamed from: a */
    void mo19434a(C2804z zVar) throws RemoteException;

    /* renamed from: ab */
    void mo19435ab(DataHolder dataHolder) throws RemoteException;
}
